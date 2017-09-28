package fw10.util.u9erp;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.Holder;

import org.apache.commons.lang.StringUtils;
import org.w3c.dom.Node;

import syncbom.org.tempuri.SyncBomInfoSVStub;
import syncbom.org.ufida.UFIDAU9CustFuwaPDMSyncBomCompontInfoSVISyncBomInfoSV;
import syncbom.org.ufida.UFIDAU9CustFuwaPDMSyncBomCompontInfoSVISyncBomInfoSVDoServiceExceptionFaultFaultMessage;
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
import alterbom.org.ufida.entitydata.UFIDAU9BaseFlexFieldDescFlexFieldDescFlexSegmentsData;
import alterbom.org.ufida.entitydata.UFIDAU9CBOPubControllerCommonArchiveDataDTOData;
import alterbom.org.ufida.entitydata.UFIDAU9CBOPubControllerContextDTOData;
import alterbom.org.ufida.entitydata.UFIDAU9ISVMFGBOMBOMCompPositionDTO4CreateSvData;
import alterbom.org.ufida.entitydata.UFIDAU9ISVMFGBOMBOMComponentDTO4CreateSvData;
import alterbom.org.ufida.entitydata.UFIDAU9ISVMFGBOMBOMMasterDTO4CreateSvData;
import alterbom.org.ufida.entitydata.UFIDAU9ISVMFGBOMLogDTO4CreateSvData;

import com.fuwa.services.model.BomResultModel;
import com.fuwa.services.model.LXBomModel;
import com.teamcenter.clientx.ConstantUtils;


public class BomModifyNew {

	private static class Temp {     
        public final static BomModifyNew instance = new BomModifyNew();     
    }     
    
    public static BomModifyNew getInstance() {  
        return Temp.instance;     
    }

