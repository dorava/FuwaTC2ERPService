
package querymaterial.org.ufida;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import querymaterial.org.ufida.entitydata.ArrayOfUFIDAU9ISVItemQueryItemDTOData;
import querymaterial.org.ufida.entitydata.UFIDAU9CBOPubControllerContextDTOData;


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
 *         &lt;element name="queryItemDTOs" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.ISV.Item.QueryItemDTOData" minOccurs="0"/&gt;
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
    "queryItemDTOs",
    "contextDTO"
})
@XmlRootElement(name = "Do")
public class Do {

    @XmlElementRef(name = "context", namespace = "http://www.UFIDA.org", type = JAXBElement.class, required = false)
    protected JAXBElement<Object> context;
    @XmlElementRef(name = "queryItemDTOs", namespace = "http://www.UFIDA.org", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9ISVItemQueryItemDTOData> queryItemDTOs;
    @XmlElementRef(name = "contextDTO", namespace = "http://www.UFIDA.org", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerContextDTOData> contextDTO;

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
     * 获取queryItemDTOs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVItemQueryItemDTOData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9ISVItemQueryItemDTOData> getQueryItemDTOs() {
        return queryItemDTOs;
    }

    /**
     * 设置queryItemDTOs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVItemQueryItemDTOData }{@code >}
     *     
     */
    public void setQueryItemDTOs(JAXBElement<ArrayOfUFIDAU9ISVItemQueryItemDTOData> value) {
        this.queryItemDTOs = value;
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

}
