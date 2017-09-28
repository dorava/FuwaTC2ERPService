package com.fuwa.services.model;

import java.util.List;

public class BomResultModel {
	private String errorMSG;
	private boolean result;
	private String parentLog;
	private List<String> childLogs;
	private String totalLog;
	public String getErrorMSG() {
		return errorMSG;
	}
	public void setErrorMSG(String errorMSG) {
		this.errorMSG = errorMSG;
	}
	public boolean isResult() {
		return result;
	}
	public void setResult(boolean result) {
		this.result = result;
	}
	public String getParentLog() {
		return parentLog;
	}
	public void setParentLog(String parentLog) {
		this.parentLog = parentLog;
	}
	public List<String> getChildLogs() {
		return childLogs;
	}
	public void setChildLogs(List<String> childLogs) {
		this.childLogs = childLogs;
	}
	public String getTotalLog() {
		return totalLog;
	}
	public void setTotalLog(String totalLog) {
		this.totalLog = totalLog;
	}
	
}
