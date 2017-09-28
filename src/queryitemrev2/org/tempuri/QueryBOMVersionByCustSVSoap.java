package queryitemrev2.org.tempuri;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.0
 * 2017-09-25T08:20:45.154+08:00
 * Generated source version: 3.2.0
 * 
 */
@WebService(targetNamespace = "http://tempuri.org/", name = "QueryBOMVersionByCustSVSoap")
@XmlSeeAlso({ObjectFactory.class})
public interface QueryBOMVersionByCustSVSoap {

    @WebMethod(operationName = "Do", action = "http://tempuri.org/Do")
    @RequestWrapper(localName = "Do", targetNamespace = "http://tempuri.org/", className = "org.tempuri.Do")
    @ResponseWrapper(localName = "DoResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.DoResponse")
    @WebResult(name = "DoResult", targetNamespace = "http://tempuri.org/")
    public java.lang.String _do(
        @WebParam(name = "itemCode", targetNamespace = "http://tempuri.org/")
        java.lang.String itemCode,
        @WebParam(name = "queryType", targetNamespace = "http://tempuri.org/")
        int queryType,
        @WebParam(name = "orgID", targetNamespace = "http://tempuri.org/")
        java.lang.String orgID,
        @WebParam(name = "userID", targetNamespace = "http://tempuri.org/")
        java.lang.String userID,
        @WebParam(name = "userCode", targetNamespace = "http://tempuri.org/")
        java.lang.String userCode,
        @WebParam(name = "userName", targetNamespace = "http://tempuri.org/")
        java.lang.String userName
    );
}
