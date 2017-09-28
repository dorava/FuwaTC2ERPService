package fw10.util.u9erp;



import queryitemrev.org.tempuri.QueryBOMVersionByCustSV;
import queryitemrev.org.tempuri.QueryBOMVersionByCustSVSoap;

import com.fuwa.services.model.LXBomModel;

public class ItemRevQuery {
	private static class Temp {     
        public final static ItemRevQuery instance = new ItemRevQuery();     
    }     
    
    public static ItemRevQuery getInstance() {  
        return Temp.instance;     
    }
	
	public  void modifyItemRev(LXBomModel model,String orgID,String userID,String  userCode){
		QueryBOMVersionByCustSV searchItemRevService = new QueryBOMVersionByCustSV();
		QueryBOMVersionByCustSVSoap searchItemRevPort = searchItemRevService.getQueryBOMVersionByCustSVSoap();
		String resultItemRev = searchItemRevPort._do(model.getMaterial_code(), orgID, userID, userCode, null);
		if(resultItemRev != null && !resultItemRev.isEmpty()) {
			model.setItem_rev_id(resultItemRev);
		} else {
			String item_rev_id = model.getItem_rev_id();
			model.setItem_rev_id(item_rev_id + "1");
		}
		//String item_rev_id = model.getItem_rev_id();
		//model.setItem_rev_id(item_rev_id + "1");
	}
	public  String modifyItemRev(String itemId,String itemRevId,String orgID,String userID,String  userCode){
		QueryBOMVersionByCustSV searchItemRevService = new QueryBOMVersionByCustSV();
		QueryBOMVersionByCustSVSoap searchItemRevPort = searchItemRevService.getQueryBOMVersionByCustSVSoap();
		String resultItemRev = searchItemRevPort._do(itemId, orgID, userID, userCode, null);
		if(resultItemRev != null && !resultItemRev.isEmpty()) {
			return resultItemRev;
		} else {
			return itemRevId + "1";
		}
		//return itemRevId + "1";
	}
	
	public String getErpAndPlmVersion(String itemId,int queryType,String orgID,String userID,String  userCode,String userName){
		queryitemrev2.org.tempuri.QueryBOMVersionByCustSV qbcs = new queryitemrev2.org.tempuri.QueryBOMVersionByCustSV();
		queryitemrev2.org.tempuri.QueryBOMVersionByCustSVSoap qbbs = qbcs.getQueryBOMVersionByCustSVSoap();
		return qbbs._do(itemId, queryType, orgID, userID, userCode, userName);
	}
	
}
