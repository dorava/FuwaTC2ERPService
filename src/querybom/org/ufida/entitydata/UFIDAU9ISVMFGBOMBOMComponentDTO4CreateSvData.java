
package querybom.org.ufida.entitydata;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>UFIDA.U9.ISV.MFG.BOM.BOMComponentDTO4CreateSvData complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡmbomCompPositions���Ե�ֵ��
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
     * ����mbomCompPositions���Ե�ֵ��
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
     * ��ȡmbomCompScalarScraps���Ե�ֵ��
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
     * ����mbomCompScalarScraps���Ե�ֵ��
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
     * ��ȡmbomCompSubstituteDTO4CreateSv���Ե�ֵ��
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
     * ����mbomCompSubstituteDTO4CreateSv���Ե�ֵ��
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
     * ��ȡmbomCompSuppliers���Ե�ֵ��
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
     * ����mbomCompSuppliers���Ե�ֵ��
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
     * ��ȡmbomComponentChangeDTOList���Ե�ֵ��
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
     * ����mbomComponentChangeDTOList���Ե�ֵ��
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
     * ��ȡmbomComponentLots���Ե�ֵ��
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
     * ����mbomComponentLots���Ե�ֵ��
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
     * ��ȡmbomMasterDTO4CreateSv���Ե�ֵ��
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
     * ����mbomMasterDTO4CreateSv���Ե�ֵ��
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
     * ��ȡmCompProject���Ե�ֵ��
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
     * ����mCompProject���Ե�ֵ��
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
     * ��ȡmComponentType���Ե�ֵ��
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
     * ����mComponentType���Ե�ֵ��
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
     * ��ȡmConsignProcessItemSrc���Ե�ֵ��
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
     * ����mConsignProcessItemSrc���Ե�ֵ��
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
     * ��ȡmCostElement���Ե�ֵ��
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
     * ����mCostElement���Ե�ֵ��
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
     * ��ȡmCostPercent���Ե�ֵ��
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
     * ����mCostPercent���Ե�ֵ��
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
     * ��ȡmDescFlexField���Ե�ֵ��
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
     * ����mDescFlexField���Ե�ֵ��
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
     * ��ȡmDescFlexFieldPrivateDescSeg1���Ե�ֵ��
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
     * ����mDescFlexFieldPrivateDescSeg1���Ե�ֵ��
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
     * ��ȡmDescFlexFieldPrivateDescSeg10���Ե�ֵ��
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
     * ����mDescFlexFieldPrivateDescSeg10���Ե�ֵ��
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
     * ��ȡmDescFlexFieldPrivateDescSeg11���Ե�ֵ��
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
     * ����mDescFlexFieldPrivateDescSeg11���Ե�ֵ��
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
     * ��ȡmDescFlexFieldPrivateDescSeg12���Ե�ֵ��
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
     * ����mDescFlexFieldPrivateDescSeg12���Ե�ֵ��
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
     * ��ȡmDescFlexFieldPrivateDescSeg13���Ե�ֵ��
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
     * ����mDescFlexFieldPrivateDescSeg13���Ե�ֵ��
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
     * ��ȡmDescFlexFieldPrivateDescSeg14���Ե�ֵ��
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
     * ����mDescFlexFieldPrivateDescSeg14���Ե�ֵ��
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
     * ��ȡmDescFlexFieldPrivateDescSeg15���Ե�ֵ��
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
     * ����mDescFlexFieldPrivateDescSeg15���Ե�ֵ��
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
     * ��ȡmDescFlexFieldPrivateDescSeg16���Ե�ֵ��
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
     * ����mDescFlexFieldPrivateDescSeg16���Ե�ֵ��
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
     * ��ȡmDescFlexFieldPrivateDescSeg17���Ե�ֵ��
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
     * ����mDescFlexFieldPrivateDescSeg17���Ե�ֵ��
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
     * ��ȡmDescFlexFieldPrivateDescSeg18���Ե�ֵ��
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
     * ����mDescFlexFieldPrivateDescSeg18���Ե�ֵ��
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
     * ��ȡmDescFlexFieldPrivateDescSeg19���Ե�ֵ��
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
     * ����mDescFlexFieldPrivateDescSeg19���Ե�ֵ��
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
     * ��ȡmDescFlexFieldPrivateDescSeg2���Ե�ֵ��
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
     * ����mDescFlexFieldPrivateDescSeg2���Ե�ֵ��
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
     * ��ȡmDescFlexFieldPrivateDescSeg20���Ե�ֵ��
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
     * ����mDescFlexFieldPrivateDescSeg20���Ե�ֵ��
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
     * ��ȡmDescFlexFieldPrivateDescSeg21���Ե�ֵ��
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
     * ����mDescFlexFieldPrivateDescSeg21���Ե�ֵ��
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
     * ��ȡmDescFlexFieldPrivateDescSeg22���Ե�ֵ��
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
     * ����mDescFlexFieldPrivateDescSeg22���Ե�ֵ��
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
     * ��ȡmDescFlexFieldPrivateDescSeg23���Ե�ֵ��
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
     * ����mDescFlexFieldPrivateDescSeg23���Ե�ֵ��
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
     * ��ȡmDescFlexFieldPrivateDescSeg24���Ե�ֵ��
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
     * ����mDescFlexFieldPrivateDescSeg24���Ե�ֵ��
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
     * ��ȡmDescFlexFieldPrivateDescSeg25���Ե�ֵ��
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
     * ����mDescFlexFieldPrivateDescSeg25���Ե�ֵ��
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
     * ��ȡmDescFlexFieldPrivateDescSeg26���Ե�ֵ��
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
     * ����mDescFlexFieldPrivateDescSeg26���Ե�ֵ��
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
     * ��ȡmDescFlexFieldPrivateDescSeg27���Ե�ֵ��
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
     * ����mDescFlexFieldPrivateDescSeg27���Ե�ֵ��
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
     * ��ȡmDescFlexFieldPrivateDescSeg28���Ե�ֵ��
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
     * ����mDescFlexFieldPrivateDescSeg28���Ե�ֵ��
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
     * ��ȡmDescFlexFieldPrivateDescSeg29���Ե�ֵ��
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
     * ����mDescFlexFieldPrivateDescSeg29���Ե�ֵ��
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
     * ��ȡmDescFlexFieldPrivateDescSeg3���Ե�ֵ��
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
     * ����mDescFlexFieldPrivateDescSeg3���Ե�ֵ��
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
     * ��ȡmDescFlexFieldPrivateDescSeg30���Ե�ֵ��
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
     * ����mDescFlexFieldPrivateDescSeg30���Ե�ֵ��
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
     * ��ȡmDescFlexFieldPrivateDescSeg4���Ե�ֵ��
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
     * ����mDescFlexFieldPrivateDescSeg4���Ե�ֵ��
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
     * ��ȡmDescFlexFieldPrivateDescSeg5���Ե�ֵ��
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
     * ����mDescFlexFieldPrivateDescSeg5���Ե�ֵ��
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
     * ��ȡmDescFlexFieldPrivateDescSeg6���Ե�ֵ��
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
     * ����mDescFlexFieldPrivateDescSeg6���Ե�ֵ��
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
     * ��ȡmDescFlexFieldPrivateDescSeg7���Ե�ֵ��
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
     * ����mDescFlexFieldPrivateDescSeg7���Ե�ֵ��
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
     * ��ȡmDescFlexFieldPrivateDescSeg8���Ե�ֵ��
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
     * ����mDescFlexFieldPrivateDescSeg8���Ե�ֵ��
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
     * ��ȡmDescFlexFieldPrivateDescSeg9���Ե�ֵ��
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
     * ����mDescFlexFieldPrivateDescSeg9���Ե�ֵ��
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
     * ��ȡmDescFlexFieldPubDescSeg1���Ե�ֵ��
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
     * ����mDescFlexFieldPubDescSeg1���Ե�ֵ��
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
     * ��ȡmDescFlexFieldPubDescSeg10���Ե�ֵ��
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
     * ����mDescFlexFieldPubDescSeg10���Ե�ֵ��
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
     * ��ȡmDescFlexFieldPubDescSeg11���Ե�ֵ��
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
     * ����mDescFlexFieldPubDescSeg11���Ե�ֵ��
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
     * ��ȡmDescFlexFieldPubDescSeg12���Ե�ֵ��
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
     * ����mDescFlexFieldPubDescSeg12���Ե�ֵ��
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
     * ��ȡmDescFlexFieldPubDescSeg13���Ե�ֵ��
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
     * ����mDescFlexFieldPubDescSeg13���Ե�ֵ��
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
     * ��ȡmDescFlexFieldPubDescSeg14���Ե�ֵ��
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
     * ����mDescFlexFieldPubDescSeg14���Ե�ֵ��
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
     * ��ȡmDescFlexFieldPubDescSeg15���Ե�ֵ��
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
     * ����mDescFlexFieldPubDescSeg15���Ե�ֵ��
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
     * ��ȡmDescFlexFieldPubDescSeg16���Ե�ֵ��
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
     * ����mDescFlexFieldPubDescSeg16���Ե�ֵ��
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
     * ��ȡmDescFlexFieldPubDescSeg17���Ե�ֵ��
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
     * ����mDescFlexFieldPubDescSeg17���Ե�ֵ��
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
     * ��ȡmDescFlexFieldPubDescSeg18���Ե�ֵ��
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
     * ����mDescFlexFieldPubDescSeg18���Ե�ֵ��
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
     * ��ȡmDescFlexFieldPubDescSeg19���Ե�ֵ��
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
     * ����mDescFlexFieldPubDescSeg19���Ե�ֵ��
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
     * ��ȡmDescFlexFieldPubDescSeg2���Ե�ֵ��
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
     * ����mDescFlexFieldPubDescSeg2���Ե�ֵ��
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
     * ��ȡmDescFlexFieldPubDescSeg20���Ե�ֵ��
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
     * ����mDescFlexFieldPubDescSeg20���Ե�ֵ��
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
     * ��ȡmDescFlexFieldPubDescSeg21���Ե�ֵ��
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
     * ����mDescFlexFieldPubDescSeg21���Ե�ֵ��
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
     * ��ȡmDescFlexFieldPubDescSeg22���Ե�ֵ��
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
     * ����mDescFlexFieldPubDescSeg22���Ե�ֵ��
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
     * ��ȡmDescFlexFieldPubDescSeg23���Ե�ֵ��
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
     * ����mDescFlexFieldPubDescSeg23���Ե�ֵ��
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
     * ��ȡmDescFlexFieldPubDescSeg24���Ե�ֵ��
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
     * ����mDescFlexFieldPubDescSeg24���Ե�ֵ��
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
     * ��ȡmDescFlexFieldPubDescSeg25���Ե�ֵ��
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
     * ����mDescFlexFieldPubDescSeg25���Ե�ֵ��
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
     * ��ȡmDescFlexFieldPubDescSeg26���Ե�ֵ��
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
     * ����mDescFlexFieldPubDescSeg26���Ե�ֵ��
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
     * ��ȡmDescFlexFieldPubDescSeg27���Ե�ֵ��
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
     * ����mDescFlexFieldPubDescSeg27���Ե�ֵ��
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
     * ��ȡmDescFlexFieldPubDescSeg28���Ե�ֵ��
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
     * ����mDescFlexFieldPubDescSeg28���Ե�ֵ��
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
     * ��ȡmDescFlexFieldPubDescSeg29���Ե�ֵ��
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
     * ����mDescFlexFieldPubDescSeg29���Ե�ֵ��
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
     * ��ȡmDescFlexFieldPubDescSeg3���Ե�ֵ��
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
     * ����mDescFlexFieldPubDescSeg3���Ե�ֵ��
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
     * ��ȡmDescFlexFieldPubDescSeg30���Ե�ֵ��
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
     * ����mDescFlexFieldPubDescSeg30���Ե�ֵ��
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
     * ��ȡmDescFlexFieldPubDescSeg31���Ե�ֵ��
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
     * ����mDescFlexFieldPubDescSeg31���Ե�ֵ��
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
     * ��ȡmDescFlexFieldPubDescSeg32���Ե�ֵ��
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
     * ����mDescFlexFieldPubDescSeg32���Ե�ֵ��
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
     * ��ȡmDescFlexFieldPubDescSeg33���Ե�ֵ��
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
     * ����mDescFlexFieldPubDescSeg33���Ե�ֵ��
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
     * ��ȡmDescFlexFieldPubDescSeg34���Ե�ֵ��
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
     * ����mDescFlexFieldPubDescSeg34���Ե�ֵ��
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
     * ��ȡmDescFlexFieldPubDescSeg35���Ե�ֵ��
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
     * ����mDescFlexFieldPubDescSeg35���Ե�ֵ��
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
     * ��ȡmDescFlexFieldPubDescSeg36���Ե�ֵ��
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
     * ����mDescFlexFieldPubDescSeg36���Ե�ֵ��
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
     * ��ȡmDescFlexFieldPubDescSeg37���Ե�ֵ��
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
     * ����mDescFlexFieldPubDescSeg37���Ե�ֵ��
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
     * ��ȡmDescFlexFieldPubDescSeg38���Ե�ֵ��
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
     * ����mDescFlexFieldPubDescSeg38���Ե�ֵ��
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
     * ��ȡmDescFlexFieldPubDescSeg39���Ե�ֵ��
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
     * ����mDescFlexFieldPubDescSeg39���Ե�ֵ��
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
     * ��ȡmDescFlexFieldPubDescSeg4���Ե�ֵ��
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
     * ����mDescFlexFieldPubDescSeg4���Ե�ֵ��
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
     * ��ȡmDescFlexFieldPubDescSeg40���Ե�ֵ��
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
     * ����mDescFlexFieldPubDescSeg40���Ե�ֵ��
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
     * ��ȡmDescFlexFieldPubDescSeg41���Ե�ֵ��
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
     * ����mDescFlexFieldPubDescSeg41���Ե�ֵ��
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
     * ��ȡmDescFlexFieldPubDescSeg42���Ե�ֵ��
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
     * ����mDescFlexFieldPubDescSeg42���Ե�ֵ��
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
     * ��ȡmDescFlexFieldPubDescSeg43���Ե�ֵ��
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
     * ����mDescFlexFieldPubDescSeg43���Ե�ֵ��
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
     * ��ȡmDescFlexFieldPubDescSeg44���Ե�ֵ��
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
     * ����mDescFlexFieldPubDescSeg44���Ե�ֵ��
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
     * ��ȡmDescFlexFieldPubDescSeg45���Ե�ֵ��
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
     * ����mDescFlexFieldPubDescSeg45���Ե�ֵ��
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
     * ��ȡmDescFlexFieldPubDescSeg46���Ե�ֵ��
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
     * ����mDescFlexFieldPubDescSeg46���Ե�ֵ��
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
     * ��ȡmDescFlexFieldPubDescSeg47���Ե�ֵ��
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
     * ����mDescFlexFieldPubDescSeg47���Ե�ֵ��
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
     * ��ȡmDescFlexFieldPubDescSeg48���Ե�ֵ��
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
     * ����mDescFlexFieldPubDescSeg48���Ե�ֵ��
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
     * ��ȡmDescFlexFieldPubDescSeg49���Ե�ֵ��
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
     * ����mDescFlexFieldPubDescSeg49���Ե�ֵ��
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
     * ��ȡmDescFlexFieldPubDescSeg5���Ե�ֵ��
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
     * ����mDescFlexFieldPubDescSeg5���Ե�ֵ��
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
     * ��ȡmDescFlexFieldPubDescSeg50���Ե�ֵ��
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
     * ����mDescFlexFieldPubDescSeg50���Ե�ֵ��
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
     * ��ȡmDescFlexFieldPubDescSeg6���Ե�ֵ��
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
     * ����mDescFlexFieldPubDescSeg6���Ե�ֵ��
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
     * ��ȡmDescFlexFieldPubDescSeg7���Ե�ֵ��
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
     * ����mDescFlexFieldPubDescSeg7���Ե�ֵ��
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
     * ��ȡmDescFlexFieldPubDescSeg8���Ե�ֵ��
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
     * ����mDescFlexFieldPubDescSeg8���Ե�ֵ��
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
     * ��ȡmDescFlexFieldPubDescSeg9���Ե�ֵ��
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
     * ����mDescFlexFieldPubDescSeg9���Ե�ֵ��
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
     * ��ȡmFixedMaterialNum���Ե�ֵ��
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
     * ����mFixedMaterialNum���Ե�ֵ��
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
     * ��ȡmFixedScrap���Ե�ֵ��
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
     * ����mFixedScrap���Ե�ֵ��
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
     * ��ȡmFromDegree���Ե�ֵ��
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
     * ����mFromDegree���Ե�ֵ��
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
     * ��ȡmFromPotency���Ե�ֵ��
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
     * ����mFromPotency���Ե�ֵ��
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
     * ��ȡmFromQty���Ե�ֵ��
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
     * ����mFromQty���Ե�ֵ��
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
     * ��ȡmIsATP���Ե�ֵ��
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
     * ����mIsATP���Ե�ֵ��
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
     * ��ȡmIsCTP���Ե�ֵ��
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
     * ����mIsCTP���Ե�ֵ��
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
     * ��ȡmIsCalcPrice���Ե�ֵ��
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
     * ����mIsCalcPrice���Ե�ֵ��
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
     * ��ȡmIsCeiling���Ե�ֵ��
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
     * ����mIsCeiling���Ե�ֵ��
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
     * ��ȡmIsCharge���Ե�ֵ��
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
     * ����mIsCharge���Ե�ֵ��
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
     * ��ȡmIsDefault���Ե�ֵ��
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
     * ����mIsDefault���Ե�ֵ��
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
     * ��ȡmIsDiffentBatchCtl���Ե�ֵ��
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
     * ����mIsDiffentBatchCtl���Ե�ֵ��
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
     * ��ȡmIsDisassembly���Ե�ֵ��
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
     * ����mIsDisassembly���Ե�ֵ��
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
     * ��ȡmIsEffective���Ե�ֵ��
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
     * ����mIsEffective���Ե�ֵ��
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
     * ��ȡmIsExclude���Ե�ֵ��
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
     * ����mIsExclude���Ե�ֵ��
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
     * ��ȡmIsMandatory���Ե�ֵ��
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
     * ����mIsMandatory���Ե�ֵ��
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
     * ��ȡmIsManuallySelect���Ե�ֵ��
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
     * ����mIsManuallySelect���Ե�ֵ��
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
     * ��ȡmIsOptionDependent���Ե�ֵ��
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
     * ����mIsOptionDependent���Ե�ֵ��
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
     * ��ȡmIsOverIssue���Ե�ֵ��
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
     * ����mIsOverIssue���Ե�ֵ��
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
     * ��ȡmIsPhantomPart���Ե�ֵ��
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
     * ����mIsPhantomPart���Ե�ֵ��
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
     * ��ȡmIsSpecialUseItem���Ե�ֵ��
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
     * ����mIsSpecialUseItem���Ե�ֵ��
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
     * ��ȡmIsWholeSetIssue���Ե�ֵ��
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
     * ����mIsWholeSetIssue���Ե�ֵ��
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
     * ��ȡmIssueOrg���Ե�ֵ��
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
     * ����mIssueOrg���Ե�ֵ��
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
     * ��ȡmIssueStyle���Ե�ֵ��
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
     * ����mIssueStyle���Ե�ֵ��
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
     * ��ȡmIssueUOM���Ե�ֵ��
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
     * ����mIssueUOM���Ե�ֵ��
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
     * ��ȡmItemMaster���Ե�ֵ��
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
     * ����mItemMaster���Ե�ֵ��
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
     * ��ȡmItemVersionCode���Ե�ֵ��
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
     * ����mItemVersionCode���Ե�ֵ��
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
     * ��ȡmjit���Ե�ֵ��
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
     * ����mjit���Ե�ֵ��
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
     * ��ȡmLeadTimeOffSet���Ե�ֵ��
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
     * ����mLeadTimeOffSet���Ե�ֵ��
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
     * ��ȡmMaterialType���Ե�ֵ��
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
     * ����mMaterialType���Ե�ֵ��
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
     * ��ȡmMaxSelectedQty���Ե�ֵ��
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
     * ����mMaxSelectedQty���Ե�ֵ��
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
     * ��ȡmMinSelectedQty���Ե�ֵ��
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
     * ����mMinSelectedQty���Ե�ֵ��
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
     * ��ȡmOperationNum���Ե�ֵ��
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
     * ����mOperationNum���Ե�ֵ��
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
     * ��ȡmParentQty���Ե�ֵ��
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
     * ����mParentQty���Ե�ֵ��
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
     * ��ȡmPlanPercent���Ե�ֵ��
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
     * ����mPlanPercent���Ե�ֵ��
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
     * ��ȡmProjectMapNum���Ե�ֵ��
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
     * ����mProjectMapNum���Ե�ֵ��
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
     * ��ȡmRemark���Ե�ֵ��
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
     * ����mRemark���Ե�ֵ��
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
     * ��ȡmScrap���Ե�ֵ��
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
     * ����mScrap���Ե�ֵ��
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
     * ��ȡmScrapType���Ե�ֵ��
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
     * ����mScrapType���Ե�ֵ��
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
     * ��ȡmSequence���Ե�ֵ��
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
     * ����mSequence���Ե�ֵ��
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
     * ��ȡmSetChkAtComplete���Ե�ֵ��
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
     * ����mSetChkAtComplete���Ե�ֵ��
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
     * ��ȡmSetChkAtOptComplete���Ե�ֵ��
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
     * ����mSetChkAtOptComplete���Ե�ֵ��
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
     * ��ȡmSetChkAtOptStart���Ե�ֵ��
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
     * ����mSetChkAtOptStart���Ե�ֵ��
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
     * ��ȡmSetChkAtWorkingStart���Ե�ֵ��
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
     * ����mSetChkAtWorkingStart���Ե�ֵ��
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
     * ��ȡmStandardMaterialScale���Ե�ֵ��
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
     * ����mStandardMaterialScale���Ե�ֵ��
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
     * ��ȡmSubPercent���Ե�ֵ��
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
     * ����mSubPercent���Ե�ֵ��
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
     * ��ȡmSubSeq���Ե�ֵ��
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
     * ����mSubSeq���Ե�ֵ��
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
     * ��ȡmSubcontractItemSrc���Ե�ֵ��
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
     * ����mSubcontractItemSrc���Ե�ֵ��
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
     * ��ȡmSubstituteStyle���Ե�ֵ��
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
     * ����mSubstituteStyle���Ե�ֵ��
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
     * ��ȡmSupplyBin���Ե�ֵ��
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
     * ����mSupplyBin���Ե�ֵ��
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
     * ��ȡmSupplyStyle���Ե�ֵ��
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
     * ����mSupplyStyle���Ե�ֵ��
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
     * ��ȡmSupplyWareHouse���Ե�ֵ��
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
     * ����mSupplyWareHouse���Ե�ֵ��
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
     * ��ȡmTimeUOM���Ե�ֵ��
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
     * ����mTimeUOM���Ե�ֵ��
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
     * ��ȡmToDegree���Ե�ֵ��
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
     * ����mToDegree���Ե�ֵ��
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
     * ��ȡmToPotency���Ե�ֵ��
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
     * ����mToPotency���Ե�ֵ��
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
     * ��ȡmToQty���Ե�ֵ��
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
     * ����mToQty���Ե�ֵ��
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
     * ��ȡmUsageQty���Ե�ֵ��
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
     * ����mUsageQty���Ե�ֵ��
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
     * ��ȡmUsageQtyType���Ե�ֵ��
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
     * ����mUsageQtyType���Ե�ֵ��
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
