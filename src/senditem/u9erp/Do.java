
package senditem.u9erp;

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
 *         &lt;element name="itemInfo" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.Cust.Fuwa.PDM.ItemSendSV.ItemInfoDTOData" minOccurs="0"/&gt;
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
    "itemInfo"
})
@XmlRootElement(name = "Do", namespace = "http://www.UFIDA.org")
public class Do {

    @XmlElementRef(name = "context", namespace = "http://www.UFIDA.org", type = JAXBElement.class, required = false)
    protected JAXBElement<Object> context;
    @XmlElementRef(name = "itemInfo", namespace = "http://www.UFIDA.org", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CustFuwaPDMItemSendSVItemInfoDTOData> itemInfo;

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
     * 获取itemInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CustFuwaPDMItemSendSVItemInfoDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CustFuwaPDMItemSendSVItemInfoDTOData> getItemInfo() {
        return itemInfo;
    }

    /**
     * 设置itemInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CustFuwaPDMItemSendSVItemInfoDTOData }{@code >}
     *     
     */
    public void setItemInfo(JAXBElement<UFIDAU9CustFuwaPDMItemSendSVItemInfoDTOData> value) {
        this.itemInfo = value;
    }

}
