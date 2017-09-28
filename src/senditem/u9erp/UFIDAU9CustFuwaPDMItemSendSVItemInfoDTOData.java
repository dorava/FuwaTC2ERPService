
package senditem.u9erp;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>UFIDA.U9.Cust.Fuwa.PDM.ItemSendSV.ItemInfoDTOData complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="UFIDA.U9.Cust.Fuwa.PDM.ItemSendSV.ItemInfoDTOData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.UFIDA.org/EntityData}UFSoft.UBF.Business.DataTransObjectBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="m_fromOrg" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="m_itemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_toOrg" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UFIDA.U9.Cust.Fuwa.PDM.ItemSendSV.ItemInfoDTOData", namespace = "http://www.UFIDA.org/EntityData", propOrder = {
    "mFromOrg",
    "mItemCode",
    "mToOrg"
})
public class UFIDAU9CustFuwaPDMItemSendSVItemInfoDTOData
    extends UFSoftUBFBusinessDataTransObjectBase
{

    @XmlElement(name = "m_fromOrg", namespace = "http://www.UFIDA.org/EntityData")
    protected Long mFromOrg;
    @XmlElementRef(name = "m_itemCode", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mItemCode;
    @XmlElementRef(name = "m_toOrg", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOflong> mToOrg;

    /**
     * 获取mFromOrg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMFromOrg() {
        return mFromOrg;
    }

    /**
     * 设置mFromOrg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMFromOrg(Long value) {
        this.mFromOrg = value;
    }

    /**
     * 获取mItemCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMItemCode() {
        return mItemCode;
    }

    /**
     * 设置mItemCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMItemCode(JAXBElement<String> value) {
        this.mItemCode = value;
    }

    /**
     * 获取mToOrg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public JAXBElement<ArrayOflong> getMToOrg() {
        return mToOrg;
    }

    /**
     * 设置mToOrg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public void setMToOrg(JAXBElement<ArrayOflong> value) {
        this.mToOrg = value;
    }

}
