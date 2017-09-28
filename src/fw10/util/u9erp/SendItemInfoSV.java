package fw10.util.u9erp;



import java.util.HashMap;

import com.teamcenter.clientx.ConstantUtils;

import senditem.u9erp.ArrayOfKeyValueOfanyTypeanyType;
import senditem.u9erp.ArrayOfKeyValueOfanyTypeanyType.KeyValueOfanyTypeanyType;
import senditem.u9erp.ArrayOfMessageBase;
import senditem.u9erp.ArrayOflong;
import senditem.u9erp.FuwaItemSendSVStub;
import senditem.u9erp.ObjectFactory;
import senditem.u9erp.ServiceException;
import senditem.u9erp.ThreadContext;
import senditem.u9erp.UFIDAU9CustFuwaPDMItemSendSVIFuwaItemSendSV;
import senditem.u9erp.UFIDAU9CustFuwaPDMItemSendSVIFuwaItemSendSVDoServiceExceptionFaultFaultMessage;
import senditem.u9erp.UFIDAU9CustFuwaPDMItemSendSVItemInfoDTOData;



public class SendItemInfoSV {
	
	private static class Temp {     
        public final static SendItemInfoSV instance = new SendItemInfoSV();     
    }     
    
    public static SendItemInfoSV getInstance() {  
        return Temp.instance;     
    }
	public boolean flagOK;
/**
 * 同步BOM信息
 */
	public void SendItemInfoSVAction(String itemcode){

		System.out.println("Beginning....");
		flagOK = true;
		
		// 创建当前上下文（相当于验证信息，这部分需灵活配置）		
		HashMap<String, String> hashMapAccountValues = U9ERPAccount.getU9Account();
		if(hashMapAccountValues==null){
			flagOK = false;
			return;
		}
		// 创建当前上下文（相当于验证信息，这部分需灵活配置）
		String IDForCompany = hashMapAccountValues.get(ConstantUtils.U9_ACCOUNT_ENTERPRISE_CODE);		//"002";// 当前企业编号
		Long IDForOrganization = new Long(hashMapAccountValues.get(ConstantUtils.U9_ACCOUNT_SD_ORG_ID));	//new Long("1001212053116304");// 当前组织ID
		String OrgCode = hashMapAccountValues.get(ConstantUtils.U9_ACCOUNT_ORG_CODE);					//"102";
		Long IDForUsers = new Long(hashMapAccountValues.get(ConstantUtils.U9_ACCOUNT_USER_ID));		//new Long("1001212053116969");// 当前用户ID
		String UserCode = hashMapAccountValues.get(ConstantUtils.U9_ACCOUNT_USER_CODE);				//"admin";// 当前用户编码
	
		Long ZBIDForOrganization = new Long(hashMapAccountValues.get(ConstantUtils.U9_ACCOUNT_ZB_ORG_ID));	//new Long("1001212053116304");// 当前组织ID
//		String ZBOrgCode = hashMapAccountValues.get(ConstantUtils.U9_ACCOUNT_ZB_ORG_CODE);					//"102";
//	
		
		// 创建上下文环境
		System.out.println("IDForCompany:"+IDForCompany);
		System.out.println("IDForOrganization:"+ZBIDForOrganization);
		System.out.println("IDForUsers:"+IDForUsers);
		System.out.println("UserCode:"+UserCode);
		
		
			// 开始调用ERP服务，“创建服务”
		FuwaItemSendSVStub senditemsvclient = new FuwaItemSendSVStub();
		UFIDAU9CustFuwaPDMItemSendSVIFuwaItemSendSV createsv = null;
		try{
			createsv = senditemsvclient.getBasicHttpBindingUFIDAU9CustFuwaPDMItemSendSVIFuwaItemSendSV();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		// 给头、明细赋值
		
		// doResult就是返回结果。
		javax.xml.ws.Holder<java.lang.String> doResult =new javax.xml.ws.Holder<java.lang.String> ();
		javax.xml.ws.Holder<ArrayOfMessageBase> outMessages = new javax.xml.ws.Holder<ArrayOfMessageBase>();// 这个参数暂未使用
		
		ObjectFactory dataFactory = new ObjectFactory();
		
		UFIDAU9CustFuwaPDMItemSendSVItemInfoDTOData iteminfo=dataFactory.createUFIDAU9CustFuwaPDMItemSendSVItemInfoDTOData();
		
		
		System.out.println("iteminfo.setMFromOrg:"+ZBIDForOrganization);
		System.out.println("iteminfo.setMItemCode:"+itemcode);
		System.out.println("iteminfo.setIDForOrganization:"+ZBIDForOrganization);
		
		
		iteminfo.setMFromOrg(ZBIDForOrganization);
		
		iteminfo.setMItemCode(dataFactory.createUFIDAU9CustFuwaPDMItemSendSVItemInfoDTODataMItemCode(itemcode));
		ArrayOflong orgLst= new ArrayOflong(); 
		orgLst.getLong().add(IDForOrganization);
		iteminfo.setMToOrg(dataFactory.createUFIDAU9CustFuwaPDMItemSendSVItemInfoDTODataMToOrg(orgLst));

		try {
			
			Object context = createContext(IDForCompany, ZBIDForOrganization,
					IDForUsers, UserCode);
			// 将料品内容传入ERP（入和返的值，均作为此方法的参数）。
			// context验证信息，dto入的值，doResult方法返回值，outMessages无用字段，可不理会
			createsv._do(context, iteminfo, doResult, outMessages);
			//_do(context, itemcode,  doResult, outMessages);
			System.out.println("Invoke end ...");
		}

		// 捕获服务中的异常
		catch (Exception ex1) {
			System.out.println("time out ,call service again......");
			try{
				Object context = createContext(IDForCompany, ZBIDForOrganization,
						IDForUsers, UserCode);
				createsv._do(context, iteminfo, doResult, outMessages);
			System.out.println("Invoke end ...");
			}catch(UFIDAU9CustFuwaPDMItemSendSVIFuwaItemSendSVDoServiceExceptionFaultFaultMessage ex)
			{
				flagOK = false;
				// 下面的代码可以将服务端的异常信息给显示输出来。
				StringBuffer strBufferMessage = new StringBuffer();
				String strErrorTemp = "";
				ServiceException ed = ex.getFaultInfo();
				for (int i = 0; i < ed.getAny().size() - 1; i++) {
//					System.out.println(ed.getAny().get(i).toString());
//					System.out.println(ed.getAny().get(i).getFirstChild()
//							.toString());
					
					org.w3c.dom.Node nodeTemp = ed.getAny().get(i).getFirstChild();
					if(nodeTemp!=null){
						strErrorTemp = nodeTemp.toString();
						System.out.println(strErrorTemp);
						strBufferMessage.append(strErrorTemp).append("\n");
					}
					
				}
//				if(strBufferMessage.length()>0){
//					String[] strArrayTemps = strBufferMessage.toString().split("\n");
//					StringViewerDialog dialog = new StringViewerDialog(strArrayTemps);
//					dialog.setVisible(true);
//				}
				//MessageBox.post(AIFUtility.getActiveDesktop().getFrame(), strBufferMessage.toString(), "错误", MessageBox.ERROR);
			}catch (Exception ex) {
				flagOK = false;
				System.out.println("Error..");
				System.out.println(ex.getMessage());
				System.out.println(ex.getClass().toString());
				System.out.println(ex.getStackTrace().toString());
				//MessageBox.post(AIFUtility.getActiveDesktop().getFrame(),ex.getMessage(), "错误", MessageBox.ERROR);
				
				
			}
		
		} 
		if(doResult.value!=null){
			System.out.println("doResult.value:"+doResult.value);
//			if(doResult.value)
//			{
//				flagOK=true;
//				System.out.println("Result is true.");
//			}else
//			{
//				flagOK=false;
//				System.out.println("Result is false.");
//			}
			flagOK=true;
		}else
		{
			flagOK=true;
			System.out.println("Result is null.");
		}
		
		
		System.out.println("end...");
		System.out.println("Invoke success...");
	
	}
	

	

	// 创建上下文环境　
	private static Object createContext(String entid, long orgid, long userid,
			String usercode) {
//		org.datacontract.schemas._2004._07.ufsoft_ubf_util.ObjectFactory contextfactory = new org.datacontract.schemas._2004._07.ufsoft_ubf_util.ObjectFactory();
//		org.datacontract.schemas._2004._07.ufsoft_ubf_util.ThreadContext tc = contextfactory
//				.createThreadContext();
//
//		com.microsoft.schemas._2003._10.serialization.arrays.ObjectFactory arrayFactory = new com.microsoft.schemas._2003._10.serialization.arrays.ObjectFactory();
//		ArrayOfKeyValueOfanyTypeanyType contextarray = arrayFactory.createArrayOfKeyValueOfanyTypeanyType();
		
		ObjectFactory contextfactory = new ObjectFactory();
		ThreadContext tc = contextfactory
				.createThreadContext();

		ObjectFactory arrayFactory = new ObjectFactory();
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
		KeyValueOfanyTypeanyType kv6 = new KeyValueOfanyTypeanyType();
		kv6.setKey("DefaultCultureName");
		kv6.setValue("zh-CN");// 默认语种
		contextarray.getKeyValueOfanyTypeanyType().add(kv6);
		
		tc.setNameValueHas(contextarray);
		return tc;
	}
}
