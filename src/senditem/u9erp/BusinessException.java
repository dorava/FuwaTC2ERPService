
package senditem.u9erp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>BusinessException complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="BusinessException"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/UFSoft.UBF}ExceptionBase"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessException", namespace = "http://schemas.datacontract.org/2004/07/UFSoft.UBF.Business")
@XmlSeeAlso({
    AttrsContainerException.class,
    AttributeInValidException.class,
    EntityNotExistException.class
})
public class BusinessException
    extends ExceptionBase
{


}
