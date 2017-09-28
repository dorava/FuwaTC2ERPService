
package alterbom.org.ufida.entitydata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfUFIDA.U9.ISV.MFG.BOM.LogDTO4CreateSvData complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ArrayOfUFIDA.U9.ISV.MFG.BOM.LogDTO4CreateSvData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UFIDA.U9.ISV.MFG.BOM.LogDTO4CreateSvData" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.ISV.MFG.BOM.LogDTO4CreateSvData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUFIDA.U9.ISV.MFG.BOM.LogDTO4CreateSvData", propOrder = {
    "ufidau9ISVMFGBOMLogDTO4CreateSvData"
})
public class ArrayOfUFIDAU9ISVMFGBOMLogDTO4CreateSvData {

    @XmlElement(name = "UFIDA.U9.ISV.MFG.BOM.LogDTO4CreateSvData", nillable = true)
    protected List<UFIDAU9ISVMFGBOMLogDTO4CreateSvData> ufidau9ISVMFGBOMLogDTO4CreateSvData;

    /**
     * Gets the value of the ufidau9ISVMFGBOMLogDTO4CreateSvData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ufidau9ISVMFGBOMLogDTO4CreateSvData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUFIDAU9ISVMFGBOMLogDTO4CreateSvData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UFIDAU9ISVMFGBOMLogDTO4CreateSvData }
     * 
     * 
     */
    public List<UFIDAU9ISVMFGBOMLogDTO4CreateSvData> getUFIDAU9ISVMFGBOMLogDTO4CreateSvData() {
        if (ufidau9ISVMFGBOMLogDTO4CreateSvData == null) {
            ufidau9ISVMFGBOMLogDTO4CreateSvData = new ArrayList<UFIDAU9ISVMFGBOMLogDTO4CreateSvData>();
        }
        return this.ufidau9ISVMFGBOMLogDTO4CreateSvData;
    }

}
