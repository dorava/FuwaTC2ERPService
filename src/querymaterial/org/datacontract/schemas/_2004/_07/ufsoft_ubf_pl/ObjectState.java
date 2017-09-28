
package querymaterial.org.datacontract.schemas._2004._07.ufsoft_ubf_pl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ObjectState的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="ObjectState"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NotExist"/&gt;
 *     &lt;enumeration value="Unchanged"/&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *     &lt;enumeration value="Inserted"/&gt;
 *     &lt;enumeration value="Updated"/&gt;
 *     &lt;enumeration value="Deleted"/&gt;
 *     &lt;enumeration value="Operating"/&gt;
 *     &lt;enumeration value="NeedLoad"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ObjectState", namespace = "http://schemas.datacontract.org/2004/07/UFSoft.UBF.PL.Engine")
@XmlEnum
public enum ObjectState {

    @XmlEnumValue("NotExist")
    NOT_EXIST("NotExist"),
    @XmlEnumValue("Unchanged")
    UNCHANGED("Unchanged"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Inserted")
    INSERTED("Inserted"),
    @XmlEnumValue("Updated")
    UPDATED("Updated"),
    @XmlEnumValue("Deleted")
    DELETED("Deleted"),
    @XmlEnumValue("Operating")
    OPERATING("Operating"),
    @XmlEnumValue("NeedLoad")
    NEED_LOAD("NeedLoad");
    private final String value;

    ObjectState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ObjectState fromValue(String v) {
        for (ObjectState c: ObjectState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
