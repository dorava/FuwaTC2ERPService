package fw10.util.u9erp;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.ws.Holder;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.teamcenter.clientx.ConstantUtils;

import querymaterial.exceptions.ubf.ufsoft.ArrayOfMessageBase;
import querymaterial.org.tempuri.BatchQueryItemByDTOSRVStub;
import querymaterial.org.ufida.UFIDAU9ISVItemIBatchQueryItemByDTOSRV;
import querymaterial.org.ufida.UFIDAU9ISVItemIBatchQueryItemByDTOSRVDoExceptionBaseFaultFaultMessage;
import querymaterial.org.ufida.UFIDAU9ISVItemIBatchQueryItemByDTOSRVDoExceptionFaultFaultMessage;
import querymaterial.org.ufida.UFIDAU9ISVItemIBatchQueryItemByDTOSRVDoServiceExceptionDetailFaultFaultMessage;
import querymaterial.org.ufida.UFIDAU9ISVItemIBatchQueryItemByDTOSRVDoServiceExceptionFaultFaultMessage;
import querymaterial.org.ufida.UFIDAU9ISVItemIBatchQueryItemByDTOSRVDoServiceLostExceptionFaultFaultMessage;
import querymaterial.org.ufida.entitydata.ArrayOfUFIDAU9ISVItemItemMasterDTOData;
import querymaterial.org.ufida.entitydata.ArrayOfUFIDAU9ISVItemQueryItemDTOData;
import querymaterial.org.ufida.entitydata.UFIDAU9ISVItemQueryItemDTOData;
import querymaterial2.org.tempuri.QueryItemByCustSV;
import querymaterial2.org.tempuri.QueryItemByCustSVSoap;


public class MaterialQuery {

	private static class Temp {     
        public final static MaterialQuery instance = new MaterialQuery();     
    }     
    
    public static MaterialQuery getInstance() {  
        return Temp.instance;     
    }
    private String[] keys = new String[] {
            "Code",	
            "Name",
            "MainItemCategory",
            "ItemFormAttribute",
            "SPECS",
            "PLMCode",
            "AssetCategory",
            "UOM",
            "SecondUOM",
            "Weight",
            "SecondWeight",
            "Material",
            "Description",
            "OldNo",
            "Dept",
            "Size"
            
     };

