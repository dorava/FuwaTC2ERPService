
package querymaterial.data.util.ubf.ufsoft;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the data.util.ubf.ufsoft package. 
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

    private final static QName _MultiLangDataDict_QNAME = new QName("UFSoft.UBF.Util.Data", "MultiLangDataDict");
    private final static QName _ArrayOfMultiLangData_QNAME = new QName("UFSoft.UBF.Util.Data", "ArrayOfMultiLangData");
    private final static QName _MultiLangData_QNAME = new QName("UFSoft.UBF.Util.Data", "MultiLangData");
    private final static QName _MultiLangDataLangType_QNAME = new QName("UFSoft.UBF.Util.Data", "LangType");
    private final static QName _MultiLangDataLangValue_QNAME = new QName("UFSoft.UBF.Util.Data", "LangValue");
    private final static QName _MultiLangDataDictLangs_QNAME = new QName("UFSoft.UBF.Util.Data", "_langs");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: data.util.ubf.ufsoft
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MultiLangDataDict }
     * 
     */
    public MultiLangDataDict createMultiLangDataDict() {
        return new MultiLangDataDict();
    }

    /**
     * Create an instance of {@link ArrayOfMultiLangData }
     * 
     */
    public ArrayOfMultiLangData createArrayOfMultiLangData() {
        return new ArrayOfMultiLangData();
    }

    /**
     * Create an instance of {@link MultiLangData }
     * 
     */
    public MultiLangData createMultiLangData() {
        return new MultiLangData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "UFSoft.UBF.Util.Data", name = "MultiLangDataDict")
    public JAXBElement<MultiLangDataDict> createMultiLangDataDict(MultiLangDataDict value) {
        return new JAXBElement<MultiLangDataDict>(_MultiLangDataDict_QNAME, MultiLangDataDict.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMultiLangData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "UFSoft.UBF.Util.Data", name = "ArrayOfMultiLangData")
    public JAXBElement<ArrayOfMultiLangData> createArrayOfMultiLangData(ArrayOfMultiLangData value) {
        return new JAXBElement<ArrayOfMultiLangData>(_ArrayOfMultiLangData_QNAME, ArrayOfMultiLangData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiLangData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "UFSoft.UBF.Util.Data", name = "MultiLangData")
    public JAXBElement<MultiLangData> createMultiLangData(MultiLangData value) {
        return new JAXBElement<MultiLangData>(_MultiLangData_QNAME, MultiLangData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "UFSoft.UBF.Util.Data", name = "LangType", scope = MultiLangData.class)
    public JAXBElement<String> createMultiLangDataLangType(String value) {
        return new JAXBElement<String>(_MultiLangDataLangType_QNAME, String.class, MultiLangData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "UFSoft.UBF.Util.Data", name = "LangValue", scope = MultiLangData.class)
    public JAXBElement<String> createMultiLangDataLangValue(String value) {
        return new JAXBElement<String>(_MultiLangDataLangValue_QNAME, String.class, MultiLangData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMultiLangData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "UFSoft.UBF.Util.Data", name = "_langs", scope = MultiLangDataDict.class)
    public JAXBElement<ArrayOfMultiLangData> createMultiLangDataDictLangs(ArrayOfMultiLangData value) {
        return new JAXBElement<ArrayOfMultiLangData>(_MultiLangDataDictLangs_QNAME, ArrayOfMultiLangData.class, MultiLangDataDict.class, value);
    }

}
