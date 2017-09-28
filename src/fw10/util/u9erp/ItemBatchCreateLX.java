package fw10.util.u9erp;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import take_number.call_net.CreateItemForSDByCustSV;
import take_number.call_net.CreateItemForSDByCustSVSoap;
import take_number.call_net.util.CovertToXml;
import take_number.call_net.util.Table;
import alteritem.org.tempuri.ModifyItemForSDByCustSV;
import alteritem.org.tempuri.ModifyItemForSDByCustSVSoap;

import com.teamcenter.clientx.ConstantUtils;


public class ItemBatchCreateLX {
	private static class Temp {     
        public final static ItemBatchCreateLX instance = new ItemBatchCreateLX();     
    }     
    
    public static ItemBatchCreateLX getInstance() {  
        return Temp.instance;     
    }
	public  boolean flagOK;
	public  String[] itemBatchCreate2(Map<String, String> hashMapTCValues,String item_id, String strNewDRAWNNO, String type, String erpClass,String dept,String oldNo, String masterUnit, String secondUnit){

		System.out.println("Beginning....");
		for(Map.Entry<String, String> entry : hashMapTCValues.entrySet()){
			System.out.println(entry.getKey()+"------>"+entry.getValue());
		}
		System.out.println("the two arguments is :"+strNewDRAWNNO);
		
		System.out.println("Beginning. arguments end...");
		flagOK = true;
		
		// 创建当前上下文（相当于验证信息，这部分需灵活配置）		
		HashMap<String, String> hashMapAccountValues = U9ERPAccount.getU9Account();
		if(hashMapAccountValues==null){
			flagOK = false;
			return null;
		}
		// 创建当前上下文（相当于验证信息，这部分需灵活配置）
		String IDForCompany = hashMapAccountValues.get(ConstantUtils.U9_ACCOUNT_ENTERPRISE_CODE);		//"002";// 当前企业编号
		Long IDForOrganization = new Long(hashMapAccountValues.get(ConstantUtils.U9_ACCOUNT_ZB_ORG_ID));	//new Long("1001212053116304");// 当前组织ID
		String OrgCode = hashMapAccountValues.get(ConstantUtils.U9_ACCOUNT_ZB_ORG_CODE);					//"102";
		Long IDForUsers = new Long(hashMapAccountValues.get(ConstantUtils.U9_ACCOUNT_USER_ID));		//new Long("1001212053116969");// 当前用户ID
		String UserCode = hashMapAccountValues.get(ConstantUtils.U9_ACCOUNT_USER_CODE);				//"admin";// 当前用户编码
		String UserName = hashMapAccountValues.get(ConstantUtils.U9_ACCOUNT_PREFERENCE);				//"admin";// 当前用户名
	
		CreateItemForSDByCustSV sv = new CreateItemForSDByCustSV();
		CreateItemForSDByCustSVSoap cfbs = sv.getCreateItemForSDByCustSVSoap();
		String strdt = getDtXmlStr(hashMapTCValues,item_id, strNewDRAWNNO, type, erpClass,dept,oldNo,masterUnit,secondUnit) ;
		
		System.out.println(strdt);
		String _do = cfbs._do(strdt , IDForOrganization+"", IDForUsers+"", UserCode, UserName);
		System.out.println("itemBatchCreate2 result:" + _do);
		return new String[]{_do,strdt};
	}
	
	public  String[] itemBatchModify(Map<String, String> hashMapTCValues,String item_id, String strNewDRAWNNO, String type, String erpClass,String dept,String oldNo, String masterUnit, String secondUnit){

		System.out.println("Beginning....");
		for(Map.Entry<String, String> entry : hashMapTCValues.entrySet()){
			System.out.println(entry.getKey()+"------>"+entry.getValue());
		}
		System.out.println("the two arguments is :"+strNewDRAWNNO);
		
		System.out.println("Beginning. arguments end...");
		flagOK = true;
		
		// 创建当前上下文（相当于验证信息，这部分需灵活配置）		
		HashMap<String, String> hashMapAccountValues = U9ERPAccount.getU9Account();
		if(hashMapAccountValues==null){
			flagOK = false;
			return null;
		}
		System.out.println("U9ERPAccount:"+hashMapAccountValues);
		// 创建当前上下文（相当于验证信息，这部分需灵活配置）
		String IDForCompany = hashMapAccountValues.get(ConstantUtils.U9_ACCOUNT_ENTERPRISE_CODE);		//"002";// 当前企业编号
		Long IDForOrganization = new Long(hashMapAccountValues.get(ConstantUtils.U9_ACCOUNT_ZB_ORG_ID));	//new Long("1001212053116304");// 当前组织ID
		String OrgCode = hashMapAccountValues.get(ConstantUtils.U9_ACCOUNT_ZB_ORG_CODE);					//"102";
		Long IDForUsers = new Long(hashMapAccountValues.get(ConstantUtils.U9_ACCOUNT_USER_ID));		//new Long("1001212053116969");// 当前用户ID
		String UserCode = hashMapAccountValues.get(ConstantUtils.U9_ACCOUNT_USER_CODE);				//"admin";// 当前用户编码
		String UserName = hashMapAccountValues.get(ConstantUtils.U9_ACCOUNT_PREFERENCE);				//"admin";// 当前用户名
	
		//LHHUtil.getInstance().initService();
		ModifyItemForSDByCustSV sv = new ModifyItemForSDByCustSV();
	    ModifyItemForSDByCustSVSoap cfbs = sv.getModifyItemForSDByCustSVSoap();
		//ModifyItemForSDByCustSVSoap cfbs = LHHUtil.getInstance().
		String strdt = getDtXmlStr(hashMapTCValues,item_id, strNewDRAWNNO, type, erpClass,dept,oldNo,masterUnit,secondUnit) ;
		System.out.println(strdt);
		
		String _do = cfbs._do(strdt , IDForOrganization+"", IDForUsers+"", UserCode, UserName);
		System.out.println(_do);
		return new String[]{_do,strdt};
	}
	
