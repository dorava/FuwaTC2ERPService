
package querymaterial.org.ufida.entitydata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>UFIDA.U9.Base.PropertyTypes.EffectiveData complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="UFIDA.U9.Base.PropertyTypes.EffectiveData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.UFIDA.org/EntityData}UFSoft.UBF.Business.DataTransObjectBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="m_disableDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="m_effectiveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="m_isEffective" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UFIDA.U9.Base.PropertyTypes.EffectiveData", propOrder = {
    "mDisableDate",
    "mEffectiveDate",
    "mIsEffective"
})
public class UFIDAU9BasePropertyTypesEffectiveData
    extends UFSoftUBFBusinessDataTransObjectBase
{

    @XmlElement(name = "m_disableDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mDisableDate;
    @XmlElement(name = "m_effectiveDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mEffectiveDate;
    @XmlElement(name = "m_isEffective")
    protected Boolean mIsEffective;

    /**
     * 获取mDisableDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMDisableDate() {
        return mDisableDate;
    }

    /**
     * 设置mDisableDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMDisableDate(XMLGregorianCalendar value) {
        this.mDisableDate = value;
    }

    /**
     * 获取mEffectiveDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMEffectiveDate() {
        return mEffectiveDate;
    }

    /**
     * 设置mEffectiveDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMEffectiveDate(XMLGregorianCalendar value) {
        this.mEffectiveDate = value;
    }

    /**
     * 获取mIsEffective属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsEffective() {
        return mIsEffective;
    }

    /**
     * 设置mIsEffective属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsEffective(Boolean value) {
        this.mIsEffective = value;
    }

}
