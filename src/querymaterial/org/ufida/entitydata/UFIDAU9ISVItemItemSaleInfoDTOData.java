
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
 * <p>UFIDA.U9.ISV.Item.ItemSaleInfoDTOData complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡmatpRule���Ե�ֵ��
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
     * ����matpRule���Ե�ֵ��
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
     * ��ȡmAvailableQtyRule���Ե�ֵ��
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
     * ����mAvailableQtyRule���Ե�ֵ��
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
     * ��ȡmbomOrg���Ե�ֵ��
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
     * ����mbomOrg���Ե�ֵ��
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
     * ��ȡmDemandTransType���Ե�ֵ��
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
     * ����mDemandTransType���Ե�ֵ��
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
     * ��ȡmFamilyAdscription���Ե�ֵ��
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
     * ����mFamilyAdscription���Ե�ֵ��
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
     * ��ȡmFamilyLayer���Ե�ֵ��
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
     * ����mFamilyLayer���Ե�ֵ��
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
     * ��ȡmGrossRate���Ե�ֵ��
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
     * ����mGrossRate���Ե�ֵ��
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
     * ��ȡmIsATPCheck���Ե�ֵ��
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
     * ����mIsATPCheck���Ե�ֵ��
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
     * ��ȡmIsAvailableQtyCheck���Ե�ֵ��
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
     * ����mIsAvailableQtyCheck���Ե�ֵ��
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
     * ��ȡmIsCTP���Ե�ֵ��
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
     * ����mIsCTP���Ե�ֵ��
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
     * ��ȡmIsCalLandCarriageFee���Ե�ֵ��
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
     * ����mIsCalLandCarriageFee���Ե�ֵ��
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
     * ��ȡmIsPriceProtectSN���Ե�ֵ��
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
     * ����mIsPriceProtectSN���Ե�ֵ��
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
     * ��ȡmIsRMAAllowModify���Ե�ֵ��
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
     * ����mIsRMAAllowModify���Ե�ֵ��
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
     * ��ȡmIsReturnCheckLot���Ե�ֵ��
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
     * ����mIsReturnCheckLot���Ե�ֵ��
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
     * ��ȡmIsReturnCheckSN���Ե�ֵ��
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
     * ����mIsReturnCheckSN���Ե�ֵ��
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
     * ��ȡmIsReturnable���Ե�ֵ��
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
     * ����mIsReturnable���Ե�ֵ��
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
     * ��ȡmIsSDRtnTradePathModify���Ե�ֵ��
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
     * ����mIsSDRtnTradePathModify���Ե�ֵ��
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
     * ��ȡmIsSDTradePathModify���Ե�ֵ��
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
     * ����mIsSDTradePathModify���Ե�ֵ��
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
     * ��ȡmItemForInvoice���Ե�ֵ��
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
     * ����mItemForInvoice���Ե�ֵ��
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
     * ��ȡmLimitPriceBy���Ե�ֵ��
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
     * ����mLimitPriceBy���Ե�ֵ��
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
     * ��ȡmLimitPriceMode���Ե�ֵ��
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
     * ����mLimitPriceMode���Ե�ֵ��
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
     * ��ȡmMaxLimitPrice���Ե�ֵ��
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
     * ����mMaxLimitPrice���Ե�ֵ��
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
     * ��ȡmMaxLimitPriceRate���Ե�ֵ��
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
     * ����mMaxLimitPriceRate���Ե�ֵ��
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
     * ��ȡmMaxSaleQty���Ե�ֵ��
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
     * ����mMaxSaleQty���Ե�ֵ��
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
     * ��ȡmMinLimitPrice���Ե�ֵ��
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
     * ����mMinLimitPrice���Ե�ֵ��
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
     * ��ȡmMinLimitPriceRate���Ե�ֵ��
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
     * ����mMinLimitPriceRate���Ե�ֵ��
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
     * ��ȡmMinOrderQtyCheckType���Ե�ֵ��
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
     * ����mMinOrderQtyCheckType���Ե�ֵ��
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
     * ��ȡmMinSaleQty���Ե�ֵ��
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
     * ����mMinSaleQty���Ե�ֵ��
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
     * ��ȡmNameForInvoice���Ե�ֵ��
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
     * ����mNameForInvoice���Ե�ֵ��
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
     * ��ȡmsdRtnTradePath���Ե�ֵ��
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
     * ����msdRtnTradePath���Ե�ֵ��
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
     * ��ȡmsdTradePath���Ե�ֵ��
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
     * ����msdTradePath���Ե�ֵ��
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
     * ��ȡmSaleBatchQty���Ե�ֵ��
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
     * ����mSaleBatchQty���Ե�ֵ��
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
     * ��ȡmSaleCurrency���Ե�ֵ��
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
     * ����mSaleCurrency���Ե�ֵ��
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
     * ��ȡmSaleLimitCurrency���Ե�ֵ��
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
     * ����mSaleLimitCurrency���Ե�ֵ��
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
     * ��ȡmSaleMinDiscount���Ե�ֵ��
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
     * ����mSaleMinDiscount���Ե�ֵ��
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
     * ��ȡmSalePriceList���Ե�ֵ��
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
     * ����mSalePriceList���Ե�ֵ��
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
     * ��ȡmSaleTaxSchedule���Ե�ֵ��
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
     * ����mSaleTaxSchedule���Ե�ֵ��
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
     * ��ȡmSalesDepartment���Ե�ֵ��
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
     * ����mSalesDepartment���Ե�ֵ��
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
     * ��ȡmSalesPerson���Ե�ֵ��
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
     * ����mSalesPerson���Ե�ֵ��
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
     * ��ȡmShipmentWarehouse���Ե�ֵ��
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
     * ����mShipmentWarehouse���Ե�ֵ��
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
     * ��ȡmSupplier���Ե�ֵ��
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
     * ����mSupplier���Ե�ֵ��
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
     * ��ȡmSupplyOrg���Ե�ֵ��
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
     * ����mSupplyOrg���Ե�ֵ��
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
     * ��ȡmSupplySource���Ե�ֵ��
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
     * ����mSupplySource���Ե�ֵ��
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
