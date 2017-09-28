
package queryitem.org.ufida;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import queryitem.com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import queryitem.exceptions.ubf.ufsoft.ArrayOfMessageBase;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DoResult" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="outMessages" type="{UFSoft.UBF.Exceptions}ArrayOfMessageBase" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "doResult",
    "outMessages"
})
@XmlRootElement(name = "DoResponse")
public class DoResponse {

    @XmlElementRef(name = "DoResult", namespace = "http://www.UFIDA.org", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> doResult;
    @XmlElementRef(name = "outMessages", namespace = "http://www.UFIDA.org", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfMessageBase> outMessages;

    /**
     * 获取doResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getDoResult() {
        return doResult;
    }

    /**
     * 设置doResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setDoResult(JAXBElement<ArrayOfstring> value) {
        this.doResult = value;
    }

    /**
     * 获取outMessages属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMessageBase }{@code >}
     *     
     */
    public JAXBElement<ArrayOfMessageBase> getOutMessages() {
        return outMessages;
    }

    /**
     * 设置outMessages属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMessageBase }{@code >}
     *     
     */
    public void setOutMessages(JAXBElement<ArrayOfMessageBase> value) {
        this.outMessages = value;
    }

}
