package fw10.util.u9erp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.ws.Holder;

import org.apache.log4j.Logger;
import org.w3c.dom.Node;

import com.teamcenter.clientx.ConstantUtils;

import queryitem.com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfanyTypeanyType;
import queryitem.com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import queryitem.com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfanyTypeanyType.KeyValueOfanyTypeanyType;
import queryitem.exceptions.ubf.ufsoft.ArrayOfMessageBase;
import queryitem.org.datacontract.schemas._2004._07.ufsoft_ubf.ServiceException;
import queryitem.org.tempuri.QueryItemCodeFromSPECSSVStub;
import queryitem.org.ufida.UFIDAU9CustFuwaPDMQueryItemCodeFromSPECSSVIQueryItemCodeFromSPECSSV;
import queryitem.org.ufida.UFIDAU9CustFuwaPDMQueryItemCodeFromSPECSSVIQueryItemCodeFromSPECSSVDoExceptionBaseFaultFaultMessage;
import queryitem.org.ufida.UFIDAU9CustFuwaPDMQueryItemCodeFromSPECSSVIQueryItemCodeFromSPECSSVDoExceptionFaultFaultMessage;
import queryitem.org.ufida.UFIDAU9CustFuwaPDMQueryItemCodeFromSPECSSVIQueryItemCodeFromSPECSSVDoServiceExceptionDetailFaultFaultMessage;
import queryitem.org.ufida.UFIDAU9CustFuwaPDMQueryItemCodeFromSPECSSVIQueryItemCodeFromSPECSSVDoServiceExceptionFaultFaultMessage;
import queryitem.org.ufida.UFIDAU9CustFuwaPDMQueryItemCodeFromSPECSSVIQueryItemCodeFromSPECSSVDoServiceLostExceptionFaultFaultMessage;


public class ItemOldQuery {

	public static boolean flagOK;
	/**
	 * @param args
	 */

