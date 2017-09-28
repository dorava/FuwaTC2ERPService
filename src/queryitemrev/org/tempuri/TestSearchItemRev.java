package queryitemrev.org.tempuri;

public class TestSearchItemRev {
	public static void main(String[] args) {
		QueryBOMVersionByCustSV searchItemRevService = new QueryBOMVersionByCustSV();
		QueryBOMVersionByCustSVSoap searchItemRevPort = searchItemRevService.getQueryBOMVersionByCustSVSoap();
		String resultItemRev = searchItemRevPort._do("0.N50001.0022", "1001601073416051", "1001212053116969", "admin", null);
		if(resultItemRev != null && !resultItemRev.isEmpty()) {
			//parent.setItem_rev_id(resultItemRev);
			
		} else {
			//String item_rev_id = parent.getItem_rev_id();
			//parent.setItem_rev_id(item_rev_id + "1");
		}
		System.out.println(resultItemRev);
	}

}
