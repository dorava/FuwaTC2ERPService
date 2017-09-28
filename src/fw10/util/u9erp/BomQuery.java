package fw10.util.u9erp;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.Holder;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.w3c.dom.Node;


























import querybom.org.tempuri.QueryBOMSvStub;
import querybom.org.ufida.UFIDAU9ISVMFGBOMIQueryBOMSv;
import querybom.org.ufida.UFIDAU9ISVMFGBOMIQueryBOMSvDoExceptionBaseFaultFaultMessage;
import querybom.org.ufida.UFIDAU9ISVMFGBOMIQueryBOMSvDoExceptionFaultFaultMessage;
import querybom.org.ufida.UFIDAU9ISVMFGBOMIQueryBOMSvDoServiceExceptionDetailFaultFaultMessage;
import querybom.org.ufida.UFIDAU9ISVMFGBOMIQueryBOMSvDoServiceExceptionFaultFaultMessage;
import querybom.org.ufida.UFIDAU9ISVMFGBOMIQueryBOMSvDoServiceLostExceptionFaultFaultMessage;
import querybom.org.ufida.entitydata.ArrayOfUFIDAU9ISVMFGBOMBOMComponentDTO4CreateSvData;
import querybom.org.ufida.entitydata.ArrayOfUFIDAU9ISVMFGBOMBOMMasterDTO4CreateSvData;
import querybom.org.ufida.entitydata.ArrayOfUFIDAU9ISVMFGBOMQueryDelParamsDTOData;
import querybom.org.ufida.entitydata.UFIDAU9ISVMFGBOMBOMComponentDTO4CreateSvData;
import querybom.org.ufida.entitydata.UFIDAU9ISVMFGBOMBOMMasterDTO4CreateSvData;

import com.fuwa.services.model.BomResultModel;
import com.fuwa.services.model.LXBomModel;
import com.teamcenter.clientx.ConstantUtils;


public class BomQuery {

	private static class Temp {     
        public final static BomQuery instance = new BomQuery();     
    }     
    
    public static BomQuery getInstance() {  
        return Temp.instance;     
    }

