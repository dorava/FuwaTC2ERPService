package com.fuwa.services.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ResultModel implements Serializable {
	private static String targetDir = "C:\\PLMApp\\ERP\\";
	private static SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private boolean success = false;
	private String result = "";
	private String log;
	private List<String> wl_nos = new ArrayList<String>();
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public List<String> getWl_nos() {
		return wl_nos;
	}
	public void setWl_nos(List<String> wl_nos) {
		this.wl_nos = wl_nos;
	}
	public String getLog() {
		return log;
	}
	public void setLog(String log) {
		this.log = log;
	}
	public static void createLog(String content,String fileName) {
		try {
			File dir = new File(targetDir);
			if(!dir.exists()) {
				dir.mkdirs();
			}
			File targetFile = new File(dir,fileName + sdf.format(new Date()) + ".txt");
			PrintWriter writer = new PrintWriter(targetFile);
			writer.write(content);
			writer.flush();
			writer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	@Override
	public String toString() {
		return "ResultModel [result=" + result + ", log=" + log + ", wl_nos="
				+ wl_nos + "]";
	}
	
}
