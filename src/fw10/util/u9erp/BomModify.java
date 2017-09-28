package fw10.util.u9erp;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.Holder;

import org.w3c.dom.Node;

import com.teamcenter.clientx.ConstantUtils;

import alterbom.com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfanyTypeanyType;
import alterbom.com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfanyTypeanyType.KeyValueOfanyTypeanyType;
import alterbom.exceptions.ubf.ufsoft.ArrayOfMessageBase;
import alterbom.org.datacontract.schemas._2004._07.ufsoft_ubf.ServiceException;
import alterbom.org.datacontract.schemas._2004._07.ufsoft_ubf_pl.ObjectState;
import alterbom.org.tempuri.ImportBOMSvStub;
import alterbom.org.ufida.UFIDAU9ISVMFGBOMIImportBOMSv;
import alterbom.org.ufida.UFIDAU9ISVMFGBOMIImportBOMSvDoExceptionBaseFaultFaultMessage;
import alterbom.org.ufida.UFIDAU9ISVMFGBOMIImportBOMSvDoExceptionFaultFaultMessage;
import alterbom.org.ufida.UFIDAU9ISVMFGBOMIImportBOMSvDoServiceExceptionDetailFaultFaultMessage;
import alterbom.org.ufida.UFIDAU9ISVMFGBOMIImportBOMSvDoServiceExceptionFaultFaultMessage;
import alterbom.org.ufida.UFIDAU9ISVMFGBOMIImportBOMSvDoServiceLostExceptionFaultFaultMessage;
import alterbom.org.ufida.entitydata.ArrayOfUFIDAU9ISVMFGBOMBOMCompPositionDTO4CreateSvData;
import alterbom.org.ufida.entitydata.ArrayOfUFIDAU9ISVMFGBOMBOMComponentDTO4CreateSvData;
import alterbom.org.ufida.entitydata.ArrayOfUFIDAU9ISVMFGBOMBOMMasterDTO4CreateSvData;
import alterbom.org.ufida.entitydata.ArrayOfUFIDAU9ISVMFGBOMLogDTO4CreateSvData;
import alterbom.org.ufida.entitydata.ObjectFactory;
import alterbom.org.ufida.entitydata.UFIDAU9CBOPubControllerCommonArchiveDataDTOData;
import alterbom.org.ufida.entitydata.UFIDAU9CBOPubControllerContextDTOData;
import alterbom.org.ufida.entitydata.UFIDAU9ISVMFGBOMBOMCompPositionDTO4CreateSvData;
import alterbom.org.ufida.entitydata.UFIDAU9ISVMFGBOMBOMComponentDTO4CreateSvData;
import alterbom.org.ufida.entitydata.UFIDAU9ISVMFGBOMBOMMasterDTO4CreateSvData;
import alterbom.org.ufida.entitydata.UFIDAU9ISVMFGBOMLogDTO4CreateSvData;





public class BomModify {



