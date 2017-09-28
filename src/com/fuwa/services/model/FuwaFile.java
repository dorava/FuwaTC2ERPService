package com.fuwa.services.model;

import java.io.Serializable;

public class FuwaFile implements Serializable{
	private String fileName;
	private byte[] bytes;
	public FuwaFile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FuwaFile(String fileName, byte[] bytes) {
		super();
		this.fileName = fileName;
		this.bytes = bytes;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public byte[] getBytes() {
		return bytes;
	}
	public void setBytes(byte[] bytes) {
		this.bytes = bytes;
	}
	

}
