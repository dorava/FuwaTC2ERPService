
package alterbom.org.ufida.entitydata;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import alterbom.data.util.ubf.ufsoft.MultiLangDataDict;


/**
 * <p>UFIDA.U9.Base.FlexField.DescFlexField.DescFlexSegmentsData complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="UFIDA.U9.Base.FlexField.DescFlexField.DescFlexSegmentsData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.UFIDA.org/EntityData}UFSoft.UBF.Business.DataTransObjectBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CombineName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Multi_CombineName" type="{UFSoft.UBF.Util.Data}MultiLangDataDict" minOccurs="0"/&gt;
 *         &lt;element name="m_contextValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_privateDescSeg1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_privateDescSeg10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_privateDescSeg11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_privateDescSeg12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_privateDescSeg13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_privateDescSeg14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_privateDescSeg15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_privateDescSeg16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_privateDescSeg17" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_privateDescSeg18" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_privateDescSeg19" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_privateDescSeg2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_privateDescSeg20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_privateDescSeg21" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_privateDescSeg22" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_privateDescSeg23" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_privateDescSeg24" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_privateDescSeg25" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_privateDescSeg26" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_privateDescSeg27" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_privateDescSeg28" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_privateDescSeg29" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_privateDescSeg3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_privateDescSeg30" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_privateDescSeg4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_privateDescSeg5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_privateDescSeg6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_privateDescSeg7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_privateDescSeg8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_privateDescSeg9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_pubDescSeg1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_pubDescSeg10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_pubDescSeg11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_pubDescSeg12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_pubDescSeg13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_pubDescSeg14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_pubDescSeg15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_pubDescSeg16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_pubDescSeg17" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_pubDescSeg18" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_pubDescSeg19" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_pubDescSeg2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_pubDescSeg20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_pubDescSeg21" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_pubDescSeg22" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_pubDescSeg23" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_pubDescSeg24" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_pubDescSeg25" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_pubDescSeg26" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_pubDescSeg27" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_pubDescSeg28" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_pubDescSeg29" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_pubDescSeg3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_pubDescSeg30" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_pubDescSeg31" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_pubDescSeg32" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_pubDescSeg33" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_pubDescSeg34" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_pubDescSeg35" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_pubDescSeg36" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_pubDescSeg37" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_pubDescSeg38" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_pubDescSeg39" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_pubDescSeg4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_pubDescSeg40" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_pubDescSeg41" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_pubDescSeg42" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_pubDescSeg43" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_pubDescSeg44" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_pubDescSeg45" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_pubDescSeg46" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_pubDescSeg47" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_pubDescSeg48" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_pubDescSeg49" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_pubDescSeg5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_pubDescSeg50" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_pubDescSeg6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_pubDescSeg7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_pubDescSeg8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_pubDescSeg9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UFIDA.U9.Base.FlexField.DescFlexField.DescFlexSegmentsData", propOrder = {
    "combineName",
    "multiCombineName",
    "mContextValue",
    "mPrivateDescSeg1",
    "mPrivateDescSeg10",
    "mPrivateDescSeg11",
    "mPrivateDescSeg12",
    "mPrivateDescSeg13",
    "mPrivateDescSeg14",
    "mPrivateDescSeg15",
    "mPrivateDescSeg16",
    "mPrivateDescSeg17",
    "mPrivateDescSeg18",
    "mPrivateDescSeg19",
    "mPrivateDescSeg2",
    "mPrivateDescSeg20",
    "mPrivateDescSeg21",
    "mPrivateDescSeg22",
    "mPrivateDescSeg23",
    "mPrivateDescSeg24",
    "mPrivateDescSeg25",
    "mPrivateDescSeg26",
    "mPrivateDescSeg27",
    "mPrivateDescSeg28",
    "mPrivateDescSeg29",
    "mPrivateDescSeg3",
    "mPrivateDescSeg30",
    "mPrivateDescSeg4",
    "mPrivateDescSeg5",
    "mPrivateDescSeg6",
    "mPrivateDescSeg7",
    "mPrivateDescSeg8",
    "mPrivateDescSeg9",
    "mPubDescSeg1",
    "mPubDescSeg10",
    "mPubDescSeg11",
    "mPubDescSeg12",
    "mPubDescSeg13",
    "mPubDescSeg14",
    "mPubDescSeg15",
    "mPubDescSeg16",
    "mPubDescSeg17",
    "mPubDescSeg18",
    "mPubDescSeg19",
    "mPubDescSeg2",
    "mPubDescSeg20",
    "mPubDescSeg21",
    "mPubDescSeg22",
    "mPubDescSeg23",
    "mPubDescSeg24",
    "mPubDescSeg25",
    "mPubDescSeg26",
    "mPubDescSeg27",
    "mPubDescSeg28",
    "mPubDescSeg29",
    "mPubDescSeg3",
    "mPubDescSeg30",
    "mPubDescSeg31",
    "mPubDescSeg32",
    "mPubDescSeg33",
    "mPubDescSeg34",
    "mPubDescSeg35",
    "mPubDescSeg36",
    "mPubDescSeg37",
    "mPubDescSeg38",
    "mPubDescSeg39",
    "mPubDescSeg4",
    "mPubDescSeg40",
    "mPubDescSeg41",
    "mPubDescSeg42",
    "mPubDescSeg43",
    "mPubDescSeg44",
    "mPubDescSeg45",
    "mPubDescSeg46",
    "mPubDescSeg47",
    "mPubDescSeg48",
    "mPubDescSeg49",
    "mPubDescSeg5",
    "mPubDescSeg50",
    "mPubDescSeg6",
    "mPubDescSeg7",
    "mPubDescSeg8",
    "mPubDescSeg9"
})
public class UFIDAU9BaseFlexFieldDescFlexFieldDescFlexSegmentsData
    extends UFSoftUBFBusinessDataTransObjectBase
{

    @XmlElementRef(name = "CombineName", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> combineName;
    @XmlElementRef(name = "Multi_CombineName", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<MultiLangDataDict> multiCombineName;
    @XmlElementRef(name = "m_contextValue", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mContextValue;
    @XmlElementRef(name = "m_privateDescSeg1", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPrivateDescSeg1;
    @XmlElementRef(name = "m_privateDescSeg10", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPrivateDescSeg10;
    @XmlElementRef(name = "m_privateDescSeg11", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPrivateDescSeg11;
    @XmlElementRef(name = "m_privateDescSeg12", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPrivateDescSeg12;
    @XmlElementRef(name = "m_privateDescSeg13", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPrivateDescSeg13;
    @XmlElementRef(name = "m_privateDescSeg14", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPrivateDescSeg14;
    @XmlElementRef(name = "m_privateDescSeg15", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPrivateDescSeg15;
    @XmlElementRef(name = "m_privateDescSeg16", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPrivateDescSeg16;
    @XmlElementRef(name = "m_privateDescSeg17", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPrivateDescSeg17;
    @XmlElementRef(name = "m_privateDescSeg18", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPrivateDescSeg18;
    @XmlElementRef(name = "m_privateDescSeg19", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPrivateDescSeg19;
    @XmlElementRef(name = "m_privateDescSeg2", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPrivateDescSeg2;
    @XmlElementRef(name = "m_privateDescSeg20", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPrivateDescSeg20;
    @XmlElementRef(name = "m_privateDescSeg21", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPrivateDescSeg21;
    @XmlElementRef(name = "m_privateDescSeg22", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPrivateDescSeg22;
    @XmlElementRef(name = "m_privateDescSeg23", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPrivateDescSeg23;
    @XmlElementRef(name = "m_privateDescSeg24", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPrivateDescSeg24;
    @XmlElementRef(name = "m_privateDescSeg25", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPrivateDescSeg25;
    @XmlElementRef(name = "m_privateDescSeg26", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPrivateDescSeg26;
    @XmlElementRef(name = "m_privateDescSeg27", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPrivateDescSeg27;
    @XmlElementRef(name = "m_privateDescSeg28", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPrivateDescSeg28;
    @XmlElementRef(name = "m_privateDescSeg29", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPrivateDescSeg29;
    @XmlElementRef(name = "m_privateDescSeg3", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPrivateDescSeg3;
    @XmlElementRef(name = "m_privateDescSeg30", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPrivateDescSeg30;
    @XmlElementRef(name = "m_privateDescSeg4", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPrivateDescSeg4;
    @XmlElementRef(name = "m_privateDescSeg5", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPrivateDescSeg5;
    @XmlElementRef(name = "m_privateDescSeg6", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPrivateDescSeg6;
    @XmlElementRef(name = "m_privateDescSeg7", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPrivateDescSeg7;
    @XmlElementRef(name = "m_privateDescSeg8", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPrivateDescSeg8;
    @XmlElementRef(name = "m_privateDescSeg9", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPrivateDescSeg9;
    @XmlElementRef(name = "m_pubDescSeg1", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg1;
    @XmlElementRef(name = "m_pubDescSeg10", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg10;
    @XmlElementRef(name = "m_pubDescSeg11", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg11;
    @XmlElementRef(name = "m_pubDescSeg12", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg12;
    @XmlElementRef(name = "m_pubDescSeg13", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg13;
    @XmlElementRef(name = "m_pubDescSeg14", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg14;
    @XmlElementRef(name = "m_pubDescSeg15", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg15;
    @XmlElementRef(name = "m_pubDescSeg16", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg16;
    @XmlElementRef(name = "m_pubDescSeg17", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg17;
    @XmlElementRef(name = "m_pubDescSeg18", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg18;
    @XmlElementRef(name = "m_pubDescSeg19", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg19;
    @XmlElementRef(name = "m_pubDescSeg2", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg2;
    @XmlElementRef(name = "m_pubDescSeg20", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg20;
    @XmlElementRef(name = "m_pubDescSeg21", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg21;
    @XmlElementRef(name = "m_pubDescSeg22", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg22;
    @XmlElementRef(name = "m_pubDescSeg23", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg23;
    @XmlElementRef(name = "m_pubDescSeg24", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg24;
    @XmlElementRef(name = "m_pubDescSeg25", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg25;
    @XmlElementRef(name = "m_pubDescSeg26", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg26;
    @XmlElementRef(name = "m_pubDescSeg27", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg27;
    @XmlElementRef(name = "m_pubDescSeg28", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg28;
    @XmlElementRef(name = "m_pubDescSeg29", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg29;
    @XmlElementRef(name = "m_pubDescSeg3", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg3;
    @XmlElementRef(name = "m_pubDescSeg30", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg30;
    @XmlElementRef(name = "m_pubDescSeg31", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg31;
    @XmlElementRef(name = "m_pubDescSeg32", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg32;
    @XmlElementRef(name = "m_pubDescSeg33", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg33;
    @XmlElementRef(name = "m_pubDescSeg34", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg34;
    @XmlElementRef(name = "m_pubDescSeg35", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg35;
    @XmlElementRef(name = "m_pubDescSeg36", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg36;
    @XmlElementRef(name = "m_pubDescSeg37", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg37;
    @XmlElementRef(name = "m_pubDescSeg38", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg38;
    @XmlElementRef(name = "m_pubDescSeg39", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg39;
    @XmlElementRef(name = "m_pubDescSeg4", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg4;
    @XmlElementRef(name = "m_pubDescSeg40", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg40;
    @XmlElementRef(name = "m_pubDescSeg41", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg41;
    @XmlElementRef(name = "m_pubDescSeg42", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg42;
    @XmlElementRef(name = "m_pubDescSeg43", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg43;
    @XmlElementRef(name = "m_pubDescSeg44", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg44;
    @XmlElementRef(name = "m_pubDescSeg45", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg45;
    @XmlElementRef(name = "m_pubDescSeg46", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg46;
    @XmlElementRef(name = "m_pubDescSeg47", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg47;
    @XmlElementRef(name = "m_pubDescSeg48", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg48;
    @XmlElementRef(name = "m_pubDescSeg49", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg49;
    @XmlElementRef(name = "m_pubDescSeg5", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg5;
    @XmlElementRef(name = "m_pubDescSeg50", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg50;
    @XmlElementRef(name = "m_pubDescSeg6", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg6;
    @XmlElementRef(name = "m_pubDescSeg7", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg7;
    @XmlElementRef(name = "m_pubDescSeg8", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg8;
    @XmlElementRef(name = "m_pubDescSeg9", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg9;

    /**
     * 获取combineName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCombineName() {
        return combineName;
    }

    /**
     * 设置combineName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCombineName(JAXBElement<String> value) {
        this.combineName = value;
    }

    /**
     * 获取multiCombineName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public JAXBElement<MultiLangDataDict> getMultiCombineName() {
        return multiCombineName;
    }

    /**
     * 设置multiCombineName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public void setMultiCombineName(JAXBElement<MultiLangDataDict> value) {
        this.multiCombineName = value;
    }

    /**
     * 获取mContextValue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMContextValue() {
        return mContextValue;
    }

    /**
     * 设置mContextValue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMContextValue(JAXBElement<String> value) {
        this.mContextValue = value;
    }

    /**
     * 获取mPrivateDescSeg1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPrivateDescSeg1() {
        return mPrivateDescSeg1;
    }

    /**
     * 设置mPrivateDescSeg1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPrivateDescSeg1(JAXBElement<String> value) {
        this.mPrivateDescSeg1 = value;
    }

    /**
     * 获取mPrivateDescSeg10属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPrivateDescSeg10() {
        return mPrivateDescSeg10;
    }

    /**
     * 设置mPrivateDescSeg10属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPrivateDescSeg10(JAXBElement<String> value) {
        this.mPrivateDescSeg10 = value;
    }

    /**
     * 获取mPrivateDescSeg11属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPrivateDescSeg11() {
        return mPrivateDescSeg11;
    }

    /**
     * 设置mPrivateDescSeg11属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPrivateDescSeg11(JAXBElement<String> value) {
        this.mPrivateDescSeg11 = value;
    }

    /**
     * 获取mPrivateDescSeg12属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPrivateDescSeg12() {
        return mPrivateDescSeg12;
    }

    /**
     * 设置mPrivateDescSeg12属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPrivateDescSeg12(JAXBElement<String> value) {
        this.mPrivateDescSeg12 = value;
    }

    /**
     * 获取mPrivateDescSeg13属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPrivateDescSeg13() {
        return mPrivateDescSeg13;
    }

    /**
     * 设置mPrivateDescSeg13属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPrivateDescSeg13(JAXBElement<String> value) {
        this.mPrivateDescSeg13 = value;
    }

    /**
     * 获取mPrivateDescSeg14属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPrivateDescSeg14() {
        return mPrivateDescSeg14;
    }

    /**
     * 设置mPrivateDescSeg14属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPrivateDescSeg14(JAXBElement<String> value) {
        this.mPrivateDescSeg14 = value;
    }

    /**
     * 获取mPrivateDescSeg15属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPrivateDescSeg15() {
        return mPrivateDescSeg15;
    }

    /**
     * 设置mPrivateDescSeg15属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPrivateDescSeg15(JAXBElement<String> value) {
        this.mPrivateDescSeg15 = value;
    }

    /**
     * 获取mPrivateDescSeg16属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPrivateDescSeg16() {
        return mPrivateDescSeg16;
    }

    /**
     * 设置mPrivateDescSeg16属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPrivateDescSeg16(JAXBElement<String> value) {
        this.mPrivateDescSeg16 = value;
    }

    /**
     * 获取mPrivateDescSeg17属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPrivateDescSeg17() {
        return mPrivateDescSeg17;
    }

    /**
     * 设置mPrivateDescSeg17属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPrivateDescSeg17(JAXBElement<String> value) {
        this.mPrivateDescSeg17 = value;
    }

    /**
     * 获取mPrivateDescSeg18属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPrivateDescSeg18() {
        return mPrivateDescSeg18;
    }

    /**
     * 设置mPrivateDescSeg18属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPrivateDescSeg18(JAXBElement<String> value) {
        this.mPrivateDescSeg18 = value;
    }

    /**
     * 获取mPrivateDescSeg19属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPrivateDescSeg19() {
        return mPrivateDescSeg19;
    }

    /**
     * 设置mPrivateDescSeg19属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPrivateDescSeg19(JAXBElement<String> value) {
        this.mPrivateDescSeg19 = value;
    }

    /**
     * 获取mPrivateDescSeg2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPrivateDescSeg2() {
        return mPrivateDescSeg2;
    }

    /**
     * 设置mPrivateDescSeg2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPrivateDescSeg2(JAXBElement<String> value) {
        this.mPrivateDescSeg2 = value;
    }

    /**
     * 获取mPrivateDescSeg20属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPrivateDescSeg20() {
        return mPrivateDescSeg20;
    }

    /**
     * 设置mPrivateDescSeg20属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPrivateDescSeg20(JAXBElement<String> value) {
        this.mPrivateDescSeg20 = value;
    }

    /**
     * 获取mPrivateDescSeg21属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPrivateDescSeg21() {
        return mPrivateDescSeg21;
    }

    /**
     * 设置mPrivateDescSeg21属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPrivateDescSeg21(JAXBElement<String> value) {
        this.mPrivateDescSeg21 = value;
    }

    /**
     * 获取mPrivateDescSeg22属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPrivateDescSeg22() {
        return mPrivateDescSeg22;
    }

    /**
     * 设置mPrivateDescSeg22属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPrivateDescSeg22(JAXBElement<String> value) {
        this.mPrivateDescSeg22 = value;
    }

    /**
     * 获取mPrivateDescSeg23属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPrivateDescSeg23() {
        return mPrivateDescSeg23;
    }

    /**
     * 设置mPrivateDescSeg23属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPrivateDescSeg23(JAXBElement<String> value) {
        this.mPrivateDescSeg23 = value;
    }

    /**
     * 获取mPrivateDescSeg24属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPrivateDescSeg24() {
        return mPrivateDescSeg24;
    }

    /**
     * 设置mPrivateDescSeg24属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPrivateDescSeg24(JAXBElement<String> value) {
        this.mPrivateDescSeg24 = value;
    }

    /**
     * 获取mPrivateDescSeg25属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPrivateDescSeg25() {
        return mPrivateDescSeg25;
    }

    /**
     * 设置mPrivateDescSeg25属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPrivateDescSeg25(JAXBElement<String> value) {
        this.mPrivateDescSeg25 = value;
    }

    /**
     * 获取mPrivateDescSeg26属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPrivateDescSeg26() {
        return mPrivateDescSeg26;
    }

    /**
     * 设置mPrivateDescSeg26属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPrivateDescSeg26(JAXBElement<String> value) {
        this.mPrivateDescSeg26 = value;
    }

    /**
     * 获取mPrivateDescSeg27属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPrivateDescSeg27() {
        return mPrivateDescSeg27;
    }

    /**
     * 设置mPrivateDescSeg27属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPrivateDescSeg27(JAXBElement<String> value) {
        this.mPrivateDescSeg27 = value;
    }

    /**
     * 获取mPrivateDescSeg28属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPrivateDescSeg28() {
        return mPrivateDescSeg28;
    }

    /**
     * 设置mPrivateDescSeg28属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPrivateDescSeg28(JAXBElement<String> value) {
        this.mPrivateDescSeg28 = value;
    }

    /**
     * 获取mPrivateDescSeg29属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPrivateDescSeg29() {
        return mPrivateDescSeg29;
    }

    /**
     * 设置mPrivateDescSeg29属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPrivateDescSeg29(JAXBElement<String> value) {
        this.mPrivateDescSeg29 = value;
    }

    /**
     * 获取mPrivateDescSeg3属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPrivateDescSeg3() {
        return mPrivateDescSeg3;
    }

    /**
     * 设置mPrivateDescSeg3属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPrivateDescSeg3(JAXBElement<String> value) {
        this.mPrivateDescSeg3 = value;
    }

    /**
     * 获取mPrivateDescSeg30属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPrivateDescSeg30() {
        return mPrivateDescSeg30;
    }

    /**
     * 设置mPrivateDescSeg30属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPrivateDescSeg30(JAXBElement<String> value) {
        this.mPrivateDescSeg30 = value;
    }

    /**
     * 获取mPrivateDescSeg4属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPrivateDescSeg4() {
        return mPrivateDescSeg4;
    }

    /**
     * 设置mPrivateDescSeg4属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPrivateDescSeg4(JAXBElement<String> value) {
        this.mPrivateDescSeg4 = value;
    }

    /**
     * 获取mPrivateDescSeg5属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPrivateDescSeg5() {
        return mPrivateDescSeg5;
    }

    /**
     * 设置mPrivateDescSeg5属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPrivateDescSeg5(JAXBElement<String> value) {
        this.mPrivateDescSeg5 = value;
    }

    /**
     * 获取mPrivateDescSeg6属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPrivateDescSeg6() {
        return mPrivateDescSeg6;
    }

    /**
     * 设置mPrivateDescSeg6属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPrivateDescSeg6(JAXBElement<String> value) {
        this.mPrivateDescSeg6 = value;
    }

    /**
     * 获取mPrivateDescSeg7属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPrivateDescSeg7() {
        return mPrivateDescSeg7;
    }

    /**
     * 设置mPrivateDescSeg7属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPrivateDescSeg7(JAXBElement<String> value) {
        this.mPrivateDescSeg7 = value;
    }

    /**
     * 获取mPrivateDescSeg8属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPrivateDescSeg8() {
        return mPrivateDescSeg8;
    }

    /**
     * 设置mPrivateDescSeg8属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPrivateDescSeg8(JAXBElement<String> value) {
        this.mPrivateDescSeg8 = value;
    }

    /**
     * 获取mPrivateDescSeg9属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPrivateDescSeg9() {
        return mPrivateDescSeg9;
    }

    /**
     * 设置mPrivateDescSeg9属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPrivateDescSeg9(JAXBElement<String> value) {
        this.mPrivateDescSeg9 = value;
    }

    /**
     * 获取mPubDescSeg1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg1() {
        return mPubDescSeg1;
    }

    /**
     * 设置mPubDescSeg1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg1(JAXBElement<String> value) {
        this.mPubDescSeg1 = value;
    }

    /**
     * 获取mPubDescSeg10属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg10() {
        return mPubDescSeg10;
    }

    /**
     * 设置mPubDescSeg10属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg10(JAXBElement<String> value) {
        this.mPubDescSeg10 = value;
    }

    /**
     * 获取mPubDescSeg11属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg11() {
        return mPubDescSeg11;
    }

    /**
     * 设置mPubDescSeg11属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg11(JAXBElement<String> value) {
        this.mPubDescSeg11 = value;
    }

    /**
     * 获取mPubDescSeg12属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg12() {
        return mPubDescSeg12;
    }

    /**
     * 设置mPubDescSeg12属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg12(JAXBElement<String> value) {
        this.mPubDescSeg12 = value;
    }

    /**
     * 获取mPubDescSeg13属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg13() {
        return mPubDescSeg13;
    }

    /**
     * 设置mPubDescSeg13属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg13(JAXBElement<String> value) {
        this.mPubDescSeg13 = value;
    }

    /**
     * 获取mPubDescSeg14属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg14() {
        return mPubDescSeg14;
    }

    /**
     * 设置mPubDescSeg14属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg14(JAXBElement<String> value) {
        this.mPubDescSeg14 = value;
    }

    /**
     * 获取mPubDescSeg15属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg15() {
        return mPubDescSeg15;
    }

    /**
     * 设置mPubDescSeg15属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg15(JAXBElement<String> value) {
        this.mPubDescSeg15 = value;
    }

    /**
     * 获取mPubDescSeg16属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg16() {
        return mPubDescSeg16;
    }

    /**
     * 设置mPubDescSeg16属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg16(JAXBElement<String> value) {
        this.mPubDescSeg16 = value;
    }

    /**
     * 获取mPubDescSeg17属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg17() {
        return mPubDescSeg17;
    }

    /**
     * 设置mPubDescSeg17属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg17(JAXBElement<String> value) {
        this.mPubDescSeg17 = value;
    }

    /**
     * 获取mPubDescSeg18属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg18() {
        return mPubDescSeg18;
    }

    /**
     * 设置mPubDescSeg18属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg18(JAXBElement<String> value) {
        this.mPubDescSeg18 = value;
    }

    /**
     * 获取mPubDescSeg19属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg19() {
        return mPubDescSeg19;
    }

    /**
     * 设置mPubDescSeg19属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg19(JAXBElement<String> value) {
        this.mPubDescSeg19 = value;
    }

    /**
     * 获取mPubDescSeg2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg2() {
        return mPubDescSeg2;
    }

    /**
     * 设置mPubDescSeg2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg2(JAXBElement<String> value) {
        this.mPubDescSeg2 = value;
    }

    /**
     * 获取mPubDescSeg20属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg20() {
        return mPubDescSeg20;
    }

    /**
     * 设置mPubDescSeg20属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg20(JAXBElement<String> value) {
        this.mPubDescSeg20 = value;
    }

    /**
     * 获取mPubDescSeg21属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg21() {
        return mPubDescSeg21;
    }

    /**
     * 设置mPubDescSeg21属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg21(JAXBElement<String> value) {
        this.mPubDescSeg21 = value;
    }

    /**
     * 获取mPubDescSeg22属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg22() {
        return mPubDescSeg22;
    }

    /**
     * 设置mPubDescSeg22属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg22(JAXBElement<String> value) {
        this.mPubDescSeg22 = value;
    }

    /**
     * 获取mPubDescSeg23属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg23() {
        return mPubDescSeg23;
    }

    /**
     * 设置mPubDescSeg23属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg23(JAXBElement<String> value) {
        this.mPubDescSeg23 = value;
    }

    /**
     * 获取mPubDescSeg24属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg24() {
        return mPubDescSeg24;
    }

    /**
     * 设置mPubDescSeg24属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg24(JAXBElement<String> value) {
        this.mPubDescSeg24 = value;
    }

    /**
     * 获取mPubDescSeg25属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg25() {
        return mPubDescSeg25;
    }

    /**
     * 设置mPubDescSeg25属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg25(JAXBElement<String> value) {
        this.mPubDescSeg25 = value;
    }

    /**
     * 获取mPubDescSeg26属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg26() {
        return mPubDescSeg26;
    }

    /**
     * 设置mPubDescSeg26属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg26(JAXBElement<String> value) {
        this.mPubDescSeg26 = value;
    }

    /**
     * 获取mPubDescSeg27属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg27() {
        return mPubDescSeg27;
    }

    /**
     * 设置mPubDescSeg27属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg27(JAXBElement<String> value) {
        this.mPubDescSeg27 = value;
    }

    /**
     * 获取mPubDescSeg28属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg28() {
        return mPubDescSeg28;
    }

    /**
     * 设置mPubDescSeg28属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg28(JAXBElement<String> value) {
        this.mPubDescSeg28 = value;
    }

    /**
     * 获取mPubDescSeg29属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg29() {
        return mPubDescSeg29;
    }

    /**
     * 设置mPubDescSeg29属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg29(JAXBElement<String> value) {
        this.mPubDescSeg29 = value;
    }

    /**
     * 获取mPubDescSeg3属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg3() {
        return mPubDescSeg3;
    }

    /**
     * 设置mPubDescSeg3属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg3(JAXBElement<String> value) {
        this.mPubDescSeg3 = value;
    }

    /**
     * 获取mPubDescSeg30属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg30() {
        return mPubDescSeg30;
    }

    /**
     * 设置mPubDescSeg30属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg30(JAXBElement<String> value) {
        this.mPubDescSeg30 = value;
    }

    /**
     * 获取mPubDescSeg31属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg31() {
        return mPubDescSeg31;
    }

    /**
     * 设置mPubDescSeg31属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg31(JAXBElement<String> value) {
        this.mPubDescSeg31 = value;
    }

    /**
     * 获取mPubDescSeg32属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg32() {
        return mPubDescSeg32;
    }

    /**
     * 设置mPubDescSeg32属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg32(JAXBElement<String> value) {
        this.mPubDescSeg32 = value;
    }

    /**
     * 获取mPubDescSeg33属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg33() {
        return mPubDescSeg33;
    }

    /**
     * 设置mPubDescSeg33属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg33(JAXBElement<String> value) {
        this.mPubDescSeg33 = value;
    }

    /**
     * 获取mPubDescSeg34属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg34() {
        return mPubDescSeg34;
    }

    /**
     * 设置mPubDescSeg34属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg34(JAXBElement<String> value) {
        this.mPubDescSeg34 = value;
    }

    /**
     * 获取mPubDescSeg35属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg35() {
        return mPubDescSeg35;
    }

    /**
     * 设置mPubDescSeg35属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg35(JAXBElement<String> value) {
        this.mPubDescSeg35 = value;
    }

    /**
     * 获取mPubDescSeg36属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg36() {
        return mPubDescSeg36;
    }

    /**
     * 设置mPubDescSeg36属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg36(JAXBElement<String> value) {
        this.mPubDescSeg36 = value;
    }

    /**
     * 获取mPubDescSeg37属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg37() {
        return mPubDescSeg37;
    }

    /**
     * 设置mPubDescSeg37属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg37(JAXBElement<String> value) {
        this.mPubDescSeg37 = value;
    }

    /**
     * 获取mPubDescSeg38属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg38() {
        return mPubDescSeg38;
    }

    /**
     * 设置mPubDescSeg38属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg38(JAXBElement<String> value) {
        this.mPubDescSeg38 = value;
    }

    /**
     * 获取mPubDescSeg39属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg39() {
        return mPubDescSeg39;
    }

    /**
     * 设置mPubDescSeg39属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg39(JAXBElement<String> value) {
        this.mPubDescSeg39 = value;
    }

    /**
     * 获取mPubDescSeg4属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg4() {
        return mPubDescSeg4;
    }

    /**
     * 设置mPubDescSeg4属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg4(JAXBElement<String> value) {
        this.mPubDescSeg4 = value;
    }

    /**
     * 获取mPubDescSeg40属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg40() {
        return mPubDescSeg40;
    }

    /**
     * 设置mPubDescSeg40属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg40(JAXBElement<String> value) {
        this.mPubDescSeg40 = value;
    }

    /**
     * 获取mPubDescSeg41属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg41() {
        return mPubDescSeg41;
    }

    /**
     * 设置mPubDescSeg41属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg41(JAXBElement<String> value) {
        this.mPubDescSeg41 = value;
    }

    /**
     * 获取mPubDescSeg42属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg42() {
        return mPubDescSeg42;
    }

    /**
     * 设置mPubDescSeg42属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg42(JAXBElement<String> value) {
        this.mPubDescSeg42 = value;
    }

    /**
     * 获取mPubDescSeg43属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg43() {
        return mPubDescSeg43;
    }

    /**
     * 设置mPubDescSeg43属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg43(JAXBElement<String> value) {
        this.mPubDescSeg43 = value;
    }

    /**
     * 获取mPubDescSeg44属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg44() {
        return mPubDescSeg44;
    }

    /**
     * 设置mPubDescSeg44属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg44(JAXBElement<String> value) {
        this.mPubDescSeg44 = value;
    }

    /**
     * 获取mPubDescSeg45属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg45() {
        return mPubDescSeg45;
    }

    /**
     * 设置mPubDescSeg45属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg45(JAXBElement<String> value) {
        this.mPubDescSeg45 = value;
    }

    /**
     * 获取mPubDescSeg46属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg46() {
        return mPubDescSeg46;
    }

    /**
     * 设置mPubDescSeg46属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg46(JAXBElement<String> value) {
        this.mPubDescSeg46 = value;
    }

    /**
     * 获取mPubDescSeg47属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg47() {
        return mPubDescSeg47;
    }

    /**
     * 设置mPubDescSeg47属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg47(JAXBElement<String> value) {
        this.mPubDescSeg47 = value;
    }

    /**
     * 获取mPubDescSeg48属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg48() {
        return mPubDescSeg48;
    }

    /**
     * 设置mPubDescSeg48属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg48(JAXBElement<String> value) {
        this.mPubDescSeg48 = value;
    }

    /**
     * 获取mPubDescSeg49属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg49() {
        return mPubDescSeg49;
    }

    /**
     * 设置mPubDescSeg49属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg49(JAXBElement<String> value) {
        this.mPubDescSeg49 = value;
    }

    /**
     * 获取mPubDescSeg5属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg5() {
        return mPubDescSeg5;
    }

    /**
     * 设置mPubDescSeg5属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg5(JAXBElement<String> value) {
        this.mPubDescSeg5 = value;
    }

    /**
     * 获取mPubDescSeg50属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg50() {
        return mPubDescSeg50;
    }

    /**
     * 设置mPubDescSeg50属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg50(JAXBElement<String> value) {
        this.mPubDescSeg50 = value;
    }

    /**
     * 获取mPubDescSeg6属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg6() {
        return mPubDescSeg6;
    }

    /**
     * 设置mPubDescSeg6属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg6(JAXBElement<String> value) {
        this.mPubDescSeg6 = value;
    }

    /**
     * 获取mPubDescSeg7属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg7() {
        return mPubDescSeg7;
    }

    /**
     * 设置mPubDescSeg7属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg7(JAXBElement<String> value) {
        this.mPubDescSeg7 = value;
    }

    /**
     * 获取mPubDescSeg8属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg8() {
        return mPubDescSeg8;
    }

    /**
     * 设置mPubDescSeg8属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg8(JAXBElement<String> value) {
        this.mPubDescSeg8 = value;
    }

    /**
     * 获取mPubDescSeg9属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg9() {
        return mPubDescSeg9;
    }

    /**
     * 设置mPubDescSeg9属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg9(JAXBElement<String> value) {
        this.mPubDescSeg9 = value;
    }

}
