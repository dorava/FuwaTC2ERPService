
package querybom.data.util.ubf.ufsoft;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MultiLangData complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="MultiLangData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LangType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LangValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="State" type="{http://schemas.datacontract.org/2004/07/System.Data}DataRowState" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiLangData", propOrder = {
    "langType",
    "langValue",
    "state"
})
public class MultiLangData {

    @XmlElementRef(name = "LangType", namespace = "UFSoft.UBF.Util.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> langType;
    @XmlElementRef(name = "LangValue", namespace = "UFSoft.UBF.Util.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> langValue;
    @XmlList
    @XmlElement(name = "State")
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> state;

    /**
     * 获取langType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLangType() {
        return langType;
    }

    /**
     * 设置langType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLangType(JAXBElement<String> value) {
        this.langType = value;
    }

    /**
     * 获取langValue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLangValue() {
        return langValue;
    }

    /**
     * 设置langValue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLangValue(JAXBElement<String> value) {
        this.langValue = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the state property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getState().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getState() {
        if (state == null) {
            state = new ArrayList<String>();
        }
        return this.state;
    }

}
