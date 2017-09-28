package fw10.util.u9erp;



import java.awt.Frame;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

import com.teamcenter.clientx.ConstantUtils;
import com.teamcenter.clientx.WSconfig;


public class U9ERPAccount {
	static HashMap<String, String> hashMapvalues = new HashMap<String, String>();
	public static HashMap<String, String> getU9Account(){
		Properties pro=new Properties();
	   	try {
			pro.load(WSconfig.class.getResourceAsStream("ERPConfig.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   	for(Object keySet : pro.keySet()) {
	   		hashMapvalues.put(keySet.toString(), pro.getProperty(keySet.toString()));
	   	}
		
		if(!hashMapvalues.containsKey(ConstantUtils.U9_ACCOUNT_ENTERPRISE_CODE) 
				|| !hashMapvalues.containsKey(ConstantUtils.U9_ACCOUNT_ORG_CODE)
				|| !hashMapvalues.containsKey(ConstantUtils.U9_ACCOUNT_ORG_ID)
				|| !hashMapvalues.containsKey(ConstantUtils.U9_ACCOUNT_USER_CODE)
				|| !hashMapvalues.containsKey(ConstantUtils.U9_ACCOUNT_USER_ID)
				|| !hashMapvalues.containsKey(ConstantUtils.U9_ACCOUNT_SD_ORG_ID)){
			System.out.println("请确认选项中配置有此参数"
					+ConstantUtils.U9_ACCOUNT_PREFERENCE+
					"配置正确，以下参数确认存在:\n"
					+ConstantUtils.U9_ACCOUNT_ENTERPRISE_CODE +" \n"
					+ConstantUtils.U9_ACCOUNT_ORG_CODE+" \n"
					+ConstantUtils.U9_ACCOUNT_ORG_ID+" \n"
					+ConstantUtils.U9_ACCOUNT_SD_ORG_ID+" \n"
					+ConstantUtils.U9_ACCOUNT_USER_CODE+" \n"
					+ConstantUtils.U9_ACCOUNT_USER_ID+" \n");
			
		}
		
		
		return hashMapvalues;
	}
	public static void main(String[] args) {
		System.out.println(getU9Account());
	}
	
}