	public static boolean createBom(Map<String, String> mapBomlineParentValues, Vector<Map<String, String>> vectorChildBomlineValues,Date date,String unit) throws DatatypeConfigurationException {
		System.out.println("Beginning....");
		// 创建当前上下文（相当于验证信息，这部分需灵活配置）
		HashMap<String, String> hashMapAccountValues = U9ERPAccount.getU9Account();
		if(hashMapAccountValues==null){
			return false;
		}
		
		// 创建当前上下文（相当于验证信息，这部分需灵活配置）
		String IDForCompany = hashMapAccountValues.get(ConstantUtils.U9_ACCOUNT_ENTERPRISE_CODE);		//"002";// 当前企业编号
		Long IDForOrganization = new Long(hashMapAccountValues.get(ConstantUtils.U9_ACCOUNT_ORG_ID));	//new Long("1001212053116304");// 当前组织ID
		String OrgCode = hashMapAccountValues.get(ConstantUtils.U9_ACCOUNT_ORG_CODE);					//"102";
		Long IDForUsers = new Long(hashMapAccountValues.get(ConstantUtils.U9_ACCOUNT_USER_ID));		//new Long("1001212053116969");// 当前用户ID
		String UserCode = hashMapAccountValues.get(ConstantUtils.U9_ACCOUNT_USER_CODE);				//"admin";// 当前用户编码
        IDForOrganization = new Long("1001601073416051");
        OrgCode = "105";
		// 创建上下文环境
		Object context = createContext(IDForCompany, IDForOrganization,
				IDForUsers, UserCode);
		UFIDAU9CBOPubControllerContextDTOData pubContext = CreatePubContext(
				IDForCompany, OrgCode, UserCode);

		// 开始调用ERP服务 ,"创建服务"
		ImportBOMSvStub modifyClient = new ImportBOMSvStub();
		UFIDAU9ISVMFGBOMIImportBOMSv modifySV = modifyClient.getBasicHttpBindingUFIDAU9ISVMFGBOMIImportBOMSv();


		// 开始创建业务逻辑
		ArrayOfUFIDAU9ISVMFGBOMBOMMasterDTO4CreateSvData bOMMasterDTOList = createDTO(mapBomlineParentValues, vectorChildBomlineValues,date, unit);

		// doResult就是返回结果。
		Holder<ArrayOfUFIDAU9ISVMFGBOMLogDTO4CreateSvData> doResult = new Holder<ArrayOfUFIDAU9ISVMFGBOMLogDTO4CreateSvData>();

		Holder<ArrayOfMessageBase> outMessages = new Holder<ArrayOfMessageBase>();// 这个参数暂未使用

		try {
			modifySV._do(context, bOMMasterDTOList, pubContext, false,
					doResult, outMessages);
			System.out.println("END....");
		} catch (UFIDAU9ISVMFGBOMIImportBOMSvDoServiceExceptionFaultFaultMessage ex) {
			ex.printStackTrace();
			StringBuffer strBufferMessage = new StringBuffer();
			String strErrorTemp = "";
			ServiceException ed = ex.getFaultInfo();
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
			//MessageBox.post(AIFUtility.getActiveDesktop().getFrame(), strBufferMessage.toString(), "错误", MessageBox.ERROR);
			return false;
		} catch (UFIDAU9ISVMFGBOMIImportBOMSvDoExceptionFaultFaultMessage e) {
			e.printStackTrace();
			return false;
		} catch (UFIDAU9ISVMFGBOMIImportBOMSvDoExceptionBaseFaultFaultMessage e) {
			e.printStackTrace();
			return false;
		} catch (UFIDAU9ISVMFGBOMIImportBOMSvDoServiceLostExceptionFaultFaultMessage e) {
			e.printStackTrace();
			return false;
		} catch (UFIDAU9ISVMFGBOMIImportBOMSvDoServiceExceptionDetailFaultFaultMessage e) {
			e.printStackTrace();
			return false;
		}

		ArrayOfUFIDAU9ISVMFGBOMLogDTO4CreateSvData lotdatas = doResult.value;
		List<UFIDAU9ISVMFGBOMLogDTO4CreateSvData> lotdata = lotdatas
				.getUFIDAU9ISVMFGBOMLogDTO4CreateSvData();
		if (lotdata == null || lotdata.size() == 0) {
			System.out.println("Result is null");
		} else {
			System.out.println();
			for (int i = 0; i < lotdata.size(); i++) {
				System.out.println(lotdata.get(i));
			}
		}
		System.out.println("End....");
		return true;
	}

