
package queryitem.org.datacontract.schemas._2004._07.ufsoft;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import queryitem.org.datacontract.schemas._2004._07.system.Exception;
import queryitem.org.datacontract.schemas._2004._07.ufsoft_ubf.BusinessException;
import queryitem.org.datacontract.schemas._2004._07.ufsoft_ubf.ServiceException;
import queryitem.org.datacontract.schemas._2004._07.ufsoft_ubf.ServiceLostException;


/**
 * <p>ExceptionBase complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ExceptionBase">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/System}Exception">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExceptionBase")
@XmlSeeAlso({
    UnknownException.class,
    BusinessException.class,
    ServiceLostException.class,
    ServiceException.class
})
public class ExceptionBase
    extends Exception
{


}
