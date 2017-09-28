package fw10.util.u9erp;

import java.util.HashMap;

import queryitem.org.tempuri.QueryItemCodeFromSPECSSVStub;
import queryitem.org.ufida.UFIDAU9CustFuwaPDMQueryItemCodeFromSPECSSVIQueryItemCodeFromSPECSSV;
import queryitemrev.org.tempuri.QueryBOMVersionByCustSV;
import queryitemrev.org.tempuri.QueryBOMVersionByCustSVSoap;
import senditem.u9erp.FuwaItemSendSVStub;
import senditem.u9erp.UFIDAU9CustFuwaPDMItemSendSVIFuwaItemSendSV;
import syncbom.org.tempuri.SyncBomInfoSVStub;
import syncbom.org.ufida.UFIDAU9CustFuwaPDMSyncBomCompontInfoSVISyncBomInfoSV;
import take_number.call_net.CreateItemForSDByCustSV;
import take_number.call_net.CreateItemForSDByCustSVSoap;
import alterbom.org.tempuri.ImportBOMSvStub;
import alterbom.org.ufida.UFIDAU9ISVMFGBOMIImportBOMSv;
import alteritem.org.tempuri.ModifyItemForSDByCustSV;
import alteritem.org.tempuri.ModifyItemForSDByCustSVSoap;

public class LHHUtil {
	 
	private static class Temp {     
        public final static LHHUtil instance = new LHHUtil();     
    }     
    
    public static LHHUtil getInstance() {  
        return Temp.instance;     
    }
    
	public void initService() {
		QueryItemCodeFromSPECSSVStub queryItem = new QueryItemCodeFromSPECSSVStub();
		UFIDAU9CustFuwaPDMQueryItemCodeFromSPECSSVIQueryItemCodeFromSPECSSV queryItemPort = null;
		try{
			queryItemPort = queryItem.getBasicHttpBindingUFIDAU9CustFuwaPDMQueryItemCodeFromSPECSSVIQueryItemCodeFromSPECSSV();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		CreateItemForSDByCustSV createItem = new CreateItemForSDByCustSV();
		CreateItemForSDByCustSVSoap createItemPort = createItem.getCreateItemForSDByCustSVSoap();
	
		
		ModifyItemForSDByCustSV modifyItem = new ModifyItemForSDByCustSV();
		ModifyItemForSDByCustSVSoap modifyItemPort = modifyItem.getModifyItemForSDByCustSVSoap();
	
		
		
		FuwaItemSendSVStub sendItem = new FuwaItemSendSVStub();
		UFIDAU9CustFuwaPDMItemSendSVIFuwaItemSendSV sendItemPort = null;
		try{
			sendItemPort = sendItem.getBasicHttpBindingUFIDAU9CustFuwaPDMItemSendSVIFuwaItemSendSV();
			
		}catch(Exception e){
			e.printStackTrace();
		}
	
		QueryBOMVersionByCustSV queryItemRev = new QueryBOMVersionByCustSV();
		QueryBOMVersionByCustSVSoap queryItemRevPort = queryItemRev.getQueryBOMVersionByCustSVSoap();
	
		ImportBOMSvStub modifyBom = new ImportBOMSvStub();
		UFIDAU9ISVMFGBOMIImportBOMSv modifyBomPort = modifyBom.getBasicHttpBindingUFIDAU9ISVMFGBOMIImportBOMSv();
	
		
		SyncBomInfoSVStub sysncBom = new SyncBomInfoSVStub();
		UFIDAU9CustFuwaPDMSyncBomCompontInfoSVISyncBomInfoSV sysncBomPort = sysncBom.getBasicHttpBindingUFIDAU9CustFuwaPDMSyncBomCompontInfoSVISyncBomInfoSV();
		
		
		
	}
	public static void main(String[] args) {
		HashMap<String, String> hashMapAccountValues = U9ERPAccount.getU9Account();
		System.out.println(hashMapAccountValues);
	}

}