	/**
	 * 业务逻辑创建
	 * 
	 * @return
	 * @throws DatatypeConfigurationException
	 */
	private static ArrayOfUFIDAU9ISVMFGBOMBOMMasterDTO4CreateSvData createDTO(Map<String, String> mapParentValues, Vector<Map<String, String>> vectorChildValues,Date date,String unit)
			throws DatatypeConfigurationException {
		ObjectFactory dataFactory = new ObjectFactory();

		ArrayOfUFIDAU9ISVMFGBOMBOMMasterDTO4CreateSvData bomDTOs = dataFactory
				.createArrayOfUFIDAU9ISVMFGBOMBOMMasterDTO4CreateSvData();

		UFIDAU9ISVMFGBOMBOMMasterDTO4CreateSvData bomDTO = dataFactory
				.createUFIDAU9ISVMFGBOMBOMMasterDTO4CreateSvData();
		bomDTO.setMItemMaster(dataFactory.createUFIDAU9ISVMFGBOMBOMComponentDTO4CreateSvDataMItemMaster(SetDto(mapParentValues.get("fw9MaterialCodeRev")))); //"0.A01001.0011"
		//bomDTO.setMBOMVersionCode(dataFactory.createUFIDAU9ISVMFGBOMBOMMasterResultDTODataMBOMVersionCode("A0"));
		//modify by wujin 20141014 传递版本到ERP
		Object[]  objs=mapParentValues.keySet().toArray();
		for(int i=0;i<objs.length;i++)
		{
			System.out.println(objs[i]+"  "+i+"   "+mapParentValues.get(objs[i]));
		}
	    String revid=mapParentValues.get(ConstantUtils.TC_PROPERTY_BL_REV_ID)+"1";
	   
		System.out.println("版本:"+revid);
		 String uom = unit;
		  
		    System.out.println("UOM:"+uom);
		    
		bomDTO.setMBOMVersionCode(dataFactory.createUFIDAU9ISVMFGBOMBOMMasterResultDTODataMBOMVersionCode(revid));
		bomDTO.setMLot(1);
		bomDTO.setMIsPrimaryLot(true);
		bomDTO.setMAlternateType(0);
		bomDTO.setMProductUOM(dataFactory.createUFIDAU9ISVMFGBOMBOMMasterDTO4CreateSvDataMProductUOM(SetDto(uom)));
		//bomDTO.setMOwnerOrg(dataFactory.createUFIDAU9ISVMFGBOMBOMMasterDTO4CreateSvDataMOwnerOrg(SetDto("102")));
		//bomDTO.setMProject(dataFactory.createUFIDAU9ISVMFGBOMBOMMasterDTO4CreateSvDataMProject(SetDto("D212001")));
		bomDTO.setMBOMType(0);
		DatatypeFactory dataTypeFactory = DatatypeFactory.newInstance();
		XMLGregorianCalendar timeValueErrective = dataTypeFactory.newXMLGregorianCalendar();
		Calendar cal=Calendar.getInstance();
		cal.setTime(date);
		timeValueErrective.setYear(cal.get(Calendar.YEAR));
		timeValueErrective.setMonth(cal.get(Calendar.MONTH)+1);
		timeValueErrective.setDay(cal.get(Calendar.DAY_OF_MONTH));
		timeValueErrective.setHour(cal.get(Calendar.HOUR_OF_DAY));
		timeValueErrective.setMinute(cal.get(Calendar.MINUTE));
		timeValueErrective.setSecond(cal.get(Calendar.SECOND));
		System.out.println("设定BOM生效时间："+timeValueErrective.getYear()+"年"+timeValueErrective.getMonth()+"月"+timeValueErrective.getDay()+"日");
		
		bomDTO.setMEffectiveDate(timeValueErrective);
		XMLGregorianCalendar timeValueDisable = dataTypeFactory.newXMLGregorianCalendar();
		timeValueDisable.setYear(9999);
		timeValueDisable.setMonth(9);
		timeValueDisable.setDay(18);
		timeValueDisable.setHour(16);
		timeValueDisable.setMinute(51);
		timeValueDisable.setSecond(10);
		bomDTO.setMDisableDate(timeValueDisable);
		bomDTO.setMBOMSort(-1);
		bomDTO.setMPriceStyle(-1);

		ArrayOfUFIDAU9ISVMFGBOMBOMComponentDTO4CreateSvData compDTOS = dataFactory.createArrayOfUFIDAU9ISVMFGBOMBOMComponentDTO4CreateSvData();
		
		for(int i=0; i<vectorChildValues.size(); i++){
			Map<String, String> mapValueTemp = vectorChildValues.get(i);
			UFIDAU9ISVMFGBOMBOMComponentDTO4CreateSvData compDTO1 = dataFactory.createUFIDAU9ISVMFGBOMBOMComponentDTO4CreateSvData();
			compDTO1.setMItemMaster(dataFactory.createUFIDAU9ISVMFGBOMBOMComponentDTO4CreateSvDataMItemMaster(SetDto(mapValueTemp.get("bl_fw9MaterialCodeBl"))));  //"0.A01002.0012"
			compDTO1.setMComponentType(0);
			compDTO1.setMOperationNum(dataFactory.createUFIDAU9ISVMFGBOMBOMComponentDTO4CreateSvDataMOperationNum(mapValueTemp.get(ConstantUtils.TC_PROPERTY_BL_SEQUENCE_NO))); //"10"
			compDTO1.setMUsageQtyType(1);
			compDTO1.setMUsageQty(new BigDecimal(3));
			compDTO1.setMParentQty(new BigDecimal(1));
			compDTO1.setMScrapType(0);
			compDTO1.setMIssueStyle(0);
			compDTO1.setMSupplyStyle(0);
			compDTO1.setMTimeUOM(dataFactory.createUFIDAU9ISVMFGBOMBOMComponentDTO4CreateSvDataMTimeUOM(SetDto("A41")));
			compDTO1.setMSubstituteStyle(0);
			compDTO1.setMLeadTimeOffSet(new BigDecimal(0));
			//compDTO1.setMCostElement(dataFactory.createUFIDAU9ISVMFGBOMBOMComponentDTO4CreateSvDataMCostElement(SetDto("No1")));
			System.out.println("bommodify成本要素赋值。。。。。");
			compDTO1.setMCostElement(dataFactory
					.createUFIDAU9ISVMFGBOMBOMComponentDTO4CreateSvDataMCostElement(SetDto("No101")));
			compDTO1.setMSubcontractItemSrc(-1);
			compDTO1.setMConsignProcessItemSrc(2);
			compDTO1.setMIsCharge(true);
			compDTO1.setMCostPercent(new BigDecimal(0.5));
			compDTO1.setMIsEffective(true);
			ArrayOfUFIDAU9ISVMFGBOMBOMCompPositionDTO4CreateSvData positionDTOs = dataFactory.createArrayOfUFIDAU9ISVMFGBOMBOMCompPositionDTO4CreateSvData();
			UFIDAU9ISVMFGBOMBOMCompPositionDTO4CreateSvData positionDTO1 = dataFactory.createUFIDAU9ISVMFGBOMBOMCompPositionDTO4CreateSvData();
			positionDTO1.setMPosition(dataFactory.createUFIDAU9ISVMFGBOMBOMCompPositionDTO4CreateSvDataMPosition("AAA"));
			positionDTO1.setMUsage(new BigDecimal(1));
			UFIDAU9ISVMFGBOMBOMCompPositionDTO4CreateSvData positionDTO2 = dataFactory.createUFIDAU9ISVMFGBOMBOMCompPositionDTO4CreateSvData();
			positionDTO2.setMPosition(dataFactory.createUFIDAU9ISVMFGBOMBOMCompPositionDTO4CreateSvDataMPosition("BBB"));
			positionDTO2.setMUsage(new BigDecimal(2));
			positionDTOs.getUFIDAU9ISVMFGBOMBOMCompPositionDTO4CreateSvData().add(positionDTO1);
			positionDTOs.getUFIDAU9ISVMFGBOMBOMCompPositionDTO4CreateSvData().add(positionDTO2);

			compDTO1.setMBOMCompPositions(dataFactory.createArrayOfUFIDAU9ISVMFGBOMBOMCompPositionDTO4CreateSvData(positionDTOs));

			compDTOS.getUFIDAU9ISVMFGBOMBOMComponentDTO4CreateSvData().add(compDTO1);
		}
		

		bomDTO.setMBOMComponents(dataFactory.createUFIDAU9ISVMFGBOMBOMMasterDTO4CreateSvDataMBOMComponents(compDTOS));

		bomDTOs.getUFIDAU9ISVMFGBOMBOMMasterDTO4CreateSvData().add(bomDTO);
		return bomDTOs;
	}

