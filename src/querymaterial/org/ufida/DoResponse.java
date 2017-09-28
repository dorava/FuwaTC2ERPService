
package querymaterial.org.ufida;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import querymaterial.exceptions.ubf.ufsoft.ArrayOfMessageBase;
import querymaterial.org.ufida.entitydata.ArrayOfUFIDAU9ISVItemItemMasterDTOData;


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
 *         &lt;element name="DoResult" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.ISV.Item.ItemMasterDTOData" minOccurs="0"/&gt;
 *         &lt;element name="outMessages" type="{UFSoft.UBF.Exceptions}ArrayOfMessageBase" minOccurs="0"/&gt;
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
    "doResult",
    "outMessages"
})
@XmlRootElement(name = "DoResponse")
public class DoResponse {

    @XmlElementRef(name = "DoResult", namespace = "http://www.UFIDA.org", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9ISVItemItemMasterDTOData> doResult;
    @XmlElementRef(name = "outMessages", namespace = "http://www.UFIDA.org", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfMessageBase> outMessages;

    /**
     * 获取doResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVItemItemMasterDTOData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9ISVItemItemMasterDTOData> getDoResult() {
        return doResult;
    }

    /**
     * 设置doResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVItemItemMasterDTOData }{@code >}
     *     
     */
    public void setDoResult(JAXBElement<ArrayOfUFIDAU9ISVItemItemMasterDTOData> value) {
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
