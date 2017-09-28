
package queryitem.exceptions.ubf.ufsoft;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfMessageBase complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMessageBase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MessageBase" type="{UFSoft.UBF.Exceptions}MessageBase" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMessageBaseDif1", propOrder = {
    "messageBase"
})
public class ArrayOfMessageBase {

    @XmlElement(name = "MessageBase", nillable = true)
    protected List<MessageBase> messageBase;

    /**
     * Gets the value of the messageBase property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messageBase property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessageBase().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MessageBase }
     * 
     * 
     */
    public List<MessageBase> getMessageBase() {
        if (messageBase == null) {
            messageBase = new ArrayList<MessageBase>();
        }
        return this.messageBase;
    }

}
