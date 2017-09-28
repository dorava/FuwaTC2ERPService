
package querymaterial.data.util.ubf.ufsoft;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MultiLangDataDict complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="MultiLangDataDict"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="_langs" type="{UFSoft.UBF.Util.Data}ArrayOfMultiLangData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiLangDataDict", propOrder = {
    "langs"
})
public class MultiLangDataDict {

    @XmlElementRef(name = "_langs", namespace = "UFSoft.UBF.Util.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfMultiLangData> langs;

    /**
     * 获取langs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMultiLangData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfMultiLangData> getLangs() {
        return langs;
    }

    /**
     * 设置langs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMultiLangData }{@code >}
     *     
     */
    public void setLangs(JAXBElement<ArrayOfMultiLangData> value) {
        this.langs = value;
    }

}
