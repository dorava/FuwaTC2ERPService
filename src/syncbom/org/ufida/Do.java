
package syncbom.org.ufida;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="context" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="itemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bomVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "context",
    "itemCode",
    "bomVersion"
})
@XmlRootElement(name = "Do")
public class Do {

    @XmlElementRef(name = "context", namespace = "http://www.UFIDA.org", type = JAXBElement.class, required = false)
    protected JAXBElement<Object> context;
    @XmlElementRef(name = "itemCode", namespace = "http://www.UFIDA.org", type = JAXBElement.class, required = false)
    protected JAXBElement<String> itemCode;
    @XmlElementRef(name = "bomVersion", namespace = "http://www.UFIDA.org", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bomVersion;

    /**
     * 获取context属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public JAXBElement<Object> getContext() {
        return context;
    }

    /**
     * 设置context属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public void setContext(JAXBElement<Object> value) {
        this.context = value;
    }

    /**
     * 获取itemCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getItemCode() {
        return itemCode;
    }

    /**
     * 设置itemCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setItemCode(JAXBElement<String> value) {
        this.itemCode = value;
    }

    /**
     * 获取bomVersion属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBomVersion() {
        return bomVersion;
    }

    /**
     * 设置bomVersion属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBomVersion(JAXBElement<String> value) {
        this.bomVersion = value;
    }

}