	public  String getErpID(String sql, String parmID) {
    	Connection conn = null;
    	PreparedStatement preparedStatement = null;
    	try{
    		preparedStatement = conn.prepareStatement(sql);
        	preparedStatement.setString(1, parmID);
        	ResultSet rs = preparedStatement.executeQuery();
        	if (rs.next()) {
        		 return (String) rs.getObject(1);
    		}
    	}catch(Exception e){
    		e.printStackTrace();
    	}finally{
    		if(preparedStatement!=null){
    			try {
					preparedStatement.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    		}
    	}    	
    	
    	return null;
    }
	
	/**
	 * 获取erp分类
	 * @param tcComponentICOs
	 * @return
	 */
	public  String getMainItemCategory(String ico_class){
		try {
			
			System.out.println("分类id-------------"+ico_class); 
			String erpClassId = (String) getErpID("select distinct ERPCLASSID from FW_HFPLM_MATERIAL where MATERIALCLASSTYPE =?", ico_class);
			System.out.println("分类id-------------"+ico_class + "    erpClassId   " + erpClassId); 
			return erpClassId;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("获取分类失败");
		}
		
	}
	
	private  String getDtXmlStr(Map<String, String> hashMapTCValues,String item_id, String strNewDRAWNNO, String type,String erpClass,String dept,String oldNo, String masterUnit, String secondUnit) {
				//String unit=hashMapTCValues.get(ConstantUtils.TC_PROPERTY_FW9_UNIT);
		
		//current_name,item_id,fw9_LBJRev_03,fw9_CP_LBJRev_05,fw9_LBJRev_01,fw9_CP_LBJRev_09,fw9_CP_LBJRev_01
				// 拼接规格
				
		
				
		Table transferA = new Table();
		transferA.setCode(strNewDRAWNNO);
		transferA.setName(hashMapTCValues.get("current_name"));
		
		if(type.startsWith("Fw9_CP_")){
			//产品erp主分类fw9_CP_LXRev_03
			String string = erpClass;
			transferA.setMainItemCategory(string);
			transferA.setSPECS(item_id);
			transferA.setMaterial("");
		}else{
			transferA.setMainItemCategory(erpClass);
			String specs = item_id;
			
			if (hashMapTCValues.get("fw9_LBJ_LX_02") != null) {
				String tmp = hashMapTCValues.get("fw9_LBJ_LX_02");
				//specs += hashMapTCValues.get("fw9_LBJ_LX_02");
				if(!tmp.equals(""))
					specs += "/" + tmp;	
				else
					specs += tmp;
			}
			
			
			if (hashMapTCValues.get("fw9_LBJ_LX_05") != null) {
				String tmp = hashMapTCValues.get("fw9_LBJ_LX_05");
				//specs += hashMapTCValues.get("fw9_LBJ_LX_02");
				if(!tmp.equals(""))
					specs += "/" + tmp;	
				else
					specs += tmp;
			}
			
			String s1 = "";
			String s2 = "";
			String s3 = "";
			String s4 = "";
			String s5 = "";
			
				System.out.println("nnt " + specs);
				if (hashMapTCValues.get("fw9_CP_LBJRev_01") != null) {
					String[] descptionArr = hashMapTCValues.get("fw9_CP_LBJRev_01").split(";");
					System.out.println("nnt " + descptionArr);
					for (int i = 0; i < descptionArr.length; i++) {
						System.out.println("nnt " + descptionArr[i]);
						if (descptionArr[i].contains("截面号")) {
							s1 = descptionArr[i];
						} else if(descptionArr[i].contains("长")){
							s2 = descptionArr[i];
						} else if(descptionArr[i].contains("宽")){
							s3 = descptionArr[i];
						} else if(descptionArr[i].contains("高")){
							s4 = descptionArr[i];
						}else if(descptionArr[i].contains("颜色")){
							s5 = descptionArr[i];
						}
					}
				}
			
				if(!s1.equals(""))
					specs += "/" + s1;	
				else
					specs += s1;
				
				if(!s2.equals(""))
					specs += "/" + s2;	
				else
					specs += s2;
				
				if(!s3.equals(""))
					specs += "/" + s3;	
				else
					specs += s3;
				
				if(!s4.equals(""))
					specs += "/" + s4;	
				else
					specs += s4;
				
				if(!s5.equals(""))
					specs += "/" + s5;	
				else
					specs += s5;
				
				if(specs.startsWith("/")){
					specs = specs.substring(1);
				}
			transferA.setSPECS(specs);
			transferA.setMaterial(hashMapTCValues.get("fw9_LBJRev_01")); // fw9_LBJRev_01
		}
		
		if(hashMapTCValues.get("fw9_LBJ_LX_05") != null) {
			transferA.setSize(hashMapTCValues.get("fw9_LBJ_LX_05"));//fw9_LBJ_LX_05开料尺寸
		}
		
		transferA.setItemFormAttribute(getItemFormAttribute(type, hashMapTCValues));		
		
		transferA.setPLMCode(hashMapTCValues.get("item_id"));
		transferA.setAssetCategory(getAssetCategory(type, hashMapTCValues));
		transferA.setUOM(masterUnit);
		transferA.setSecondUOM(secondUnit);
		transferA.setWeight(hashMapTCValues.get("fw9_CP_LBJRev_05"));  // fw9_CP_LBJRev_05
		transferA.setSecondWeight(hashMapTCValues.get(ConstantUtils.TC_PROPERTY_fw9_CP_LBJRev_09));		
		transferA.setDescription(hashMapTCValues.get("fw9_CP_LBJRev_01"));
		transferA.setOldNo(oldNo);
		transferA.setDept(dept);
		
		
		List<Table> list = new ArrayList<>();
		list.add(transferA);
		
		try {
			String xml = CovertToXml.beanListToXml(list, Table.class);
			System.out.println(xml);
			return xml;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	private  String getItemFormAttribute(String type,
			Map<String, String> hashMapTCValues) {
		// TODO Auto-generated method stub
		
		String itemFormAttribute = "";
		if (type.startsWith("Fw9_CP_LX") || type.startsWith("Fw9_LBJ_LX")) {
			String ljType = hashMapTCValues.get(ConstantUtils.TC_PROPERTY_fw9_LBJRev_03);
			if (type.startsWith("Fw9_CP_LX")) { //  “Fw9_CP_LX”表示为冷箱成品,则传ERP财务分类为“11”:产成品
				itemFormAttribute = "10";
			}
			// “Fw9_LBJ_LX”表示为冷箱零部件,
			// 再判断如果“零件类型”属性值为“外购”,则传ERP财务分类为“31”:原材料,如果“零件类型”属性值为“自制”或“外协”或“虚拟”,则财务分类为“21”:半成品。
			if (type.startsWith("Fw9_LBJ_LX")) {
				if (ljType.equals("外购")||ljType.equals("Outsourcing")) {
					itemFormAttribute = "9"; // 原材料
				}

				if (ljType.equals("自制") ||ljType.equals("self made")) { // 半成品
					itemFormAttribute = "10"; // 半成品
				}
				
				if (ljType.equals("虚拟")||ljType.equals("Virtual")) {
					itemFormAttribute = "6"; // 原材料
				}
				
				if (ljType.equals("外协")||ljType.equals("OutsideAssist")) {
					itemFormAttribute = "4"; // 原材料
				}
			}
		}
		return itemFormAttribute;
	}

	private  String getAssetCategory(String type,Map<String, String> hashMapTCValues){
		String AssetCatacoryCode = "";
		if (type.startsWith("Fw9_CP_LX") || type.startsWith("Fw9_LBJ_LX")) {
			String ljType = hashMapTCValues.get(ConstantUtils.TC_PROPERTY_fw9_LBJRev_03);
			if (type.startsWith("Fw9_CP_LX")) { //  “Fw9_CP_LX”表示为冷箱成品,则传ERP财务分类为“11”:产成品
				AssetCatacoryCode = "11";
			}
			// “Fw9_LBJ_LX”表示为冷箱零部件,
			// 再判断如果“零件类型”属性值为“外购”,则传ERP财务分类为“31”:原材料,如果“零件类型”属性值为“自制”或“外协”或“虚拟”,则财务分类为“21”:半成品。
			if (type.startsWith("Fw9_LBJ_LX")) {
				if (ljType.equals("外购")||ljType.equals("Outsourcing")) {
					AssetCatacoryCode = "31"; // 原材料
				}

				if (ljType.equals("自制") ||ljType.equals("self made")|| ljType.equals("外协")||ljType.equals("OutsideAssist")
						|| ljType.equals("虚拟")||ljType.equals("Virtual")) { // 半成品
					AssetCatacoryCode = "21"; // 半成品
				}
			}
		}
		return AssetCatacoryCode;
	}
	

}
