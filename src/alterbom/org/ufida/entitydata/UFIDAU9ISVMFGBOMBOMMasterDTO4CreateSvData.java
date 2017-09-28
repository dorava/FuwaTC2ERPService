
package alterbom.org.ufida.entitydata;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>UFIDA.U9.ISV.MFG.BOM.BOMMasterDTO4CreateSvData complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="UFIDA.U9.ISV.MFG.BOM.BOMMasterDTO4CreateSvData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.UFIDA.org/EntityData}UFSoft.UBF.Business.DataTransObjectBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="m_alternateType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="m_bOMComponents" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.ISV.MFG.BOM.BOMComponentDTO4CreateSvData" minOccurs="0"/&gt;
 *         &lt;element name="m_bOMMasterChangeDTOList" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.ISV.MFG.BOM.CommonChgDTOData" minOccurs="0"/&gt;
 *         &lt;element name="m_bOMSort" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="m_bOMType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="m_bOMVersionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_degreePercents" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.ISV.MFG.BOM.DegreePercentDTO4CreateSvData" minOccurs="0"/&gt;
 *         &lt;element name="m_descFlexField" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.Base.FlexField.DescFlexField.DescFlexSegmentsData" minOccurs="0"/&gt;
 *         &lt;element name="m_disableDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="m_eCOCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_effectiveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="m_explain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_fromQty" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="m_isPrimaryLot" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="m_itemMaster" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&gt;
 *         &lt;element name="m_lot" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="m_org" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&gt;
 *         &lt;element name="m_ownerOrg" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&gt;
 *         &lt;element name="m_priceStyle" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="m_productUOM" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&gt;
 *         &lt;element name="m_productionLine" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&gt;
 *         &lt;element name="m_project" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&gt;
 *         &lt;element name="m_projectMapNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_status" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="m_toQty" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UFIDA.U9.ISV.MFG.BOM.BOMMasterDTO4CreateSvData", propOrder = {
    "mAlternateType",
    "mbomComponents",
    "mbomMasterChangeDTOList",
    "mbomSort",
    "mbomType",
    "mbomVersionCode",
    "mDegreePercents",
    "mDescFlexField",
    "mDisableDate",
    "mecoCode",
    "mEffectiveDate",
    "mExplain",
    "mFromQty",
    "mIsPrimaryLot",
    "mItemMaster",
    "mLot",
    "mOrg",
    "mOwnerOrg",
    "mPriceStyle",
    "mProductUOM",
    "mProductionLine",
    "mProject",
    "mProjectMapNum",
    "mStatus",
    "mToQty"
})
public class UFIDAU9ISVMFGBOMBOMMasterDTO4CreateSvData
    extends UFSoftUBFBusinessDataTransObjectBase
{

    @XmlElement(name = "m_alternateType")
    protected Integer mAlternateType;
    @XmlElementRef(name = "m_bOMComponents", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9ISVMFGBOMBOMComponentDTO4CreateSvData> mbomComponents;
    @XmlElementRef(name = "m_bOMMasterChangeDTOList", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9ISVMFGBOMCommonChgDTOData> mbomMasterChangeDTOList;
    @XmlElement(name = "m_bOMSort")
    protected Integer mbomSort;
    @XmlElement(name = "m_bOMType")
    protected Integer mbomType;
    @XmlElementRef(name = "m_bOMVersionCode", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mbomVersionCode;
    @XmlElementRef(name = "m_degreePercents", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9ISVMFGBOMDegreePercentDTO4CreateSvData> mDegreePercents;
    @XmlElementRef(name = "m_descFlexField", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9BaseFlexFieldDescFlexFieldDescFlexSegmentsData> mDescFlexField;
    @XmlElement(name = "m_disableDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mDisableDate;
    @XmlElementRef(name = "m_eCOCode", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mecoCode;
    @XmlElement(name = "m_effectiveDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mEffectiveDate;
    @XmlElementRef(name = "m_explain", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mExplain;
    @XmlElement(name = "m_fromQty")
    protected Integer mFromQty;
    @XmlElement(name = "m_isPrimaryLot")
    protected Boolean mIsPrimaryLot;
    @XmlElementRef(name = "m_itemMaster", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mItemMaster;
    @XmlElement(name = "m_lot")
    protected Integer mLot;
    @XmlElementRef(name = "m_org", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mOrg;
    @XmlElementRef(name = "m_ownerOrg", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mOwnerOrg;
    @XmlElement(name = "m_priceStyle")
    protected Integer mPriceStyle;
    @XmlElementRef(name = "m_productUOM", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mProductUOM;
    @XmlElementRef(name = "m_productionLine", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mProductionLine;
    @XmlElementRef(name = "m_project", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mProject;
    @XmlElementRef(name = "m_projectMapNum", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mProjectMapNum;
    @XmlElement(name = "m_status")
    protected Integer mStatus;
    @XmlElement(name = "m_toQty")
    protected Integer mToQty;

    /**
     * 获取mAlternateType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMAlternateType() {
        return mAlternateType;
    }

    /**
     * 设置mAlternateType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMAlternateType(Integer value) {
        this.mAlternateType = value;
    }

    /**
     * 获取mbomComponents属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVMFGBOMBOMComponentDTO4CreateSvData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9ISVMFGBOMBOMComponentDTO4CreateSvData> getMBOMComponents() {
        return mbomComponents;
    }

    /**
     * 设置mbomComponents属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVMFGBOMBOMComponentDTO4CreateSvData }{@code >}
     *     
     */
    public void setMBOMComponents(JAXBElement<ArrayOfUFIDAU9ISVMFGBOMBOMComponentDTO4CreateSvData> value) {
        this.mbomComponents = value;
    }

    /**
     * 获取mbomMasterChangeDTOList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVMFGBOMCommonChgDTOData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9ISVMFGBOMCommonChgDTOData> getMBOMMasterChangeDTOList() {
        return mbomMasterChangeDTOList;
    }

    /**
     * 设置mbomMasterChangeDTOList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVMFGBOMCommonChgDTOData }{@code >}
     *     
     */
    public void setMBOMMasterChangeDTOList(JAXBElement<ArrayOfUFIDAU9ISVMFGBOMCommonChgDTOData> value) {
        this.mbomMasterChangeDTOList = value;
    }

    /**
     * 获取mbomSort属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMBOMSort() {
        return mbomSort;
    }

    /**
     * 设置mbomSort属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMBOMSort(Integer value) {
        this.mbomSort = value;
    }

    /**
     * 获取mbomType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMBOMType() {
        return mbomType;
    }

    /**
     * 设置mbomType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMBOMType(Integer value) {
        this.mbomType = value;
    }

    /**
     * 获取mbomVersionCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMBOMVersionCode() {
        return mbomVersionCode;
    }

    /**
     * 设置mbomVersionCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMBOMVersionCode(JAXBElement<String> value) {
        this.mbomVersionCode = value;
    }

    /**
     * 获取mDegreePercents属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVMFGBOMDegreePercentDTO4CreateSvData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9ISVMFGBOMDegreePercentDTO4CreateSvData> getMDegreePercents() {
        return mDegreePercents;
    }

    /**
     * 设置mDegreePercents属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVMFGBOMDegreePercentDTO4CreateSvData }{@code >}
     *     
     */
    public void setMDegreePercents(JAXBElement<ArrayOfUFIDAU9ISVMFGBOMDegreePercentDTO4CreateSvData> value) {
        this.mDegreePercents = value;
    }

    /**
     * 获取mDescFlexField属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9BaseFlexFieldDescFlexFieldDescFlexSegmentsData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9BaseFlexFieldDescFlexFieldDescFlexSegmentsData> getMDescFlexField() {
        return mDescFlexField;
    }

    /**
     * 设置mDescFlexField属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9BaseFlexFieldDescFlexFieldDescFlexSegmentsData }{@code >}
     *     
     */
    public void setMDescFlexField(JAXBElement<UFIDAU9BaseFlexFieldDescFlexFieldDescFlexSegmentsData> value) {
        this.mDescFlexField = value;
    }

    /**
     * 获取mDisableDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMDisableDate() {
        return mDisableDate;
    }

    /**
     * 设置mDisableDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMDisableDate(XMLGregorianCalendar value) {
        this.mDisableDate = value;
    }

    /**
     * 获取mecoCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMECOCode() {
        return mecoCode;
    }

    /**
     * 设置mecoCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMECOCode(JAXBElement<String> value) {
        this.mecoCode = value;
    }

    /**
     * 获取mEffectiveDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMEffectiveDate() {
        return mEffectiveDate;
    }

    /**
     * 设置mEffectiveDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMEffectiveDate(XMLGregorianCalendar value) {
        this.mEffectiveDate = value;
    }

    /**
     * 获取mExplain属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMExplain() {
        return mExplain;
    }

    /**
     * 设置mExplain属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMExplain(JAXBElement<String> value) {
        this.mExplain = value;
    }

    /**
     * 获取mFromQty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMFromQty() {
        return mFromQty;
    }

    /**
     * 设置mFromQty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMFromQty(Integer value) {
        this.mFromQty = value;
    }

    /**
     * 获取mIsPrimaryLot属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsPrimaryLot() {
        return mIsPrimaryLot;
    }

    /**
     * 设置mIsPrimaryLot属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsPrimaryLot(Boolean value) {
        this.mIsPrimaryLot = value;
    }

    /**
     * 获取mItemMaster属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMItemMaster() {
        return mItemMaster;
    }

    /**
     * 设置mItemMaster属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMItemMaster(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mItemMaster = value;
    }

    /**
     * 获取mLot属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMLot() {
        return mLot;
    }

    /**
     * 设置mLot属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMLot(Integer value) {
        this.mLot = value;
    }

    /**
     * 获取mOrg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMOrg() {
        return mOrg;
    }

    /**
     * 设置mOrg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMOrg(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mOrg = value;
    }

    /**
     * 获取mOwnerOrg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMOwnerOrg() {
        return mOwnerOrg;
    }

    /**
     * 设置mOwnerOrg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMOwnerOrg(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mOwnerOrg = value;
    }

    /**
     * 获取mPriceStyle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMPriceStyle() {
        return mPriceStyle;
    }

    /**
     * 设置mPriceStyle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMPriceStyle(Integer value) {
        this.mPriceStyle = value;
    }

    /**
     * 获取mProductUOM属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMProductUOM() {
        return mProductUOM;
    }

    /**
     * 设置mProductUOM属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMProductUOM(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mProductUOM = value;
    }

    /**
     * 获取mProductionLine属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMProductionLine() {
        return mProductionLine;
    }

    /**
     * 设置mProductionLine属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMProductionLine(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mProductionLine = value;
    }

    /**
     * 获取mProject属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMProject() {
        return mProject;
    }

    /**
     * 设置mProject属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMProject(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mProject = value;
    }

    /**
     * 获取mProjectMapNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMProjectMapNum() {
        return mProjectMapNum;
    }

    /**
     * 设置mProjectMapNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMProjectMapNum(JAXBElement<String> value) {
        this.mProjectMapNum = value;
    }

    /**
     * 获取mStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMStatus() {
        return mStatus;
    }

    /**
     * 设置mStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMStatus(Integer value) {
        this.mStatus = value;
    }

    /**
     * 获取mToQty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMToQty() {
        return mToQty;
    }

    /**
     * 设置mToQty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMToQty(Integer value) {
        this.mToQty = value;
    }

}
