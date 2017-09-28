
package querybom.org.ufida.entitydata;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>UFIDA.U9.ISV.MFG.BOM.BOMCompSupplierDTO4CreateSvData complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="UFIDA.U9.ISV.MFG.BOM.BOMCompSupplierDTO4CreateSvData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.UFIDA.org/EntityData}UFSoft.UBF.Business.DataTransObjectBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="m_bOMComponentDTO4CreateSv" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.ISV.MFG.BOM.BOMComponentDTO4CreateSvData" minOccurs="0"/&gt;
 *         &lt;element name="m_lineNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="m_supplier" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UFIDA.U9.ISV.MFG.BOM.BOMCompSupplierDTO4CreateSvData", propOrder = {
    "mbomComponentDTO4CreateSv",
    "mLineNum",
    "mSupplier"
})
public class UFIDAU9ISVMFGBOMBOMCompSupplierDTO4CreateSvData
    extends UFSoftUBFBusinessDataTransObjectBase
{

    @XmlElementRef(name = "m_bOMComponentDTO4CreateSv", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9ISVMFGBOMBOMComponentDTO4CreateSvData> mbomComponentDTO4CreateSv;
    @XmlElement(name = "m_lineNum")
    protected Integer mLineNum;
    @XmlElementRef(name = "m_supplier", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mSupplier;

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

}
