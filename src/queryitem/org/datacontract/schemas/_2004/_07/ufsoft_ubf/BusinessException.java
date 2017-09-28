
package queryitem.org.datacontract.schemas._2004._07.ufsoft_ubf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import queryitem.org.datacontract.schemas._2004._07.ufsoft.ExceptionBase;


/**
 * <p>BusinessException complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="BusinessException">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/UFSoft.UBF}ExceptionBase">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessException")
@XmlSeeAlso({
    AttributeInValidException.class,
    AttrsContainerException.class,
    EntityNotExistException.class
})
public class BusinessException
    extends ExceptionBase
{


}