	public String query(String materialCode,String rev) throws JsonGenerationException, JsonMappingException, IOException {

		Map<String,Object> resultMap = new LinkedHashMap<String, Object>();
		resultMap.put("success", false);
		ObjectMapper om = new ObjectMapper();
		
		/*String IDForCompany = "001";		//"002";// 当前企业编号
		Long IDForOrganization = new Long("1001601073416051");	//new Long("1001212053116304");// 当前组织ID
		String OrgCode = "105";					//"102";
		Long IDForUsers = new Long("1001212053116969");		//new Long("1001212053116969");// 当前用户ID
		String UserCode = "admin";	*/			//"admin";// 当前用户编码
		HashMap<String, String> hashMapAccountValues = U9ERPAccount.getU9Account();
		if(hashMapAccountValues == null){
			resultMap.put("error", "创建当前上下文失败");
			return om.writeValueAsString(resultMap);
			
		}
		
		// 创建当前上下文（相当于验证信息，这部分需灵活配置）
		String IDForCompany = hashMapAccountValues.get(ConstantUtils.U9_ACCOUNT_ENTERPRISE_CODE);		//"002";// 当前企业编号
		Long IDForOrganization = new Long(hashMapAccountValues.get(ConstantUtils.U9_ACCOUNT_ORG_ID));	//new Long("1001212053116304");// 当前组织ID
		String OrgCode = hashMapAccountValues.get(ConstantUtils.U9_ACCOUNT_ORG_CODE);					//"102";
		Long IDForUsers = new Long(hashMapAccountValues.get(ConstantUtils.U9_ACCOUNT_USER_ID));		//new Long("1001212053116969");// 当前用户ID
		String UserCode = hashMapAccountValues.get(ConstantUtils.U9_ACCOUNT_USER_CODE);				//"admin";// 当前用户编码
        IDForOrganization = new Long("1001601073416051");
        OrgCode = "105";
        
        rev = ItemRevQuery.getInstance().modifyItemRev(materialCode, rev, IDForOrganization.toString(), IDForUsers.toString(), UserCode);
		QueryBOMSvStub queryBom = new QueryBOMSvStub();
	    UFIDAU9ISVMFGBOMIQueryBOMSv queryBomPort = queryBom.getBasicHttpBindingUFIDAU9ISVMFGBOMIQueryBOMSv();
		Object context = createQueryBomContext(IDForCompany, IDForOrganization, IDForUsers, UserCode);
		ArrayOfUFIDAU9ISVMFGBOMQueryDelParamsDTOData qryParams = createQueryBomData(materialCode,rev);
		querybom.org.ufida.entitydata.UFIDAU9CBOPubControllerContextDTOData contextDTO = createQueryBomPubContext(IDForCompany, OrgCode, UserCode);
		Holder<ArrayOfUFIDAU9ISVMFGBOMBOMMasterDTO4CreateSvData> doResult = new Holder<ArrayOfUFIDAU9ISVMFGBOMBOMMasterDTO4CreateSvData>();
		Holder<querybom.exceptions.ubf.ufsoft.ArrayOfMessageBase> outMessages = new Holder<querybom.exceptions.ubf.ufsoft.ArrayOfMessageBase>();
		try {
			queryBomPort._do(context, qryParams, contextDTO, doResult, outMessages);
		} catch (UFIDAU9ISVMFGBOMIQueryBOMSvDoServiceExceptionFaultFaultMessage ex) {
			ex.printStackTrace();
			StringBuffer strBufferMessage = new StringBuffer();
			String strErrorTemp = "";
			querybom.org.datacontract.schemas._2004._07.system.Exception ed = ex.getFaultInfo();
			for (int i = 0; i < ed.getAny().size() - 1; i++) {
//				System.out.println(ed.getAny().get(i).toString());
//				System.out.println(ed.getAny().get(i).getFirstChild()
//						.toString());
				Node nodeTemp = ed.getAny().get(i).getFirstChild();
				if(nodeTemp!=null){
					strErrorTemp = nodeTemp.toString();
					System.out.println(strErrorTemp);
					strBufferMessage.append(strErrorTemp).append("\n");
				}
			}
			resultMap.put("error", strBufferMessage.toString());
			System.out.println(strBufferMessage);
		} catch (UFIDAU9ISVMFGBOMIQueryBOMSvDoExceptionFaultFaultMessage e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			resultMap.put("error", e.getMessage());
		} catch (UFIDAU9ISVMFGBOMIQueryBOMSvDoExceptionBaseFaultFaultMessage e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			resultMap.put("error", e.getMessage());
		} catch (UFIDAU9ISVMFGBOMIQueryBOMSvDoServiceLostExceptionFaultFaultMessage e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			resultMap.put("error", e.getMessage());
		} catch (UFIDAU9ISVMFGBOMIQueryBOMSvDoServiceExceptionDetailFaultFaultMessage e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			resultMap.put("error", e.getMessage());
		} 
		if(doResult.value!=null){
	     List<querybom.org.ufida.entitydata.UFIDAU9ISVMFGBOMBOMMasterDTO4CreateSvData> list = doResult.value.getUFIDAU9ISVMFGBOMBOMMasterDTO4CreateSvData();
			if(list!=null && list.size()>0){
				    resultMap.put("success", true);
					System.out.println("Result["+0+"]="+list.get(0).getMBOMVersionCode().getValue());
					//System.out.println("Item="+list.get(0).getMItemMaster().getValue().getMCode().getValue());
					UFIDAU9ISVMFGBOMBOMMasterDTO4CreateSvData svData = list.get(0);
					LinkedHashMap<String,Object> parentMap = new LinkedHashMap<String, Object>();
					List<LinkedHashMap<String, Object>> childDataList = new ArrayList<LinkedHashMap<String,Object>>();
				    			    		    	
			    	parentMap.put("material_code", svData.getMItemMaster().getValue().getMCode().getValue());
			    	parentMap.put("item_rev_id", svData.getMBOMVersionCode().getValue());
			    	parentMap.put("UOM", svData.getMProductUOM().getValue().getMCode().getValue());
			    	parentMap.put("installLocation", svData.getMDescFlexField().getValue().getMPrivateDescSeg1().getValue());
			    	parentMap.put("openMaterialSize", svData.getMDescFlexField().getValue().getMPrivateDescSeg2().getValue());
			    	parentMap.put("useWorkshop", svData.getMDescFlexField().getValue().getMPrivateDescSeg3().getValue());
			    	
			    	ArrayOfUFIDAU9ISVMFGBOMBOMComponentDTO4CreateSvData childValue = svData.getMBOMComponents().getValue();
			    	if(childValue != null) {
			    		List<UFIDAU9ISVMFGBOMBOMComponentDTO4CreateSvData> srcChildDataList = childValue.getUFIDAU9ISVMFGBOMBOMComponentDTO4CreateSvData();
			    		if(srcChildDataList != null) {
			    			for (int j = 0; j < srcChildDataList.size(); j++) {
			    				UFIDAU9ISVMFGBOMBOMComponentDTO4CreateSvData childData = srcChildDataList.get(j);			   			
			    				LinkedHashMap<String,Object> childMap = new LinkedHashMap<String, Object>();
			    				childMap.put("material_code", childData.getMItemMaster().getValue().getMCode().getValue());
			    				//childMap.put("item_rev_id", svData.getMBOMVersionCode().getValue());
			    				//childMap.put("UOM", svData.getMProductUOM().getValue().getMCode().getValue());
			    				childMap.put("usage_qty", childData.getMUsageQty());
			    				childMap.put("parent_qty", childData.getMParentQty());
			    				childMap.put("sequence_no", childData.getMOperationNum().getValue());
			    				childMap.put("installLocation", childData.getMDescFlexField().getValue().getMPrivateDescSeg1().getValue());
			    				childMap.put("openMaterialSize", childData.getMDescFlexField().getValue().getMPrivateDescSeg2().getValue());
			    				childMap.put("useWorkshop", childData.getMDescFlexField().getValue().getMPrivateDescSeg3().getValue());
			    				childDataList.add(childMap);
							}
			    		}
			    	}
			    	
			    	
			    	resultMap.put("parentMap", parentMap);
				    resultMap.put("childDataList", childDataList);
				    
			}else{
				System.out.println("Result is null.");
				resultMap.put("error", "Result is null.");
			}
		}
	return om.writeValueAsString(resultMap);
	
	}
	
