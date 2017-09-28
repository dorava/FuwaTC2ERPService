package com.fuwa.services;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.fuwa.services.model.BomResultModel;
import com.fuwa.services.model.LXBomModel;
import com.fuwa.services.model.ResultModel;

@WebService(name = "plmToErp", targetNamespace = "http://com.fuwa.services/")
public interface PlmToErp {

	@WebMethod(operationName = "lhh")
	public String lhh(String content);
	
	

	
	@WebMethod(operationName = "sendMaterial2Erp")
	public ResultModel sendMaterial2Erp(
			@WebParam(name ="jsonMap") String jsonMap);
	
	/*@WebMethod(operationName = "sendBom2Erp")
	public BomResultModel sendBom2Erp(
			@WebParam(name ="parent") LXBomModel parent, 
			@WebParam(name ="childList") List<LXBomModel> childList,
			@WebParam(name ="date") Date date,
			@WebParam(name ="unit") String unit);*/
	
	@WebMethod(operationName = "sendBom2Erp")
	public BomResultModel sendBom2Erp(
			@WebParam(name ="jsonMap") String jsonMap,
			@WebParam(name ="date") Date date);
	
	@WebMethod(operationName = "syncBom2Erp")
	public BomResultModel syncBom2Erp(
			@WebParam(name ="itemId") String itemId, 
			@WebParam(name ="itemRevId") String itemRevId);
	
	@WebMethod(operationName = "queryMaterialFromErp")
	public String queryMaterialFromErp(
			@WebParam(name ="materialCode") String materialCode);
	//(String materialCode,String rev)
	
	@WebMethod(operationName = "queryBomFromErp")
	public String queryBomFromErp(
			@WebParam(name ="materialCode") String materialCode,
			@WebParam(name ="rev") String rev);
}