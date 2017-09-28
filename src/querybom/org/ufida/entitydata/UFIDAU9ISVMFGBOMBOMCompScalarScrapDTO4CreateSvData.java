
package querybom.org.ufida.entitydata;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>UFIDA.U9.ISV.MFG.BOM.BOMCompScalarScrapDTO4CreateSvData complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="UFIDA.U9.ISV.MFG.BOM.BOMCompScalarScrapDTO4CreateSvData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.UFIDA.org/EntityData}UFSoft.UBF.Business.DataTransObjectBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="m_bOMComponentDTO4CreateSv" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.ISV.MFG.BOM.BOMComponentDTO4CreateSvData" minOccurs="0"/&gt;
 *         &lt;element name="m_fixedScrap" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="m_fromUsageQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="m_lineNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="m_scrap" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="m_toUsageQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UFIDA.U9.ISV.MFG.BOM.BOMCompScalarScrapDTO4CreateSvData", propOrder = {
    "mbomComponentDTO4CreateSv",
    "mFixedScrap",
    "mFromUsageQty",
    "mLineNum",
    "mScrap",
    "mToUsageQty"
})
public class UFIDAU9ISVMFGBOMBOMCompScalarScrapDTO4CreateSvData
    extends UFSoftUBFBusinessDataTransObjectBase
{

    @XmlElementRef(name = "m_bOMComponentDTO4CreateSv", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9ISVMFGBOMBOMComponentDTO4CreateSvData> mbomComponentDTO4CreateSv;
    @XmlElement(name = "m_fixedScrap")
    protected BigDecimal mFixedScrap;
    @XmlElement(name = "m_fromUsageQty")
    protected BigDecimal mFromUsageQty;
    @XmlElement(name = "m_lineNum")
    protected Integer mLineNum;
    @XmlElement(name = "m_scrap")
    protected BigDecimal mScrap;
    @XmlElement(name = "m_toUsageQty")
    protected BigDecimal mToUsageQty;

    /**
     * 获取mbomComponentDTO4CreateSv属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9ISVMFGBOMBOMComponentDTO4CreateSvData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9ISVMFGBOMBOMComponentDTO4CreateSvData> getMBOMComponentDTO4CreateSv() {
        return mbomComponentDTO4CreateSv;
    }

    /**
     * 设置mbomComponentDTO4CreateSv属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9ISVMFGBOMBOMComponentDTO4CreateSvData }{@code >}
     *     
     */
    public void setMBOMComponentDTO4CreateSv(JAXBElement<UFIDAU9ISVMFGBOMBOMComponentDTO4CreateSvData> value) {
        this.mbomComponentDTO4CreateSv = value;
    }

    /**
     * 获取mFixedScrap属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMFixedScrap() {
        return mFixedScrap;
    }

    /**
     * 设置mFixedScrap属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMFixedScrap(BigDecimal value) {
        this.mFixedScrap = value;
    }

    /**
     * 获取mFromUsageQty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMFromUsageQty() {
        return mFromUsageQty;
    }

    /**
     * 设置mFromUsageQty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMFromUsageQty(BigDecimal value) {
        this.mFromUsageQty = value;
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
     * 获取mScrap属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMScrap() {
        return mScrap;
    }

    /**
     * 设置mScrap属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMScrap(BigDecimal value) {
        this.mScrap = value;
    }

    /**
     * 获取mToUsageQty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMToUsageQty() {
        return mToUsageQty;
    }

    /**
     * 设置mToUsageQty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMToUsageQty(BigDecimal value) {
        this.mToUsageQty = value;
    }

}