	private  Object createQueryBomContext(String entid, long orgid, long userid,
			String usercode) {
		querybom.org.datacontract.schemas._2004._07.ufsoft_ubf_util.ObjectFactory contextfactory = new querybom.org.datacontract.schemas._2004._07.ufsoft_ubf_util.ObjectFactory();
		querybom.org.datacontract.schemas._2004._07.ufsoft_ubf_util.ThreadContext tc = contextfactory
				.createThreadContext();

		querybom.com.microsoft.schemas._2003._10.serialization.arrays.ObjectFactory arrayFactory = new querybom.com.microsoft.schemas._2003._10.serialization.arrays.ObjectFactory();
		querybom.com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfanyTypeanyType contextarray = arrayFactory
				.createArrayOfKeyValueOfanyTypeanyType();

		querybom.com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfanyTypeanyType.KeyValueOfanyTypeanyType kv1 = new querybom.com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfanyTypeanyType.KeyValueOfanyTypeanyType();
		kv1.setKey("EnterpriseID");
		kv1.setValue(entid);// 填具体的企业编号
		contextarray.getKeyValueOfanyTypeanyType().add(kv1);
		querybom.com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfanyTypeanyType.KeyValueOfanyTypeanyType kv2 = new querybom.com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfanyTypeanyType.KeyValueOfanyTypeanyType();
		kv2.setKey("OrgID");
		kv2.setValue(orgid);// 填具体的组织ID
		contextarray.getKeyValueOfanyTypeanyType().add(kv2);
		querybom.com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfanyTypeanyType.KeyValueOfanyTypeanyType kv3 = new querybom.com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfanyTypeanyType.KeyValueOfanyTypeanyType();
		kv3.setKey("UserID");
		kv3.setValue(userid);// //填具体的用户ID
		contextarray.getKeyValueOfanyTypeanyType().add(kv3);
		querybom.com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfanyTypeanyType.KeyValueOfanyTypeanyType kv4 = new querybom.com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfanyTypeanyType.KeyValueOfanyTypeanyType();
		kv4.setKey("UserCode");
		kv4.setValue(usercode);// 填具体的用户编码
		contextarray.getKeyValueOfanyTypeanyType().add(kv4);
		querybom.com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfanyTypeanyType.KeyValueOfanyTypeanyType kv5 = new querybom.com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfanyTypeanyType.KeyValueOfanyTypeanyType();
		kv5.setKey("CultureName");
		kv5.setValue("zh-CN");// 当前语种
		contextarray.getKeyValueOfanyTypeanyType().add(kv5);

		tc.setNameValueHas(contextarray);
		return tc;
	}
	
