package com.fuwa.lhh.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;



public class LogUtil {
	private String targetDirStr = "C:\\PLMApp\\classification\\";
	private static class ToolUtilsHolder {
		private final static LogUtil INSTANCE = new LogUtil();
	}
	public static LogUtil getInstance() {
	   return ToolUtilsHolder.INSTANCE;
	}
	public void addClassLog(boolean create,String itemID,String itemRevID,String classID,String classAttr) {
		try {
			File targetDir = new File(targetDirStr);
			if(!targetDir.exists()) {
				targetDir.mkdirs();
			}
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
			String fileName = create ? (itemID + "create" +sdf.format(new Date()) + ".txt"):(itemID + "modify" +sdf.format(new Date()) + ".txt");
			File file = new File(targetDir,fileName);
			
			Document document = DocumentHelper.createDocument();
			Element root = DocumentHelper.createElement("classification");
			document.setRootElement(root);
		    root.addElement("itemID")
					.setText(itemID);
		    
		    root.addElement("itemRevID")
			.setText(itemRevID);
		    
		    root.addElement("classID")
			.setText(classID);
		    
		    root.addElement("classAttr")
			.setText(classAttr);
			
			OutputFormat format = OutputFormat.createPrettyPrint();
			format.setEncoding("UTF-8");
			FileOutputStream fos = new FileOutputStream(file);
			XMLWriter writer = new XMLWriter(fos, format);
			writer.write(document);
			writer.close();
			fos.close();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	public static void main(String[] args) {
		new LogUtil().addClassLog(true,"1", "A", "123", "1=2,3=Â¬º£»¶");
	}
	
	


}
