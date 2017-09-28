
package querymaterial.org.ufida.entitydata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import querymaterial.org.datacontract.schemas._2004._07.ufsoft_ubf_pl.ObjectState;


/**
 * <p>UFSoft.UBF.Business.DataTransObjectBase complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="UFSoft.UBF.Business.DataTransObjectBase"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sysState" type="{http://schemas.datacontract.org/2004/07/UFSoft.UBF.PL.Engine}ObjectState" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute ref="{http://schemas.microsoft.com/2003/10/Serialization/}Id"/&gt;
 *       &lt;attribute ref="{http://schemas.microsoft.com/2003/10/Serialization/}Ref"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UFSoft.UBF.Business.DataTransObjectBase", propOrder = {
    "sysState"
})
@XmlSeeAlso({
    UFIDAU9ISVItemQueryItemDTOData.class,
    UFIDAU9CBOPubControllerCommonArchiveDataDTOData.class,
    UFIDAU9CBOPubControllerContextDTOData.class,
    UFIDAU9ISVItemItemMasterDTOData.class,
    UFIDAU9BaseFlexFieldDescFlexFieldDescFlexSegmentsData.class,
    UFIDAU9BasePropertyTypesEffectiveData.class,
    UFIDAU9ISVItemEntranceInfoDTOData.class,
    UFIDAU9ISVItemItemInspectionInfoDTOData.class,
    UFIDAU9ISVItemItemInvInfoDTOData.class,
    UFIDAU9ISVItemItemMasterVersionDTOData.class,
    UFIDAU9ISVItemItemTradeMarkDTOData.class,
    UFIDAU9ISVItemItemMFGInfoDTOData.class,
    UFIDAU9ISVItemItemMRPInfoDTOData.class,
    UFIDAU9ISVItemItemPurchaseInfoDTOData.class,
    UFIDAU9ISVItemItemSaleInfoDTOData.class
})
public class UFSoftUBFBusinessDataTransObjectBase {

    @XmlSchemaType(name = "string")
    protected ObjectState sysState;
    @XmlAttribute(name = "Id", namespace = "http://schemas.microsoft.com/2003/10/Serialization/")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "Ref", namespace = "http://schemas.microsoft.com/2003/10/Serialization/")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object ref;

    /**
     * 获取sysState属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ObjectState }
     *     
     */
    public ObjectState getSysState() {
        return sysState;
    }

    /**
     * 设置sysState属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectState }
     *     
     */
    public void setSysState(ObjectState value) {
        this.sysState = value;
    }

    /**
     * 获取id属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * 设置id属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * 获取ref属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRef() {
        return ref;
    }

    /**
     * 设置ref属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRef(Object value) {
        this.ref = value;
    }

}