	public ArrayOfUFIDAU9ISVMFGBOMQueryDelParamsDTOData createQueryBomData(String materialCode,String rev) {
		querybom.org.ufida.entitydata.ObjectFactory factory = new querybom.org.ufida.entitydata.ObjectFactory();
		ArrayOfUFIDAU9ISVMFGBOMQueryDelParamsDTOData baseData = factory.createArrayOfUFIDAU9ISVMFGBOMQueryDelParamsDTOData();
		querybom.org.ufida.entitydata.UFIDAU9ISVMFGBOMQueryDelParamsDTOData secondData = factory.createUFIDAU9ISVMFGBOMQueryDelParamsDTOData();		
		//querybom.org.ufida.entitydata.UFIDAU9CBOPubControllerCommonArchiveDataDTOData thirdData = factory.createUFIDAU9CBOPubControllerCommonArchiveDataDTOData();
		//thirdData.setId(orgID);
		//thirdData.setMCode(factory.createUFIDAU9CBOPubControllerCommonArchiveDataDTODataMCode(materialCode));
		//secondData.setMItemMaster(factory.createUFIDAU9CBOPubControllerCommonArchiveDataDTOData(thirdData));
		secondData.setMBOMVersionCode(factory.createUFIDAU9ISVMFGBOMQueryDelParamsDTODataMBOMVersionCode(rev));
		secondData.setMItemMaster(factory.createUFIDAU9ISVMFGBOMQueryDelParamsDTODataMItemMaster(SetQuryBomDto(materialCode)));
		baseData.getUFIDAU9ISVMFGBOMQueryDelParamsDTOData().add(secondData);
		return baseData;
	}
	
	private  querybom.org.ufida.entitydata.UFIDAU9CBOPubControllerContextDTOData createQueryBomPubContext(
			String EnCode, String OrgCode, String UserCode) {
		querybom.org.ufida.entitydata.UFIDAU9CBOPubControllerContextDTOData contextDTOData = new querybom.org.ufida.entitydata.UFIDAU9CBOPubControllerContextDTOData();
		querybom.org.ufida.entitydata.ObjectFactory factory = new querybom.org.ufida.entitydata.ObjectFactory();

		contextDTOData.setMEntCode(factory
				.createUFIDAU9CBOPubControllerContextDTODataMEntCode(EnCode)); // "002"
		contextDTOData.setMOrgCode(factory
				.createUFIDAU9CBOPubControllerContextDTODataMOrgCode(OrgCode)); // "102"
        contextDTOData.setMCultureName(factory.createUFIDAU9CBOPubControllerContextDTODataMCultureName("zh-CN"));
		contextDTOData
				.setMUserCode(factory
						.createUFIDAU9CBOPubControllerContextDTODataMUserCode(UserCode)); // "admin"
		return contextDTOData;
	}
	
	private static querybom.org.ufida.entitydata.UFIDAU9CBOPubControllerCommonArchiveDataDTOData SetQuryBomDto(
			String code) {
		querybom.org.ufida.entitydata.ObjectFactory dataFactory = new querybom.org.ufida.entitydata.ObjectFactory();
		querybom.org.ufida.entitydata.UFIDAU9CBOPubControllerCommonArchiveDataDTOData result = dataFactory
				.createUFIDAU9CBOPubControllerCommonArchiveDataDTOData();
		result.setMCode(dataFactory
				.createUFIDAU9CBOPubControllerCommonArchiveDataDTODataMCode(code));
		result.setSysState(querybom.org.datacontract.schemas._2004._07.ufsoft_ubf_pl.ObjectState.INSERTED);
		return result;
	}
	
}
