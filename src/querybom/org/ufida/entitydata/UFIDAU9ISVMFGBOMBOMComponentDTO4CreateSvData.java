
package querybom.org.ufida.entitydata;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>UFIDA.U9.ISV.MFG.BOM.BOMComponentDTO4CreateSvData complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="UFIDA.U9.ISV.MFG.BOM.BOMComponentDTO4CreateSvData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.UFIDA.org/EntityData}UFSoft.UBF.Business.DataTransObjectBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="m_bOMCompPositions" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.ISV.MFG.BOM.BOMCompPositionDTO4CreateSvData" minOccurs="0"/&gt;
 *         &lt;element name="m_bOMCompScalarScraps" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.ISV.MFG.BOM.BOMCompScalarScrapDTO4CreateSvData" minOccurs="0"/&gt;
 *         &lt;element name="m_bOMCompSubstituteDTO4CreateSv" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.ISV.MFG.BOM.BOMComponentDTO4CreateSvData" minOccurs="0"/&gt;
 *         &lt;element name="m_bOMCompSuppliers" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.ISV.MFG.BOM.BOMCompSupplierDTO4CreateSvData" minOccurs="0"/&gt;
 *         &lt;element name="m_bOMComponentChangeDTOList" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.ISV.MFG.BOM.CommonChgDTOData" minOccurs="0"/&gt;
 *         &lt;element name="m_bOMComponentLots" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.ISV.MFG.BOM.BOMComponentLotDTO4CreateSvData" minOccurs="0"/&gt;
 *         &lt;element name="m_bOMMasterDTO4CreateSv" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.ISV.MFG.BOM.BOMMasterDTO4CreateSvData" minOccurs="0"/&gt;
 *         &lt;element name="m_compProject" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&gt;
 *         &lt;element name="m_componentType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="m_consignProcessItemSrc" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="m_costElement" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&gt;
 *         &lt;element name="m_costPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="m_descFlexField" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.Base.FlexField.DescFlexField.DescFlexSegmentsData" minOccurs="0"/&gt;
 *         &lt;element name="m_descFlexField_PrivateDescSeg1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_descFlexField_PrivateDescSeg10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_descFlexField_PrivateDescSeg11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_descFlexField_PrivateDescSeg12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_descFlexField_PrivateDescSeg13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_descFlexField_PrivateDescSeg14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_descFlexField_PrivateDescSeg15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_descFlexField_PrivateDescSeg16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_descFlexField_PrivateDescSeg17" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_descFlexField_PrivateDescSeg18" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_descFlexField_PrivateDescSeg19" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_descFlexField_PrivateDescSeg2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_descFlexField_PrivateDescSeg20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_descFlexField_PrivateDescSeg21" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_descFlexField_PrivateDescSeg22" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_descFlexField_PrivateDescSeg23" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_descFlexField_PrivateDescSeg24" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_descFlexField_PrivateDescSeg25" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_descFlexField_PrivateDescSeg26" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_descFlexField_PrivateDescSeg27" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_descFlexField_PrivateDescSeg28" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_descFlexField_PrivateDescSeg29" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_descFlexField_PrivateDescSeg3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_descFlexField_PrivateDescSeg30" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_descFlexField_PrivateDescSeg4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_descFlexField_PrivateDescSeg5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_descFlexField_PrivateDescSeg6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_descFlexField_PrivateDescSeg7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_descFlexField_PrivateDescSeg8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_descFlexField_PrivateDescSeg9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_descFlexField_PubDescSeg1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_descFlexField_PubDescSeg10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_descFlexField_PubDescSeg11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_descFlexField_PubDescSeg12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_descFlexField_PubDescSeg13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_descFlexField_PubDescSeg14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_descFlexField_PubDescSeg15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_descFlexField_PubDescSeg16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_descFlexField_PubDescSeg17" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_descFlexField_PubDescSeg18" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_descFlexField_PubDescSeg19" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_descFlexField_PubDescSeg2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_descFlexField_PubDescSeg20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_descFlexField_PubDescSeg21" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_descFlexField_PubDescSeg22" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_descFlexField_PubDescSeg23" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_descFlexField_PubDescSeg24" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_descFlexField_PubDescSeg25" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_descFlexField_PubDescSeg26" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_descFlexField_PubDescSeg27" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_descFlexField_PubDescSeg28" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_descFlexField_PubDescSeg29" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_descFlexField_PubDescSeg3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_descFlexField_PubDescSeg30" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_descFlexField_PubDescSeg31" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_descFlexField_PubDescSeg32" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_descFlexField_PubDescSeg33" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_descFlexField_PubDescSeg34" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_descFlexField_PubDescSeg35" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_descFlexField_PubDescSeg36" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_descFlexField_PubDescSeg37" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_descFlexField_PubDescSeg38" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_descFlexField_PubDescSeg39" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_descFlexField_PubDescSeg4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_descFlexField_PubDescSeg40" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_descFlexField_PubDescSeg41" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_descFlexField_PubDescSeg42" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_descFlexField_PubDescSeg43" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_descFlexField_PubDescSeg44" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_descFlexField_PubDescSeg45" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_descFlexField_PubDescSeg46" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_descFlexField_PubDescSeg47" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_descFlexField_PubDescSeg48" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_descFlexField_PubDescSeg49" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_descFlexField_PubDescSeg5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_descFlexField_PubDescSeg50" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_descFlexField_PubDescSeg6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_descFlexField_PubDescSeg7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_descFlexField_PubDescSeg8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_descFlexField_PubDescSeg9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_fixedMaterialNum" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="m_fixedScrap" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="m_fromDegree" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="m_fromPotency" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="m_fromQty" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="m_isATP" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="m_isCTP" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="m_isCalcPrice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="m_isCeiling" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="m_isCharge" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="m_isDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="m_isDiffentBatchCtl" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="m_isDisassembly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="m_isEffective" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="m_isExclude" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="m_isMandatory" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="m_isManuallySelect" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="m_isOptionDependent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="m_isOverIssue" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="m_isPhantomPart" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="m_isSpecialUseItem" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="m_isWholeSetIssue" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="m_issueOrg" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&gt;
 *         &lt;element name="m_issueStyle" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="m_issueUOM" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&gt;
 *         &lt;element name="m_itemMaster" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&gt;
 *         &lt;element name="m_itemVersionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_jIT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="m_leadTimeOffSet" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="m_materialType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="m_maxSelectedQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="m_minSelectedQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="m_operationNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_parentQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="m_planPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="m_projectMapNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_scrap" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="m_scrapType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="m_sequence" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="m_setChkAtComplete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="m_setChkAtOptComplete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="m_setChkAtOptStart" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="m_setChkAtWorkingStart" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="m_standardMaterialScale" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="m_subPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="m_subSeq" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="m_subcontractItemSrc" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="m_substituteStyle" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="m_supplyBin" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&gt;
 *         &lt;element name="m_supplyStyle" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="m_supplyWareHouse" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&gt;
 *         &lt;element name="m_timeUOM" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&gt;
 *         &lt;element name="m_toDegree" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="m_toPotency" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="m_toQty" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="m_usageQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="m_usageQtyType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UFIDA.U9.ISV.MFG.BOM.BOMComponentDTO4CreateSvData", propOrder = {
    "mbomCompPositions",
    "mbomCompScalarScraps",
    "mbomCompSubstituteDTO4CreateSv",
    "mbomCompSuppliers",
    "mbomComponentChangeDTOList",
    "mbomComponentLots",
    "mbomMasterDTO4CreateSv",
    "mCompProject",
    "mComponentType",
    "mConsignProcessItemSrc",
    "mCostElement",
    "mCostPercent",
    "mDescFlexField",
    "mDescFlexFieldPrivateDescSeg1",
    "mDescFlexFieldPrivateDescSeg10",
    "mDescFlexFieldPrivateDescSeg11",
    "mDescFlexFieldPrivateDescSeg12",
    "mDescFlexFieldPrivateDescSeg13",
    "mDescFlexFieldPrivateDescSeg14",
    "mDescFlexFieldPrivateDescSeg15",
    "mDescFlexFieldPrivateDescSeg16",
    "mDescFlexFieldPrivateDescSeg17",
    "mDescFlexFieldPrivateDescSeg18",
    "mDescFlexFieldPrivateDescSeg19",
    "mDescFlexFieldPrivateDescSeg2",
    "mDescFlexFieldPrivateDescSeg20",
    "mDescFlexFieldPrivateDescSeg21",
    "mDescFlexFieldPrivateDescSeg22",
    "mDescFlexFieldPrivateDescSeg23",
    "mDescFlexFieldPrivateDescSeg24",
    "mDescFlexFieldPrivateDescSeg25",
    "mDescFlexFieldPrivateDescSeg26",
    "mDescFlexFieldPrivateDescSeg27",
    "mDescFlexFieldPrivateDescSeg28",
    "mDescFlexFieldPrivateDescSeg29",
    "mDescFlexFieldPrivateDescSeg3",
    "mDescFlexFieldPrivateDescSeg30",
    "mDescFlexFieldPrivateDescSeg4",
    "mDescFlexFieldPrivateDescSeg5",
    "mDescFlexFieldPrivateDescSeg6",
    "mDescFlexFieldPrivateDescSeg7",
    "mDescFlexFieldPrivateDescSeg8",
    "mDescFlexFieldPrivateDescSeg9",
    "mDescFlexFieldPubDescSeg1",
    "mDescFlexFieldPubDescSeg10",
    "mDescFlexFieldPubDescSeg11",
    "mDescFlexFieldPubDescSeg12",
    "mDescFlexFieldPubDescSeg13",
    "mDescFlexFieldPubDescSeg14",
    "mDescFlexFieldPubDescSeg15",
    "mDescFlexFieldPubDescSeg16",
    "mDescFlexFieldPubDescSeg17",
    "mDescFlexFieldPubDescSeg18",
    "mDescFlexFieldPubDescSeg19",
    "mDescFlexFieldPubDescSeg2",
    "mDescFlexFieldPubDescSeg20",
    "mDescFlexFieldPubDescSeg21",
    "mDescFlexFieldPubDescSeg22",
    "mDescFlexFieldPubDescSeg23",
    "mDescFlexFieldPubDescSeg24",
    "mDescFlexFieldPubDescSeg25",
    "mDescFlexFieldPubDescSeg26",
    "mDescFlexFieldPubDescSeg27",
    "mDescFlexFieldPubDescSeg28",
    "mDescFlexFieldPubDescSeg29",
    "mDescFlexFieldPubDescSeg3",
    "mDescFlexFieldPubDescSeg30",
    "mDescFlexFieldPubDescSeg31",
    "mDescFlexFieldPubDescSeg32",
    "mDescFlexFieldPubDescSeg33",
    "mDescFlexFieldPubDescSeg34",
    "mDescFlexFieldPubDescSeg35",
    "mDescFlexFieldPubDescSeg36",
    "mDescFlexFieldPubDescSeg37",
    "mDescFlexFieldPubDescSeg38",
    "mDescFlexFieldPubDescSeg39",
    "mDescFlexFieldPubDescSeg4",
    "mDescFlexFieldPubDescSeg40",
    "mDescFlexFieldPubDescSeg41",
    "mDescFlexFieldPubDescSeg42",
    "mDescFlexFieldPubDescSeg43",
    "mDescFlexFieldPubDescSeg44",
    "mDescFlexFieldPubDescSeg45",
    "mDescFlexFieldPubDescSeg46",
    "mDescFlexFieldPubDescSeg47",
    "mDescFlexFieldPubDescSeg48",
    "mDescFlexFieldPubDescSeg49",
    "mDescFlexFieldPubDescSeg5",
    "mDescFlexFieldPubDescSeg50",
    "mDescFlexFieldPubDescSeg6",
    "mDescFlexFieldPubDescSeg7",
    "mDescFlexFieldPubDescSeg8",
    "mDescFlexFieldPubDescSeg9",
    "mFixedMaterialNum",
    "mFixedScrap",
    "mFromDegree",
    "mFromPotency",
    "mFromQty",
    "mIsATP",
    "mIsCTP",
    "mIsCalcPrice",
    "mIsCeiling",
    "mIsCharge",
    "mIsDefault",
    "mIsDiffentBatchCtl",
    "mIsDisassembly",
    "mIsEffective",
    "mIsExclude",
    "mIsMandatory",
    "mIsManuallySelect",
    "mIsOptionDependent",
    "mIsOverIssue",
    "mIsPhantomPart",
    "mIsSpecialUseItem",
    "mIsWholeSetIssue",
    "mIssueOrg",
    "mIssueStyle",
    "mIssueUOM",
    "mItemMaster",
    "mItemVersionCode",
    "mjit",
    "mLeadTimeOffSet",
    "mMaterialType",
    "mMaxSelectedQty",
    "mMinSelectedQty",
    "mOperationNum",
    "mParentQty",
    "mPlanPercent",
    "mProjectMapNum",
    "mRemark",
    "mScrap",
    "mScrapType",
    "mSequence",
    "mSetChkAtComplete",
    "mSetChkAtOptComplete",
    "mSetChkAtOptStart",
    "mSetChkAtWorkingStart",
    "mStandardMaterialScale",
    "mSubPercent",
    "mSubSeq",
    "mSubcontractItemSrc",
    "mSubstituteStyle",
    "mSupplyBin",
    "mSupplyStyle",
    "mSupplyWareHouse",
    "mTimeUOM",
    "mToDegree",
    "mToPotency",
    "mToQty",
    "mUsageQty",
    "mUsageQtyType"
})
public class UFIDAU9ISVMFGBOMBOMComponentDTO4CreateSvData
    extends UFSoftUBFBusinessDataTransObjectBase
{

    @XmlElementRef(name = "m_bOMCompPositions", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9ISVMFGBOMBOMCompPositionDTO4CreateSvData> mbomCompPositions;
    @XmlElementRef(name = "m_bOMCompScalarScraps", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9ISVMFGBOMBOMCompScalarScrapDTO4CreateSvData> mbomCompScalarScraps;
    @XmlElementRef(name = "m_bOMCompSubstituteDTO4CreateSv", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9ISVMFGBOMBOMComponentDTO4CreateSvData> mbomCompSubstituteDTO4CreateSv;
    @XmlElementRef(name = "m_bOMCompSuppliers", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9ISVMFGBOMBOMCompSupplierDTO4CreateSvData> mbomCompSuppliers;
    @XmlElementRef(name = "m_bOMComponentChangeDTOList", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9ISVMFGBOMCommonChgDTOData> mbomComponentChangeDTOList;
    @XmlElementRef(name = "m_bOMComponentLots", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9ISVMFGBOMBOMComponentLotDTO4CreateSvData> mbomComponentLots;
    @XmlElementRef(name = "m_bOMMasterDTO4CreateSv", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9ISVMFGBOMBOMMasterDTO4CreateSvData> mbomMasterDTO4CreateSv;
    @XmlElementRef(name = "m_compProject", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mCompProject;
    @XmlElement(name = "m_componentType")
    protected Integer mComponentType;
    @XmlElement(name = "m_consignProcessItemSrc")
    protected Integer mConsignProcessItemSrc;
    @XmlElementRef(name = "m_costElement", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mCostElement;
    @XmlElement(name = "m_costPercent")
    protected BigDecimal mCostPercent;
    @XmlElementRef(name = "m_descFlexField", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9BaseFlexFieldDescFlexFieldDescFlexSegmentsData> mDescFlexField;
    @XmlElementRef(name = "m_descFlexField_PrivateDescSeg1", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDescFlexFieldPrivateDescSeg1;
    @XmlElementRef(name = "m_descFlexField_PrivateDescSeg10", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDescFlexFieldPrivateDescSeg10;
    @XmlElementRef(name = "m_descFlexField_PrivateDescSeg11", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDescFlexFieldPrivateDescSeg11;
    @XmlElementRef(name = "m_descFlexField_PrivateDescSeg12", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDescFlexFieldPrivateDescSeg12;
    @XmlElementRef(name = "m_descFlexField_PrivateDescSeg13", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDescFlexFieldPrivateDescSeg13;
    @XmlElementRef(name = "m_descFlexField_PrivateDescSeg14", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDescFlexFieldPrivateDescSeg14;
    @XmlElementRef(name = "m_descFlexField_PrivateDescSeg15", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDescFlexFieldPrivateDescSeg15;
    @XmlElementRef(name = "m_descFlexField_PrivateDescSeg16", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDescFlexFieldPrivateDescSeg16;
    @XmlElementRef(name = "m_descFlexField_PrivateDescSeg17", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDescFlexFieldPrivateDescSeg17;
    @XmlElementRef(name = "m_descFlexField_PrivateDescSeg18", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDescFlexFieldPrivateDescSeg18;
    @XmlElementRef(name = "m_descFlexField_PrivateDescSeg19", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDescFlexFieldPrivateDescSeg19;
    @XmlElementRef(name = "m_descFlexField_PrivateDescSeg2", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDescFlexFieldPrivateDescSeg2;
    @XmlElementRef(name = "m_descFlexField_PrivateDescSeg20", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDescFlexFieldPrivateDescSeg20;
    @XmlElementRef(name = "m_descFlexField_PrivateDescSeg21", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDescFlexFieldPrivateDescSeg21;
    @XmlElementRef(name = "m_descFlexField_PrivateDescSeg22", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDescFlexFieldPrivateDescSeg22;
    @XmlElementRef(name = "m_descFlexField_PrivateDescSeg23", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDescFlexFieldPrivateDescSeg23;
    @XmlElementRef(name = "m_descFlexField_PrivateDescSeg24", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDescFlexFieldPrivateDescSeg24;
    @XmlElementRef(name = "m_descFlexField_PrivateDescSeg25", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDescFlexFieldPrivateDescSeg25;
    @XmlElementRef(name = "m_descFlexField_PrivateDescSeg26", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDescFlexFieldPrivateDescSeg26;
    @XmlElementRef(name = "m_descFlexField_PrivateDescSeg27", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDescFlexFieldPrivateDescSeg27;
    @XmlElementRef(name = "m_descFlexField_PrivateDescSeg28", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDescFlexFieldPrivateDescSeg28;
    @XmlElementRef(name = "m_descFlexField_PrivateDescSeg29", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDescFlexFieldPrivateDescSeg29;
    @XmlElementRef(name = "m_descFlexField_PrivateDescSeg3", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDescFlexFieldPrivateDescSeg3;
    @XmlElementRef(name = "m_descFlexField_PrivateDescSeg30", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDescFlexFieldPrivateDescSeg30;
    @XmlElementRef(name = "m_descFlexField_PrivateDescSeg4", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDescFlexFieldPrivateDescSeg4;
    @XmlElementRef(name = "m_descFlexField_PrivateDescSeg5", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDescFlexFieldPrivateDescSeg5;
    @XmlElementRef(name = "m_descFlexField_PrivateDescSeg6", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDescFlexFieldPrivateDescSeg6;
    @XmlElementRef(name = "m_descFlexField_PrivateDescSeg7", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDescFlexFieldPrivateDescSeg7;
    @XmlElementRef(name = "m_descFlexField_PrivateDescSeg8", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDescFlexFieldPrivateDescSeg8;
    @XmlElementRef(name = "m_descFlexField_PrivateDescSeg9", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDescFlexFieldPrivateDescSeg9;
    @XmlElementRef(name = "m_descFlexField_PubDescSeg1", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDescFlexFieldPubDescSeg1;
    @XmlElementRef(name = "m_descFlexField_PubDescSeg10", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDescFlexFieldPubDescSeg10;
    @XmlElementRef(name = "m_descFlexField_PubDescSeg11", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDescFlexFieldPubDescSeg11;
    @XmlElementRef(name = "m_descFlexField_PubDescSeg12", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDescFlexFieldPubDescSeg12;
    @XmlElementRef(name = "m_descFlexField_PubDescSeg13", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDescFlexFieldPubDescSeg13;
    @XmlElementRef(name = "m_descFlexField_PubDescSeg14", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDescFlexFieldPubDescSeg14;
    @XmlElementRef(name = "m_descFlexField_PubDescSeg15", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDescFlexFieldPubDescSeg15;
    @XmlElementRef(name = "m_descFlexField_PubDescSeg16", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDescFlexFieldPubDescSeg16;
    @XmlElementRef(name = "m_descFlexField_PubDescSeg17", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDescFlexFieldPubDescSeg17;
    @XmlElementRef(name = "m_descFlexField_PubDescSeg18", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDescFlexFieldPubDescSeg18;
    @XmlElementRef(name = "m_descFlexField_PubDescSeg19", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDescFlexFieldPubDescSeg19;
    @XmlElementRef(name = "m_descFlexField_PubDescSeg2", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDescFlexFieldPubDescSeg2;
    @XmlElementRef(name = "m_descFlexField_PubDescSeg20", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDescFlexFieldPubDescSeg20;
    @XmlElementRef(name = "m_descFlexField_PubDescSeg21", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDescFlexFieldPubDescSeg21;
    @XmlElementRef(name = "m_descFlexField_PubDescSeg22", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDescFlexFieldPubDescSeg22;
    @XmlElementRef(name = "m_descFlexField_PubDescSeg23", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDescFlexFieldPubDescSeg23;
    @XmlElementRef(name = "m_descFlexField_PubDescSeg24", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDescFlexFieldPubDescSeg24;
    @XmlElementRef(name = "m_descFlexField_PubDescSeg25", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDescFlexFieldPubDescSeg25;
    @XmlElementRef(name = "m_descFlexField_PubDescSeg26", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDescFlexFieldPubDescSeg26;
    @XmlElementRef(name = "m_descFlexField_PubDescSeg27", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDescFlexFieldPubDescSeg27;
    @XmlElementRef(name = "m_descFlexField_PubDescSeg28", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDescFlexFieldPubDescSeg28;
    @XmlElementRef(name = "m_descFlexField_PubDescSeg29", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDescFlexFieldPubDescSeg29;
    @XmlElementRef(name = "m_descFlexField_PubDescSeg3", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDescFlexFieldPubDescSeg3;
    @XmlElementRef(name = "m_descFlexField_PubDescSeg30", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDescFlexFieldPubDescSeg30;
    @XmlElementRef(name = "m_descFlexField_PubDescSeg31", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDescFlexFieldPubDescSeg31;
    @XmlElementRef(name = "m_descFlexField_PubDescSeg32", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDescFlexFieldPubDescSeg32;
    @XmlElementRef(name = "m_descFlexField_PubDescSeg33", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDescFlexFieldPubDescSeg33;
    @XmlElementRef(name = "m_descFlexField_PubDescSeg34", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDescFlexFieldPubDescSeg34;
    @XmlElementRef(name = "m_descFlexField_PubDescSeg35", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDescFlexFieldPubDescSeg35;
    @XmlElementRef(name = "m_descFlexField_PubDescSeg36", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDescFlexFieldPubDescSeg36;
    @XmlElementRef(name = "m_descFlexField_PubDescSeg37", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDescFlexFieldPubDescSeg37;
    @XmlElementRef(name = "m_descFlexField_PubDescSeg38", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDescFlexFieldPubDescSeg38;
    @XmlElementRef(name = "m_descFlexField_PubDescSeg39", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDescFlexFieldPubDescSeg39;
    @XmlElementRef(name = "m_descFlexField_PubDescSeg4", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDescFlexFieldPubDescSeg4;
    @XmlElementRef(name = "m_descFlexField_PubDescSeg40", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDescFlexFieldPubDescSeg40;
    @XmlElementRef(name = "m_descFlexField_PubDescSeg41", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDescFlexFieldPubDescSeg41;
    @XmlElementRef(name = "m_descFlexField_PubDescSeg42", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDescFlexFieldPubDescSeg42;
    @XmlElementRef(name = "m_descFlexField_PubDescSeg43", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDescFlexFieldPubDescSeg43;
    @XmlElementRef(name = "m_descFlexField_PubDescSeg44", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDescFlexFieldPubDescSeg44;
    @XmlElementRef(name = "m_descFlexField_PubDescSeg45", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDescFlexFieldPubDescSeg45;
    @XmlElementRef(name = "m_descFlexField_PubDescSeg46", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDescFlexFieldPubDescSeg46;
    @XmlElementRef(name = "m_descFlexField_PubDescSeg47", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDescFlexFieldPubDescSeg47;
    @XmlElementRef(name = "m_descFlexField_PubDescSeg48", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDescFlexFieldPubDescSeg48;
    @XmlElementRef(name = "m_descFlexField_PubDescSeg49", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDescFlexFieldPubDescSeg49;
    @XmlElementRef(name = "m_descFlexField_PubDescSeg5", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDescFlexFieldPubDescSeg5;
    @XmlElementRef(name = "m_descFlexField_PubDescSeg50", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDescFlexFieldPubDescSeg50;
    @XmlElementRef(name = "m_descFlexField_PubDescSeg6", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDescFlexFieldPubDescSeg6;
    @XmlElementRef(name = "m_descFlexField_PubDescSeg7", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDescFlexFieldPubDescSeg7;
    @XmlElementRef(name = "m_descFlexField_PubDescSeg8", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDescFlexFieldPubDescSeg8;
    @XmlElementRef(name = "m_descFlexField_PubDescSeg9", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDescFlexFieldPubDescSeg9;
    @XmlElement(name = "m_fixedMaterialNum")
    protected BigDecimal mFixedMaterialNum;
    @XmlElement(name = "m_fixedScrap")
    protected BigDecimal mFixedScrap;
    @XmlElement(name = "m_fromDegree")
    protected Integer mFromDegree;
    @XmlElement(name = "m_fromPotency")
    protected Integer mFromPotency;
    @XmlElement(name = "m_fromQty")
    protected Integer mFromQty;
    @XmlElement(name = "m_isATP")
    protected Boolean mIsATP;
    @XmlElement(name = "m_isCTP")
    protected Boolean mIsCTP;
    @XmlElement(name = "m_isCalcPrice")
    protected Boolean mIsCalcPrice;
    @XmlElement(name = "m_isCeiling")
    protected Boolean mIsCeiling;
    @XmlElement(name = "m_isCharge")
    protected Boolean mIsCharge;
    @XmlElement(name = "m_isDefault")
    protected Boolean mIsDefault;
    @XmlElement(name = "m_isDiffentBatchCtl")
    protected Boolean mIsDiffentBatchCtl;
    @XmlElement(name = "m_isDisassembly")
    protected Boolean mIsDisassembly;
    @XmlElement(name = "m_isEffective")
    protected Boolean mIsEffective;
    @XmlElement(name = "m_isExclude")
    protected Boolean mIsExclude;
    @XmlElement(name = "m_isMandatory")
    protected Boolean mIsMandatory;
    @XmlElement(name = "m_isManuallySelect")
    protected Boolean mIsManuallySelect;
    @XmlElement(name = "m_isOptionDependent")
    protected Boolean mIsOptionDependent;
    @XmlElement(name = "m_isOverIssue")
    protected Boolean mIsOverIssue;
    @XmlElement(name = "m_isPhantomPart")
    protected Boolean mIsPhantomPart;
    @XmlElement(name = "m_isSpecialUseItem")
    protected Boolean mIsSpecialUseItem;
    @XmlElement(name = "m_isWholeSetIssue")
    protected Boolean mIsWholeSetIssue;
    @XmlElementRef(name = "m_issueOrg", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mIssueOrg;
    @XmlElement(name = "m_issueStyle")
    protected Integer mIssueStyle;
    @XmlElementRef(name = "m_issueUOM", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mIssueUOM;
    @XmlElementRef(name = "m_itemMaster", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mItemMaster;
    @XmlElementRef(name = "m_itemVersionCode", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mItemVersionCode;
    @XmlElement(name = "m_jIT")
    protected Boolean mjit;
    @XmlElement(name = "m_leadTimeOffSet")
    protected BigDecimal mLeadTimeOffSet;
    @XmlElement(name = "m_materialType")
    protected Integer mMaterialType;
    @XmlElement(name = "m_maxSelectedQty")
    protected BigDecimal mMaxSelectedQty;
    @XmlElement(name = "m_minSelectedQty")
    protected BigDecimal mMinSelectedQty;
    @XmlElementRef(name = "m_operationNum", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mOperationNum;
    @XmlElement(name = "m_parentQty")
    protected BigDecimal mParentQty;
    @XmlElement(name = "m_planPercent")
    protected BigDecimal mPlanPercent;
    @XmlElementRef(name = "m_projectMapNum", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mProjectMapNum;
    @XmlElementRef(name = "m_remark", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mRemark;
    @XmlElement(name = "m_scrap")
    protected BigDecimal mScrap;
    @XmlElement(name = "m_scrapType")
    protected Integer mScrapType;
    @XmlElement(name = "m_sequence")
    protected Integer mSequence;
    @XmlElement(name = "m_setChkAtComplete")
    protected Boolean mSetChkAtComplete;
    @XmlElement(name = "m_setChkAtOptComplete")
    protected Boolean mSetChkAtOptComplete;
    @XmlElement(name = "m_setChkAtOptStart")
    protected Boolean mSetChkAtOptStart;
    @XmlElement(name = "m_setChkAtWorkingStart")
    protected Boolean mSetChkAtWorkingStart;
    @XmlElement(name = "m_standardMaterialScale")
    protected BigDecimal mStandardMaterialScale;
    @XmlElement(name = "m_subPercent")
    protected BigDecimal mSubPercent;
    @XmlElement(name = "m_subSeq")
    protected Integer mSubSeq;
    @XmlElement(name = "m_subcontractItemSrc")
    protected Integer mSubcontractItemSrc;
    @XmlElement(name = "m_substituteStyle")
    protected Integer mSubstituteStyle;
    @XmlElementRef(name = "m_supplyBin", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mSupplyBin;
    @XmlElement(name = "m_supplyStyle")
    protected Integer mSupplyStyle;
    @XmlElementRef(name = "m_supplyWareHouse", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mSupplyWareHouse;
    @XmlElementRef(name = "m_timeUOM", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mTimeUOM;
    @XmlElement(name = "m_toDegree")
    protected Integer mToDegree;
    @XmlElement(name = "m_toPotency")
    protected Integer mToPotency;
    @XmlElement(name = "m_toQty")
    protected Integer mToQty;
    @XmlElement(name = "m_usageQty")
    protected BigDecimal mUsageQty;
    @XmlElement(name = "m_usageQtyType")
    protected Integer mUsageQtyType;

    /**
     * 获取mbomCompPositions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVMFGBOMBOMCompPositionDTO4CreateSvData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9ISVMFGBOMBOMCompPositionDTO4CreateSvData> getMBOMCompPositions() {
        return mbomCompPositions;
    }

    /**
     * 设置mbomCompPositions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVMFGBOMBOMCompPositionDTO4CreateSvData }{@code >}
     *     
     */
    public void setMBOMCompPositions(JAXBElement<ArrayOfUFIDAU9ISVMFGBOMBOMCompPositionDTO4CreateSvData> value) {
        this.mbomCompPositions = value;
    }

    /**
     * 获取mbomCompScalarScraps属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVMFGBOMBOMCompScalarScrapDTO4CreateSvData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9ISVMFGBOMBOMCompScalarScrapDTO4CreateSvData> getMBOMCompScalarScraps() {
        return mbomCompScalarScraps;
    }

    /**
     * 设置mbomCompScalarScraps属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVMFGBOMBOMCompScalarScrapDTO4CreateSvData }{@code >}
     *     
     */
    public void setMBOMCompScalarScraps(JAXBElement<ArrayOfUFIDAU9ISVMFGBOMBOMCompScalarScrapDTO4CreateSvData> value) {
        this.mbomCompScalarScraps = value;
    }

    /**
     * 获取mbomCompSubstituteDTO4CreateSv属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVMFGBOMBOMComponentDTO4CreateSvData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9ISVMFGBOMBOMComponentDTO4CreateSvData> getMBOMCompSubstituteDTO4CreateSv() {
        return mbomCompSubstituteDTO4CreateSv;
    }

    /**
     * 设置mbomCompSubstituteDTO4CreateSv属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVMFGBOMBOMComponentDTO4CreateSvData }{@code >}
     *     
     */
    public void setMBOMCompSubstituteDTO4CreateSv(JAXBElement<ArrayOfUFIDAU9ISVMFGBOMBOMComponentDTO4CreateSvData> value) {
        this.mbomCompSubstituteDTO4CreateSv = value;
    }

    /**
     * 获取mbomCompSuppliers属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVMFGBOMBOMCompSupplierDTO4CreateSvData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9ISVMFGBOMBOMCompSupplierDTO4CreateSvData> getMBOMCompSuppliers() {
        return mbomCompSuppliers;
    }

    /**
     * 设置mbomCompSuppliers属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVMFGBOMBOMCompSupplierDTO4CreateSvData }{@code >}
     *     
     */
    public void setMBOMCompSuppliers(JAXBElement<ArrayOfUFIDAU9ISVMFGBOMBOMCompSupplierDTO4CreateSvData> value) {
        this.mbomCompSuppliers = value;
    }

    /**
     * 获取mbomComponentChangeDTOList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVMFGBOMCommonChgDTOData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9ISVMFGBOMCommonChgDTOData> getMBOMComponentChangeDTOList() {
        return mbomComponentChangeDTOList;
    }

    /**
     * 设置mbomComponentChangeDTOList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVMFGBOMCommonChgDTOData }{@code >}
     *     
     */
    public void setMBOMComponentChangeDTOList(JAXBElement<ArrayOfUFIDAU9ISVMFGBOMCommonChgDTOData> value) {
        this.mbomComponentChangeDTOList = value;
    }

    /**
     * 获取mbomComponentLots属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVMFGBOMBOMComponentLotDTO4CreateSvData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9ISVMFGBOMBOMComponentLotDTO4CreateSvData> getMBOMComponentLots() {
        return mbomComponentLots;
    }

    /**
     * 设置mbomComponentLots属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVMFGBOMBOMComponentLotDTO4CreateSvData }{@code >}
     *     
     */
    public void setMBOMComponentLots(JAXBElement<ArrayOfUFIDAU9ISVMFGBOMBOMComponentLotDTO4CreateSvData> value) {
        this.mbomComponentLots = value;
    }

    /**
     * 获取mbomMasterDTO4CreateSv属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9ISVMFGBOMBOMMasterDTO4CreateSvData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9ISVMFGBOMBOMMasterDTO4CreateSvData> getMBOMMasterDTO4CreateSv() {
        return mbomMasterDTO4CreateSv;
    }

    /**
     * 设置mbomMasterDTO4CreateSv属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9ISVMFGBOMBOMMasterDTO4CreateSvData }{@code >}
     *     
     */
    public void setMBOMMasterDTO4CreateSv(JAXBElement<UFIDAU9ISVMFGBOMBOMMasterDTO4CreateSvData> value) {
        this.mbomMasterDTO4CreateSv = value;
    }

    /**
     * 获取mCompProject属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMCompProject() {
        return mCompProject;
    }

    /**
     * 设置mCompProject属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMCompProject(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mCompProject = value;
    }

    /**
     * 获取mComponentType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMComponentType() {
        return mComponentType;
    }

    /**
     * 设置mComponentType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMComponentType(Integer value) {
        this.mComponentType = value;
    }

    /**
     * 获取mConsignProcessItemSrc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMConsignProcessItemSrc() {
        return mConsignProcessItemSrc;
    }

    /**
     * 设置mConsignProcessItemSrc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMConsignProcessItemSrc(Integer value) {
        this.mConsignProcessItemSrc = value;
    }

    /**
     * 获取mCostElement属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMCostElement() {
        return mCostElement;
    }

    /**
     * 设置mCostElement属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMCostElement(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mCostElement = value;
    }

    /**
     * 获取mCostPercent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMCostPercent() {
        return mCostPercent;
    }

    /**
     * 设置mCostPercent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMCostPercent(BigDecimal value) {
        this.mCostPercent = value;
    }

    /**
     * 获取mDescFlexField属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9BaseFlexFieldDescFlexFieldDescFlexSegmentsData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9BaseFlexFieldDescFlexFieldDescFlexSegmentsData> getMDescFlexField() {
        return mDescFlexField;
    }

    /**
     * 设置mDescFlexField属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9BaseFlexFieldDescFlexFieldDescFlexSegmentsData }{@code >}
     *     
     */
    public void setMDescFlexField(JAXBElement<UFIDAU9BaseFlexFieldDescFlexFieldDescFlexSegmentsData> value) {
        this.mDescFlexField = value;
    }

    /**
     * 获取mDescFlexFieldPrivateDescSeg1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDescFlexFieldPrivateDescSeg1() {
        return mDescFlexFieldPrivateDescSeg1;
    }

    /**
     * 设置mDescFlexFieldPrivateDescSeg1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDescFlexFieldPrivateDescSeg1(JAXBElement<String> value) {
        this.mDescFlexFieldPrivateDescSeg1 = value;
    }

    /**
     * 获取mDescFlexFieldPrivateDescSeg10属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDescFlexFieldPrivateDescSeg10() {
        return mDescFlexFieldPrivateDescSeg10;
    }

    /**
     * 设置mDescFlexFieldPrivateDescSeg10属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDescFlexFieldPrivateDescSeg10(JAXBElement<String> value) {
        this.mDescFlexFieldPrivateDescSeg10 = value;
    }

    /**
     * 获取mDescFlexFieldPrivateDescSeg11属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDescFlexFieldPrivateDescSeg11() {
        return mDescFlexFieldPrivateDescSeg11;
    }

    /**
     * 设置mDescFlexFieldPrivateDescSeg11属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDescFlexFieldPrivateDescSeg11(JAXBElement<String> value) {
        this.mDescFlexFieldPrivateDescSeg11 = value;
    }

    /**
     * 获取mDescFlexFieldPrivateDescSeg12属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDescFlexFieldPrivateDescSeg12() {
        return mDescFlexFieldPrivateDescSeg12;
    }

    /**
     * 设置mDescFlexFieldPrivateDescSeg12属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDescFlexFieldPrivateDescSeg12(JAXBElement<String> value) {
        this.mDescFlexFieldPrivateDescSeg12 = value;
    }

    /**
     * 获取mDescFlexFieldPrivateDescSeg13属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDescFlexFieldPrivateDescSeg13() {
        return mDescFlexFieldPrivateDescSeg13;
    }

    /**
     * 设置mDescFlexFieldPrivateDescSeg13属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDescFlexFieldPrivateDescSeg13(JAXBElement<String> value) {
        this.mDescFlexFieldPrivateDescSeg13 = value;
    }

    /**
     * 获取mDescFlexFieldPrivateDescSeg14属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDescFlexFieldPrivateDescSeg14() {
        return mDescFlexFieldPrivateDescSeg14;
    }

    /**
     * 设置mDescFlexFieldPrivateDescSeg14属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDescFlexFieldPrivateDescSeg14(JAXBElement<String> value) {
        this.mDescFlexFieldPrivateDescSeg14 = value;
    }

    /**
     * 获取mDescFlexFieldPrivateDescSeg15属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDescFlexFieldPrivateDescSeg15() {
        return mDescFlexFieldPrivateDescSeg15;
    }

    /**
     * 设置mDescFlexFieldPrivateDescSeg15属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDescFlexFieldPrivateDescSeg15(JAXBElement<String> value) {
        this.mDescFlexFieldPrivateDescSeg15 = value;
    }

    /**
     * 获取mDescFlexFieldPrivateDescSeg16属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDescFlexFieldPrivateDescSeg16() {
        return mDescFlexFieldPrivateDescSeg16;
    }

    /**
     * 设置mDescFlexFieldPrivateDescSeg16属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDescFlexFieldPrivateDescSeg16(JAXBElement<String> value) {
        this.mDescFlexFieldPrivateDescSeg16 = value;
    }

    /**
     * 获取mDescFlexFieldPrivateDescSeg17属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDescFlexFieldPrivateDescSeg17() {
        return mDescFlexFieldPrivateDescSeg17;
    }

    /**
     * 设置mDescFlexFieldPrivateDescSeg17属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDescFlexFieldPrivateDescSeg17(JAXBElement<String> value) {
        this.mDescFlexFieldPrivateDescSeg17 = value;
    }

    /**
     * 获取mDescFlexFieldPrivateDescSeg18属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDescFlexFieldPrivateDescSeg18() {
        return mDescFlexFieldPrivateDescSeg18;
    }

    /**
     * 设置mDescFlexFieldPrivateDescSeg18属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDescFlexFieldPrivateDescSeg18(JAXBElement<String> value) {
        this.mDescFlexFieldPrivateDescSeg18 = value;
    }

    /**
     * 获取mDescFlexFieldPrivateDescSeg19属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDescFlexFieldPrivateDescSeg19() {
        return mDescFlexFieldPrivateDescSeg19;
    }

    /**
     * 设置mDescFlexFieldPrivateDescSeg19属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDescFlexFieldPrivateDescSeg19(JAXBElement<String> value) {
        this.mDescFlexFieldPrivateDescSeg19 = value;
    }

    /**
     * 获取mDescFlexFieldPrivateDescSeg2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDescFlexFieldPrivateDescSeg2() {
        return mDescFlexFieldPrivateDescSeg2;
    }

    /**
     * 设置mDescFlexFieldPrivateDescSeg2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDescFlexFieldPrivateDescSeg2(JAXBElement<String> value) {
        this.mDescFlexFieldPrivateDescSeg2 = value;
    }

    /**
     * 获取mDescFlexFieldPrivateDescSeg20属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDescFlexFieldPrivateDescSeg20() {
        return mDescFlexFieldPrivateDescSeg20;
    }

    /**
     * 设置mDescFlexFieldPrivateDescSeg20属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDescFlexFieldPrivateDescSeg20(JAXBElement<String> value) {
        this.mDescFlexFieldPrivateDescSeg20 = value;
    }

    /**
     * 获取mDescFlexFieldPrivateDescSeg21属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDescFlexFieldPrivateDescSeg21() {
        return mDescFlexFieldPrivateDescSeg21;
    }

    /**
     * 设置mDescFlexFieldPrivateDescSeg21属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDescFlexFieldPrivateDescSeg21(JAXBElement<String> value) {
        this.mDescFlexFieldPrivateDescSeg21 = value;
    }

    /**
     * 获取mDescFlexFieldPrivateDescSeg22属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDescFlexFieldPrivateDescSeg22() {
        return mDescFlexFieldPrivateDescSeg22;
    }

    /**
     * 设置mDescFlexFieldPrivateDescSeg22属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDescFlexFieldPrivateDescSeg22(JAXBElement<String> value) {
        this.mDescFlexFieldPrivateDescSeg22 = value;
    }

    /**
     * 获取mDescFlexFieldPrivateDescSeg23属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDescFlexFieldPrivateDescSeg23() {
        return mDescFlexFieldPrivateDescSeg23;
    }

    /**
     * 设置mDescFlexFieldPrivateDescSeg23属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDescFlexFieldPrivateDescSeg23(JAXBElement<String> value) {
        this.mDescFlexFieldPrivateDescSeg23 = value;
    }

    /**
     * 获取mDescFlexFieldPrivateDescSeg24属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDescFlexFieldPrivateDescSeg24() {
        return mDescFlexFieldPrivateDescSeg24;
    }

    /**
     * 设置mDescFlexFieldPrivateDescSeg24属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDescFlexFieldPrivateDescSeg24(JAXBElement<String> value) {
        this.mDescFlexFieldPrivateDescSeg24 = value;
    }

    /**
     * 获取mDescFlexFieldPrivateDescSeg25属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDescFlexFieldPrivateDescSeg25() {
        return mDescFlexFieldPrivateDescSeg25;
    }

    /**
     * 设置mDescFlexFieldPrivateDescSeg25属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDescFlexFieldPrivateDescSeg25(JAXBElement<String> value) {
        this.mDescFlexFieldPrivateDescSeg25 = value;
    }

    /**
     * 获取mDescFlexFieldPrivateDescSeg26属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDescFlexFieldPrivateDescSeg26() {
        return mDescFlexFieldPrivateDescSeg26;
    }

    /**
     * 设置mDescFlexFieldPrivateDescSeg26属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDescFlexFieldPrivateDescSeg26(JAXBElement<String> value) {
        this.mDescFlexFieldPrivateDescSeg26 = value;
    }

    /**
     * 获取mDescFlexFieldPrivateDescSeg27属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDescFlexFieldPrivateDescSeg27() {
        return mDescFlexFieldPrivateDescSeg27;
    }

    /**
     * 设置mDescFlexFieldPrivateDescSeg27属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDescFlexFieldPrivateDescSeg27(JAXBElement<String> value) {
        this.mDescFlexFieldPrivateDescSeg27 = value;
    }

    /**
     * 获取mDescFlexFieldPrivateDescSeg28属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDescFlexFieldPrivateDescSeg28() {
        return mDescFlexFieldPrivateDescSeg28;
    }

    /**
     * 设置mDescFlexFieldPrivateDescSeg28属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDescFlexFieldPrivateDescSeg28(JAXBElement<String> value) {
        this.mDescFlexFieldPrivateDescSeg28 = value;
    }

    /**
     * 获取mDescFlexFieldPrivateDescSeg29属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDescFlexFieldPrivateDescSeg29() {
        return mDescFlexFieldPrivateDescSeg29;
    }

    /**
     * 设置mDescFlexFieldPrivateDescSeg29属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDescFlexFieldPrivateDescSeg29(JAXBElement<String> value) {
        this.mDescFlexFieldPrivateDescSeg29 = value;
    }

    /**
     * 获取mDescFlexFieldPrivateDescSeg3属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDescFlexFieldPrivateDescSeg3() {
        return mDescFlexFieldPrivateDescSeg3;
    }

    /**
     * 设置mDescFlexFieldPrivateDescSeg3属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDescFlexFieldPrivateDescSeg3(JAXBElement<String> value) {
        this.mDescFlexFieldPrivateDescSeg3 = value;
    }

    /**
     * 获取mDescFlexFieldPrivateDescSeg30属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDescFlexFieldPrivateDescSeg30() {
        return mDescFlexFieldPrivateDescSeg30;
    }

    /**
     * 设置mDescFlexFieldPrivateDescSeg30属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDescFlexFieldPrivateDescSeg30(JAXBElement<String> value) {
        this.mDescFlexFieldPrivateDescSeg30 = value;
    }

    /**
     * 获取mDescFlexFieldPrivateDescSeg4属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDescFlexFieldPrivateDescSeg4() {
        return mDescFlexFieldPrivateDescSeg4;
    }

    /**
     * 设置mDescFlexFieldPrivateDescSeg4属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDescFlexFieldPrivateDescSeg4(JAXBElement<String> value) {
        this.mDescFlexFieldPrivateDescSeg4 = value;
    }

    /**
     * 获取mDescFlexFieldPrivateDescSeg5属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDescFlexFieldPrivateDescSeg5() {
        return mDescFlexFieldPrivateDescSeg5;
    }

    /**
     * 设置mDescFlexFieldPrivateDescSeg5属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDescFlexFieldPrivateDescSeg5(JAXBElement<String> value) {
        this.mDescFlexFieldPrivateDescSeg5 = value;
    }

    /**
     * 获取mDescFlexFieldPrivateDescSeg6属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDescFlexFieldPrivateDescSeg6() {
        return mDescFlexFieldPrivateDescSeg6;
    }

    /**
     * 设置mDescFlexFieldPrivateDescSeg6属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDescFlexFieldPrivateDescSeg6(JAXBElement<String> value) {
        this.mDescFlexFieldPrivateDescSeg6 = value;
    }

    /**
     * 获取mDescFlexFieldPrivateDescSeg7属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDescFlexFieldPrivateDescSeg7() {
        return mDescFlexFieldPrivateDescSeg7;
    }

    /**
     * 设置mDescFlexFieldPrivateDescSeg7属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDescFlexFieldPrivateDescSeg7(JAXBElement<String> value) {
        this.mDescFlexFieldPrivateDescSeg7 = value;
    }

    /**
     * 获取mDescFlexFieldPrivateDescSeg8属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDescFlexFieldPrivateDescSeg8() {
        return mDescFlexFieldPrivateDescSeg8;
    }

    /**
     * 设置mDescFlexFieldPrivateDescSeg8属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDescFlexFieldPrivateDescSeg8(JAXBElement<String> value) {
        this.mDescFlexFieldPrivateDescSeg8 = value;
    }

    /**
     * 获取mDescFlexFieldPrivateDescSeg9属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDescFlexFieldPrivateDescSeg9() {
        return mDescFlexFieldPrivateDescSeg9;
    }

    /**
     * 设置mDescFlexFieldPrivateDescSeg9属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDescFlexFieldPrivateDescSeg9(JAXBElement<String> value) {
        this.mDescFlexFieldPrivateDescSeg9 = value;
    }

    /**
     * 获取mDescFlexFieldPubDescSeg1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDescFlexFieldPubDescSeg1() {
        return mDescFlexFieldPubDescSeg1;
    }

    /**
     * 设置mDescFlexFieldPubDescSeg1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDescFlexFieldPubDescSeg1(JAXBElement<String> value) {
        this.mDescFlexFieldPubDescSeg1 = value;
    }

    /**
     * 获取mDescFlexFieldPubDescSeg10属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDescFlexFieldPubDescSeg10() {
        return mDescFlexFieldPubDescSeg10;
    }

    /**
     * 设置mDescFlexFieldPubDescSeg10属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDescFlexFieldPubDescSeg10(JAXBElement<String> value) {
        this.mDescFlexFieldPubDescSeg10 = value;
    }

    /**
     * 获取mDescFlexFieldPubDescSeg11属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDescFlexFieldPubDescSeg11() {
        return mDescFlexFieldPubDescSeg11;
    }

    /**
     * 设置mDescFlexFieldPubDescSeg11属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDescFlexFieldPubDescSeg11(JAXBElement<String> value) {
        this.mDescFlexFieldPubDescSeg11 = value;
    }

    /**
     * 获取mDescFlexFieldPubDescSeg12属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDescFlexFieldPubDescSeg12() {
        return mDescFlexFieldPubDescSeg12;
    }

    /**
     * 设置mDescFlexFieldPubDescSeg12属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDescFlexFieldPubDescSeg12(JAXBElement<String> value) {
        this.mDescFlexFieldPubDescSeg12 = value;
    }

    /**
     * 获取mDescFlexFieldPubDescSeg13属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDescFlexFieldPubDescSeg13() {
        return mDescFlexFieldPubDescSeg13;
    }

    /**
     * 设置mDescFlexFieldPubDescSeg13属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDescFlexFieldPubDescSeg13(JAXBElement<String> value) {
        this.mDescFlexFieldPubDescSeg13 = value;
    }

    /**
     * 获取mDescFlexFieldPubDescSeg14属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDescFlexFieldPubDescSeg14() {
        return mDescFlexFieldPubDescSeg14;
    }

    /**
     * 设置mDescFlexFieldPubDescSeg14属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDescFlexFieldPubDescSeg14(JAXBElement<String> value) {
        this.mDescFlexFieldPubDescSeg14 = value;
    }

    /**
     * 获取mDescFlexFieldPubDescSeg15属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDescFlexFieldPubDescSeg15() {
        return mDescFlexFieldPubDescSeg15;
    }

    /**
     * 设置mDescFlexFieldPubDescSeg15属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDescFlexFieldPubDescSeg15(JAXBElement<String> value) {
        this.mDescFlexFieldPubDescSeg15 = value;
    }

    /**
     * 获取mDescFlexFieldPubDescSeg16属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDescFlexFieldPubDescSeg16() {
        return mDescFlexFieldPubDescSeg16;
    }

    /**
     * 设置mDescFlexFieldPubDescSeg16属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDescFlexFieldPubDescSeg16(JAXBElement<String> value) {
        this.mDescFlexFieldPubDescSeg16 = value;
    }

    /**
     * 获取mDescFlexFieldPubDescSeg17属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDescFlexFieldPubDescSeg17() {
        return mDescFlexFieldPubDescSeg17;
    }

    /**
     * 设置mDescFlexFieldPubDescSeg17属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDescFlexFieldPubDescSeg17(JAXBElement<String> value) {
        this.mDescFlexFieldPubDescSeg17 = value;
    }

    /**
     * 获取mDescFlexFieldPubDescSeg18属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDescFlexFieldPubDescSeg18() {
        return mDescFlexFieldPubDescSeg18;
    }

    /**
     * 设置mDescFlexFieldPubDescSeg18属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDescFlexFieldPubDescSeg18(JAXBElement<String> value) {
        this.mDescFlexFieldPubDescSeg18 = value;
    }

    /**
     * 获取mDescFlexFieldPubDescSeg19属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDescFlexFieldPubDescSeg19() {
        return mDescFlexFieldPubDescSeg19;
    }

    /**
     * 设置mDescFlexFieldPubDescSeg19属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDescFlexFieldPubDescSeg19(JAXBElement<String> value) {
        this.mDescFlexFieldPubDescSeg19 = value;
    }

    /**
     * 获取mDescFlexFieldPubDescSeg2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDescFlexFieldPubDescSeg2() {
        return mDescFlexFieldPubDescSeg2;
    }

    /**
     * 设置mDescFlexFieldPubDescSeg2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDescFlexFieldPubDescSeg2(JAXBElement<String> value) {
        this.mDescFlexFieldPubDescSeg2 = value;
    }

    /**
     * 获取mDescFlexFieldPubDescSeg20属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDescFlexFieldPubDescSeg20() {
        return mDescFlexFieldPubDescSeg20;
    }

    /**
     * 设置mDescFlexFieldPubDescSeg20属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDescFlexFieldPubDescSeg20(JAXBElement<String> value) {
        this.mDescFlexFieldPubDescSeg20 = value;
    }

    /**
     * 获取mDescFlexFieldPubDescSeg21属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDescFlexFieldPubDescSeg21() {
        return mDescFlexFieldPubDescSeg21;
    }

    /**
     * 设置mDescFlexFieldPubDescSeg21属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDescFlexFieldPubDescSeg21(JAXBElement<String> value) {
        this.mDescFlexFieldPubDescSeg21 = value;
    }

    /**
     * 获取mDescFlexFieldPubDescSeg22属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDescFlexFieldPubDescSeg22() {
        return mDescFlexFieldPubDescSeg22;
    }

    /**
     * 设置mDescFlexFieldPubDescSeg22属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDescFlexFieldPubDescSeg22(JAXBElement<String> value) {
        this.mDescFlexFieldPubDescSeg22 = value;
    }

    /**
     * 获取mDescFlexFieldPubDescSeg23属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDescFlexFieldPubDescSeg23() {
        return mDescFlexFieldPubDescSeg23;
    }

    /**
     * 设置mDescFlexFieldPubDescSeg23属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDescFlexFieldPubDescSeg23(JAXBElement<String> value) {
        this.mDescFlexFieldPubDescSeg23 = value;
    }

    /**
     * 获取mDescFlexFieldPubDescSeg24属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDescFlexFieldPubDescSeg24() {
        return mDescFlexFieldPubDescSeg24;
    }

    /**
     * 设置mDescFlexFieldPubDescSeg24属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDescFlexFieldPubDescSeg24(JAXBElement<String> value) {
        this.mDescFlexFieldPubDescSeg24 = value;
    }

    /**
     * 获取mDescFlexFieldPubDescSeg25属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDescFlexFieldPubDescSeg25() {
        return mDescFlexFieldPubDescSeg25;
    }

    /**
     * 设置mDescFlexFieldPubDescSeg25属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDescFlexFieldPubDescSeg25(JAXBElement<String> value) {
        this.mDescFlexFieldPubDescSeg25 = value;
    }

    /**
     * 获取mDescFlexFieldPubDescSeg26属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDescFlexFieldPubDescSeg26() {
        return mDescFlexFieldPubDescSeg26;
    }

    /**
     * 设置mDescFlexFieldPubDescSeg26属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDescFlexFieldPubDescSeg26(JAXBElement<String> value) {
        this.mDescFlexFieldPubDescSeg26 = value;
    }

    /**
     * 获取mDescFlexFieldPubDescSeg27属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDescFlexFieldPubDescSeg27() {
        return mDescFlexFieldPubDescSeg27;
    }

    /**
     * 设置mDescFlexFieldPubDescSeg27属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDescFlexFieldPubDescSeg27(JAXBElement<String> value) {
        this.mDescFlexFieldPubDescSeg27 = value;
    }

    /**
     * 获取mDescFlexFieldPubDescSeg28属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDescFlexFieldPubDescSeg28() {
        return mDescFlexFieldPubDescSeg28;
    }

    /**
     * 设置mDescFlexFieldPubDescSeg28属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDescFlexFieldPubDescSeg28(JAXBElement<String> value) {
        this.mDescFlexFieldPubDescSeg28 = value;
    }

    /**
     * 获取mDescFlexFieldPubDescSeg29属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDescFlexFieldPubDescSeg29() {
        return mDescFlexFieldPubDescSeg29;
    }

    /**
     * 设置mDescFlexFieldPubDescSeg29属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDescFlexFieldPubDescSeg29(JAXBElement<String> value) {
        this.mDescFlexFieldPubDescSeg29 = value;
    }

    /**
     * 获取mDescFlexFieldPubDescSeg3属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDescFlexFieldPubDescSeg3() {
        return mDescFlexFieldPubDescSeg3;
    }

    /**
     * 设置mDescFlexFieldPubDescSeg3属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDescFlexFieldPubDescSeg3(JAXBElement<String> value) {
        this.mDescFlexFieldPubDescSeg3 = value;
    }

    /**
     * 获取mDescFlexFieldPubDescSeg30属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDescFlexFieldPubDescSeg30() {
        return mDescFlexFieldPubDescSeg30;
    }

    /**
     * 设置mDescFlexFieldPubDescSeg30属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDescFlexFieldPubDescSeg30(JAXBElement<String> value) {
        this.mDescFlexFieldPubDescSeg30 = value;
    }

    /**
     * 获取mDescFlexFieldPubDescSeg31属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDescFlexFieldPubDescSeg31() {
        return mDescFlexFieldPubDescSeg31;
    }

    /**
     * 设置mDescFlexFieldPubDescSeg31属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDescFlexFieldPubDescSeg31(JAXBElement<String> value) {
        this.mDescFlexFieldPubDescSeg31 = value;
    }

    /**
     * 获取mDescFlexFieldPubDescSeg32属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDescFlexFieldPubDescSeg32() {
        return mDescFlexFieldPubDescSeg32;
    }

    /**
     * 设置mDescFlexFieldPubDescSeg32属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDescFlexFieldPubDescSeg32(JAXBElement<String> value) {
        this.mDescFlexFieldPubDescSeg32 = value;
    }

    /**
     * 获取mDescFlexFieldPubDescSeg33属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDescFlexFieldPubDescSeg33() {
        return mDescFlexFieldPubDescSeg33;
    }

    /**
     * 设置mDescFlexFieldPubDescSeg33属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDescFlexFieldPubDescSeg33(JAXBElement<String> value) {
        this.mDescFlexFieldPubDescSeg33 = value;
    }

    /**
     * 获取mDescFlexFieldPubDescSeg34属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDescFlexFieldPubDescSeg34() {
        return mDescFlexFieldPubDescSeg34;
    }

    /**
     * 设置mDescFlexFieldPubDescSeg34属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDescFlexFieldPubDescSeg34(JAXBElement<String> value) {
        this.mDescFlexFieldPubDescSeg34 = value;
    }

    /**
     * 获取mDescFlexFieldPubDescSeg35属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDescFlexFieldPubDescSeg35() {
        return mDescFlexFieldPubDescSeg35;
    }

    /**
     * 设置mDescFlexFieldPubDescSeg35属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDescFlexFieldPubDescSeg35(JAXBElement<String> value) {
        this.mDescFlexFieldPubDescSeg35 = value;
    }

    /**
     * 获取mDescFlexFieldPubDescSeg36属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDescFlexFieldPubDescSeg36() {
        return mDescFlexFieldPubDescSeg36;
    }

    /**
     * 设置mDescFlexFieldPubDescSeg36属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDescFlexFieldPubDescSeg36(JAXBElement<String> value) {
        this.mDescFlexFieldPubDescSeg36 = value;
    }

    /**
     * 获取mDescFlexFieldPubDescSeg37属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDescFlexFieldPubDescSeg37() {
        return mDescFlexFieldPubDescSeg37;
    }

    /**
     * 设置mDescFlexFieldPubDescSeg37属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDescFlexFieldPubDescSeg37(JAXBElement<String> value) {
        this.mDescFlexFieldPubDescSeg37 = value;
    }

    /**
     * 获取mDescFlexFieldPubDescSeg38属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDescFlexFieldPubDescSeg38() {
        return mDescFlexFieldPubDescSeg38;
    }

    /**
     * 设置mDescFlexFieldPubDescSeg38属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDescFlexFieldPubDescSeg38(JAXBElement<String> value) {
        this.mDescFlexFieldPubDescSeg38 = value;
    }

    /**
     * 获取mDescFlexFieldPubDescSeg39属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDescFlexFieldPubDescSeg39() {
        return mDescFlexFieldPubDescSeg39;
    }

    /**
     * 设置mDescFlexFieldPubDescSeg39属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDescFlexFieldPubDescSeg39(JAXBElement<String> value) {
        this.mDescFlexFieldPubDescSeg39 = value;
    }

    /**
     * 获取mDescFlexFieldPubDescSeg4属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDescFlexFieldPubDescSeg4() {
        return mDescFlexFieldPubDescSeg4;
    }

    /**
     * 设置mDescFlexFieldPubDescSeg4属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDescFlexFieldPubDescSeg4(JAXBElement<String> value) {
        this.mDescFlexFieldPubDescSeg4 = value;
    }

    /**
     * 获取mDescFlexFieldPubDescSeg40属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDescFlexFieldPubDescSeg40() {
        return mDescFlexFieldPubDescSeg40;
    }

    /**
     * 设置mDescFlexFieldPubDescSeg40属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDescFlexFieldPubDescSeg40(JAXBElement<String> value) {
        this.mDescFlexFieldPubDescSeg40 = value;
    }

    /**
     * 获取mDescFlexFieldPubDescSeg41属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDescFlexFieldPubDescSeg41() {
        return mDescFlexFieldPubDescSeg41;
    }

    /**
     * 设置mDescFlexFieldPubDescSeg41属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDescFlexFieldPubDescSeg41(JAXBElement<String> value) {
        this.mDescFlexFieldPubDescSeg41 = value;
    }

    /**
     * 获取mDescFlexFieldPubDescSeg42属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDescFlexFieldPubDescSeg42() {
        return mDescFlexFieldPubDescSeg42;
    }

    /**
     * 设置mDescFlexFieldPubDescSeg42属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDescFlexFieldPubDescSeg42(JAXBElement<String> value) {
        this.mDescFlexFieldPubDescSeg42 = value;
    }

    /**
     * 获取mDescFlexFieldPubDescSeg43属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDescFlexFieldPubDescSeg43() {
        return mDescFlexFieldPubDescSeg43;
    }

    /**
     * 设置mDescFlexFieldPubDescSeg43属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDescFlexFieldPubDescSeg43(JAXBElement<String> value) {
        this.mDescFlexFieldPubDescSeg43 = value;
    }

    /**
     * 获取mDescFlexFieldPubDescSeg44属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDescFlexFieldPubDescSeg44() {
        return mDescFlexFieldPubDescSeg44;
    }

    /**
     * 设置mDescFlexFieldPubDescSeg44属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDescFlexFieldPubDescSeg44(JAXBElement<String> value) {
        this.mDescFlexFieldPubDescSeg44 = value;
    }

    /**
     * 获取mDescFlexFieldPubDescSeg45属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDescFlexFieldPubDescSeg45() {
        return mDescFlexFieldPubDescSeg45;
    }

    /**
     * 设置mDescFlexFieldPubDescSeg45属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDescFlexFieldPubDescSeg45(JAXBElement<String> value) {
        this.mDescFlexFieldPubDescSeg45 = value;
    }

    /**
     * 获取mDescFlexFieldPubDescSeg46属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDescFlexFieldPubDescSeg46() {
        return mDescFlexFieldPubDescSeg46;
    }

    /**
     * 设置mDescFlexFieldPubDescSeg46属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDescFlexFieldPubDescSeg46(JAXBElement<String> value) {
        this.mDescFlexFieldPubDescSeg46 = value;
    }

    /**
     * 获取mDescFlexFieldPubDescSeg47属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDescFlexFieldPubDescSeg47() {
        return mDescFlexFieldPubDescSeg47;
    }

    /**
     * 设置mDescFlexFieldPubDescSeg47属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDescFlexFieldPubDescSeg47(JAXBElement<String> value) {
        this.mDescFlexFieldPubDescSeg47 = value;
    }

    /**
     * 获取mDescFlexFieldPubDescSeg48属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDescFlexFieldPubDescSeg48() {
        return mDescFlexFieldPubDescSeg48;
    }

    /**
     * 设置mDescFlexFieldPubDescSeg48属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDescFlexFieldPubDescSeg48(JAXBElement<String> value) {
        this.mDescFlexFieldPubDescSeg48 = value;
    }

    /**
     * 获取mDescFlexFieldPubDescSeg49属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDescFlexFieldPubDescSeg49() {
        return mDescFlexFieldPubDescSeg49;
    }

    /**
     * 设置mDescFlexFieldPubDescSeg49属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDescFlexFieldPubDescSeg49(JAXBElement<String> value) {
        this.mDescFlexFieldPubDescSeg49 = value;
    }

    /**
     * 获取mDescFlexFieldPubDescSeg5属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDescFlexFieldPubDescSeg5() {
        return mDescFlexFieldPubDescSeg5;
    }

    /**
     * 设置mDescFlexFieldPubDescSeg5属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDescFlexFieldPubDescSeg5(JAXBElement<String> value) {
        this.mDescFlexFieldPubDescSeg5 = value;
    }

    /**
     * 获取mDescFlexFieldPubDescSeg50属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDescFlexFieldPubDescSeg50() {
        return mDescFlexFieldPubDescSeg50;
    }

    /**
     * 设置mDescFlexFieldPubDescSeg50属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDescFlexFieldPubDescSeg50(JAXBElement<String> value) {
        this.mDescFlexFieldPubDescSeg50 = value;
    }

    /**
     * 获取mDescFlexFieldPubDescSeg6属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDescFlexFieldPubDescSeg6() {
        return mDescFlexFieldPubDescSeg6;
    }

    /**
     * 设置mDescFlexFieldPubDescSeg6属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDescFlexFieldPubDescSeg6(JAXBElement<String> value) {
        this.mDescFlexFieldPubDescSeg6 = value;
    }

    /**
     * 获取mDescFlexFieldPubDescSeg7属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDescFlexFieldPubDescSeg7() {
        return mDescFlexFieldPubDescSeg7;
    }

    /**
     * 设置mDescFlexFieldPubDescSeg7属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDescFlexFieldPubDescSeg7(JAXBElement<String> value) {
        this.mDescFlexFieldPubDescSeg7 = value;
    }

    /**
     * 获取mDescFlexFieldPubDescSeg8属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDescFlexFieldPubDescSeg8() {
        return mDescFlexFieldPubDescSeg8;
    }

    /**
     * 设置mDescFlexFieldPubDescSeg8属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDescFlexFieldPubDescSeg8(JAXBElement<String> value) {
        this.mDescFlexFieldPubDescSeg8 = value;
    }

    /**
     * 获取mDescFlexFieldPubDescSeg9属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDescFlexFieldPubDescSeg9() {
        return mDescFlexFieldPubDescSeg9;
    }

    /**
     * 设置mDescFlexFieldPubDescSeg9属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDescFlexFieldPubDescSeg9(JAXBElement<String> value) {
        this.mDescFlexFieldPubDescSeg9 = value;
    }

    /**
     * 获取mFixedMaterialNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMFixedMaterialNum() {
        return mFixedMaterialNum;
    }

    /**
     * 设置mFixedMaterialNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMFixedMaterialNum(BigDecimal value) {
        this.mFixedMaterialNum = value;
    }

    /**
     * 获取mFixedScrap属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMFixedScrap() {
        return mFixedScrap;
    }

    /**
     * 设置mFixedScrap属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMFixedScrap(BigDecimal value) {
        this.mFixedScrap = value;
    }

    /**
     * 获取mFromDegree属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMFromDegree() {
        return mFromDegree;
    }

    /**
     * 设置mFromDegree属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMFromDegree(Integer value) {
        this.mFromDegree = value;
    }

    /**
     * 获取mFromPotency属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMFromPotency() {
        return mFromPotency;
    }

    /**
     * 设置mFromPotency属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMFromPotency(Integer value) {
        this.mFromPotency = value;
    }

    /**
     * 获取mFromQty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMFromQty() {
        return mFromQty;
    }

    /**
     * 设置mFromQty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMFromQty(Integer value) {
        this.mFromQty = value;
    }

    /**
     * 获取mIsATP属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsATP() {
        return mIsATP;
    }

    /**
     * 设置mIsATP属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsATP(Boolean value) {
        this.mIsATP = value;
    }

    /**
     * 获取mIsCTP属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsCTP() {
        return mIsCTP;
    }

    /**
     * 设置mIsCTP属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsCTP(Boolean value) {
        this.mIsCTP = value;
    }

    /**
     * 获取mIsCalcPrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsCalcPrice() {
        return mIsCalcPrice;
    }

    /**
     * 设置mIsCalcPrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsCalcPrice(Boolean value) {
        this.mIsCalcPrice = value;
    }

    /**
     * 获取mIsCeiling属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsCeiling() {
        return mIsCeiling;
    }

    /**
     * 设置mIsCeiling属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsCeiling(Boolean value) {
        this.mIsCeiling = value;
    }

    /**
     * 获取mIsCharge属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsCharge() {
        return mIsCharge;
    }

    /**
     * 设置mIsCharge属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsCharge(Boolean value) {
        this.mIsCharge = value;
    }

    /**
     * 获取mIsDefault属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsDefault() {
        return mIsDefault;
    }

    /**
     * 设置mIsDefault属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsDefault(Boolean value) {
        this.mIsDefault = value;
    }

    /**
     * 获取mIsDiffentBatchCtl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsDiffentBatchCtl() {
        return mIsDiffentBatchCtl;
    }

    /**
     * 设置mIsDiffentBatchCtl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsDiffentBatchCtl(Boolean value) {
        this.mIsDiffentBatchCtl = value;
    }

    /**
     * 获取mIsDisassembly属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsDisassembly() {
        return mIsDisassembly;
    }

    /**
     * 设置mIsDisassembly属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsDisassembly(Boolean value) {
        this.mIsDisassembly = value;
    }

    /**
     * 获取mIsEffective属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsEffective() {
        return mIsEffective;
    }

    /**
     * 设置mIsEffective属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsEffective(Boolean value) {
        this.mIsEffective = value;
    }

    /**
     * 获取mIsExclude属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsExclude() {
        return mIsExclude;
    }

    /**
     * 设置mIsExclude属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsExclude(Boolean value) {
        this.mIsExclude = value;
    }

    /**
     * 获取mIsMandatory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsMandatory() {
        return mIsMandatory;
    }

    /**
     * 设置mIsMandatory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsMandatory(Boolean value) {
        this.mIsMandatory = value;
    }

    /**
     * 获取mIsManuallySelect属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsManuallySelect() {
        return mIsManuallySelect;
    }

    /**
     * 设置mIsManuallySelect属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsManuallySelect(Boolean value) {
        this.mIsManuallySelect = value;
    }

    /**
     * 获取mIsOptionDependent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsOptionDependent() {
        return mIsOptionDependent;
    }

    /**
     * 设置mIsOptionDependent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsOptionDependent(Boolean value) {
        this.mIsOptionDependent = value;
    }

    /**
     * 获取mIsOverIssue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsOverIssue() {
        return mIsOverIssue;
    }

    /**
     * 设置mIsOverIssue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsOverIssue(Boolean value) {
        this.mIsOverIssue = value;
    }

    /**
     * 获取mIsPhantomPart属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsPhantomPart() {
        return mIsPhantomPart;
    }

    /**
     * 设置mIsPhantomPart属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsPhantomPart(Boolean value) {
        this.mIsPhantomPart = value;
    }

    /**
     * 获取mIsSpecialUseItem属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsSpecialUseItem() {
        return mIsSpecialUseItem;
    }

    /**
     * 设置mIsSpecialUseItem属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsSpecialUseItem(Boolean value) {
        this.mIsSpecialUseItem = value;
    }

    /**
     * 获取mIsWholeSetIssue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsWholeSetIssue() {
        return mIsWholeSetIssue;
    }

    /**
     * 设置mIsWholeSetIssue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsWholeSetIssue(Boolean value) {
        this.mIsWholeSetIssue = value;
    }

    /**
     * 获取mIssueOrg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMIssueOrg() {
        return mIssueOrg;
    }

    /**
     * 设置mIssueOrg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMIssueOrg(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mIssueOrg = value;
    }

    /**
     * 获取mIssueStyle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMIssueStyle() {
        return mIssueStyle;
    }

    /**
     * 设置mIssueStyle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMIssueStyle(Integer value) {
        this.mIssueStyle = value;
    }

    /**
     * 获取mIssueUOM属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMIssueUOM() {
        return mIssueUOM;
    }

    /**
     * 设置mIssueUOM属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMIssueUOM(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mIssueUOM = value;
    }

    /**
     * 获取mItemMaster属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMItemMaster() {
        return mItemMaster;
    }

    /**
     * 设置mItemMaster属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMItemMaster(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mItemMaster = value;
    }

    /**
     * 获取mItemVersionCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMItemVersionCode() {
        return mItemVersionCode;
    }

    /**
     * 设置mItemVersionCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMItemVersionCode(JAXBElement<String> value) {
        this.mItemVersionCode = value;
    }

    /**
     * 获取mjit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMJIT() {
        return mjit;
    }

    /**
     * 设置mjit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMJIT(Boolean value) {
        this.mjit = value;
    }

    /**
     * 获取mLeadTimeOffSet属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMLeadTimeOffSet() {
        return mLeadTimeOffSet;
    }

    /**
     * 设置mLeadTimeOffSet属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMLeadTimeOffSet(BigDecimal value) {
        this.mLeadTimeOffSet = value;
    }

    /**
     * 获取mMaterialType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMMaterialType() {
        return mMaterialType;
    }

    /**
     * 设置mMaterialType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMMaterialType(Integer value) {
        this.mMaterialType = value;
    }

    /**
     * 获取mMaxSelectedQty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMMaxSelectedQty() {
        return mMaxSelectedQty;
    }

    /**
     * 设置mMaxSelectedQty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMMaxSelectedQty(BigDecimal value) {
        this.mMaxSelectedQty = value;
    }

    /**
     * 获取mMinSelectedQty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMMinSelectedQty() {
        return mMinSelectedQty;
    }

    /**
     * 设置mMinSelectedQty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMMinSelectedQty(BigDecimal value) {
        this.mMinSelectedQty = value;
    }

    /**
     * 获取mOperationNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMOperationNum() {
        return mOperationNum;
    }

    /**
     * 设置mOperationNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMOperationNum(JAXBElement<String> value) {
        this.mOperationNum = value;
    }

    /**
     * 获取mParentQty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMParentQty() {
        return mParentQty;
    }

    /**
     * 设置mParentQty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMParentQty(BigDecimal value) {
        this.mParentQty = value;
    }

    /**
     * 获取mPlanPercent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMPlanPercent() {
        return mPlanPercent;
    }

    /**
     * 设置mPlanPercent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMPlanPercent(BigDecimal value) {
        this.mPlanPercent = value;
    }

    /**
     * 获取mProjectMapNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMProjectMapNum() {
        return mProjectMapNum;
    }

    /**
     * 设置mProjectMapNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMProjectMapNum(JAXBElement<String> value) {
        this.mProjectMapNum = value;
    }

    /**
     * 获取mRemark属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMRemark() {
        return mRemark;
    }

    /**
     * 设置mRemark属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMRemark(JAXBElement<String> value) {
        this.mRemark = value;
    }

    /**
     * 获取mScrap属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMScrap() {
        return mScrap;
    }

    /**
     * 设置mScrap属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMScrap(BigDecimal value) {
        this.mScrap = value;
    }

    /**
     * 获取mScrapType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMScrapType() {
        return mScrapType;
    }

    /**
     * 设置mScrapType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMScrapType(Integer value) {
        this.mScrapType = value;
    }

    /**
     * 获取mSequence属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMSequence() {
        return mSequence;
    }

    /**
     * 设置mSequence属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMSequence(Integer value) {
        this.mSequence = value;
    }

    /**
     * 获取mSetChkAtComplete属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMSetChkAtComplete() {
        return mSetChkAtComplete;
    }

    /**
     * 设置mSetChkAtComplete属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMSetChkAtComplete(Boolean value) {
        this.mSetChkAtComplete = value;
    }

    /**
     * 获取mSetChkAtOptComplete属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMSetChkAtOptComplete() {
        return mSetChkAtOptComplete;
    }

    /**
     * 设置mSetChkAtOptComplete属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMSetChkAtOptComplete(Boolean value) {
        this.mSetChkAtOptComplete = value;
    }

    /**
     * 获取mSetChkAtOptStart属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMSetChkAtOptStart() {
        return mSetChkAtOptStart;
    }

    /**
     * 设置mSetChkAtOptStart属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMSetChkAtOptStart(Boolean value) {
        this.mSetChkAtOptStart = value;
    }

    /**
     * 获取mSetChkAtWorkingStart属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMSetChkAtWorkingStart() {
        return mSetChkAtWorkingStart;
    }

    /**
     * 设置mSetChkAtWorkingStart属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMSetChkAtWorkingStart(Boolean value) {
        this.mSetChkAtWorkingStart = value;
    }

    /**
     * 获取mStandardMaterialScale属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMStandardMaterialScale() {
        return mStandardMaterialScale;
    }

    /**
     * 设置mStandardMaterialScale属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMStandardMaterialScale(BigDecimal value) {
        this.mStandardMaterialScale = value;
    }

    /**
     * 获取mSubPercent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSubPercent() {
        return mSubPercent;
    }

    /**
     * 设置mSubPercent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSubPercent(BigDecimal value) {
        this.mSubPercent = value;
    }

    /**
     * 获取mSubSeq属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMSubSeq() {
        return mSubSeq;
    }

    /**
     * 设置mSubSeq属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMSubSeq(Integer value) {
        this.mSubSeq = value;
    }

    /**
     * 获取mSubcontractItemSrc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMSubcontractItemSrc() {
        return mSubcontractItemSrc;
    }

    /**
     * 设置mSubcontractItemSrc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMSubcontractItemSrc(Integer value) {
        this.mSubcontractItemSrc = value;
    }

    /**
     * 获取mSubstituteStyle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMSubstituteStyle() {
        return mSubstituteStyle;
    }

    /**
     * 设置mSubstituteStyle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMSubstituteStyle(Integer value) {
        this.mSubstituteStyle = value;
    }

    /**
     * 获取mSupplyBin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMSupplyBin() {
        return mSupplyBin;
    }

    /**
     * 设置mSupplyBin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMSupplyBin(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mSupplyBin = value;
    }

    /**
     * 获取mSupplyStyle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMSupplyStyle() {
        return mSupplyStyle;
    }

    /**
     * 设置mSupplyStyle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMSupplyStyle(Integer value) {
        this.mSupplyStyle = value;
    }

    /**
     * 获取mSupplyWareHouse属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMSupplyWareHouse() {
        return mSupplyWareHouse;
    }

    /**
     * 设置mSupplyWareHouse属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMSupplyWareHouse(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mSupplyWareHouse = value;
    }

    /**
     * 获取mTimeUOM属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMTimeUOM() {
        return mTimeUOM;
    }

    /**
     * 设置mTimeUOM属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMTimeUOM(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mTimeUOM = value;
    }

    /**
     * 获取mToDegree属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMToDegree() {
        return mToDegree;
    }

    /**
     * 设置mToDegree属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMToDegree(Integer value) {
        this.mToDegree = value;
    }

    /**
     * 获取mToPotency属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMToPotency() {
        return mToPotency;
    }

    /**
     * 设置mToPotency属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMToPotency(Integer value) {
        this.mToPotency = value;
    }

    /**
     * 获取mToQty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMToQty() {
        return mToQty;
    }

    /**
     * 设置mToQty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMToQty(Integer value) {
        this.mToQty = value;
    }

    /**
     * 获取mUsageQty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMUsageQty() {
        return mUsageQty;
    }

    /**
     * 设置mUsageQty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMUsageQty(BigDecimal value) {
        this.mUsageQty = value;
    }

    /**
     * 获取mUsageQtyType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMUsageQtyType() {
        return mUsageQtyType;
    }

    /**
     * 设置mUsageQtyType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMUsageQtyType(Integer value) {
        this.mUsageQtyType = value;
    }

}
