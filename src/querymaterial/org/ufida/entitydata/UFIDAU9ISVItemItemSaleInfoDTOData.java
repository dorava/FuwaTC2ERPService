
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
 * <p>UFIDA.U9.ISV.Item.ItemSaleInfoDTOData complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="UFIDA.U9.ISV.Item.ItemSaleInfoDTOData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.UFIDA.org/EntityData}UFSoft.UBF.Business.DataTransObjectBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="m_aTPRule" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&gt;
 *         &lt;element name="m_availableQtyRule" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="m_bOMOrg" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&gt;
 *         &lt;element name="m_createdBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_createdOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="m_demandTransType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="m_familyAdscription" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&gt;
 *         &lt;element name="m_familyLayer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="m_grossRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="m_iD" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="m_isATPCheck" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="m_isAvailableQtyCheck" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="m_isCTP" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="m_isCalLandCarriageFee" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="m_isPriceProtectSN" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="m_isRMAAllowModify" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="m_isReturnCheckLot" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="m_isReturnCheckSN" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="m_isReturnable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="m_isSDRtnTradePathModify" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="m_isSDTradePathModify" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="m_itemForInvoice" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&gt;
 *         &lt;element name="m_limitPriceBy" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="m_limitPriceMode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="m_maxLimitPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="m_maxLimitPriceRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="m_maxSaleQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="m_minLimitPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="m_minLimitPriceRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="m_minOrderQtyCheckType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="m_minSaleQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="m_modifiedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_modifiedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="m_nameForInvoice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_sDRtnTradePath" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&gt;
 *         &lt;element name="m_sDTradePath" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&gt;
 *         &lt;element name="m_saleBatchQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="m_saleCurrency" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&gt;
 *         &lt;element name="m_saleLimitCurrency" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&gt;
 *         &lt;element name="m_saleMinDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="m_salePriceList" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="m_saleTaxSchedule" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&gt;
 *         &lt;element name="m_salesDepartment" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&gt;
 *         &lt;element name="m_salesPerson" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&gt;
 *         &lt;element name="m_shipmentWarehouse" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&gt;
 *         &lt;element name="m_supplier" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&gt;
 *         &lt;element name="m_supplyOrg" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&gt;
 *         &lt;element name="m_supplySource" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
