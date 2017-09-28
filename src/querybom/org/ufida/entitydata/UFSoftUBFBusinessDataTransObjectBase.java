
package querybom.org.ufida.entitydata;

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

import querybom.org.datacontract.schemas._2004._07.ufsoft_ubf_pl.ObjectState;


/**
 * <p>UFSoft.UBF.Business.DataTransObjectBase complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
    UFIDAU9ISVMFGBOMQueryDelParamsDTOData.class,
    UFIDAU9CBOPubControllerCommonArchiveDataDTOData.class,
    UFIDAU9CBOPubControllerContextDTOData.class,
    UFIDAU9ISVMFGBOMBOMMasterDTO4CreateSvData.class,
    UFIDAU9ISVMFGBOMBOMComponentDTO4CreateSvData.class,
    UFIDAU9ISVMFGBOMBOMCompPositionDTO4CreateSvData.class,
    UFIDAU9ISVMFGBOMDegreePercentDTO4CreateSvData.class,
    UFIDAU9BaseFlexFieldDescFlexFieldDescFlexSegmentsData.class,
    UFIDAU9ISVMFGBOMCommonChgDTOData.class,
    UFIDAU9ISVMFGBOMBOMCompSupplierDTO4CreateSvData.class,
    UFIDAU9ISVMFGBOMBOMComponentLotDTO4CreateSvData.class,
    UFIDAU9ISVMFGBOMBOMCompScalarScrapDTO4CreateSvData.class
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
     * ��ȡsysState���Ե�ֵ��
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
     * ����sysState���Ե�ֵ��
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
     * ��ȡid���Ե�ֵ��
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
     * ����id���Ե�ֵ��
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
     * ��ȡref���Ե�ֵ��
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
     * ����ref���Ե�ֵ��
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
