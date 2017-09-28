
package querymaterial.org.ufida.entitydata;

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
 * <p>UFIDA.U9.ISV.Item.ItemInspectionInfoDTOData complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="UFIDA.U9.ISV.Item.ItemInspectionInfoDTOData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.UFIDA.org/EntityData}UFSoft.UBF.Business.DataTransObjectBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Multi_QualityDescription" type="{UFSoft.UBF.Util.Data}MultiLangDataDict" minOccurs="0"/&gt;
 *         &lt;element name="QualityDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_buildCompleteCheckUpRule" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="m_buildCompleteCheckUpRuleVer" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="m_createdBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_createdOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="m_destroyInspectQty" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="m_iD" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="m_inStockInspectRule" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="m_inStockInspectRuleVer" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="m_inspectPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="m_modifiedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_modifiedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="m_receiptInspectRule" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="m_receiptInspectRuleVer" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="m_saleReturnCheckupRule" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="m_saleReturnCheckupRuleVer" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="m_shipInspectRule" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="m_shipInspectRuleVer" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="m_shipmentInspectRule" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="m_shipmentInspectRuleVer" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="m_sysVersion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UFIDA.U9.ISV.Item.ItemInspectionInfoDTOData", propOrder = {
    "multiQualityDescription",
    "qualityDescription",
    "mBuildCompleteCheckUpRule",
    "mBuildCompleteCheckUpRuleVer",
    "mCreatedBy",
    "mCreatedOn",
    "mDestroyInspectQty",
    "mid",
    "mInStockInspectRule",
    "mInStockInspectRuleVer",
    "mInspectPeriod",
    "mModifiedBy",
    "mModifiedOn",
    "mReceiptInspectRule",
    "mReceiptInspectRuleVer",
    "mSaleReturnCheckupRule",
    "mSaleReturnCheckupRuleVer",
    "mShipInspectRule",
    "mShipInspectRuleVer",
    "mShipmentInspectRule",
    "mShipmentInspectRuleVer",
    "mSysVersion"
})
public class UFIDAU9ISVItemItemInspectionInfoDTOData
    extends UFSoftUBFBusinessDataTransObjectBase
{

    @XmlElementRef(name = "Multi_QualityDescription", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<MultiLangDataDict> multiQualityDescription;
    @XmlElementRef(name = "QualityDescription", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> qualityDescription;
    @XmlElement(name = "m_buildCompleteCheckUpRule")
    protected Long mBuildCompleteCheckUpRule;
    @XmlElement(name = "m_buildCompleteCheckUpRuleVer")
    protected Long mBuildCompleteCheckUpRuleVer;
    @XmlElementRef(name = "m_createdBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCreatedBy;
    @XmlElement(name = "m_createdOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mCreatedOn;
    @XmlElement(name = "m_destroyInspectQty")
    protected Integer mDestroyInspectQty;
    @XmlElement(name = "m_iD")
    protected Long mid;
    @XmlElement(name = "m_inStockInspectRule")
    protected Long mInStockInspectRule;
    @XmlElement(name = "m_inStockInspectRuleVer")
    protected Long mInStockInspectRuleVer;
    @XmlElement(name = "m_inspectPeriod")
    protected Integer mInspectPeriod;
    @XmlElementRef(name = "m_modifiedBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mModifiedBy;
    @XmlElement(name = "m_modifiedOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mModifiedOn;
    @XmlElement(name = "m_receiptInspectRule")
    protected Long mReceiptInspectRule;
    @XmlElement(name = "m_receiptInspectRuleVer")
    protected Long mReceiptInspectRuleVer;
    @XmlElement(name = "m_saleReturnCheckupRule")
    protected Long mSaleReturnCheckupRule;
    @XmlElement(name = "m_saleReturnCheckupRuleVer")
    protected Long mSaleReturnCheckupRuleVer;
    @XmlElement(name = "m_shipInspectRule")
    protected Long mShipInspectRule;
    @XmlElement(name = "m_shipInspectRuleVer")
    protected Long mShipInspectRuleVer;
    @XmlElement(name = "m_shipmentInspectRule")
    protected Long mShipmentInspectRule;
    @XmlElement(name = "m_shipmentInspectRuleVer")
    protected Long mShipmentInspectRuleVer;
    @XmlElement(name = "m_sysVersion")
    protected Long mSysVersion;

    /**
     * ��ȡmultiQualityDescription���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public JAXBElement<MultiLangDataDict> getMultiQualityDescription() {
        return multiQualityDescription;
    }

    /**
     * ����multiQualityDescription���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public void setMultiQualityDescription(JAXBElement<MultiLangDataDict> value) {
        this.multiQualityDescription = value;
    }

    /**
     * ��ȡqualityDescription���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQualityDescription() {
        return qualityDescription;
    }

    /**
     * ����qualityDescription���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQualityDescription(JAXBElement<String> value) {
        this.qualityDescription = value;
    }

    /**
     * ��ȡmBuildCompleteCheckUpRule���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMBuildCompleteCheckUpRule() {
        return mBuildCompleteCheckUpRule;
    }

    /**
     * ����mBuildCompleteCheckUpRule���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMBuildCompleteCheckUpRule(Long value) {
        this.mBuildCompleteCheckUpRule = value;
    }

    /**
     * ��ȡmBuildCompleteCheckUpRuleVer���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMBuildCompleteCheckUpRuleVer() {
        return mBuildCompleteCheckUpRuleVer;
    }

    /**
     * ����mBuildCompleteCheckUpRuleVer���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMBuildCompleteCheckUpRuleVer(Long value) {
        this.mBuildCompleteCheckUpRuleVer = value;
    }

    /**
     * ��ȡmCreatedBy���Ե�ֵ��
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
     * ����mCreatedBy���Ե�ֵ��
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
     * ��ȡmCreatedOn���Ե�ֵ��
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
     * ����mCreatedOn���Ե�ֵ��
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
     * ��ȡmDestroyInspectQty���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMDestroyInspectQty() {
        return mDestroyInspectQty;
    }

    /**
     * ����mDestroyInspectQty���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMDestroyInspectQty(Integer value) {
        this.mDestroyInspectQty = value;
    }

    /**
     * ��ȡmid���Ե�ֵ��
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
     * ����mid���Ե�ֵ��
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
     * ��ȡmInStockInspectRule���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMInStockInspectRule() {
        return mInStockInspectRule;
    }

    /**
     * ����mInStockInspectRule���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMInStockInspectRule(Long value) {
        this.mInStockInspectRule = value;
    }

    /**
     * ��ȡmInStockInspectRuleVer���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMInStockInspectRuleVer() {
        return mInStockInspectRuleVer;
    }

    /**
     * ����mInStockInspectRuleVer���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMInStockInspectRuleVer(Long value) {
        this.mInStockInspectRuleVer = value;
    }

    /**
     * ��ȡmInspectPeriod���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMInspectPeriod() {
        return mInspectPeriod;
    }

    /**
     * ����mInspectPeriod���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMInspectPeriod(Integer value) {
        this.mInspectPeriod = value;
    }

    /**
     * ��ȡmModifiedBy���Ե�ֵ��
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
     * ����mModifiedBy���Ե�ֵ��
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
     * ��ȡmModifiedOn���Ե�ֵ��
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
     * ����mModifiedOn���Ե�ֵ��
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
     * ��ȡmReceiptInspectRule���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMReceiptInspectRule() {
        return mReceiptInspectRule;
    }

    /**
     * ����mReceiptInspectRule���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMReceiptInspectRule(Long value) {
        this.mReceiptInspectRule = value;
    }

    /**
     * ��ȡmReceiptInspectRuleVer���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMReceiptInspectRuleVer() {
        return mReceiptInspectRuleVer;
    }

    /**
     * ����mReceiptInspectRuleVer���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMReceiptInspectRuleVer(Long value) {
        this.mReceiptInspectRuleVer = value;
    }

    /**
     * ��ȡmSaleReturnCheckupRule���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMSaleReturnCheckupRule() {
        return mSaleReturnCheckupRule;
    }

    /**
     * ����mSaleReturnCheckupRule���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMSaleReturnCheckupRule(Long value) {
        this.mSaleReturnCheckupRule = value;
    }

    /**
     * ��ȡmSaleReturnCheckupRuleVer���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMSaleReturnCheckupRuleVer() {
        return mSaleReturnCheckupRuleVer;
    }

    /**
     * ����mSaleReturnCheckupRuleVer���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMSaleReturnCheckupRuleVer(Long value) {
        this.mSaleReturnCheckupRuleVer = value;
    }

    /**
     * ��ȡmShipInspectRule���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMShipInspectRule() {
        return mShipInspectRule;
    }

    /**
     * ����mShipInspectRule���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMShipInspectRule(Long value) {
        this.mShipInspectRule = value;
    }

    /**
     * ��ȡmShipInspectRuleVer���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMShipInspectRuleVer() {
        return mShipInspectRuleVer;
    }

    /**
     * ����mShipInspectRuleVer���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMShipInspectRuleVer(Long value) {
        this.mShipInspectRuleVer = value;
    }

    /**
     * ��ȡmShipmentInspectRule���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMShipmentInspectRule() {
        return mShipmentInspectRule;
    }

    /**
     * ����mShipmentInspectRule���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMShipmentInspectRule(Long value) {
        this.mShipmentInspectRule = value;
    }

    /**
     * ��ȡmShipmentInspectRuleVer���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMShipmentInspectRuleVer() {
        return mShipmentInspectRuleVer;
    }

    /**
     * ����mShipmentInspectRuleVer���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMShipmentInspectRuleVer(Long value) {
        this.mShipmentInspectRuleVer = value;
    }

    /**
     * ��ȡmSysVersion���Ե�ֵ��
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
     * ����mSysVersion���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMSysVersion(Long value) {
        this.mSysVersion = value;
    }

}
