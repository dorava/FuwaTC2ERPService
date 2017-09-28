
package querybom.org.ufida.entitydata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfUFIDA.U9.ISV.MFG.BOM.QueryDelParamsDTOData complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ArrayOfUFIDA.U9.ISV.MFG.BOM.QueryDelParamsDTOData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UFIDA.U9.ISV.MFG.BOM.QueryDelParamsDTOData" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.ISV.MFG.BOM.QueryDelParamsDTOData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUFIDA.U9.ISV.MFG.BOM.QueryDelParamsDTOData", propOrder = {
    "ufidau9ISVMFGBOMQueryDelParamsDTOData"
})
public class ArrayOfUFIDAU9ISVMFGBOMQueryDelParamsDTOData {

    @XmlElement(name = "UFIDA.U9.ISV.MFG.BOM.QueryDelParamsDTOData", nillable = true)
    protected List<UFIDAU9ISVMFGBOMQueryDelParamsDTOData> ufidau9ISVMFGBOMQueryDelParamsDTOData;

    /**
     * Gets the value of the ufidau9ISVMFGBOMQueryDelParamsDTOData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ufidau9ISVMFGBOMQueryDelParamsDTOData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUFIDAU9ISVMFGBOMQueryDelParamsDTOData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UFIDAU9ISVMFGBOMQueryDelParamsDTOData }
     * 
     * 
     */
    public List<UFIDAU9ISVMFGBOMQueryDelParamsDTOData> getUFIDAU9ISVMFGBOMQueryDelParamsDTOData() {
        if (ufidau9ISVMFGBOMQueryDelParamsDTOData == null) {
            ufidau9ISVMFGBOMQueryDelParamsDTOData = new ArrayList<UFIDAU9ISVMFGBOMQueryDelParamsDTOData>();
        }
        return this.ufidau9ISVMFGBOMQueryDelParamsDTOData;
    }

}
