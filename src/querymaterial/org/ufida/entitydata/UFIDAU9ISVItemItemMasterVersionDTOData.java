
package querymaterial.org.ufida.entitydata;

import java.math.BigDecimal;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import querymaterial.data.util.ubf.ufsoft.MultiLangDataDict;


/**
 * <p>UFIDA.U9.ISV.Item.ItemMasterVersionDTOData complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="UFIDA.U9.ISV.Item.ItemMasterVersionDTOData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.UFIDA.org/EntityData}UFSoft.UBF.Business.DataTransObjectBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Multi_Description" type="{UFSoft.UBF.Util.Data}MultiLangDataDict" minOccurs="0"/&gt;
 *         &lt;element name="m_createdBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_createdOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="m_eCNDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="m_eCNNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_effective" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.Base.PropertyTypes.EffectiveData" minOccurs="0"/&gt;
 *         &lt;element name="m_fromQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="m_iD" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="m_modifiedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_modifiedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="m_operateType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="m_sysVersion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="m_toQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="m_version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UFIDA.U9.ISV.Item.ItemMasterVersionDTOData", propOrder = {
    "description",
    "multiDescription",
    "mCreatedBy",
    "mCreatedOn",
    "mecnDate",
    "mecnno",
    "mEffective",
    "mFromQty",
    "mid",
    "mModifiedBy",
    "mModifiedOn",
    "mOperateType",
    "mSysVersion",
    "mToQty",
    "mVersion"
})
public class UFIDAU9ISVItemItemMasterVersionDTOData
    extends UFSoftUBFBusinessDataTransObjectBase
{

    @XmlElementRef(name = "Description", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "Multi_Description", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<MultiLangDataDict> multiDescription;
    @XmlElementRef(name = "m_createdBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCreatedBy;
    @XmlElement(name = "m_createdOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mCreatedOn;
    @XmlElement(name = "m_eCNDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mecnDate;
    @XmlElementRef(name = "m_eCNNO", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mecnno;
    @XmlElementRef(name = "m_effective", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9BasePropertyTypesEffectiveData> mEffective;
    @XmlElement(name = "m_fromQty")
    protected BigDecimal mFromQty;
    @XmlElement(name = "m_iD")
    protected Long mid;
    @XmlElementRef(name = "m_modifiedBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mModifiedBy;
    @XmlElement(name = "m_modifiedOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mModifiedOn;
    @XmlElement(name = "m_operateType")
    protected Integer mOperateType;
    @XmlElement(name = "m_sysVersion")
    protected Long mSysVersion;
    @XmlElement(name = "m_toQty")
    protected BigDecimal mToQty;
    @XmlElementRef(name = "m_version", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mVersion;

    /**
     * 获取description属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * 设置description属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = value;
    }

    /**
     * 获取multiDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public JAXBElement<MultiLangDataDict> getMultiDescription() {
        return multiDescription;
    }

    /**
     * 设置multiDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public void setMultiDescription(JAXBElement<MultiLangDataDict> value) {
        this.multiDescription = value;
    }

    /**
     * 获取mCreatedBy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMCreatedBy() {
        return mCreatedBy;
    }

    /**
     * 设置mCreatedBy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMCreatedBy(JAXBElement<String> value) {
        this.mCreatedBy = value;
    }

    /**
     * 获取mCreatedOn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMCreatedOn() {
        return mCreatedOn;
    }

    /**
     * 设置mCreatedOn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMCreatedOn(XMLGregorianCalendar value) {
        this.mCreatedOn = value;
    }

    /**
     * 获取mecnDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMECNDate() {
        return mecnDate;
    }

    /**
     * 设置mecnDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMECNDate(XMLGregorianCalendar value) {
        this.mecnDate = value;
    }

    /**
     * 获取mecnno属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMECNNO() {
        return mecnno;
    }

    /**
     * 设置mecnno属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMECNNO(JAXBElement<String> value) {
        this.mecnno = value;
    }

    /**
     * 获取mEffective属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9BasePropertyTypesEffectiveData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9BasePropertyTypesEffectiveData> getMEffective() {
        return mEffective;
    }

    /**
     * 设置mEffective属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9BasePropertyTypesEffectiveData }{@code >}
     *     
     */
    public void setMEffective(JAXBElement<UFIDAU9BasePropertyTypesEffectiveData> value) {
        this.mEffective = value;
    }

    /**
     * 获取mFromQty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMFromQty() {
        return mFromQty;
    }

    /**
     * 设置mFromQty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMFromQty(BigDecimal value) {
        this.mFromQty = value;
    }

    /**
     * 获取mid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMID() {
        return mid;
    }

    /**
     * 设置mid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMID(Long value) {
        this.mid = value;
    }

    /**
     * 获取mModifiedBy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMModifiedBy() {
        return mModifiedBy;
    }

    /**
     * 设置mModifiedBy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMModifiedBy(JAXBElement<String> value) {
        this.mModifiedBy = value;
    }

    /**
     * 获取mModifiedOn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMModifiedOn() {
        return mModifiedOn;
    }

    /**
     * 设置mModifiedOn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMModifiedOn(XMLGregorianCalendar value) {
        this.mModifiedOn = value;
    }

    /**
     * 获取mOperateType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMOperateType() {
        return mOperateType;
    }

    /**
     * 设置mOperateType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMOperateType(Integer value) {
        this.mOperateType = value;
    }

    /**
     * 获取mSysVersion属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMSysVersion() {
        return mSysVersion;
    }

    /**
     * 设置mSysVersion属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMSysVersion(Long value) {
        this.mSysVersion = value;
    }

    /**
     * 获取mToQty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMToQty() {
        return mToQty;
    }

    /**
     * 设置mToQty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMToQty(BigDecimal value) {
        this.mToQty = value;
    }

    /**
     * 获取mVersion属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMVersion() {
        return mVersion;
    }

    /**
     * 设置mVersion属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMVersion(JAXBElement<String> value) {
        this.mVersion = value;
    }

}
