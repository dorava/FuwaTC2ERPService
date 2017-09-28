package take_number.call_net.util;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class CovertToXml {

	public static String beanListToXml(List<?> list ,Class<?> cls) throws Exception{
		return beanListToXml(list, cls,"yyyy-MM-dd");
	}

	public static String beanListToXml(List<?> list ,Class<?> cls,String pattern) throws Exception{
		StringBuffer sb = new StringBuffer();
		sb.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>").append("\r\n");
		String className = cls.getSimpleName();
		sb.append("<Xml").append(className).append(">").append("\r\n");
		Field[] fileds = cls.getDeclaredFields();
		fileds = getFileds(cls,fileds);
		try {
			for(int i=0;i<list.size();i++){
				sb.append("<").append(className).append(">").append("\r\n");
				for(int j = 0;j<fileds.length;j++){
					String filedName = fileds[j].getName();
					String getMethodName = "get"
						+ filedName.substring(0, 1).toUpperCase()
						+ filedName.substring(1);
					Method getMethod = cls.getMethod(getMethodName,
							new Class[] {});
					Object value = getMethod.invoke(list.get(i), new Object[] {});
					if (value == null) {
						value = "";
					}
					String textValue = "";
					if (value instanceof Date) {
						SimpleDateFormat sdf = new SimpleDateFormat(pattern);
						textValue = sdf.format((Date) value);
					}else{
						textValue = value.toString(); /*Tool.nvl(value);*/
					}
					sb.append("<").append(filedName).append(">");
					sb.append(chargeStr(textValue));
					sb.append("</").append(filedName).append(">");
					sb.append("\r\n");
				}
				sb.append("</").append(className).append(">").append("\r\n");
			}
			sb.append("</Xml").append(className).append(">").append("\r\n");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
//			throw new DataException("实体转换成xml时出�?);
		}
		
		return sb.toString();
	}
	
	private static Field[] getFileds(Class<?> cls,Field[] fileds) {
		// TODO Auto-generated method stub
		Field[] result = null;
		Class parent = cls.getSuperclass();
		if(parent != null){
			Field[] pfields = parent.getDeclaredFields();
			result = new Field[fileds.length+pfields.length];
			System.arraycopy(fileds, 0, result, 0, fileds.length);
			
			for(int i=0;i<pfields.length;i++){
				result[fileds.length+i] = pfields[i];
			}
			getFileds(parent, fileds);
		}
		return result;
	}

	private static String chargeStr(String str){
		String result = str;
		result = result.replace("<", "<");
		result = result.replace(">", ">");
		result = result.replace("&", "&");
		result = result.replace("'", "'");
		result = result.replace("\"", "\"");
		return result;
	}
}