@XmlType(name = "UFIDA.U9.ISV.Item.ItemSaleInfoDTOData", propOrder = {
    "matpRule",
    "mAvailableQtyRule",
    "mbomOrg",
    "mCreatedBy",
    "mCreatedOn",
    "mDemandTransType",
    "mFamilyAdscription",
    "mFamilyLayer",
    "mGrossRate",
    "mid",
    "mIsATPCheck",
    "mIsAvailableQtyCheck",
    "mIsCTP",
    "mIsCalLandCarriageFee",
    "mIsPriceProtectSN",
    "mIsRMAAllowModify",
    "mIsReturnCheckLot",
    "mIsReturnCheckSN",
    "mIsReturnable",
    "mIsSDRtnTradePathModify",
    "mIsSDTradePathModify",
    "mItemForInvoice",
    "mLimitPriceBy",
    "mLimitPriceMode",
    "mMaxLimitPrice",
    "mMaxLimitPriceRate",
    "mMaxSaleQty",
    "mMinLimitPrice",
    "mMinLimitPriceRate",
    "mMinOrderQtyCheckType",
    "mMinSaleQty",
    "mModifiedBy",
    "mModifiedOn",
    "mNameForInvoice",
    "msdRtnTradePath",
    "msdTradePath",
    "mSaleBatchQty",
    "mSaleCurrency",
    "mSaleLimitCurrency",
    "mSaleMinDiscount",
    "mSalePriceList",
    "mSaleTaxSchedule",
    "mSalesDepartment",
    "mSalesPerson",
    "mShipmentWarehouse",
    "mSupplier",
    "mSupplyOrg",
    "mSupplySource",
    "mSysVersion"
})
public class UFIDAU9ISVItemItemSaleInfoDTOData
    extends UFSoftUBFBusinessDataTransObjectBase
{

    @XmlElementRef(name = "m_aTPRule", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> matpRule;
    @XmlElement(name = "m_availableQtyRule")
    protected Long mAvailableQtyRule;
    @XmlElementRef(name = "m_bOMOrg", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mbomOrg;
    @XmlElementRef(name = "m_createdBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCreatedBy;
    @XmlElement(name = "m_createdOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mCreatedOn;
    @XmlElement(name = "m_demandTransType")
    protected Integer mDemandTransType;
    @XmlElementRef(name = "m_familyAdscription", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mFamilyAdscription;
    @XmlElement(name = "m_familyLayer")
    protected Integer mFamilyLayer;
    @XmlElement(name = "m_grossRate")
    protected BigDecimal mGrossRate;
    @XmlElement(name = "m_iD")
    protected Long mid;
    @XmlElement(name = "m_isATPCheck")
    protected Boolean mIsATPCheck;
    @XmlElement(name = "m_isAvailableQtyCheck")
    protected Boolean mIsAvailableQtyCheck;
    @XmlElement(name = "m_isCTP")
    protected Boolean mIsCTP;
    @XmlElement(name = "m_isCalLandCarriageFee")
    protected Boolean mIsCalLandCarriageFee;
    @XmlElement(name = "m_isPriceProtectSN")
    protected Boolean mIsPriceProtectSN;
    @XmlElement(name = "m_isRMAAllowModify")
    protected Boolean mIsRMAAllowModify;
    @XmlElement(name = "m_isReturnCheckLot")
    protected Boolean mIsReturnCheckLot;
    @XmlElement(name = "m_isReturnCheckSN")
    protected Boolean mIsReturnCheckSN;
    @XmlElement(name = "m_isReturnable")
    protected Boolean mIsReturnable;
    @XmlElement(name = "m_isSDRtnTradePathModify")
    protected Boolean mIsSDRtnTradePathModify;
    @XmlElement(name = "m_isSDTradePathModify")
    protected Boolean mIsSDTradePathModify;
    @XmlElementRef(name = "m_itemForInvoice", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mItemForInvoice;
    @XmlElement(name = "m_limitPriceBy")
    protected Integer mLimitPriceBy;
    @XmlElement(name = "m_limitPriceMode")
    protected Integer mLimitPriceMode;
    @XmlElement(name = "m_maxLimitPrice")
    protected BigDecimal mMaxLimitPrice;
    @XmlElement(name = "m_maxLimitPriceRate")
    protected BigDecimal mMaxLimitPriceRate;
    @XmlElement(name = "m_maxSaleQty")
    protected BigDecimal mMaxSaleQty;
    @XmlElement(name = "m_minLimitPrice")
    protected BigDecimal mMinLimitPrice;
    @XmlElement(name = "m_minLimitPriceRate")
    protected BigDecimal mMinLimitPriceRate;
    @XmlElement(name = "m_minOrderQtyCheckType")
    protected Integer mMinOrderQtyCheckType;
    @XmlElement(name = "m_minSaleQty")
    protected BigDecimal mMinSaleQty;
    @XmlElementRef(name = "m_modifiedBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mModifiedBy;
    @XmlElement(name = "m_modifiedOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mModifiedOn;
    @XmlElementRef(name = "m_nameForInvoice", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mNameForInvoice;
    @XmlElementRef(name = "m_sDRtnTradePath", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> msdRtnTradePath;
    @XmlElementRef(name = "m_sDTradePath", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> msdTradePath;
    @XmlElement(name = "m_saleBatchQty")
    protected BigDecimal mSaleBatchQty;
    @XmlElementRef(name = "m_saleCurrency", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mSaleCurrency;
    @XmlElementRef(name = "m_saleLimitCurrency", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mSaleLimitCurrency;
    @XmlElement(name = "m_saleMinDiscount")
    protected BigDecimal mSaleMinDiscount;
    @XmlElement(name = "m_salePriceList")
    protected Long mSalePriceList;
    @XmlElementRef(name = "m_saleTaxSchedule", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mSaleTaxSchedule;
    @XmlElementRef(name = "m_salesDepartment", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mSalesDepartment;
    @XmlElementRef(name = "m_salesPerson", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mSalesPerson;
    @XmlElementRef(name = "m_shipmentWarehouse", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mShipmentWarehouse;
    @XmlElementRef(name = "m_supplier", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mSupplier;
    @XmlElementRef(name = "m_supplyOrg", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mSupplyOrg;
    @XmlElement(name = "m_supplySource")
    protected Integer mSupplySource;
    @XmlElement(name = "m_sysVersion")
    protected Long mSysVersion;

    /**
     * 获取matpRule属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMATPRule() {
        return matpRule;
    }

    /**
     * 设置matpRule属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMATPRule(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.matpRule = value;
    }

    /**
     * 获取mAvailableQtyRule属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMAvailableQtyRule() {
        return mAvailableQtyRule;
    }

    /**
     * 设置mAvailableQtyRule属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMAvailableQtyRule(Long value) {
        this.mAvailableQtyRule = value;
    }

    /**
     * 获取mbomOrg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMBOMOrg() {
        return mbomOrg;
    }

    /**
     * 设置mbomOrg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMBOMOrg(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mbomOrg = value;
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
     * 获取mDemandTransType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMDemandTransType() {
        return mDemandTransType;
    }

    /**
     * 设置mDemandTransType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMDemandTransType(Integer value) {
        this.mDemandTransType = value;
    }

    /**
     * 获取mFamilyAdscription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMFamilyAdscription() {
        return mFamilyAdscription;
    }

    /**
     * 设置mFamilyAdscription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMFamilyAdscription(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mFamilyAdscription = value;
    }

    /**
     * 获取mFamilyLayer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMFamilyLayer() {
        return mFamilyLayer;
    }

    /**
     * 设置mFamilyLayer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMFamilyLayer(Integer value) {
        this.mFamilyLayer = value;
    }

    /**
     * 获取mGrossRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMGrossRate() {
        return mGrossRate;
    }

    /**
     * 设置mGrossRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMGrossRate(BigDecimal value) {
        this.mGrossRate = value;
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
     * 获取mIsATPCheck属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsATPCheck() {
        return mIsATPCheck;
    }

    /**
     * 设置mIsATPCheck属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsATPCheck(Boolean value) {
        this.mIsATPCheck = value;
    }

    /**
     * 获取mIsAvailableQtyCheck属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsAvailableQtyCheck() {
        return mIsAvailableQtyCheck;
    }

    /**
     * 设置mIsAvailableQtyCheck属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsAvailableQtyCheck(Boolean value) {
        this.mIsAvailableQtyCheck = value;
    }

    /**
     * 获取mIsCTP属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsCTP() {
        return mIsCTP;
    }

    /**
     * 设置mIsCTP属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsCTP(Boolean value) {
        this.mIsCTP = value;
    }

    /**
     * 获取mIsCalLandCarriageFee属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsCalLandCarriageFee() {
        return mIsCalLandCarriageFee;
    }

    /**
     * 设置mIsCalLandCarriageFee属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsCalLandCarriageFee(Boolean value) {
        this.mIsCalLandCarriageFee = value;
    }

    /**
     * 获取mIsPriceProtectSN属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsPriceProtectSN() {
        return mIsPriceProtectSN;
    }

    /**
     * 设置mIsPriceProtectSN属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsPriceProtectSN(Boolean value) {
        this.mIsPriceProtectSN = value;
    }

    /**
     * 获取mIsRMAAllowModify属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsRMAAllowModify() {
        return mIsRMAAllowModify;
    }

    /**
     * 设置mIsRMAAllowModify属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsRMAAllowModify(Boolean value) {
        this.mIsRMAAllowModify = value;
    }

    /**
     * 获取mIsReturnCheckLot属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsReturnCheckLot() {
        return mIsReturnCheckLot;
    }

    /**
     * 设置mIsReturnCheckLot属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsReturnCheckLot(Boolean value) {
        this.mIsReturnCheckLot = value;
    }

    /**
     * 获取mIsReturnCheckSN属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsReturnCheckSN() {
        return mIsReturnCheckSN;
    }

    /**
     * 设置mIsReturnCheckSN属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsReturnCheckSN(Boolean value) {
        this.mIsReturnCheckSN = value;
    }

    /**
     * 获取mIsReturnable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsReturnable() {
        return mIsReturnable;
    }

    /**
     * 设置mIsReturnable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsReturnable(Boolean value) {
        this.mIsReturnable = value;
    }

    /**
     * 获取mIsSDRtnTradePathModify属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsSDRtnTradePathModify() {
        return mIsSDRtnTradePathModify;
    }

    /**
     * 设置mIsSDRtnTradePathModify属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsSDRtnTradePathModify(Boolean value) {
        this.mIsSDRtnTradePathModify = value;
    }

    /**
     * 获取mIsSDTradePathModify属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsSDTradePathModify() {
        return mIsSDTradePathModify;
    }

    /**
     * 设置mIsSDTradePathModify属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsSDTradePathModify(Boolean value) {
        this.mIsSDTradePathModify = value;
    }

    /**
     * 获取mItemForInvoice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMItemForInvoice() {
        return mItemForInvoice;
    }

    /**
     * 设置mItemForInvoice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMItemForInvoice(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mItemForInvoice = value;
    }

    /**
     * 获取mLimitPriceBy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMLimitPriceBy() {
        return mLimitPriceBy;
    }

    /**
     * 设置mLimitPriceBy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMLimitPriceBy(Integer value) {
        this.mLimitPriceBy = value;
    }

    /**
     * 获取mLimitPriceMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMLimitPriceMode() {
        return mLimitPriceMode;
    }

    /**
     * 设置mLimitPriceMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMLimitPriceMode(Integer value) {
        this.mLimitPriceMode = value;
    }

    /**
     * 获取mMaxLimitPrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMMaxLimitPrice() {
        return mMaxLimitPrice;
    }

    /**
     * 设置mMaxLimitPrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMMaxLimitPrice(BigDecimal value) {
        this.mMaxLimitPrice = value;
    }

    /**
     * 获取mMaxLimitPriceRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMMaxLimitPriceRate() {
        return mMaxLimitPriceRate;
    }

    /**
     * 设置mMaxLimitPriceRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMMaxLimitPriceRate(BigDecimal value) {
        this.mMaxLimitPriceRate = value;
    }

    /**
     * 获取mMaxSaleQty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMMaxSaleQty() {
        return mMaxSaleQty;
    }

    /**
     * 设置mMaxSaleQty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMMaxSaleQty(BigDecimal value) {
        this.mMaxSaleQty = value;
    }

    /**
     * 获取mMinLimitPrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMMinLimitPrice() {
        return mMinLimitPrice;
    }

    /**
     * 设置mMinLimitPrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMMinLimitPrice(BigDecimal value) {
        this.mMinLimitPrice = value;
    }

    /**
     * 获取mMinLimitPriceRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMMinLimitPriceRate() {
        return mMinLimitPriceRate;
    }

    /**
     * 设置mMinLimitPriceRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMMinLimitPriceRate(BigDecimal value) {
        this.mMinLimitPriceRate = value;
    }

    /**
     * 获取mMinOrderQtyCheckType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMMinOrderQtyCheckType() {
        return mMinOrderQtyCheckType;
    }

    /**
     * 设置mMinOrderQtyCheckType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMMinOrderQtyCheckType(Integer value) {
        this.mMinOrderQtyCheckType = value;
    }

    /**
     * 获取mMinSaleQty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMMinSaleQty() {
        return mMinSaleQty;
    }

    /**
     * 设置mMinSaleQty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMMinSaleQty(BigDecimal value) {
        this.mMinSaleQty = value;
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
     * 获取mNameForInvoice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMNameForInvoice() {
        return mNameForInvoice;
    }

    /**
     * 设置mNameForInvoice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMNameForInvoice(JAXBElement<String> value) {
        this.mNameForInvoice = value;
    }

    /**
     * 获取msdRtnTradePath属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMSDRtnTradePath() {
        return msdRtnTradePath;
    }

    /**
     * 设置msdRtnTradePath属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMSDRtnTradePath(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.msdRtnTradePath = value;
    }

    /**
     * 获取msdTradePath属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMSDTradePath() {
        return msdTradePath;
    }

    /**
     * 设置msdTradePath属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMSDTradePath(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.msdTradePath = value;
    }

    /**
     * 获取mSaleBatchQty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSaleBatchQty() {
        return mSaleBatchQty;
    }

    /**
     * 设置mSaleBatchQty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSaleBatchQty(BigDecimal value) {
        this.mSaleBatchQty = value;
    }

    /**
     * 获取mSaleCurrency属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMSaleCurrency() {
        return mSaleCurrency;
    }

    /**
     * 设置mSaleCurrency属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMSaleCurrency(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mSaleCurrency = value;
    }

    /**
     * 获取mSaleLimitCurrency属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMSaleLimitCurrency() {
        return mSaleLimitCurrency;
    }

    /**
     * 设置mSaleLimitCurrency属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMSaleLimitCurrency(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mSaleLimitCurrency = value;
    }

    /**
     * 获取mSaleMinDiscount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSaleMinDiscount() {
        return mSaleMinDiscount;
    }

    /**
     * 设置mSaleMinDiscount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSaleMinDiscount(BigDecimal value) {
        this.mSaleMinDiscount = value;
    }

    /**
     * 获取mSalePriceList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMSalePriceList() {
        return mSalePriceList;
    }

    /**
     * 设置mSalePriceList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMSalePriceList(Long value) {
        this.mSalePriceList = value;
    }

    /**
     * 获取mSaleTaxSchedule属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMSaleTaxSchedule() {
        return mSaleTaxSchedule;
    }

    /**
     * 设置mSaleTaxSchedule属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMSaleTaxSchedule(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mSaleTaxSchedule = value;
    }

    /**
     * 获取mSalesDepartment属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMSalesDepartment() {
        return mSalesDepartment;
    }

    /**
     * 设置mSalesDepartment属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMSalesDepartment(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mSalesDepartment = value;
    }

    /**
     * 获取mSalesPerson属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMSalesPerson() {
        return mSalesPerson;
    }

    /**
     * 设置mSalesPerson属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMSalesPerson(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mSalesPerson = value;
    }

    /**
     * 获取mShipmentWarehouse属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMShipmentWarehouse() {
        return mShipmentWarehouse;
    }

    /**
     * 设置mShipmentWarehouse属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMShipmentWarehouse(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mShipmentWarehouse = value;
    }

    /**
     * 获取mSupplier属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMSupplier() {
        return mSupplier;
    }

    /**
     * 设置mSupplier属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMSupplier(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mSupplier = value;
    }

    /**
     * 获取mSupplyOrg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMSupplyOrg() {
        return mSupplyOrg;
    }

    /**
     * 设置mSupplyOrg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMSupplyOrg(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mSupplyOrg = value;
    }

    /**
     * 获取mSupplySource属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMSupplySource() {
        return mSupplySource;
    }

    /**
     * 设置mSupplySource属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMSupplySource(Integer value) {
        this.mSupplySource = value;
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

}
