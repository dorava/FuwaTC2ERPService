
package senditem.u9erp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ThreadContext complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ThreadContext"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nameValueHas" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfanyTypeanyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ThreadContext", namespace = "http://schemas.datacontract.org/2004/07/UFSoft.UBF.Util.Context", propOrder = {
    "nameValueHas"
})
public class ThreadContext {

    @XmlElement(namespace = "http://schemas.datacontract.org/2004/07/UFSoft.UBF.Util.Context", required = true, nillable = true)
    protected ArrayOfKeyValueOfanyTypeanyType nameValueHas;

    /**
     * ��ȡnameValueHas���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKeyValueOfanyTypeanyType }
     *     
     */
    public ArrayOfKeyValueOfanyTypeanyType getNameValueHas() {
        return nameValueHas;
    }

    /**
     * ����nameValueHas���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKeyValueOfanyTypeanyType }
     *     
     */
    public void setNameValueHas(ArrayOfKeyValueOfanyTypeanyType value) {
        this.nameValueHas = value;
    }

}
