
package querymaterial.org.datacontract.schemas._2004._07.ufsoft;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import querymaterial.org.datacontract.schemas._2004._07.system.Exception;
import querymaterial.org.datacontract.schemas._2004._07.ufsoft_ubf.BusinessException;
import querymaterial.org.datacontract.schemas._2004._07.ufsoft_ubf.ServiceException;
import querymaterial.org.datacontract.schemas._2004._07.ufsoft_ubf.ServiceLostException;


/**
 * <p>ExceptionBase complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ExceptionBase"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/System}Exception"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExceptionBase")
@XmlSeeAlso({
    ServiceException.class,
    ServiceLostException.class,
    UnknownException.class,
    BusinessException.class
})
public class ExceptionBase
    extends Exception
{


}