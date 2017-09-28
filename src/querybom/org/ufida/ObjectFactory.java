
package querybom.org.ufida;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import querybom.exceptions.ubf.ufsoft.ArrayOfMessageBase;
import querybom.org.ufida.entitydata.ArrayOfUFIDAU9ISVMFGBOMBOMMasterDTO4CreateSvData;
import querybom.org.ufida.entitydata.ArrayOfUFIDAU9ISVMFGBOMQueryDelParamsDTOData;
import querybom.org.ufida.entitydata.UFIDAU9CBOPubControllerContextDTOData;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.ufida package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DoContext_QNAME = new QName("http://www.UFIDA.org", "context");
    private final static QName _DoQryParams_QNAME = new QName("http://www.UFIDA.org", "qryParams");
    private final static QName _DoContextDTO_QNAME = new QName("http://www.UFIDA.org", "contextDTO");
    private final static QName _DoResponseDoResult_QNAME = new QName("http://www.UFIDA.org", "DoResult");
    private final static QName _DoResponseOutMessages_QNAME = new QName("http://www.UFIDA.org", "outMessages");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.ufida
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Do }
     * 
     */
    public Do createDo() {
        return new Do();
    }

    /**
     * Create an instance of {@link DoResponse }
     * 
     */
    public DoResponse createDoResponse() {
        return new DoResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.UFIDA.org", name = "context", scope = Do.class)
    public JAXBElement<Object> createDoContext(Object value) {
        return new JAXBElement<Object>(_DoContext_QNAME, Object.class, Do.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVMFGBOMQueryDelParamsDTOData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.UFIDA.org", name = "qryParams", scope = Do.class)
    public JAXBElement<ArrayOfUFIDAU9ISVMFGBOMQueryDelParamsDTOData> createDoQryParams(ArrayOfUFIDAU9ISVMFGBOMQueryDelParamsDTOData value) {
        return new JAXBElement<ArrayOfUFIDAU9ISVMFGBOMQueryDelParamsDTOData>(_DoQryParams_QNAME, ArrayOfUFIDAU9ISVMFGBOMQueryDelParamsDTOData.class, Do.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerContextDTOData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.UFIDA.org", name = "contextDTO", scope = Do.class)
    public JAXBElement<UFIDAU9CBOPubControllerContextDTOData> createDoContextDTO(UFIDAU9CBOPubControllerContextDTOData value) {
        return new JAXBElement<UFIDAU9CBOPubControllerContextDTOData>(_DoContextDTO_QNAME, UFIDAU9CBOPubControllerContextDTOData.class, Do.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVMFGBOMBOMMasterDTO4CreateSvData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.UFIDA.org", name = "DoResult", scope = DoResponse.class)
    public JAXBElement<ArrayOfUFIDAU9ISVMFGBOMBOMMasterDTO4CreateSvData> createDoResponseDoResult(ArrayOfUFIDAU9ISVMFGBOMBOMMasterDTO4CreateSvData value) {
        return new JAXBElement<ArrayOfUFIDAU9ISVMFGBOMBOMMasterDTO4CreateSvData>(_DoResponseDoResult_QNAME, ArrayOfUFIDAU9ISVMFGBOMBOMMasterDTO4CreateSvData.class, DoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMessageBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.UFIDA.org", name = "outMessages", scope = DoResponse.class)
    public JAXBElement<ArrayOfMessageBase> createDoResponseOutMessages(ArrayOfMessageBase value) {
        return new JAXBElement<ArrayOfMessageBase>(_DoResponseOutMessages_QNAME, ArrayOfMessageBase.class, DoResponse.class, value);
    }

}
