package com.fuwa.lhh.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.JavaType;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;



public class Map2XmlUtil {
	private static class ToolUtilsHolder {
		private final static Map2XmlUtil INSTANCE = new Map2XmlUtil();
	}
	public static Map2XmlUtil getInstance() {
	   return ToolUtilsHolder.INSTANCE;
	}
	
	public  String toXml(Map<String,Object> parentMap,List<Map<String,Object>> childListMap) {
		try {
			Document document = DocumentHelper.createDocument();
			Element root = DocumentHelper.createElement("content");
			document.setRootElement(root);
			Element parent = root.addElement("parent");
			for(Map.Entry<String,Object> entry : parentMap.entrySet()) {
				parent.addElement(entry.getKey()).addText(entry.getValue().toString());
			}
			Element children = root.addElement("children");
			for(Map<String,Object> map : childListMap) {
				for(Map.Entry<String,Object> entry : map.entrySet()) {
					children.addElement(entry.getKey()).addText(entry.getValue().toString());
				}
			}
			OutputFormat format = OutputFormat.createPrettyPrint();
			format.setNewLineAfterDeclaration(false); 
			format.setEncoding("UTF-8");
			StringWriter stringWriter = new StringWriter();  
			XMLWriter writer = new XMLWriter(stringWriter, format);
			writer.write(document);
			return stringWriter.toString();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
 	}
	public String getReviseItemRevID(String str) {
		if(str == null || str.isEmpty() || str.length() != 2) {
			return "A0";
		}
		char char1 = str.charAt(0);
		char char2 = str.charAt(1);
		if(char2 < '9') {
			
			return Character.toString(char1) + Character.toString((char)(char2 + 1));
		} else {
			return Character.toString((char)(char1 + 1)) + "0";
		}
	}
	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		Map<String, Object> parentMap = new HashMap<String, Object>();
		parentMap.put("1", "1xa");
		parentMap.put("2", "2xsa");
		List<Map<String, Object>> childListMap = new ArrayList<Map<String,Object>>();
		childListMap.add(parentMap);
		String xml = new Map2XmlUtil().toXml(parentMap, childListMap);
		System.out.println(xml);
		System.out.println(new Map2XmlUtil().getReviseItemRevID("Z9"));
		BigDecimal decimal = new BigDecimal(100.01);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("key", decimal);
		ObjectMapper mapper = new ObjectMapper();
		String writeValueAsString = mapper.writeValueAsString(map);
		System.out.println(writeValueAsString);
		JavaType javaType = mapper.getTypeFactory().constructParametricType(LinkedHashMap.class, String.class,Object.class);
		Map<String,Object> receiveMap = mapper.readValue(writeValueAsString,javaType);
		BigDecimal object =  (BigDecimal) receiveMap.get("key");
		System.out.println(object);
	}
	
	


}