	/**
	 * 设置CommonArchive
	 * 
	 * @param code
	 * @return
	 */
	private static UFIDAU9CBOPubControllerCommonArchiveDataDTOData SetDto(
			String code) {
		ObjectFactory dataFactory = new ObjectFactory();
		UFIDAU9CBOPubControllerCommonArchiveDataDTOData result = dataFactory
				.createUFIDAU9CBOPubControllerCommonArchiveDataDTOData();
		result.setMCode(dataFactory
				.createUFIDAU9CBOPubControllerCommonArchiveDataDTODataMCode(code));
		result.setSysState(ObjectState.INSERTED);
		return result;
	}

	/**
	 * 创建公用上下文环境
	 * 
	 * @param EnCode
	 * @param OrgCode
	 * @param UserCode
	 * @return
	 */
	private static UFIDAU9CBOPubControllerContextDTOData CreatePubContext(
			String EnCode, String OrgCode, String UserCode) {
		UFIDAU9CBOPubControllerContextDTOData contextDTOData = new UFIDAU9CBOPubControllerContextDTOData();
		ObjectFactory factory = new ObjectFactory();

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

	/**
	 * 创建上下文环境　
	 * 
	 * @param entid
	 * @param orgid
	 * @param userid
	 * @param usercode
	 * @return
	 */
	private static Object createContext(String entid, long orgid, long userid,
			String usercode) {
		alterbom.org.datacontract.schemas._2004._07.ufsoft_ubf_util.ObjectFactory contextfactory = new alterbom.org.datacontract.schemas._2004._07.ufsoft_ubf_util.ObjectFactory();
		alterbom.org.datacontract.schemas._2004._07.ufsoft_ubf_util.ThreadContext tc = contextfactory
				.createThreadContext();

		alterbom.com.microsoft.schemas._2003._10.serialization.arrays.ObjectFactory arrayFactory = new alterbom.com.microsoft.schemas._2003._10.serialization.arrays.ObjectFactory();
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
