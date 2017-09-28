
package querymaterial.org.ufida.entitydata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfUFIDA.U9.ISV.Item.ItemTradeMarkDTOData complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfUFIDA.U9.ISV.Item.ItemTradeMarkDTOData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UFIDA.U9.ISV.Item.ItemTradeMarkDTOData" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.ISV.Item.ItemTradeMarkDTOData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUFIDA.U9.ISV.Item.ItemTradeMarkDTOData", propOrder = {
    "ufidau9ISVItemItemTradeMarkDTOData"
})
public class ArrayOfUFIDAU9ISVItemItemTradeMarkDTOData {

    @XmlElement(name = "UFIDA.U9.ISV.Item.ItemTradeMarkDTOData", nillable = true)
    protected List<UFIDAU9ISVItemItemTradeMarkDTOData> ufidau9ISVItemItemTradeMarkDTOData;

    /**
     * Gets the value of the ufidau9ISVItemItemTradeMarkDTOData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ufidau9ISVItemItemTradeMarkDTOData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUFIDAU9ISVItemItemTradeMarkDTOData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UFIDAU9ISVItemItemTradeMarkDTOData }
     * 
     * 
     */
    public List<UFIDAU9ISVItemItemTradeMarkDTOData> getUFIDAU9ISVItemItemTradeMarkDTOData() {
        if (ufidau9ISVItemItemTradeMarkDTOData == null) {
            ufidau9ISVItemItemTradeMarkDTOData = new ArrayList<UFIDAU9ISVItemItemTradeMarkDTOData>();
        }
        return this.ufidau9ISVItemItemTradeMarkDTOData;
    }

}
