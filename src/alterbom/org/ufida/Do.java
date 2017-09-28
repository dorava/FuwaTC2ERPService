
package alterbom.org.ufida;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import alterbom.org.ufida.entitydata.ArrayOfUFIDAU9ISVMFGBOMBOMMasterDTO4CreateSvData;
import alterbom.org.ufida.entitydata.UFIDAU9CBOPubControllerContextDTOData;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="context" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="bOMMasterDTOList" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.ISV.MFG.BOM.BOMMasterDTO4CreateSvData" minOccurs="0"/&gt;
 *         &lt;element name="contextDTO" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.ContextDTOData" minOccurs="0"/&gt;
 *         &lt;element name="isThrowEx" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
    "bomMasterDTOList",
    "contextDTO",
    "isThrowEx"
})
@XmlRootElement(name = "Do")
public class Do {

    @XmlElementRef(name = "context", namespace = "http://www.UFIDA.org", type = JAXBElement.class, required = false)
    protected JAXBElement<Object> context;
    @XmlElementRef(name = "bOMMasterDTOList", namespace = "http://www.UFIDA.org", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9ISVMFGBOMBOMMasterDTO4CreateSvData> bomMasterDTOList;
    @XmlElementRef(name = "contextDTO", namespace = "http://www.UFIDA.org", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerContextDTOData> contextDTO;
    protected Boolean isThrowEx;

    /**
     * 获取context属性的值。
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
     * 设置context属性的值。
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
     * 获取bomMasterDTOList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVMFGBOMBOMMasterDTO4CreateSvData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9ISVMFGBOMBOMMasterDTO4CreateSvData> getBOMMasterDTOList() {
        return bomMasterDTOList;
    }

    /**
     * 设置bomMasterDTOList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVMFGBOMBOMMasterDTO4CreateSvData }{@code >}
     *     
     */
    public void setBOMMasterDTOList(JAXBElement<ArrayOfUFIDAU9ISVMFGBOMBOMMasterDTO4CreateSvData> value) {
        this.bomMasterDTOList = value;
    }

    /**
     * 获取contextDTO属性的值。
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
     * 设置contextDTO属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerContextDTOData }{@code >}
     *     
     */
    public void setContextDTO(JAXBElement<UFIDAU9CBOPubControllerContextDTOData> value) {
        this.contextDTO = value;
    }

    /**
     * 获取isThrowEx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsThrowEx() {
        return isThrowEx;
    }

    /**
     * 设置isThrowEx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsThrowEx(Boolean value) {
        this.isThrowEx = value;
    }

}
