
package queryitem.org.ufida;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.0.1
 * 2015-01-25T08:49:08.186+08:00
 * Generated source version: 3.0.1
 */

@WebFault(name = "ExceptionBase", targetNamespace = "http://schemas.datacontract.org/2004/07/UFSoft.UBF")
public class UFIDAU9CustFuwaPDMQueryItemCodeFromSPECSSVIQueryItemCodeFromSPECSSVDoExceptionBaseFaultFaultMessage extends java.lang.Exception {
    
    private queryitem.org.datacontract.schemas._2004._07.ufsoft.ExceptionBase exceptionBase;

    public UFIDAU9CustFuwaPDMQueryItemCodeFromSPECSSVIQueryItemCodeFromSPECSSVDoExceptionBaseFaultFaultMessage() {
        super();
    }
    
    public UFIDAU9CustFuwaPDMQueryItemCodeFromSPECSSVIQueryItemCodeFromSPECSSVDoExceptionBaseFaultFaultMessage(String message) {
        super(message);
    }
    
    public UFIDAU9CustFuwaPDMQueryItemCodeFromSPECSSVIQueryItemCodeFromSPECSSVDoExceptionBaseFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public UFIDAU9CustFuwaPDMQueryItemCodeFromSPECSSVIQueryItemCodeFromSPECSSVDoExceptionBaseFaultFaultMessage(String message, queryitem.org.datacontract.schemas._2004._07.ufsoft.ExceptionBase exceptionBase) {
        super(message);
        this.exceptionBase = exceptionBase;
    }

    public UFIDAU9CustFuwaPDMQueryItemCodeFromSPECSSVIQueryItemCodeFromSPECSSVDoExceptionBaseFaultFaultMessage(String message, queryitem.org.datacontract.schemas._2004._07.ufsoft.ExceptionBase exceptionBase, Throwable cause) {
        super(message, cause);
        this.exceptionBase = exceptionBase;
    }

    public queryitem.org.datacontract.schemas._2004._07.ufsoft.ExceptionBase getFaultInfo() {
        return this.exceptionBase;
    }
}