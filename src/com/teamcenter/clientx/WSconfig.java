package com.teamcenter.clientx;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.JavaType;

public class WSconfig {
	public static String getUrl() throws IOException{
		Properties pro=new Properties();
	   	pro.load(WSconfig.class.getResourceAsStream("ERPUrl.properties"));
	   	String urlstr=pro.getProperty("wsip");
	   	System.out.println("��ǰu9�ĵ�ַΪ:"+urlstr);
		System.out.println("u9��ַ������FuwaProjectService��Ŀ��\\com\\teamcenter\\clientx\\WSconfig.properties�ļ������á�");
		return urlstr;
		   
	   }
	
}
