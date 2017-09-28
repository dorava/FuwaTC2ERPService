
package querymaterial.org.ufida;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import querymaterial.exceptions.ubf.ufsoft.ArrayOfMessageBase;
import querymaterial.org.ufida.entitydata.ArrayOfUFIDAU9ISVItemItemMasterDTOData;
import querymaterial.org.ufida.entitydata.ArrayOfUFIDAU9ISVItemQueryItemDTOData;
import querymaterial.org.ufida.entitydata.UFIDAU9CBOPubControllerContextDTOData;


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
    private final static QName _DoQueryItemDTOs_QNAME = new QName("http://www.UFIDA.org", "queryItemDTOs");
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVItemQueryItemDTOData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.UFIDA.org", name = "queryItemDTOs", scope = Do.class)
    public JAXBElement<ArrayOfUFIDAU9ISVItemQueryItemDTOData> createDoQueryItemDTOs(ArrayOfUFIDAU9ISVItemQueryItemDTOData value) {
        return new JAXBElement<ArrayOfUFIDAU9ISVItemQueryItemDTOData>(_DoQueryItemDTOs_QNAME, ArrayOfUFIDAU9ISVItemQueryItemDTOData.class, Do.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVItemItemMasterDTOData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.UFIDA.org", name = "DoResult", scope = DoResponse.class)
    public JAXBElement<ArrayOfUFIDAU9ISVItemItemMasterDTOData> createDoResponseDoResult(ArrayOfUFIDAU9ISVItemItemMasterDTOData value) {
        return new JAXBElement<ArrayOfUFIDAU9ISVItemItemMasterDTOData>(_DoResponseDoResult_QNAME, ArrayOfUFIDAU9ISVItemItemMasterDTOData.class, DoResponse.class, value);
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