	public  BomResultModel createBom(Map<String,Object> parentMap, List<Map<String,Object>> childDataList,Date date,String unit) throws DatatypeConfigurationException {
		System.out.println("Beginning....");
		BomResultModel resultModel = new BomResultModel();
		// 创建当前上下文（相当于验证信息，这部分需灵活配置）
		HashMap<String, String> hashMapAccountValues = U9ERPAccount.getU9Account();
		if(hashMapAccountValues == null){
			resultModel.setErrorMSG("创建当前上下文失败");
			resultModel.setResult(false);
			return resultModel;
		}
		
		// 创建当前上下文（相当于验证信息，这部分需灵活配置）
		String IDForCompany = hashMapAccountValues.get(ConstantUtils.U9_ACCOUNT_ENTERPRISE_CODE);		//"002";// 当前企业编号
		Long IDForOrganization = new Long(hashMapAccountValues.get(ConstantUtils.U9_ACCOUNT_ORG_ID));	//new Long("1001212053116304");// 当前组织ID
		String OrgCode = hashMapAccountValues.get(ConstantUtils.U9_ACCOUNT_ORG_CODE);					//"102";
		Long IDForUsers = new Long(hashMapAccountValues.get(ConstantUtils.U9_ACCOUNT_USER_ID));		//new Long("1001212053116969");// 当前用户ID
		String UserCode = hashMapAccountValues.get(ConstantUtils.U9_ACCOUNT_USER_CODE);				//"admin";// 当前用户编码
        IDForOrganization = new Long("1001601073416051");
        OrgCode = "105";
       //ItemRevQuery.getInstance().modifyItemRev(parent, IDForOrganization.toString(), IDForUsers.toString(), UserCode);
		//修订版本
		/*QueryBOMVersionByCustSV searchItemRevService = new QueryBOMVersionByCustSV();
		QueryBOMVersionByCustSVSoap searchItemRevPort = searchItemRevService.getQueryBOMVersionByCustSVSoap();
		String resultItemRev = searchItemRevPort._do(parent.getMaterial_code(), IDForOrganization.toString(), IDForUsers.toString(), UserCode, null);
		if(resultItemRev != null && !resultItemRev.isEmpty()) {
			parent.setItem_rev_id(resultItemRev);
		} else {
			String item_rev_id = parent.getItem_rev_id();
			parent.setItem_rev_id(item_rev_id + "1");
		}*/
		/*for(LXBomModel model : childList) {
			String resultItemRev = searchItemRevPort._do(parent.getMaterial_code(), IDForOrganization.toString(), IDForUsers.toString(), UserCode, null);
			if(resultItemRev != null && !resultItemRev.isEmpty()) {
				parent.setItem_rev_id(resultItemRev);
			} else {
				String item_rev_id = parent.getItem_rev_id();
				parent.setItem_rev_id(item_rev_id + "1");
			}
		}*/
		//parent.setItem_rev_id(parent.getItem_rev_id() + "1");
		
        
        
        // 查找ERP 中  PLM 版本号
        String result = ItemRevQuery.getInstance().getErpAndPlmVersion(parentMap.get("material_code") + "", 1,  IDForOrganization.toString(), 
     		   						IDForUsers.toString(), UserCode, null);
        System.out.println("result  "+result);
        // PLM 版本号为空  版本号不相等则进行传BOM到ERP的操作，如果是相同的，则不传。
        if (StringUtils.isNotEmpty(result) || (result.equals(parentMap.get("item_rev_id") + "")) ) {
     	  return null; // 版本号不为空， 且版本号相同，不传BOM
        }
 		
//        当要传BOM到ERP时，需要查询出当前产品的ERP里BOM版本号，然后进行升版处理，A0则升为A1，如果是A9则升为B0，如此类推。
        String resultVersion = ItemRevQuery.getInstance().getErpAndPlmVersion(parentMap.get("material_code") + "", 0,  IDForOrganization.toString(), 
 					IDForUsers.toString(), UserCode, null);
        String versionCode = null;
        if (StringUtils.isNotEmpty(resultVersion)) {
     	   char[] charArray = resultVersion.toCharArray();
     	   char c0 = charArray[0];
     	   char c1 = charArray[1];
     	   int index = Integer.parseInt(c1+"");
     	   if (index == 9 ) {
     		   c0 = (char) (c0 + 1);  // 由A变B
     		   versionCode = String.valueOf(c0) + 0;
     	   }else {
     		   index ++;
     		   versionCode = String.valueOf(c0) + index;
     	   }
        }else {
     	   versionCode = "A0";
        }
        System.out.println("resultVersion= "+ resultVersion+"  versionCode= "+versionCode);
		// 开始创建业务逻辑
		ArrayOfUFIDAU9ISVMFGBOMBOMMasterDTO4CreateSvData bOMMasterDTOList = createAlterBomDTO(parentMap, childDataList,date, unit,versionCode);

		// doResult就是返回结果。
		Holder<ArrayOfUFIDAU9ISVMFGBOMLogDTO4CreateSvData> doResult = new Holder<ArrayOfUFIDAU9ISVMFGBOMLogDTO4CreateSvData>();

		Holder<ArrayOfMessageBase> outMessages = new Holder<ArrayOfMessageBase>();// 这个参数暂未使用

		try {
			// 创建上下文环境
			Object context = createAlterBomContext(IDForCompany, IDForOrganization,
					IDForUsers, UserCode);
			UFIDAU9CBOPubControllerContextDTOData pubContext = createAlterPubContext(
					IDForCompany, OrgCode, UserCode);
			// 开始调用ERP服务 ,"创建服务"
			ImportBOMSvStub modifyClient = new ImportBOMSvStub();
			UFIDAU9ISVMFGBOMIImportBOMSv modifySV = modifyClient.getBasicHttpBindingUFIDAU9ISVMFGBOMIImportBOMSv();
			modifySV._do(context, bOMMasterDTOList, pubContext, false,
					doResult, outMessages);
			System.out.println("END....");
			
			System.out.println("同步Bom start ......");
			syncBom(parentMap.get("material_code") + "", versionCode);
			System.out.println("同步Bom end ......");
			
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
			resultModel.setResult(false);
			resultModel.setErrorMSG(strBufferMessage.toString());
			//MessageBox.post(AIFUtility.getActiveDesktop().getFrame(), strBufferMessage.toString(), "错误", MessageBox.ERROR);
			return resultModel;
		} catch (UFIDAU9ISVMFGBOMIImportBOMSvDoExceptionFaultFaultMessage e) {
			e.printStackTrace();
			resultModel.setErrorMSG(e.getMessage());	
			resultModel.setResult(false);
			return resultModel;
		} catch (UFIDAU9ISVMFGBOMIImportBOMSvDoExceptionBaseFaultFaultMessage e) {
			e.printStackTrace();
			resultModel.setErrorMSG(e.getMessage());
			resultModel.setResult(false);
			return resultModel;		
		} catch (UFIDAU9ISVMFGBOMIImportBOMSvDoServiceLostExceptionFaultFaultMessage e) {
			e.printStackTrace();
			resultModel.setErrorMSG(e.getMessage());
			resultModel.setResult(false);
			return resultModel;
		} catch (UFIDAU9ISVMFGBOMIImportBOMSvDoServiceExceptionDetailFaultFaultMessage e) {
			e.printStackTrace();
			resultModel.setErrorMSG(e.getMessage());
			resultModel.setResult(false);
			return resultModel;		
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
		resultModel.setResult(true);
		return resultModel;
	}
	public  BomResultModel syncBom(String itemId,String itemRevId) {
		boolean flagOK;
		System.out.println("Beginning....");
		BomResultModel resultModel = new BomResultModel();
		// 创建当前上下文（相当于验证信息，这部分需灵活配置）
		HashMap<String, String> hashMapAccountValues = U9ERPAccount.getU9Account();
		if(hashMapAccountValues == null){
			resultModel.setErrorMSG("创建当前上下文失败");
			resultModel.setResult(false);
			return resultModel;
		}
		
		// 创建当前上下文（相当于验证信息，这部分需灵活配置）
		String IDForCompany = hashMapAccountValues.get(ConstantUtils.U9_ACCOUNT_ENTERPRISE_CODE);		//"002";// 当前企业编号
		Long IDForOrganization = new Long(hashMapAccountValues.get(ConstantUtils.U9_ACCOUNT_ORG_ID));	//new Long("1001212053116304");// 当前组织ID
		String OrgCode = hashMapAccountValues.get(ConstantUtils.U9_ACCOUNT_ORG_CODE);					//"102";
		Long IDForUsers = new Long(hashMapAccountValues.get(ConstantUtils.U9_ACCOUNT_USER_ID));		//new Long("1001212053116969");// 当前用户ID
		String UserCode = hashMapAccountValues.get(ConstantUtils.U9_ACCOUNT_USER_CODE);				//"admin";// 当前用户编码
        IDForOrganization = new Long("1001601073416051");
        OrgCode = "105";
//        itemRevId = ItemRevQuery.getInstance().modifyItemRev(itemId,itemRevId, IDForOrganization.toString(), IDForUsers.toString(), UserCode);
        /*QueryBOMVersionByCustSV searchItemRevService = new QueryBOMVersionByCustSV();
		QueryBOMVersionByCustSVSoap searchItemRevPort = searchItemRevService.getQueryBOMVersionByCustSVSoap();
		String resultItemRev = searchItemRevPort._do(itemRevId, IDForOrganization.toString(), IDForUsers.toString(), UserCode, null);
		if(resultItemRev != null && !resultItemRev.isEmpty()) {
			itemRevId = resultItemRev;
		} else {
			itemRevId = itemRevId + "1";
		}*/
		// 创建上下文环境
		Object context = createSyncBomContext(IDForCompany, IDForOrganization,
				IDForUsers, UserCode);
		UFIDAU9CBOPubControllerContextDTOData pubContext = createSyncPubContext(
				IDForCompany, OrgCode, UserCode);
		
		// 开始调用ERP服务，“创建服务”
		SyncBomInfoSVStub createRcvsvclient = new SyncBomInfoSVStub();
		UFIDAU9CustFuwaPDMSyncBomCompontInfoSVISyncBomInfoSV createsv = createRcvsvclient.getBasicHttpBindingUFIDAU9CustFuwaPDMSyncBomCompontInfoSVISyncBomInfoSV();
		
		// 给头、明细赋值
		
		// doResult就是返回结果。
		javax.xml.ws.Holder<java.lang.Boolean> doResult =new javax.xml.ws.Holder<java.lang.Boolean> ();
		javax.xml.ws.Holder<syncbom.exceptions.ubf.ufsoft.ArrayOfMessageBase> outMessages = new javax.xml.ws.Holder<syncbom.exceptions.ubf.ufsoft.ArrayOfMessageBase>();// 这个参数暂未使用
		try {
			// 将料品内容传入ERP（入和返的值，均作为此方法的参数）。
			// context验证信息，dto入的值，doResult方法返回值，outMessages无用字段，可不理会
			createsv._do(context, itemId, itemRevId, doResult, outMessages);
			System.out.println("Invoke end ...");
		} catch (Exception ex1) {
			System.out.println("time out ,call service again......");
			try{
			createsv._do(context, itemId, itemRevId, doResult, outMessages);
			System.out.println("Invoke end ...");
			}catch(UFIDAU9CustFuwaPDMSyncBomCompontInfoSVISyncBomInfoSVDoServiceExceptionFaultFaultMessage ex){
				flagOK = false;
				// 下面的代码可以将服务端的异常信息给显示输出来。
				StringBuffer strBufferMessage = new StringBuffer();
				String strErrorTemp = "";
				syncbom.org.datacontract.schemas._2004._07.ufsoft_ubf.ServiceException ed = ex.getFaultInfo();
				for (int i = 0; i < ed.getAny().size() - 1; i++) {				
					org.w3c.dom.Node nodeTemp = ed.getAny().get(i).getFirstChild();
					if(nodeTemp!=null){
						strErrorTemp = nodeTemp.toString();
						System.out.println(strErrorTemp);
						strBufferMessage.append(strErrorTemp).append("\n");
					}
					
				}
				resultModel.setErrorMSG(strBufferMessage.toString());
				resultModel.setResult(false);
				return resultModel;
				
			} catch (Exception ex) {
				flagOK = false;
				resultModel.setErrorMSG(ex.getMessage());
				resultModel.setResult(false);
				return resultModel;			
			}
		
		} 
		if(doResult.value != null){
			if(doResult.value) {
				flagOK=true;
				System.out.println("Result is true.");
				resultModel.setErrorMSG("Result is true.");
				resultModel.setResult(true);
			} else {
				flagOK=false;
				System.out.println("Result is false.");
				resultModel.setErrorMSG("Result is false.");
				resultModel.setResult(false);
			
			}
			
		} else {
			flagOK=true;
			System.out.println("Result is null.");
			System.out.println("Result is false.");
			resultModel.setErrorMSG("Result is false.");
			resultModel.setResult(true);
			
		}				
		System.out.println("end...");
		System.out.println("Invoke success...");
		return resultModel;	
	}

	/**
	 * 业务逻辑创建
	 * @param versionCode 
	 * 
	 * @return
	 * @throws DatatypeConfigurationException
	 */
	private  ArrayOfUFIDAU9ISVMFGBOMBOMMasterDTO4CreateSvData createAlterBomDTO(Map<String,Object> parentMap, List<Map<String,Object>> childListMap,Date date,String unit, String versionCode)
			throws DatatypeConfigurationException {
		ObjectFactory dataFactory = new ObjectFactory();

		ArrayOfUFIDAU9ISVMFGBOMBOMMasterDTO4CreateSvData bomDTOs = dataFactory
				.createArrayOfUFIDAU9ISVMFGBOMBOMMasterDTO4CreateSvData();

		UFIDAU9ISVMFGBOMBOMMasterDTO4CreateSvData bomDTO = dataFactory
				.createUFIDAU9ISVMFGBOMBOMMasterDTO4CreateSvData();
		bomDTO.setMItemMaster(dataFactory.createUFIDAU9ISVMFGBOMBOMComponentDTO4CreateSvDataMItemMaster(SetDto(parentMap.get("material_code") + ""))); //"0.A01001.0011"
//		bomDTO.setMBOMVersionCode(dataFactory.createUFIDAU9ISVMFGBOMBOMMasterResultDTODataMBOMVersionCode("A0"));
		//modify by wujin 20141014 传递版本到ERP
		System.out.println("parentMap:" + parentMap);
		String revid = parentMap.get("item_rev_id") + "";


		System.out.println("版本:"+revid);
		String uom = unit;

		System.out.println("UOM:"+uom);

		bomDTO.setMBOMVersionCode(dataFactory.createUFIDAU9ISVMFGBOMBOMMasterResultDTODataMBOMVersionCode(versionCode));
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

		//新加属性
		UFIDAU9BaseFlexFieldDescFlexFieldDescFlexSegmentsData newParentProperties = dataFactory.createUFIDAU9BaseFlexFieldDescFlexFieldDescFlexSegmentsData();
		newParentProperties.setMPrivateDescSeg1(dataFactory.createUFIDAU9BaseFlexFieldDescFlexFieldDescFlexSegmentsDataMPrivateDescSeg1(revid));
		//newParentProperties.setMPrivateDescSeg2(dataFactory.createUFIDAU9BaseFlexFieldDescFlexFieldDescFlexSegmentsDataMPrivateDescSeg2(parentMap.get("openMaterialSize")+""));
		//newParentProperties.setMPrivateDescSeg3(dataFactory.createUFIDAU9BaseFlexFieldDescFlexFieldDescFlexSegmentsDataMPrivateDescSeg3(parentMap.get("useWorkshop")+""));
		bomDTO.setMDescFlexField(dataFactory.createUFIDAU9ISVMFGBOMBOMMasterDTO4CreateSvDataMDescFlexField(newParentProperties));
		//		UFIDAU9ISVItemItemMasterDTOData itemInfo = new UFIDAU9ISVItemItemMasterDTOData();


		ArrayOfUFIDAU9ISVMFGBOMBOMComponentDTO4CreateSvData compDTOS = dataFactory.createArrayOfUFIDAU9ISVMFGBOMBOMComponentDTO4CreateSvData();

		for(int i=0; i < childListMap.size(); i++){
			Map<String,Object> childMap = childListMap.get(i);
			UFIDAU9ISVMFGBOMBOMComponentDTO4CreateSvData compDTO1 = dataFactory.createUFIDAU9ISVMFGBOMBOMComponentDTO4CreateSvData();
			compDTO1.setMItemMaster(dataFactory.createUFIDAU9ISVMFGBOMBOMComponentDTO4CreateSvDataMItemMaster(SetDto(childMap.get("material_code") + "")));  //"0.A01002.0012"
			compDTO1.setMComponentType(0);
			compDTO1.setMOperationNum(dataFactory.createUFIDAU9ISVMFGBOMBOMComponentDTO4CreateSvDataMOperationNum(childMap.get("sequence_no")+"")); //"10"
			compDTO1.setMUsageQtyType(1);
			String parent_qty = childMap.get("parent_qty") + "";
			String usage_qty = childMap.get("usage_qty") + "";			
			BigDecimal b_parent_qty = parent_qty.isEmpty()?new BigDecimal(0):new BigDecimal(parent_qty);
			BigDecimal b_usage_qty = usage_qty.isEmpty()?new BigDecimal(0):new BigDecimal(usage_qty);
			compDTO1.setMUsageQty(b_usage_qty);
			compDTO1.setMParentQty(b_parent_qty);
			compDTO1.setMScrapType(0);
			
			// 现在传bom时，需要多加上述的一个参数，默认为0，如果是我截图的那两个分类下的零件，就默认传4
			// ICM0101041114    
			// ICM0101041125
			int isKL = 0; // 是否开料
			if (StringUtils.isNotEmpty(childMap.get("classificationID")+"")) {
				if ("ICM0101041114".equals(childMap.get("classificationID")+"") || "ICM0101041125".equals(childMap.get("classificationID")+"")) {
					isKL = 4;
				} 
			}
			compDTO1.setMIssueStyle(isKL);
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
			
			
			compDTO1.setMDescFlexFieldPrivateDescSeg1(dataFactory.createUFIDAU9ISVMFGBOMBOMComponentDTO4CreateSvDataMDescFlexFieldPrivateDescSeg1(childMap.get("installLocation")+""));
			compDTO1.setMDescFlexFieldPrivateDescSeg2(dataFactory.createUFIDAU9ISVMFGBOMBOMComponentDTO4CreateSvDataMDescFlexFieldPrivateDescSeg2(childMap.get("openMaterialSize")+""));
			compDTO1.setMDescFlexFieldPrivateDescSeg3(dataFactory.createUFIDAU9ISVMFGBOMBOMComponentDTO4CreateSvDataMDescFlexFieldPrivateDescSeg3(childMap.get("useWorkshop")+""));
			//新加属性
			//UFIDAU9BaseFlexFieldDescFlexFieldDescFlexSegmentsData newchildProperties = dataFactory.createUFIDAU9BaseFlexFieldDescFlexFieldDescFlexSegmentsData();
			//PLM的BOM版本号
			//newchildProperties.setMPrivateDescSeg1(dataFactory.createUFIDAU9BaseFlexFieldDescFlexFieldDescFlexSegmentsDataMPrivateDescSeg1(revid));
			//compDTO1.setMDescFlexField(dataFactory.createUFIDAU9BaseFlexFieldDescFlexFieldDescFlexSegmentsData(newchildProperties));
			

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
	private  UFIDAU9CBOPubControllerCommonArchiveDataDTOData SetDto(
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
	private  UFIDAU9CBOPubControllerContextDTOData createAlterPubContext(
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
	
	private  UFIDAU9CBOPubControllerContextDTOData createSyncPubContext(
			String EnCode, String OrgCode, String UserCode) {
		alterbom.org.ufida.entitydata.UFIDAU9CBOPubControllerContextDTOData contextDTOData = new UFIDAU9CBOPubControllerContextDTOData();
		alterbom.org.ufida.entitydata.ObjectFactory factory = new ObjectFactory();

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
	private  Object createAlterBomContext(String entid, long orgid, long userid,
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
	
	private  Object createSyncBomContext(String entid, long orgid, long userid,
			String usercode) {
		syncbom.org.datacontract.schemas._2004._07.ufsoft_ubf_util.ObjectFactory contextfactory = new syncbom.org.datacontract.schemas._2004._07.ufsoft_ubf_util.ObjectFactory();
		syncbom.org.datacontract.schemas._2004._07.ufsoft_ubf_util.ThreadContext tc = contextfactory
				.createThreadContext();

		syncbom.com.microsoft.schemas._2003._10.serialization.arrays.ObjectFactory arrayFactory = new syncbom.com.microsoft.schemas._2003._10.serialization.arrays.ObjectFactory();
		syncbom.com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfanyTypeanyType contextarray = arrayFactory
				.createArrayOfKeyValueOfanyTypeanyType();

		syncbom.com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfanyTypeanyType.KeyValueOfanyTypeanyType kv1 = new syncbom.com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfanyTypeanyType.KeyValueOfanyTypeanyType();
		kv1.setKey("EnterpriseID");
		kv1.setValue(entid);// 填具体的企业编号
		contextarray.getKeyValueOfanyTypeanyType().add(kv1);
		syncbom.com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfanyTypeanyType.KeyValueOfanyTypeanyType kv2 = new syncbom.com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfanyTypeanyType.KeyValueOfanyTypeanyType();
		kv2.setKey("OrgID");
		kv2.setValue(orgid);// 填具体的组织ID
		contextarray.getKeyValueOfanyTypeanyType().add(kv2);
		syncbom.com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfanyTypeanyType.KeyValueOfanyTypeanyType kv3 = new syncbom.com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfanyTypeanyType.KeyValueOfanyTypeanyType();
		kv3.setKey("UserID");
		kv3.setValue(userid);// //填具体的用户ID
		contextarray.getKeyValueOfanyTypeanyType().add(kv3);
		syncbom.com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfanyTypeanyType.KeyValueOfanyTypeanyType kv4 = new syncbom.com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfanyTypeanyType.KeyValueOfanyTypeanyType();
		kv4.setKey("UserCode");
		kv4.setValue(usercode);// 填具体的用户编码
		contextarray.getKeyValueOfanyTypeanyType().add(kv4);
		syncbom.com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfanyTypeanyType.KeyValueOfanyTypeanyType kv5 = new syncbom.com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfanyTypeanyType.KeyValueOfanyTypeanyType();
		kv5.setKey("CultureName");
		kv5.setValue("zh-CN");// 当前语种
		contextarray.getKeyValueOfanyTypeanyType().add(kv5);

		tc.setNameValueHas(contextarray);
		return tc;
	}


}
