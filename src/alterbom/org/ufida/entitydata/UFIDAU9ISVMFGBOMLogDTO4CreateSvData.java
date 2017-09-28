
package alterbom.org.ufida.entitydata;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>UFIDA.U9.ISV.MFG.BOM.LogDTO4CreateSvData complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="UFIDA.U9.ISV.MFG.BOM.LogDTO4CreateSvData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.UFIDA.org/EntityData}UFSoft.UBF.Business.DataTransObjectBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="m_bOMMasterDTO" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.ISV.MFG.BOM.BOMMasterResultDTOData" minOccurs="0"/&gt;
 *         &lt;element name="m_errorMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_isOperationSuccess" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UFIDA.U9.ISV.MFG.BOM.LogDTO4CreateSvData", propOrder = {
    "mbomMasterDTO",
    "mErrorMsg",
    "mIsOperationSuccess"
})
public class UFIDAU9ISVMFGBOMLogDTO4CreateSvData
    extends UFSoftUBFBusinessDataTransObjectBase
{

    @XmlElementRef(name = "m_bOMMasterDTO", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9ISVMFGBOMBOMMasterResultDTOData> mbomMasterDTO;
    @XmlElementRef(name = "m_errorMsg", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mErrorMsg;
    @XmlElement(name = "m_isOperationSuccess")
    protected Boolean mIsOperationSuccess;

    /**
     * 获取mbomMasterDTO属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9ISVMFGBOMBOMMasterResultDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9ISVMFGBOMBOMMasterResultDTOData> getMBOMMasterDTO() {
        return mbomMasterDTO;
    }

    /**
     * 设置mbomMasterDTO属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9ISVMFGBOMBOMMasterResultDTOData }{@code >}
     *     
     */
    public void setMBOMMasterDTO(JAXBElement<UFIDAU9ISVMFGBOMBOMMasterResultDTOData> value) {
        this.mbomMasterDTO = value;
    }

    /**
     * 获取mErrorMsg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMErrorMsg() {
        return mErrorMsg;
    }

    /**
     * 设置mErrorMsg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMErrorMsg(JAXBElement<String> value) {
        this.mErrorMsg = value;
    }

    /**
     * 获取mIsOperationSuccess属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsOperationSuccess() {
        return mIsOperationSuccess;
    }

    /**
     * 设置mIsOperationSuccess属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsOperationSuccess(Boolean value) {
        this.mIsOperationSuccess = value;
    }

}
