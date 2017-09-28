package syncbom.org.ufida;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.12
 * 2017-07-28T09:57:49.535+08:00
 * Generated source version: 3.1.12
 * 
 */
@WebService(targetNamespace = "http://www.UFIDA.org", name = "UFIDA.U9.Cust.Fuwa.PDM.SyncBomCompontInfoSV.ISyncBomInfoSV")
@XmlSeeAlso({syncbom.org.datacontract.schemas._2004._07.ufsoft_ubf.ObjectFactory.class, syncbom.org.datacontract.schemas._2004._07.system.ObjectFactory.class, syncbom.org.datacontract.schemas._2004._07.ufsoft.ObjectFactory.class, syncbom.com.microsoft.schemas._2003._10.serialization.ObjectFactory.class, ObjectFactory.class, syncbom.exceptions.ubf.ufsoft.ObjectFactory.class, syncbom.org.datacontract.schemas._2004._07.ufsoft_ubf_util.ObjectFactory.class, syncbom.com.microsoft.schemas._2003._10.serialization.arrays.ObjectFactory.class})
public interface UFIDAU9CustFuwaPDMSyncBomCompontInfoSVISyncBomInfoSV {

    @Action(input = "http://www.UFIDA.org/UFIDA.U9.Cust.Fuwa.PDM.SyncBomCompontInfoSV.ISyncBomInfoSV/Do", output = "http://www.UFIDA.org/UFIDA.U9.Cust.Fuwa.PDM.SyncBomCompontInfoSV.ISyncBomInfoSV/DoResponse", fault = {@FaultAction(className = UFIDAU9CustFuwaPDMSyncBomCompontInfoSVISyncBomInfoSVDoServiceExceptionFaultFaultMessage.class, value = "http://www.UFIDA.org/UFIDA.U9.Cust.Fuwa.PDM.SyncBomCompontInfoSV.ISyncBomInfoSV/DoServiceExceptionFault"), @FaultAction(className = UFIDAU9CustFuwaPDMSyncBomCompontInfoSVISyncBomInfoSVDoExceptionFaultFaultMessage.class, value = "http://www.UFIDA.org/UFIDA.U9.Cust.Fuwa.PDM.SyncBomCompontInfoSV.ISyncBomInfoSV/DoExceptionFault"), @FaultAction(className = UFIDAU9CustFuwaPDMSyncBomCompontInfoSVISyncBomInfoSVDoExceptionBaseFaultFaultMessage.class, value = "http://www.UFIDA.org/UFIDA.U9.Cust.Fuwa.PDM.SyncBomCompontInfoSV.ISyncBomInfoSV/DoExceptionBaseFault"), @FaultAction(className = UFIDAU9CustFuwaPDMSyncBomCompontInfoSVISyncBomInfoSVDoServiceLostExceptionFaultFaultMessage.class, value = "http://www.UFIDA.org/UFIDA.U9.Cust.Fuwa.PDM.SyncBomCompontInfoSV.ISyncBomInfoSV/DoServiceLostExceptionFault"), @FaultAction(className = UFIDAU9CustFuwaPDMSyncBomCompontInfoSVISyncBomInfoSVDoServiceExceptionDetailFaultFaultMessage.class, value = "http://www.UFIDA.org/UFIDA.U9.Cust.Fuwa.PDM.SyncBomCompontInfoSV.ISyncBomInfoSV/DoServiceExceptionDetailFault")})
    @RequestWrapper(localName = "Do", targetNamespace = "http://www.UFIDA.org", className = "org.ufida.Do")
    @WebMethod(operationName = "Do", action = "http://www.UFIDA.org/UFIDA.U9.Cust.Fuwa.PDM.SyncBomCompontInfoSV.ISyncBomInfoSV/Do")
    @ResponseWrapper(localName = "DoResponse", targetNamespace = "http://www.UFIDA.org", className = "org.ufida.DoResponse")
    public void _do(
        @WebParam(name = "context", targetNamespace = "http://www.UFIDA.org")
        java.lang.Object context,
        @WebParam(name = "itemCode", targetNamespace = "http://www.UFIDA.org")
        java.lang.String itemCode,
        @WebParam(name = "bomVersion", targetNamespace = "http://www.UFIDA.org")
        java.lang.String bomVersion,
        @WebParam(mode = WebParam.Mode.OUT, name = "DoResult", targetNamespace = "http://www.UFIDA.org")
        javax.xml.ws.Holder<java.lang.Boolean> doResult,
        @WebParam(mode = WebParam.Mode.OUT, name = "outMessages", targetNamespace = "http://www.UFIDA.org")
        javax.xml.ws.Holder<syncbom.exceptions.ubf.ufsoft.ArrayOfMessageBase> outMessages
    ) throws UFIDAU9CustFuwaPDMSyncBomCompontInfoSVISyncBomInfoSVDoServiceExceptionFaultFaultMessage, UFIDAU9CustFuwaPDMSyncBomCompontInfoSVISyncBomInfoSVDoExceptionFaultFaultMessage, UFIDAU9CustFuwaPDMSyncBomCompontInfoSVISyncBomInfoSVDoExceptionBaseFaultFaultMessage, UFIDAU9CustFuwaPDMSyncBomCompontInfoSVISyncBomInfoSVDoServiceLostExceptionFaultFaultMessage, UFIDAU9CustFuwaPDMSyncBomCompontInfoSVISyncBomInfoSVDoServiceExceptionDetailFaultFaultMessage;
}