	public static List<String>  queryOldID(Map<String, String> hashMapTCValues, int flag,String ico_class){
		System.out.println("Beginning....");
		flagOK = true;
		List<String> arrayStrings = null;
		// 创建当前上下文（相当于验证信息，这部分需灵活配置）	
		HashMap<String, String> hashMapAccountValues = U9ERPAccount.getU9Account();
		if(hashMapAccountValues==null){
			flagOK = false;
			return null;
		}
		
		// 创建当前上下文（相当于验证信息，这部分需灵活配置）
		String IDForCompany = hashMapAccountValues.get(ConstantUtils.U9_ACCOUNT_ENTERPRISE_CODE);		//"002";// 当前企业编号
		Long IDForOrganization = new Long(hashMapAccountValues.get(ConstantUtils.U9_ACCOUNT_SD_ORG_ID));	//new Long("1001212053116304");// 当前组织ID
		String OrgCode = hashMapAccountValues.get(ConstantUtils.U9_ACCOUNT_ORG_CODE);					//"102";
		Long IDForUsers = new Long(hashMapAccountValues.get(ConstantUtils.U9_ACCOUNT_USER_ID));		//new Long("1001212053116969");// 当前用户ID
		String UserCode = hashMapAccountValues.get(ConstantUtils.U9_ACCOUNT_USER_CODE);				//"admin";// 当前用户编码
		// 创建上下文环境
		Object context = createContext(IDForCompany, IDForOrganization,
						IDForUsers, UserCode);
		Logger log=Logger.getLogger("com.teamcenter.rac");
		log.debug("IDForCompany:"+ IDForCompany);
		log.debug("IDForOrganization:"+ IDForOrganization);
		log.debug("IDForUsers:"+ IDForUsers);
		log.debug("UserCode:"+ UserCode);
		// 具体创建查寻逻辑
		//QueryItemCodeFromSPECSSVStub queryStub = new QueryItemCodeFromSPECSSVStub();
		//UFIDAU9CustFuwaPDMQueryItemCodeFromSPECSSVIQueryItemCodeFromSPECSSV querySV = queryStub.getBasicHttpBindingUFIDAU9CustFuwaPDMQueryItemCodeFromSPECSSVIQueryItemCodeFromSPECSSV();
		
		QueryItemCodeFromSPECSSVStub queryStub = new QueryItemCodeFromSPECSSVStub();
		UFIDAU9CustFuwaPDMQueryItemCodeFromSPECSSVIQueryItemCodeFromSPECSSV querySV = null;
		try{
			querySV = queryStub.getBasicHttpBindingUFIDAU9CustFuwaPDMQueryItemCodeFromSPECSSVIQueryItemCodeFromSPECSSV();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		Holder<ArrayOfstring> doResult = new Holder<ArrayOfstring>();
		Holder<ArrayOfMessageBase> outMessages = new Holder<ArrayOfMessageBase>();
		try{
			if(flag==0){
				System.out.println("传递图号："+hashMapTCValues.get("item_id"));
				querySV._do(context, IDForOrganization, hashMapTCValues.get("item_id"), 2,doResult, outMessages); //第一步根据图号查询 例如："（2S）DD0040B0-6"
			//	querySV._do(context, IDForOrganization,"AM0008M0-7",0, doResult, outMessages);
				arrayStrings = doResult.value.getString();
				if(arrayStrings!=null && arrayStrings.size()>0){
					for(int i=0; i<arrayStrings.size(); i++){
						System.out.println("图号查找_doResult["+i+"]="+arrayStrings.get(i));
					}
				}else{
					System.out.println("图号查找_doResult is null.");
					return null;
				}
			}else if(flag==1){
				
				// 根据图号查询不到则再通过分类进行查询
				String mainItemCategory = ItemBatchCreateLX.getInstance().getMainItemCategory(ico_class);
				System.out.println("传递分类："+mainItemCategory);
				querySV._do(context, IDForOrganization, mainItemCategory, 1,doResult, outMessages); //第一步根据图号查询 例如："（2S）DD0040B0-6"
				
				arrayStrings = doResult.value.getString();
				if(arrayStrings!=null && arrayStrings.size()>0){
					for(int i=0; i<arrayStrings.size(); i++){
						System.out.println("分类查找_doResult["+i+"]="+arrayStrings.get(i));
					}
					
				}else{
					System.out.println("分类查找_doResult is null.");
					return null;
				}
			}
		}
		catch(Exception e1)
		{
			e1.printStackTrace();
			System.out.println("try again........");
		try {
			//调用类型，0为根据图号查编码，1为根据分类编码查找流水号，反回一个对应物料编码
			if(flag==0){
				System.out.println("传递图号："+hashMapTCValues.get("item_id"));
				querySV._do(context, IDForOrganization, hashMapTCValues.get("item_id"), 2,doResult, outMessages); //第一步根据图号查询 例如："（2S）DD0040B0-6"
				
				arrayStrings = doResult.value.getString();
				if(arrayStrings!=null && arrayStrings.size()>0){
					for(int i=0; i<arrayStrings.size(); i++){
						System.out.println("图号查找_doResult["+i+"]="+arrayStrings.get(i));
					}
				}else{
					System.out.println("图号查找_doResult is null.");
					return null;
				}
			}else if(flag==1){
				
				// 根据图号查询不到则再通过分类进行查询
				String mainItemCategory = ItemBatchCreateLX.getInstance().getMainItemCategory(ico_class);
				System.out.println("传递分类："+mainItemCategory);
				querySV._do(context, IDForOrganization, mainItemCategory, 1,doResult, outMessages); //第一步根据图号查询 例如："（2S）DD0040B0-6"
				
				arrayStrings = doResult.value.getString();
				if(arrayStrings!=null && arrayStrings.size()>0){
					for(int i=0; i<arrayStrings.size(); i++){
						System.out.println("分类查找_doResult["+i+"]="+arrayStrings.get(i));
					}
					
				}else{
					System.out.println("分类查找_doResult is null.");
					return null;
				}
			}
			
		} catch (UFIDAU9CustFuwaPDMQueryItemCodeFromSPECSSVIQueryItemCodeFromSPECSSVDoServiceExceptionFaultFaultMessage e) {
			flagOK = false;
			e.printStackTrace();
			StringBuffer strBufferMessage = new StringBuffer();
			String strErrorTemp = "";
			ServiceException ed = e.getFaultInfo();
			for (int i = 0; i < ed.getAny().size() - 1; i++) {
//				strErrorTemp = ed.getAny().get(i).toString();
//				System.out.println(strErrorTemp);
//				strBufferMessage.append(strErrorTemp).append("\n");
				Node nodeTemp = ed.getAny().get(i).getFirstChild();
				if(nodeTemp!=null){
					strErrorTemp = nodeTemp.toString();
					System.out.println(strErrorTemp);
					strBufferMessage.append(strErrorTemp).append("\n");
				}
				
			}
//			if(strBufferMessage.length()>0){
//				String[] strArrayTemps = strBufferMessage.toString().split("\n");
//				StringViewerDialog dialog = new StringViewerDialog(strArrayTemps);
//				dialog.setVisible(true);
//			}
			//MessageBox.post(AIFUtility.getActiveDesktop().getFrame(), strBufferMessage.toString(), "错误", MessageBox.ERROR);
			
			System.out.println(strBufferMessage.toString());
			return null;
		} catch (UFIDAU9CustFuwaPDMQueryItemCodeFromSPECSSVIQueryItemCodeFromSPECSSVDoExceptionFaultFaultMessage e) {
			flagOK = false;
			e.printStackTrace();

			//MessageBox.post(AIFUtility.getActiveDesktop().getFrame(), e.getMessage(), "错误", MessageBox.ERROR);
			System.out.println(e.getMessage());
			return null;
		} catch (UFIDAU9CustFuwaPDMQueryItemCodeFromSPECSSVIQueryItemCodeFromSPECSSVDoServiceLostExceptionFaultFaultMessage e) {
			flagOK = false;
			e.printStackTrace();
			//MessageBox.post(AIFUtility.getActiveDesktop().getFrame(), e.getMessage(), "错误", MessageBox.ERROR);
			System.out.println(e.getMessage());
			return null;
		} catch (UFIDAU9CustFuwaPDMQueryItemCodeFromSPECSSVIQueryItemCodeFromSPECSSVDoExceptionBaseFaultFaultMessage e) {
			flagOK = false;
			e.printStackTrace();
			System.out.println(e.getMessage());
			//MessageBox.post(AIFUtility.getActiveDesktop().getFrame(), e.getMessage(), "错误", MessageBox.ERROR);
			
			return null;
		} catch (UFIDAU9CustFuwaPDMQueryItemCodeFromSPECSSVIQueryItemCodeFromSPECSSVDoServiceExceptionDetailFaultFaultMessage e) {
			flagOK = false;
			e.printStackTrace();
			System.out.println(e.getMessage());
			//MessageBox.post(AIFUtility.getActiveDesktop().getFrame(), e.getMessage(), "错误", MessageBox.ERROR);
			
			return null;
		}catch(Exception e)
		{
			flagOK = false;
			e.printStackTrace();
			System.out.println(e.getMessage());
			//MessageBox.post(AIFUtility.getActiveDesktop().getFrame(), e.getMessage(), "错误", MessageBox.ERROR);
			
		}
		}
		return arrayStrings;
	}
	
	
	public static List<String>  queryZBOldID(Map<String, String> hashMapTCValues, int flag,String erp_class){
		System.out.println("Beginning....");
		flagOK = true;
		List<String> arrayStrings = null;
		// 创建当前上下文（相当于验证信息，这部分需灵活配置）	
		HashMap<String, String> hashMapAccountValues = U9ERPAccount.getU9Account();
		if(hashMapAccountValues==null){
			flagOK = false;
			return null;
		}
		
		// 创建当前上下文（相当于验证信息，这部分需灵活配置）
		String IDForCompany = hashMapAccountValues.get(ConstantUtils.U9_ACCOUNT_ENTERPRISE_CODE);		//"002";// 当前企业编号
		Long IDForOrganization = new Long(hashMapAccountValues.get(ConstantUtils.U9_ACCOUNT_ZB_ORG_ID));	//new Long("1001212053116304");// 当前组织ID
		String OrgCode = hashMapAccountValues.get(ConstantUtils.U9_ACCOUNT_ORG_CODE);					//"102";
		Long IDForUsers = new Long(hashMapAccountValues.get(ConstantUtils.U9_ACCOUNT_USER_ID));		//new Long("1001212053116969");// 当前用户ID
		String UserCode = hashMapAccountValues.get(ConstantUtils.U9_ACCOUNT_USER_CODE);				//"admin";// 当前用户编码
		// 创建上下文环境
		Object context = createContext(IDForCompany, IDForOrganization,
						IDForUsers, UserCode);
		Logger log=Logger.getLogger("com.teamcenter.rac");
		log.debug("IDForCompany:"+ IDForCompany);
		log.debug("IDForOrganization:"+ IDForOrganization);
		log.debug("IDForUsers:"+ IDForUsers);
		log.debug("UserCode:"+ UserCode);
		// 具体创建查寻逻辑
		//QueryItemCodeFromSPECSSVStub queryStub = new QueryItemCodeFromSPECSSVStub();
		//UFIDAU9CustFuwaPDMQueryItemCodeFromSPECSSVIQueryItemCodeFromSPECSSV querySV = queryStub.getBasicHttpBindingUFIDAU9CustFuwaPDMQueryItemCodeFromSPECSSVIQueryItemCodeFromSPECSSV();
		
		QueryItemCodeFromSPECSSVStub queryStub = new QueryItemCodeFromSPECSSVStub();
		UFIDAU9CustFuwaPDMQueryItemCodeFromSPECSSVIQueryItemCodeFromSPECSSV querySV = null;
		try{
			querySV = queryStub.getBasicHttpBindingUFIDAU9CustFuwaPDMQueryItemCodeFromSPECSSVIQueryItemCodeFromSPECSSV();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		Holder<ArrayOfstring> doResult = new Holder<ArrayOfstring>();
		Holder<ArrayOfMessageBase> outMessages = new Holder<ArrayOfMessageBase>();
		try{
			if(flag==0){
				System.out.println("传递图号："+hashMapTCValues.get("item_id"));
				querySV._do(context, IDForOrganization, hashMapTCValues.get("item_id"), 2,doResult, outMessages); //第一步根据图号查询 例如："（2S）DD0040B0-6"
			//	querySV._do(context, IDForOrganization,"AM0008M0-7",0, doResult, outMessages);
				arrayStrings = doResult.value.getString();
				if(arrayStrings!=null && arrayStrings.size()>0){
					for(int i=0; i<arrayStrings.size(); i++){
						System.out.println("图号查找_doResult["+i+"]="+arrayStrings.get(i));
					}
				}else{
					System.out.println("图号查找_doResult is null.");
					return null;
				}
			}else if(flag==1){
				
				// 根据图号查询不到则再通过分类进行查询
				String mainItemCategory ;
				if(hashMapTCValues.containsKey(ConstantUtils.TC_LXCP_CLASS_PROPERTY)) {
					//mainItemCategory = hashMapTCValues.get(ConstantUtils.TC_LXCP_CLASS_PROPERTY);
					//erp_class
					mainItemCategory = erp_class;
				} else {
					//mainItemCategory = ItemBatchCreateLX.getInstance().getMainItemCategory(erp_class);
					mainItemCategory = erp_class;
				}
				System.out.println("传递分类："+mainItemCategory);
				querySV._do(context, IDForOrganization, mainItemCategory, 1,doResult, outMessages); //第一步根据图号查询 例如："（2S）DD0040B0-6"
				
				arrayStrings = doResult.value.getString();
				if(arrayStrings!=null && arrayStrings.size()>0){
					for(int i=0; i<arrayStrings.size(); i++){
						System.out.println("分类查找_doResult["+i+"]="+arrayStrings.get(i));
					}
					
				}else{
					System.out.println("分类查找_doResult is null.");
					return null;
				}
			}
		}
		catch(Exception e1)
		{
			e1.printStackTrace();
			System.out.println("try again........");
		try {
			//调用类型，0为根据图号查编码，1为根据分类编码查找流水号，反回一个对应物料编码
			if(flag==0){
				System.out.println("传递图号："+hashMapTCValues.get("item_id"));
				querySV._do(context, IDForOrganization, hashMapTCValues.get("item_id"), 2,doResult, outMessages); //第一步根据图号查询 例如："（2S）DD0040B0-6"
				
				arrayStrings = doResult.value.getString();
				if(arrayStrings!=null && arrayStrings.size()>0){
					for(int i=0; i<arrayStrings.size(); i++){
						System.out.println("图号查找_doResult["+i+"]="+arrayStrings.get(i));
					}
				}else{
					System.out.println("图号查找_doResult is null.");
					return null;
				}
			}else if(flag==1){
				
				// 根据图号查询不到则再通过分类进行查询
				String mainItemCategory ;
				if(hashMapTCValues.containsKey("fw9_CP_LBJ_03")) {
					mainItemCategory = hashMapTCValues.get("fw9_CP_LBJ_03");
				} else {
					mainItemCategory = ItemBatchCreateLX.getInstance().getMainItemCategory(erp_class);
				}
				
				System.out.println("传递分类："+mainItemCategory);
				querySV._do(context, IDForOrganization, mainItemCategory, 1,doResult, outMessages); //第一步根据图号查询 例如："（2S）DD0040B0-6"
				
				arrayStrings = doResult.value.getString();
				if(arrayStrings!=null && arrayStrings.size()>0){
					for(int i=0; i<arrayStrings.size(); i++){
						System.out.println("分类查找_doResult["+i+"]="+arrayStrings.get(i));
					}
					
				}else{
					System.out.println("分类查找_doResult is null.");
					return null;
				}
			}
			
		} catch (UFIDAU9CustFuwaPDMQueryItemCodeFromSPECSSVIQueryItemCodeFromSPECSSVDoServiceExceptionFaultFaultMessage e) {
			flagOK = false;
			e.printStackTrace();
			StringBuffer strBufferMessage = new StringBuffer();
			String strErrorTemp = "";
			ServiceException ed = e.getFaultInfo();
			for (int i = 0; i < ed.getAny().size() - 1; i++) {
//				strErrorTemp = ed.getAny().get(i).toString();
//				System.out.println(strErrorTemp);
//				strBufferMessage.append(strErrorTemp).append("\n");
				Node nodeTemp = ed.getAny().get(i).getFirstChild();
				if(nodeTemp!=null){
					strErrorTemp = nodeTemp.toString();
					System.out.println(strErrorTemp);
					strBufferMessage.append(strErrorTemp).append("\n");
				}
				
			}
//			if(strBufferMessage.length()>0){
//				String[] strArrayTemps = strBufferMessage.toString().split("\n");
//				StringViewerDialog dialog = new StringViewerDialog(strArrayTemps);
//				dialog.setVisible(true);
//			}
			//MessageBox.post(AIFUtility.getActiveDesktop().getFrame(), strBufferMessage.toString(), "错误", MessageBox.ERROR);
			
			System.out.println(strBufferMessage.toString());
			return null;
		} catch (UFIDAU9CustFuwaPDMQueryItemCodeFromSPECSSVIQueryItemCodeFromSPECSSVDoExceptionFaultFaultMessage e) {
			flagOK = false;
			e.printStackTrace();

			//MessageBox.post(AIFUtility.getActiveDesktop().getFrame(), e.getMessage(), "错误", MessageBox.ERROR);
			System.out.println(e.getMessage());
			return null;
		} catch (UFIDAU9CustFuwaPDMQueryItemCodeFromSPECSSVIQueryItemCodeFromSPECSSVDoServiceLostExceptionFaultFaultMessage e) {
			flagOK = false;
			e.printStackTrace();
			//MessageBox.post(AIFUtility.getActiveDesktop().getFrame(), e.getMessage(), "错误", MessageBox.ERROR);
			System.out.println(e.getMessage());
			return null;
		} catch (UFIDAU9CustFuwaPDMQueryItemCodeFromSPECSSVIQueryItemCodeFromSPECSSVDoExceptionBaseFaultFaultMessage e) {
			flagOK = false;
			e.printStackTrace();
			System.out.println(e.getMessage());
			//MessageBox.post(AIFUtility.getActiveDesktop().getFrame(), e.getMessage(), "错误", MessageBox.ERROR);
			
			return null;
		} catch (UFIDAU9CustFuwaPDMQueryItemCodeFromSPECSSVIQueryItemCodeFromSPECSSVDoServiceExceptionDetailFaultFaultMessage e) {
			flagOK = false;
			e.printStackTrace();
			System.out.println(e.getMessage());
			//MessageBox.post(AIFUtility.getActiveDesktop().getFrame(), e.getMessage(), "错误", MessageBox.ERROR);
			
			return null;
		}catch(Exception e)
		{
			flagOK = false;
			e.printStackTrace();
			System.out.println(e.getMessage());
			//MessageBox.post(AIFUtility.getActiveDesktop().getFrame(), e.getMessage(), "错误", MessageBox.ERROR);
			
		}
		}
		return arrayStrings;
	}
	
	
	
	// 创建上下文环境　
		private static Object createContext(String entid, long orgid, long userid,
				String usercode) {
			queryitem.org.datacontract.schemas._2004._07.ufsoft_ubf_util.ObjectFactory contextfactory = new queryitem.org.datacontract.schemas._2004._07.ufsoft_ubf_util.ObjectFactory();
			queryitem.org.datacontract.schemas._2004._07.ufsoft_ubf_util.ThreadContext tc = contextfactory
					.createThreadContext();

			queryitem.com.microsoft.schemas._2003._10.serialization.arrays.ObjectFactory  arrayFactory = new queryitem.com.microsoft.schemas._2003._10.serialization.arrays.ObjectFactory ();
			ArrayOfKeyValueOfanyTypeanyType contextarray = arrayFactory
					.createArrayOfKeyValueOfanyTypeanyType();

			KeyValueOfanyTypeanyType kv1 = new KeyValueOfanyTypeanyType();
			kv1.setKey("EnterpriseID");
			kv1.setValue(entid);// 填具体的企业编号
			contextarray.getKeyValueOfanyTypeanyType().add(kv1);
			KeyValueOfanyTypeanyType kv2 = new KeyValueOfanyTypeanyType();
			kv2.setKey("OrgID");
			kv2.setValue(orgid);// 填具体的组织ID
			contextarray.getKeyValueOfanyTypeanyType().add(kv2);
			KeyValueOfanyTypeanyType kv3 = new KeyValueOfanyTypeanyType();
			kv3.setKey("UserID");
			kv3.setValue(userid);// //填具体的用户ID
			contextarray.getKeyValueOfanyTypeanyType().add(kv3);
			KeyValueOfanyTypeanyType kv4 = new KeyValueOfanyTypeanyType();
			kv4.setKey("UserCode");
			kv4.setValue(usercode);// 填具体的用户编码
			contextarray.getKeyValueOfanyTypeanyType().add(kv4);
			KeyValueOfanyTypeanyType kv5 = new KeyValueOfanyTypeanyType();
			kv5.setKey("CultureName");
			kv5.setValue("zh-CN");// 当前语种
			contextarray.getKeyValueOfanyTypeanyType().add(kv5);

			tc.setNameValueHas(contextarray);
			return tc;
		}
	
}
