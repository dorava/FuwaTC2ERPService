
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


/**
 * <p>UFIDA.U9.ISV.Item.ItemMRPInfoDTOData complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="UFIDA.U9.ISV.Item.ItemMRPInfoDTOData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.UFIDA.org/EntityData}UFSoft.UBF.Business.DataTransObjectBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="m_createdBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_createdOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="m_demandTimeFence" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="m_demandTimeFenceDays" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="m_demandTimeFenceRuleType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="m_firmPlannedMOTimeFence" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="m_fixedLT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="m_forecastContorlType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="m_iD" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="m_isReduceMPS" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="m_isTraceRequirement" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="m_lTBatch" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="m_mRPPlanningType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="m_modifiedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_modifiedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="m_overRunRatio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="m_planer" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&gt;
 *         &lt;element name="m_planningTimeFence" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="m_planningTimeFenceDays" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="m_planningTimeFenceRuleType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="m_purBackwardProcessLT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="m_purForwardProcessLT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="m_purProcessLT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="m_rearrangeTimeFence" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="m_releaseTimeFence" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="m_releaseTimeFenceDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="m_saleBackwardProcessLT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="m_saleForwardProcessLT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="m_saleProcessLT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="m_sumLT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="m_sumManufactureLT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="m_sysVersion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="m_varietyLT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UFIDA.U9.ISV.Item.ItemMRPInfoDTOData", propOrder = {
    "mCreatedBy",
    "mCreatedOn",
    "mDemandTimeFence",
    "mDemandTimeFenceDays",
    "mDemandTimeFenceRuleType",
    "mFirmPlannedMOTimeFence",
    "mFixedLT",
    "mForecastContorlType",
    "mid",
    "mIsReduceMPS",
    "mIsTraceRequirement",
    "mltBatch",
    "mmrpPlanningType",
    "mModifiedBy",
    "mModifiedOn",
    "mOverRunRatio",
    "mPlaner",
    "mPlanningTimeFence",
    "mPlanningTimeFenceDays",
    "mPlanningTimeFenceRuleType",
    "mPurBackwardProcessLT",
    "mPurForwardProcessLT",
    "mPurProcessLT",
    "mRearrangeTimeFence",
    "mReleaseTimeFence",
    "mReleaseTimeFenceDays",
    "mSaleBackwardProcessLT",
    "mSaleForwardProcessLT",
    "mSaleProcessLT",
    "mSumLT",
    "mSumManufactureLT",
    "mSysVersion",
    "mVarietyLT"
})
public class UFIDAU9ISVItemItemMRPInfoDTOData
    extends UFSoftUBFBusinessDataTransObjectBase
{

    @XmlElementRef(name = "m_createdBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCreatedBy;
    @XmlElement(name = "m_createdOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mCreatedOn;
    @XmlElement(name = "m_demandTimeFence")
    protected Integer mDemandTimeFence;
    @XmlElement(name = "m_demandTimeFenceDays")
    protected BigDecimal mDemandTimeFenceDays;
    @XmlElement(name = "m_demandTimeFenceRuleType")
    protected Integer mDemandTimeFenceRuleType;
    @XmlElement(name = "m_firmPlannedMOTimeFence")
    protected Integer mFirmPlannedMOTimeFence;
    @XmlElement(name = "m_fixedLT")
    protected BigDecimal mFixedLT;
    @XmlElement(name = "m_forecastContorlType")
    protected Integer mForecastContorlType;
    @XmlElement(name = "m_iD")
    protected Long mid;
    @XmlElement(name = "m_isReduceMPS")
    protected Boolean mIsReduceMPS;
    @XmlElement(name = "m_isTraceRequirement")
    protected Boolean mIsTraceRequirement;
    @XmlElement(name = "m_lTBatch")
    protected BigDecimal mltBatch;
    @XmlElement(name = "m_mRPPlanningType")
    protected Integer mmrpPlanningType;
    @XmlElementRef(name = "m_modifiedBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mModifiedBy;
    @XmlElement(name = "m_modifiedOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mModifiedOn;
    @XmlElement(name = "m_overRunRatio")
    protected BigDecimal mOverRunRatio;
    @XmlElementRef(name = "m_planer", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mPlaner;
    @XmlElement(name = "m_planningTimeFence")
    protected Integer mPlanningTimeFence;
    @XmlElement(name = "m_planningTimeFenceDays")
    protected BigDecimal mPlanningTimeFenceDays;
    @XmlElement(name = "m_planningTimeFenceRuleType")
    protected Integer mPlanningTimeFenceRuleType;
    @XmlElement(name = "m_purBackwardProcessLT")
    protected BigDecimal mPurBackwardProcessLT;
    @XmlElement(name = "m_purForwardProcessLT")
    protected BigDecimal mPurForwardProcessLT;
    @XmlElement(name = "m_purProcessLT")
    protected BigDecimal mPurProcessLT;
    @XmlElement(name = "m_rearrangeTimeFence")
    protected Integer mRearrangeTimeFence;
    @XmlElement(name = "m_releaseTimeFence")
    protected Integer mReleaseTimeFence;
    @XmlElement(name = "m_releaseTimeFenceDays")
    protected Integer mReleaseTimeFenceDays;
    @XmlElement(name = "m_saleBackwardProcessLT")
    protected BigDecimal mSaleBackwardProcessLT;
    @XmlElement(name = "m_saleForwardProcessLT")
    protected BigDecimal mSaleForwardProcessLT;
    @XmlElement(name = "m_saleProcessLT")
    protected BigDecimal mSaleProcessLT;
    @XmlElement(name = "m_sumLT")
    protected BigDecimal mSumLT;
    @XmlElement(name = "m_sumManufactureLT")
    protected BigDecimal mSumManufactureLT;
    @XmlElement(name = "m_sysVersion")
    protected Long mSysVersion;
    @XmlElement(name = "m_varietyLT")
    protected BigDecimal mVarietyLT;

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
     * 获取mDemandTimeFence属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMDemandTimeFence() {
        return mDemandTimeFence;
    }

    /**
     * 设置mDemandTimeFence属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMDemandTimeFence(Integer value) {
        this.mDemandTimeFence = value;
    }

    /**
     * 获取mDemandTimeFenceDays属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMDemandTimeFenceDays() {
        return mDemandTimeFenceDays;
    }

    /**
     * 设置mDemandTimeFenceDays属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMDemandTimeFenceDays(BigDecimal value) {
        this.mDemandTimeFenceDays = value;
    }

    /**
     * 获取mDemandTimeFenceRuleType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMDemandTimeFenceRuleType() {
        return mDemandTimeFenceRuleType;
    }

    /**
     * 设置mDemandTimeFenceRuleType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMDemandTimeFenceRuleType(Integer value) {
        this.mDemandTimeFenceRuleType = value;
    }

    /**
     * 获取mFirmPlannedMOTimeFence属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMFirmPlannedMOTimeFence() {
        return mFirmPlannedMOTimeFence;
    }

    /**
     * 设置mFirmPlannedMOTimeFence属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMFirmPlannedMOTimeFence(Integer value) {
        this.mFirmPlannedMOTimeFence = value;
    }

    /**
     * 获取mFixedLT属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMFixedLT() {
        return mFixedLT;
    }

    /**
     * 设置mFixedLT属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMFixedLT(BigDecimal value) {
        this.mFixedLT = value;
    }

    /**
     * 获取mForecastContorlType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMForecastContorlType() {
        return mForecastContorlType;
    }

    /**
     * 设置mForecastContorlType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMForecastContorlType(Integer value) {
        this.mForecastContorlType = value;
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
     * 获取mIsReduceMPS属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsReduceMPS() {
        return mIsReduceMPS;
    }

    /**
     * 设置mIsReduceMPS属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsReduceMPS(Boolean value) {
        this.mIsReduceMPS = value;
    }

    /**
     * 获取mIsTraceRequirement属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsTraceRequirement() {
        return mIsTraceRequirement;
    }

    /**
     * 设置mIsTraceRequirement属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsTraceRequirement(Boolean value) {
        this.mIsTraceRequirement = value;
    }

    /**
     * 获取mltBatch属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMLTBatch() {
        return mltBatch;
    }

    /**
     * 设置mltBatch属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMLTBatch(BigDecimal value) {
        this.mltBatch = value;
    }

    /**
     * 获取mmrpPlanningType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMMRPPlanningType() {
        return mmrpPlanningType;
    }

    /**
     * 设置mmrpPlanningType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMMRPPlanningType(Integer value) {
        this.mmrpPlanningType = value;
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
     * 获取mOverRunRatio属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMOverRunRatio() {
        return mOverRunRatio;
    }

    /**
     * 设置mOverRunRatio属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMOverRunRatio(BigDecimal value) {
        this.mOverRunRatio = value;
    }

    /**
     * 获取mPlaner属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMPlaner() {
        return mPlaner;
    }

    /**
     * 设置mPlaner属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMPlaner(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mPlaner = value;
    }

    /**
     * 获取mPlanningTimeFence属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMPlanningTimeFence() {
        return mPlanningTimeFence;
    }

    /**
     * 设置mPlanningTimeFence属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMPlanningTimeFence(Integer value) {
        this.mPlanningTimeFence = value;
    }

    /**
     * 获取mPlanningTimeFenceDays属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMPlanningTimeFenceDays() {
        return mPlanningTimeFenceDays;
    }

    /**
     * 设置mPlanningTimeFenceDays属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMPlanningTimeFenceDays(BigDecimal value) {
        this.mPlanningTimeFenceDays = value;
    }

    /**
     * 获取mPlanningTimeFenceRuleType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMPlanningTimeFenceRuleType() {
        return mPlanningTimeFenceRuleType;
    }

    /**
     * 设置mPlanningTimeFenceRuleType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMPlanningTimeFenceRuleType(Integer value) {
        this.mPlanningTimeFenceRuleType = value;
    }

    /**
     * 获取mPurBackwardProcessLT属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMPurBackwardProcessLT() {
        return mPurBackwardProcessLT;
    }

    /**
     * 设置mPurBackwardProcessLT属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMPurBackwardProcessLT(BigDecimal value) {
        this.mPurBackwardProcessLT = value;
    }

    /**
     * 获取mPurForwardProcessLT属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMPurForwardProcessLT() {
        return mPurForwardProcessLT;
    }

    /**
     * 设置mPurForwardProcessLT属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMPurForwardProcessLT(BigDecimal value) {
        this.mPurForwardProcessLT = value;
    }

    /**
     * 获取mPurProcessLT属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMPurProcessLT() {
        return mPurProcessLT;
    }

    /**
     * 设置mPurProcessLT属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMPurProcessLT(BigDecimal value) {
        this.mPurProcessLT = value;
    }

    /**
     * 获取mRearrangeTimeFence属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMRearrangeTimeFence() {
        return mRearrangeTimeFence;
    }

    /**
     * 设置mRearrangeTimeFence属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMRearrangeTimeFence(Integer value) {
        this.mRearrangeTimeFence = value;
    }

    /**
     * 获取mReleaseTimeFence属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMReleaseTimeFence() {
        return mReleaseTimeFence;
    }

    /**
     * 设置mReleaseTimeFence属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMReleaseTimeFence(Integer value) {
        this.mReleaseTimeFence = value;
    }

    /**
     * 获取mReleaseTimeFenceDays属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMReleaseTimeFenceDays() {
        return mReleaseTimeFenceDays;
    }

    /**
     * 设置mReleaseTimeFenceDays属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMReleaseTimeFenceDays(Integer value) {
        this.mReleaseTimeFenceDays = value;
    }

    /**
     * 获取mSaleBackwardProcessLT属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSaleBackwardProcessLT() {
        return mSaleBackwardProcessLT;
    }

    /**
     * 设置mSaleBackwardProcessLT属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSaleBackwardProcessLT(BigDecimal value) {
        this.mSaleBackwardProcessLT = value;
    }

    /**
     * 获取mSaleForwardProcessLT属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSaleForwardProcessLT() {
        return mSaleForwardProcessLT;
    }

    /**
     * 设置mSaleForwardProcessLT属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSaleForwardProcessLT(BigDecimal value) {
        this.mSaleForwardProcessLT = value;
    }

    /**
     * 获取mSaleProcessLT属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSaleProcessLT() {
        return mSaleProcessLT;
    }

    /**
     * 设置mSaleProcessLT属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSaleProcessLT(BigDecimal value) {
        this.mSaleProcessLT = value;
    }

    /**
     * 获取mSumLT属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSumLT() {
        return mSumLT;
    }

    /**
     * 设置mSumLT属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSumLT(BigDecimal value) {
        this.mSumLT = value;
    }

    /**
     * 获取mSumManufactureLT属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSumManufactureLT() {
        return mSumManufactureLT;
    }

    /**
     * 设置mSumManufactureLT属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSumManufactureLT(BigDecimal value) {
        this.mSumManufactureLT = value;
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
     * 获取mVarietyLT属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMVarietyLT() {
        return mVarietyLT;
    }

    /**
     * 设置mVarietyLT属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMVarietyLT(BigDecimal value) {
        this.mVarietyLT = value;
    }

}
