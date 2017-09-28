
package alterbom.org.ufida.entitydata;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>UFIDA.U9.ISV.MFG.BOM.LogDTO4CreateSvData complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡmbomMasterDTO���Ե�ֵ��
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
     * ����mbomMasterDTO���Ե�ֵ��
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
     * ��ȡmErrorMsg���Ե�ֵ��
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
     * ����mErrorMsg���Ե�ֵ��
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
     * ��ȡmIsOperationSuccess���Ե�ֵ��
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
     * ����mIsOperationSuccess���Ե�ֵ��
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
