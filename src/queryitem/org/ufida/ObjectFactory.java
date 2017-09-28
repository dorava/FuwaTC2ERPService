
package queryitem.org.ufida;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import queryitem.com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import queryitem.exceptions.ubf.ufsoft.ArrayOfMessageBase;


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
    private final static QName _DoSPECS_QNAME = new QName("http://www.UFIDA.org", "sPECS");
    private final static QName _DoResponseDoResult_QNAME = new QName("http://www.UFIDA.org", "DoResult");
    private final static QName _DoResponseOutMessages_QNAME = new QName("http://www.UFIDA.org", "outMessages");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.ufida
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DoResponse }
     * 
     */
    public DoResponse createDoResponse() {
        return new DoResponse();
    }

    /**
     * Create an instance of {@link Do }
     * 
     */
    public Do createDo() {
        return new Do();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.UFIDA.org", name = "sPECS", scope = Do.class)
    public JAXBElement<String> createDoSPECS(String value) {
        return new JAXBElement<String>(_DoSPECS_QNAME, String.class, Do.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.UFIDA.org", name = "DoResult", scope = DoResponse.class)
    public JAXBElement<ArrayOfstring> createDoResponseDoResult(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_DoResponseDoResult_QNAME, ArrayOfstring.class, DoResponse.class, value);
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
