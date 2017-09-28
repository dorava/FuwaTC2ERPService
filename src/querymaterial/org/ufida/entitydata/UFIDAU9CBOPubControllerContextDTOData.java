
package querymaterial.org.ufida.entitydata;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>UFIDA.U9.CBO.Pub.Controller.ContextDTOData complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="UFIDA.U9.CBO.Pub.Controller.ContextDTOData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.UFIDA.org/EntityData}UFSoft.UBF.Business.DataTransObjectBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="m_cultureName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_entCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_orgCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_orgID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="m_userClientID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_userCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_userID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="m_userPwd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UFIDA.U9.CBO.Pub.Controller.ContextDTOData", propOrder = {
    "mCultureName",
    "mEntCode",
    "mOrgCode",
    "mOrgID",
    "mUserClientID",
    "mUserCode",
    "mUserID",
    "mUserPwd"
})
public class UFIDAU9CBOPubControllerContextDTOData
    extends UFSoftUBFBusinessDataTransObjectBase
{

    @XmlElementRef(name = "m_cultureName", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCultureName;
    @XmlElementRef(name = "m_entCode", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mEntCode;
    @XmlElementRef(name = "m_orgCode", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mOrgCode;
    @XmlElement(name = "m_orgID")
    protected Long mOrgID;
    @XmlElementRef(name = "m_userClientID", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mUserClientID;
    @XmlElementRef(name = "m_userCode", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mUserCode;
    @XmlElement(name = "m_userID")
    protected Long mUserID;
    @XmlElementRef(name = "m_userPwd", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mUserPwd;

    /**
     * 获取mCultureName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMCultureName() {
        return mCultureName;
    }

    /**
     * 设置mCultureName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMCultureName(JAXBElement<String> value) {
        this.mCultureName = value;
    }

    /**
     * 获取mEntCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMEntCode() {
        return mEntCode;
    }

    /**
     * 设置mEntCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMEntCode(JAXBElement<String> value) {
        this.mEntCode = value;
    }

    /**
     * 获取mOrgCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMOrgCode() {
        return mOrgCode;
    }

    /**
     * 设置mOrgCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMOrgCode(JAXBElement<String> value) {
        this.mOrgCode = value;
    }

    /**
     * 获取mOrgID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMOrgID() {
        return mOrgID;
    }

    /**
     * 设置mOrgID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMOrgID(Long value) {
        this.mOrgID = value;
    }

    /**
     * 获取mUserClientID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMUserClientID() {
        return mUserClientID;
    }

    /**
     * 设置mUserClientID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMUserClientID(JAXBElement<String> value) {
        this.mUserClientID = value;
    }

    /**
     * 获取mUserCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMUserCode() {
        return mUserCode;
    }

    /**
     * 设置mUserCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMUserCode(JAXBElement<String> value) {
        this.mUserCode = value;
    }

    /**
     * 获取mUserID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMUserID() {
        return mUserID;
    }

    /**
     * 设置mUserID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMUserID(Long value) {
        this.mUserID = value;
    }

    /**
     * 获取mUserPwd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMUserPwd() {
        return mUserPwd;
    }

    /**
     * 设置mUserPwd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMUserPwd(JAXBElement<String> value) {
        this.mUserPwd = value;
    }

}