	public String query(String materialCode) throws JsonGenerationException, JsonMappingException, IOException {
		Map<String,Object> resultMap = new LinkedHashMap<String, Object>();
		resultMap.put("success", false);
		ObjectMapper om = new ObjectMapper();
		//String asString = ;
		/*String IDForCompany = "001";		//"002";// 当前企业编号
		Long IDForOrganization = new Long("1001601073416051");	//new Long("1001212053116304");// 当前组织ID
		String OrgCode = "105";					//"102";
		Long IDForUsers = new Long("1001212053116969");		//new Long("1001212053116969");// 当前用户ID
		String UserCode = "admin";				//"admin";// 当前用户编码
*/		
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
        
		BatchQueryItemByDTOSRVStub queryMaterial = new BatchQueryItemByDTOSRVStub();
		UFIDAU9ISVItemIBatchQueryItemByDTOSRV queryMaterialPort = queryMaterial.getBasicHttpBindingUFIDAU9ISVItemIBatchQueryItemByDTOSRV();
		Object context = createMaterialContext(IDForCompany, IDForOrganization, IDForUsers, UserCode);
		
		ArrayOfUFIDAU9ISVItemQueryItemDTOData queryItemDTOs = createMaterialData(OrgCode,materialCode);
		querymaterial.org.ufida.entitydata.UFIDAU9CBOPubControllerContextDTOData contextDTO = createMaterialPubContext(IDForCompany, OrgCode, UserCode);
		Holder<ArrayOfUFIDAU9ISVItemItemMasterDTOData> doResult = new Holder<ArrayOfUFIDAU9ISVItemItemMasterDTOData>();
		Holder<ArrayOfMessageBase> outMessages = new Holder<ArrayOfMessageBase>();
		try {
			queryMaterialPort._do(context, queryItemDTOs, contextDTO, doResult, outMessages);
		} catch (UFIDAU9ISVItemIBatchQueryItemByDTOSRVDoServiceExceptionFaultFaultMessage ex) {
			ex.printStackTrace();
			StringBuffer strBufferMessage = new StringBuffer();
			String strErrorTemp = "";
			querymaterial.org.datacontract.schemas._2004._07.system.Exception ed = ex.getFaultInfo();
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
			System.out.println(strBufferMessage);
			resultMap.put("error", strBufferMessage.toString());
		} catch (UFIDAU9ISVItemIBatchQueryItemByDTOSRVDoExceptionFaultFaultMessage e) {
			// TODO Auto-generated catch block
			resultMap.put("error", e.getMessage());
			e.printStackTrace();
		} catch (UFIDAU9ISVItemIBatchQueryItemByDTOSRVDoExceptionBaseFaultFaultMessage e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			resultMap.put("error", e.getMessage());
		} catch (UFIDAU9ISVItemIBatchQueryItemByDTOSRVDoServiceLostExceptionFaultFaultMessage e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			resultMap.put("error", e.getMessage());
		} catch (UFIDAU9ISVItemIBatchQueryItemByDTOSRVDoServiceExceptionDetailFaultFaultMessage e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			resultMap.put("error", e.getMessage());
		} 
		if(doResult.value!=null){
			List<querymaterial.org.ufida.entitydata.UFIDAU9ISVItemItemMasterDTOData> list = doResult.value.getUFIDAU9ISVItemItemMasterDTOData();
			if(list!=null && list.size()>0){
				    resultMap.put("success", true);
					System.out.println("Result["+0+"]="+list.get(0).getMCode().getValue());
					System.out.println("Code11="+list.get(0).getMCode1().getValue());
					System.out.println("Name="+list.get(0).getMName().getValue());
					//返回结果
					resultMap.put("Code", list.get(0).getMCode().getValue());
					resultMap.put("Name", list.get(0).getMName().getValue());
					resultMap.put("MainItemCategory", list.get(0).getMMainItemCategory().getValue().getMCode().getValue());
					resultMap.put("ItemFormAttribute", list.get(0).getMItemFormAttribute());
					resultMap.put("SPECS", list.get(0).getMSPECS().getValue());
					resultMap.put("PLMCode", list.get(0).getMCode1().getValue());
					try {
						resultMap.put("AssetCategory", list.get(0).getMAssetCategory().getValue().getMCode().getValue());
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
					//resultMap.put("AssetCategory", list.get(0).getMAssetCategory().getValue().getMCode().getValue());
					resultMap.put("UOM", list.get(0).getMInventoryUOM().getValue().getMCode().getValue());
					resultMap.put("SecondUOM", list.get(0).getMPriceUOM().getValue().getMCode().getValue());
					resultMap.put("Weight", list.get(0).getMWeight());
					resultMap.put("Material", list.get(0).getMDescFlexField().getValue().getMPrivateDescSeg1().getValue());
					resultMap.put("Description", list.get(0).getDescription().getValue());
					resultMap.put("OldNo", list.get(0).getMDescFlexField().getValue().getMPrivateDescSeg3().getValue());
					try {
						resultMap.put("Dept", list.get(0).getMMfgInfo().getValue().getMProductDepartment().getValue().getMCode().getValue());
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
					resultMap.put("Size", list.get(0).getMDescFlexField().getValue().getMPrivateDescSeg9().getValue());
			}else{
				System.out.println("Result is null.");
				resultMap.put("error", "Result is null.");
			}
		}
		System.out.println(doResult);
		System.out.println(outMessages);
		System.out.println("resultMap:" + resultMap);
		return om.writeValueAsString(resultMap);
	
	}
	public String query2(String materialCode) throws JsonGenerationException, JsonMappingException, IOException {
		Map<String,Object> resultMap = new LinkedHashMap<String, Object>();
		resultMap.put("success", false);
		ObjectMapper om = new ObjectMapper();
		//String asString = ;
		/*String IDForCompany = "001";		//"002";// 当前企业编号
		Long IDForOrganization = new Long("1001601073416051");	//new Long("1001212053116304");// 当前组织ID
		String OrgCode = "105";					//"102";
		Long IDForUsers = new Long("1001212053116969");		//new Long("1001212053116969");// 当前用户ID
		String UserCode = "admin";				//"admin";// 当前用户编码
*/		
		HashMap<String, String> hashMapAccountValues = U9ERPAccount.getU9Account();
		if(hashMapAccountValues == null){			
			resultMap.put("error", "创建当前上下文失败");
			return om.writeValueAsString(resultMap);
		}
		
		// 创建当前上下文（相当于验证信息，这部分需灵活配置）
		String IDForCompany = hashMapAccountValues.get(ConstantUtils.U9_ACCOUNT_ENTERPRISE_CODE);		//"002";// 当前企业编号
		Long IDForOrganization = new Long(hashMapAccountValues.get(ConstantUtils.U9_ACCOUNT_ZB_ORG_ID));	//new Long("1001212053116304");// 当前组织ID
		String OrgCode = hashMapAccountValues.get(ConstantUtils.U9_ACCOUNT_ZB_ORG_CODE);					//"102";
		Long IDForUsers = new Long(hashMapAccountValues.get(ConstantUtils.U9_ACCOUNT_USER_ID));		//new Long("1001212053116969");// 当前用户ID
		String UserCode = hashMapAccountValues.get(ConstantUtils.U9_ACCOUNT_USER_CODE);				//"admin";// 当前用户编码
		String UserName = hashMapAccountValues.get(ConstantUtils.U9_ACCOUNT_PREFERENCE);	
        
		QueryItemByCustSV queryMaterialService = new QueryItemByCustSV();
		QueryItemByCustSVSoap queryMaterialPort = queryMaterialService.getQueryItemByCustSVSoap();
		String result = queryMaterialPort._do(materialCode, IDForOrganization.toString(), IDForUsers.toString(), UserCode, UserName);
		/*for (int i = 0; i < keys.length; i++) {
			resultMap.put(keys[i], getContentByKey(result, keys[i]));
		}*/
		initResultMap(result, keys, resultMap);
		resultMap.put("success", true);
		System.out.println("result :" + result);
		System.out.println("resultMap :" + resultMap);
		return om.writeValueAsString(resultMap);
	
	}
	
	public String getContentByKey(String src,String key) {
		return  src.substring(src.indexOf("<"+key+">")+("<"+key+">").length(), src.indexOf("</"+key+">"));
	}
	public void initResultMap(String src,String[] keys,Map<String,Object> map) {		
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();  
			// 生产一个解析器对象  
			DocumentBuilder builder = factory.newDocumentBuilder();  
			// 开始解析xml文件，得到的解析结果是一个Document对象，Document对象叫做文档树对象  			
			InputStream strm =  new ByteArrayInputStream(src.getBytes("UTF-8"));
			Document document = builder.parse(strm); 
			for (int i = 0; i < keys.length; i++) {
				NodeList nodeList = document.getElementsByTagName(keys[i]);
				if(nodeList != null && nodeList.getLength() > 0) {
					String textContent = nodeList.item(0).getTextContent();
					map.put(keys[i], textContent == null ? "" : textContent);
				}
			}
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
	}
    public  void getAllNodes(Node parentNode) {		
		if(parentNode instanceof Element) {
			Element element = (Element) parentNode;
			String textContent = element.getTextContent();
			System.out.println(element.getNodeName() + ":" + textContent);			
			NamedNodeMap attributes = element.getAttributes();
			for (int i = 0; i < attributes.getLength(); i++) {
				Node item = attributes.item(i);
				System.out.println(item.getNodeName() + ":" + item.getNodeValue());
				//System.out.println();
			}
		}		
		NodeList childNodes = parentNode.getChildNodes();
		for (int i = 0; i < childNodes.getLength(); i++) {
			Node item = childNodes.item(i);
			getAllNodes(item);
		}
	}
	private  Object createMaterialContext(String entid, long orgid, long userid,
			String usercode) {
		querymaterial.org.datacontract.schemas._2004._07.ufsoft_ubf_util.ObjectFactory contextfactory = new querymaterial.org.datacontract.schemas._2004._07.ufsoft_ubf_util.ObjectFactory();
		querymaterial.org.datacontract.schemas._2004._07.ufsoft_ubf_util.ThreadContext tc = contextfactory
				.createThreadContext();

		querymaterial.com.microsoft.schemas._2003._10.serialization.arrays.ObjectFactory arrayFactory = new querymaterial.com.microsoft.schemas._2003._10.serialization.arrays.ObjectFactory();
		querymaterial.com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfanyTypeanyType contextarray = arrayFactory
				.createArrayOfKeyValueOfanyTypeanyType();

		querymaterial.com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfanyTypeanyType.KeyValueOfanyTypeanyType kv1 = new querymaterial.com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfanyTypeanyType.KeyValueOfanyTypeanyType();
		kv1.setKey("EnterpriseID");
		kv1.setValue(entid);// 填具体的企业编号
		contextarray.getKeyValueOfanyTypeanyType().add(kv1);
		querymaterial.com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfanyTypeanyType.KeyValueOfanyTypeanyType kv2 = new querymaterial.com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfanyTypeanyType.KeyValueOfanyTypeanyType();
		kv2.setKey("OrgID");
		kv2.setValue(orgid);// 填具体的组织ID
		contextarray.getKeyValueOfanyTypeanyType().add(kv2);
		querymaterial.com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfanyTypeanyType.KeyValueOfanyTypeanyType kv3 = new querymaterial.com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfanyTypeanyType.KeyValueOfanyTypeanyType();
		kv3.setKey("UserID");
		kv3.setValue(userid);// //填具体的用户ID
		contextarray.getKeyValueOfanyTypeanyType().add(kv3);
		querymaterial.com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfanyTypeanyType.KeyValueOfanyTypeanyType kv4 = new querymaterial.com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfanyTypeanyType.KeyValueOfanyTypeanyType();
		kv4.setKey("UserCode");
		kv4.setValue(usercode);// 填具体的用户编码
		contextarray.getKeyValueOfanyTypeanyType().add(kv4);
		querymaterial.com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfanyTypeanyType.KeyValueOfanyTypeanyType kv5 = new querymaterial.com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfanyTypeanyType.KeyValueOfanyTypeanyType();
		kv5.setKey("CultureName");
		kv5.setValue("zh-CN");// 当前语种
		contextarray.getKeyValueOfanyTypeanyType().add(kv5);

		tc.setNameValueHas(contextarray);
		return tc;
	}
	
	private ArrayOfUFIDAU9ISVItemQueryItemDTOData createMaterialData(String orgCode,String itemId) {
		querymaterial.org.ufida.entitydata.ObjectFactory objectFactory = new querymaterial.org.ufida.entitydata.ObjectFactory();
		ArrayOfUFIDAU9ISVItemQueryItemDTOData baseData = objectFactory.createArrayOfUFIDAU9ISVItemQueryItemDTOData();
		UFIDAU9ISVItemQueryItemDTOData secondData = objectFactory.createUFIDAU9ISVItemQueryItemDTOData();	
		//UFIDAU9CBOPubControllerCommonArchiveDataDTOData
		
		secondData.setMItemMaster(objectFactory.createUFIDAU9ISVItemQueryItemDTODataMItemMaster(SetQueryMaterialDto(itemId)));
		secondData.setMOrg(objectFactory.createUFIDAU9ISVItemQueryItemDTODataMOrg(SetQueryMaterialDto(orgCode)));
		//secondData.setMOrg(objectFactory.createUFIDAU9CBOPubControllerCommonArchiveDataDTOData(thirdData));
		baseData.getUFIDAU9ISVItemQueryItemDTOData().add(secondData);
		return baseData;
	}
	
	private  querymaterial.org.ufida.entitydata.UFIDAU9CBOPubControllerContextDTOData createMaterialPubContext(
			String EnCode, String OrgCode, String UserCode) {
		querymaterial.org.ufida.entitydata.UFIDAU9CBOPubControllerContextDTOData contextDTOData = new querymaterial.org.ufida.entitydata.UFIDAU9CBOPubControllerContextDTOData();
		querymaterial.org.ufida.entitydata.ObjectFactory factory = new querymaterial.org.ufida.entitydata.ObjectFactory();

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
	private static querymaterial.org.ufida.entitydata.UFIDAU9CBOPubControllerCommonArchiveDataDTOData SetQueryMaterialDto(
			String code) {
		querymaterial.org.ufida.entitydata.ObjectFactory dataFactory = new querymaterial.org.ufida.entitydata.ObjectFactory();
		querymaterial.org.ufida.entitydata.UFIDAU9CBOPubControllerCommonArchiveDataDTOData result = dataFactory
				.createUFIDAU9CBOPubControllerCommonArchiveDataDTOData();
		result.setMCode(dataFactory
				.createUFIDAU9CBOPubControllerCommonArchiveDataDTODataMCode(code));
		result.setSysState(querymaterial.org.datacontract.schemas._2004._07.ufsoft_ubf_pl.ObjectState.INSERTED);
		return result;
	}
	
}
