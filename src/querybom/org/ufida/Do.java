
package querybom.org.ufida;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import querybom.org.ufida.entitydata.ArrayOfUFIDAU9ISVMFGBOMQueryDelParamsDTOData;
import querybom.org.ufida.entitydata.UFIDAU9CBOPubControllerContextDTOData;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="context" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="qryParams" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.ISV.MFG.BOM.QueryDelParamsDTOData" minOccurs="0"/&gt;
 *         &lt;element name="contextDTO" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.ContextDTOData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "context",
    "qryParams",
    "contextDTO"
})
@XmlRootElement(name = "Do")
public class Do {

    @XmlElementRef(name = "context", namespace = "http://www.UFIDA.org", type = JAXBElement.class, required = false)
    protected JAXBElement<Object> context;
    @XmlElementRef(name = "qryParams", namespace = "http://www.UFIDA.org", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9ISVMFGBOMQueryDelParamsDTOData> qryParams;
    @XmlElementRef(name = "contextDTO", namespace = "http://www.UFIDA.org", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerContextDTOData> contextDTO;

    /**
     * ��ȡcontext���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public JAXBElement<Object> getContext() {
        return context;
    }

    /**
     * ����context���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public void setContext(JAXBElement<Object> value) {
        this.context = value;
    }

    /**
     * ��ȡqryParams���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVMFGBOMQueryDelParamsDTOData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9ISVMFGBOMQueryDelParamsDTOData> getQryParams() {
        return qryParams;
    }

    /**
     * ����qryParams���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVMFGBOMQueryDelParamsDTOData }{@code >}
     *     
     */
    public void setQryParams(JAXBElement<ArrayOfUFIDAU9ISVMFGBOMQueryDelParamsDTOData> value) {
        this.qryParams = value;
    }

    /**
     * ��ȡcontextDTO���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerContextDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerContextDTOData> getContextDTO() {
        return contextDTO;
    }

    /**
     * ����contextDTO���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerContextDTOData }{@code >}
     *     
     */
    public void setContextDTO(JAXBElement<UFIDAU9CBOPubControllerContextDTOData> value) {
        this.contextDTO = value;
    }

}
