package com.fuwa.services;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.jws.WebService;
import javax.xml.datatype.DatatypeConfigurationException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.JavaType;

import take_number.call_net.util.CovertToXml;

import com.fuwa.lhh.util.Map2XmlUtil;
import com.fuwa.services.model.BomResultModel;
import com.fuwa.services.model.LXBomModel;
import com.fuwa.services.model.ResultModel;

import fw10.util.u9erp.BomModifyNew;
import fw10.util.u9erp.BomQuery;
import fw10.util.u9erp.ItemBatchCreateLX;
import fw10.util.u9erp.ItemOldQuery;
import fw10.util.u9erp.MaterialQuery;


@WebService(portName = "PlmToErpPort", serviceName = "PlmToErpService", targetNamespace = "http://com.fuwa.services/", endpointInterface = "com.fuwa.services.PlmToErp")
public class PlmToErpImpl implements PlmToErp {

	public String lhh(String content) {
		// replace with your impl here
		return "result:" + content;

	}
	

	
	@Override
	public ResultModel sendMaterial2Erp(String jsonMap) {
		// TODO Auto-generated method stub
		try {
			String item_id;
			String item_rev_id;
			String object_type;
			String oldNo;
			String dept;
			String masterUnit;
			String secondUnit;
			Map<String,String> prop_map;
			String materialCode;
			String custom_class;
			String erpClass;		
			boolean create;
			ObjectMapper objectMapper = new ObjectMapper();
			JavaType javaType = objectMapper.getTypeFactory().constructParametricType(LinkedHashMap.class, String.class,Object.class);
			Map<String,Object> receiveMap = objectMapper.readValue(jsonMap,javaType);
			item_id = receiveMap.get("item_id").toString();
			item_rev_id = receiveMap.get("item_rev_id").toString();
			object_type = receiveMap.get("object_type").toString();
			oldNo = receiveMap.get("oldNo").toString();
			dept = receiveMap.get("dept").toString();
			masterUnit = receiveMap.get("masterUnit").toString();
			secondUnit = receiveMap.get("secondUnit").toString();
			prop_map = (Map<String, String>) receiveMap.get("prop_map");
			materialCode = receiveMap.get("materialCode").toString();
			erpClass = receiveMap.get("erpClass").toString();
			custom_class = receiveMap.get("custom_class").toString();
			create = (boolean) receiveMap.get("create");

			// TODO Auto-generated method stub
			//LHHUtil.getInstance().initService();
			
			ResultModel result = new ResultModel();						
			if(create) {
				List<String> arrayStringTemps = ItemOldQuery.queryZBOldID(prop_map, 0,erpClass);		
				if(!ItemOldQuery.flagOK){			
					result.setResult("查找总部物料时发生错误！");
					return result;
				}
				if(arrayStringTemps==null && ItemOldQuery.flagOK==true){
					arrayStringTemps = ItemOldQuery.queryZBOldID(prop_map, 1,erpClass);			
					if(!ItemOldQuery.flagOK){				
						result.setResult("申请总部物料号时发生错误！");
						return result;
					}
					
					if(arrayStringTemps!=null && arrayStringTemps.size()>0 && ItemOldQuery.flagOK==true){
						for(int k=0; k<arrayStringTemps.size(); k++){
//							hashMapPropertyValues.put(ConstantUtils.TC_PROPERTY_FW9_DRAWNNO, arrayStringTemps.get(k)); //替换原有图号为通过分类查询出来的图号
						
							System.out.println("开始创建itemBatchCreate....................");
							String[] info = ItemBatchCreateLX.getInstance().itemBatchCreate2(prop_map,item_id,arrayStringTemps.get(k),object_type,erpClass,dept,oldNo,masterUnit,secondUnit);
							result.setLog(info[1]);
							result.setResult(info[0]);
							if(info[0].contains("<IsSuccessed>True</IsSuccessed>")) {							
								result.setSuccess(true);
							}
							
							ResultModel.createLog(info[1],item_id + "ERPMaterialCreate");
							if(ItemBatchCreateLX.getInstance().flagOK==false){
								result.setResult("创建总部物料时发生错误！");
								return result;
							}
							//*******************add by wujin 20141224 增加调用服务****************************//*
							/*System.out.println("SendItemInfoSV.SendItemInfoSVAction():"+arrayStringTemps.get(k));
							SendItemInfoSV.getInstance().SendItemInfoSVAction(arrayStringTemps.get(k));
							//**********************end add20141224*************************//*
							if(!SendItemInfoSV.getInstance().flagOK){
								result.setResult("下发物料时发生错误！");
								return result;
							}*/
						}
						
						result.setWl_nos(arrayStringTemps);
					}

				} else {
					result.setResult("以下物料：" + arrayStringTemps.get(0) + "已存在ERP系统，请与管理员联系");
					return result;
				}
			} else{
				//LHHUtil.getInstance().initService();
				//if(arrayStringTemps!=null && arrayStringTemps.size()>0 && ItemOldQuery.flagOK==true){
				//	for(int k=0; k<arrayStringTemps.size(); k++){
//						hashMapPropertyValues.put(ConstantUtils.TC_PROPERTY_FW9_DRAWNNO, arrayStringTemps.get(k)); //替换原有图号为通过分类查询出来的图号
					
						System.out.println("开始修改itemBatchModify....................");
						String[] info = ItemBatchCreateLX.getInstance().itemBatchModify(prop_map,item_id, materialCode,object_type,erpClass,dept,oldNo,masterUnit,secondUnit);
						result.setLog(info[1]);
						result.setResult(info[0]);
						if(info[0].contains("<IsSuccessed>True</IsSuccessed>")) {						
							result.setSuccess(true);
						}
						ResultModel.createLog(info[1],item_id + "ERPMaterialModify");
						if(ItemBatchCreateLX.getInstance().flagOK==false){
							result.setResult("修改总部物料时发生错误！");
							return result;
						}
						//*******************add by wujin 20141224 增加调用服务****************************//*
						/*System.out.println("SendItemInfoSV.SendItemInfoSVAction():"+materialCode);
						SendItemInfoSV.getInstance().SendItemInfoSVAction(materialCode);
						//**********************end add20141224*************************//*
						if(!SendItemInfoSV.getInstance().flagOK){
							result.setResult("下发物料时发生错误！");
							return result;
						}*/
								
					//result.setWl_nos(materialCode);
				
				
			}		
			return result;
		
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public BomResultModel sendBom2Erp(String jsonMap,Date date) {
		// TODO Auto-generated method stub
		BomResultModel resultModel = null;
		try {
			/*String material_code;
			String item_rev_id;
			String uom;
			BigDecimal usage_qty;
			BigDecimal parent_qty;
			String sequence_no;
			String installLocation;
			String openMaterialSize;
			String useWorkshop;*/
			
			Map<String,Object> parentMap;
			List<Map<String,Object>> childDataList;
			String unit;
			ObjectMapper objectMapper = new ObjectMapper();
			JavaType javaType = objectMapper.getTypeFactory().constructParametricType(LinkedHashMap.class, String.class,Object.class);
			Map<String,Object> receiveMap = objectMapper.readValue(jsonMap,javaType);
			parentMap = (Map<String, Object>) receiveMap.get("parentMap");
			childDataList = (List<Map<String, Object>>) receiveMap.get("childDataList");
			unit = receiveMap.get("unit").toString();
			resultModel = BomModifyNew.getInstance().createBom(parentMap, childDataList, date, unit);
			if (resultModel == null) {
				resultModel = new BomResultModel();
				resultModel.setErrorMSG("版本号相同");
				resultModel.setResult(false);
			} else {
				if(resultModel.isResult()) {
					/*List<LXBomModel> total = new ArrayList<LXBomModel>();
					total.add(parent);
					total.addAll(childList);
					String toXml = CovertToXml.beanListToXml(total, LXBomModel.class);*/
					String toXML = Map2XmlUtil.getInstance().toXml(parentMap, childDataList);
					ResultModel.createLog(toXML,parentMap.get("material_code") + "ERPBOMModify");
					resultModel.setTotalLog(toXML);
				}
			}

			
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DatatypeConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		return resultModel;
	}
	

	/*@Override
	public BomResultModel sendBom2Erp(LXBomModel parent, List<LXBomModel> childList,
			Date date, String unit) {
		
		BomResultModel resultModel = null;
		try {
			
			resultModel = BomModifyNew.getInstance().createBom(parent, childList, date, unit);
			if(resultModel.isResult()) {
				List<LXBomModel> total = new ArrayList<LXBomModel>();
				total.add(parent);
				total.addAll(childList);
				String toXml = CovertToXml.beanListToXml(total, LXBomModel.class);
				ResultModel.createLog(toXml,parent.getMaterial_code() + "ERPBOMModify");
				resultModel.setTotalLog(toXml);
			}
		} catch (DatatypeConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultModel;
	}*/
	
	@Override
	public BomResultModel syncBom2Erp(String itemId, String itemRevId) {

		BomResultModel resultModel = new BomResultModel();
		
		try {
			
			resultModel = BomModifyNew.getInstance().syncBom(itemId, itemRevId);
			if(resultModel.isResult()) {
				//resultModel.setTotalLog(toXml);
				resultModel.setResult(true);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			resultModel.setResult(false);
		}
		return resultModel;
	
	}

	@Override
	public String queryMaterialFromErp(String materialCode) {
		// TODO Auto-generated method stub
		try {
			return MaterialQuery.getInstance().query2(materialCode);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		 
	}

	@Override
	public String queryBomFromErp(String materialCode, String rev) {
		// TODO Auto-generated method stub
		try {
			return BomQuery.getInstance().query(materialCode, rev);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}


	


	

	
}
