
package alterbom.org.ufida.entitydata;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>UFIDA.U9.ISV.MFG.BOM.DegreePercentDTO4CreateSvData complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="UFIDA.U9.ISV.MFG.BOM.DegreePercentDTO4CreateSvData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.UFIDA.org/EntityData}UFSoft.UBF.Business.DataTransObjectBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="m_bOMMasterDTO4CreateSv" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.ISV.MFG.BOM.BOMMasterDTO4CreateSvData" minOccurs="0"/&gt;
 *         &lt;element name="m_costPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="m_degree" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="m_forecastQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="m_itemMaster" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&gt;
 *         &lt;element name="m_itemVersionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_lineNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="m_operationNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_potency" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="m_productType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="m_uOM" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UFIDA.U9.ISV.MFG.BOM.DegreePercentDTO4CreateSvData", propOrder = {
    "mbomMasterDTO4CreateSv",
    "mCostPercent",
    "mDegree",
    "mForecastQty",
    "mItemMaster",
    "mItemVersionCode",
    "mLineNum",
    "mOperationNum",
    "mPotency",
    "mProductType",
    "muom"
})
public class UFIDAU9ISVMFGBOMDegreePercentDTO4CreateSvData
    extends UFSoftUBFBusinessDataTransObjectBase
{

    @XmlElementRef(name = "m_bOMMasterDTO4CreateSv", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9ISVMFGBOMBOMMasterDTO4CreateSvData> mbomMasterDTO4CreateSv;
    @XmlElement(name = "m_costPercent")
    protected BigDecimal mCostPercent;
    @XmlElement(name = "m_degree")
    protected Integer mDegree;
    @XmlElement(name = "m_forecastQty")
    protected BigDecimal mForecastQty;
    @XmlElementRef(name = "m_itemMaster", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mItemMaster;
    @XmlElementRef(name = "m_itemVersionCode", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mItemVersionCode;
    @XmlElement(name = "m_lineNum")
    protected Integer mLineNum;
    @XmlElementRef(name = "m_operationNum", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mOperationNum;
    @XmlElement(name = "m_potency")
    protected Integer mPotency;
    @XmlElement(name = "m_productType")
    protected Integer mProductType;
    @XmlElementRef(name = "m_uOM", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> muom;

    /**
     * 获取mbomMasterDTO4CreateSv属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9ISVMFGBOMBOMMasterDTO4CreateSvData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9ISVMFGBOMBOMMasterDTO4CreateSvData> getMBOMMasterDTO4CreateSv() {
        return mbomMasterDTO4CreateSv;
    }

    /**
     * 设置mbomMasterDTO4CreateSv属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9ISVMFGBOMBOMMasterDTO4CreateSvData }{@code >}
     *     
     */
    public void setMBOMMasterDTO4CreateSv(JAXBElement<UFIDAU9ISVMFGBOMBOMMasterDTO4CreateSvData> value) {
        this.mbomMasterDTO4CreateSv = value;
    }

    /**
     * 获取mCostPercent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMCostPercent() {
        return mCostPercent;
    }

    /**
     * 设置mCostPercent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMCostPercent(BigDecimal value) {
        this.mCostPercent = value;
    }

    /**
     * 获取mDegree属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMDegree() {
        return mDegree;
    }

    /**
     * 设置mDegree属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMDegree(Integer value) {
        this.mDegree = value;
    }

    /**
     * 获取mForecastQty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMForecastQty() {
        return mForecastQty;
    }

    /**
     * 设置mForecastQty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMForecastQty(BigDecimal value) {
        this.mForecastQty = value;
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
     * 获取mItemVersionCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMItemVersionCode() {
        return mItemVersionCode;
    }

    /**
     * 设置mItemVersionCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMItemVersionCode(JAXBElement<String> value) {
        this.mItemVersionCode = value;
    }

    /**
     * 获取mLineNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMLineNum() {
        return mLineNum;
    }

    /**
     * 设置mLineNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMLineNum(Integer value) {
        this.mLineNum = value;
    }

    /**
     * 获取mOperationNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMOperationNum() {
        return mOperationNum;
    }

    /**
     * 设置mOperationNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMOperationNum(JAXBElement<String> value) {
        this.mOperationNum = value;
    }

    /**
     * 获取mPotency属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMPotency() {
        return mPotency;
    }

    /**
     * 设置mPotency属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMPotency(Integer value) {
        this.mPotency = value;
    }

    /**
     * 获取mProductType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMProductType() {
        return mProductType;
    }

    /**
     * 设置mProductType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMProductType(Integer value) {
        this.mProductType = value;
    }

    /**
     * 获取muom属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMUOM() {
        return muom;
    }

    /**
     * 设置muom属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMUOM(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.muom = value;
    }

}
