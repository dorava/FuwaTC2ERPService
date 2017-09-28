
package querybom.org.ufida.entitydata;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>UFIDA.U9.ISV.MFG.BOM.BOMComponentLotDTO4CreateSvData complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="UFIDA.U9.ISV.MFG.BOM.BOMComponentLotDTO4CreateSvData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.UFIDA.org/EntityData}UFSoft.UBF.Business.DataTransObjectBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="m_bOMComponentDTO4CreateSv" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.ISV.MFG.BOM.BOMComponentDTO4CreateSvData" minOccurs="0"/&gt;
 *         &lt;element name="m_fromLot" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="m_parentQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="m_toLot" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="m_usage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="m_variableUsageQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UFIDA.U9.ISV.MFG.BOM.BOMComponentLotDTO4CreateSvData", propOrder = {
    "mbomComponentDTO4CreateSv",
    "mFromLot",
    "mParentQty",
    "mToLot",
    "mUsage",
    "mVariableUsageQty"
})
public class UFIDAU9ISVMFGBOMBOMComponentLotDTO4CreateSvData
    extends UFSoftUBFBusinessDataTransObjectBase
{

    @XmlElementRef(name = "m_bOMComponentDTO4CreateSv", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9ISVMFGBOMBOMComponentDTO4CreateSvData> mbomComponentDTO4CreateSv;
    @XmlElement(name = "m_fromLot")
    protected Integer mFromLot;
    @XmlElement(name = "m_parentQty")
    protected BigDecimal mParentQty;
    @XmlElement(name = "m_toLot")
    protected Integer mToLot;
    @XmlElement(name = "m_usage")
    protected BigDecimal mUsage;
    @XmlElement(name = "m_variableUsageQty")
    protected BigDecimal mVariableUsageQty;

    /**
     * ��ȡmbomComponentDTO4CreateSv���Ե�ֵ��
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
     * ����mbomComponentDTO4CreateSv���Ե�ֵ��
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
     * ��ȡmFromLot���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMFromLot() {
        return mFromLot;
    }

    /**
     * ����mFromLot���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMFromLot(Integer value) {
        this.mFromLot = value;
    }

    /**
     * ��ȡmParentQty���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMParentQty() {
        return mParentQty;
    }

    /**
     * ����mParentQty���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMParentQty(BigDecimal value) {
        this.mParentQty = value;
    }

    /**
     * ��ȡmToLot���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMToLot() {
        return mToLot;
    }

    /**
     * ����mToLot���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMToLot(Integer value) {
        this.mToLot = value;
    }

    /**
     * ��ȡmUsage���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMUsage() {
        return mUsage;
    }

    /**
     * ����mUsage���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMUsage(BigDecimal value) {
        this.mUsage = value;
    }

    /**
     * ��ȡmVariableUsageQty���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMVariableUsageQty() {
        return mVariableUsageQty;
    }

    /**
     * ����mVariableUsageQty���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMVariableUsageQty(BigDecimal value) {
        this.mVariableUsageQty = value;
    }

}
