
package querymaterial.org.ufida.entitydata;

import java.math.BigDecimal;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import querymaterial.data.util.ubf.ufsoft.MultiLangDataDict;


/**
 * <p>UFIDA.U9.ISV.Item.ItemMasterDTOData complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="UFIDA.U9.ISV.Item.ItemMasterDTOData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.UFIDA.org/EntityData}UFSoft.UBF.Business.DataTransObjectBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AliasName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Multi_AliasName" type="{UFSoft.UBF.Util.Data}MultiLangDataDict" minOccurs="0"/&gt;
 *         &lt;element name="Multi_Description" type="{UFSoft.UBF.Util.Data}MultiLangDataDict" minOccurs="0"/&gt;
 *         &lt;element name="m_assetCategory" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&gt;
 *         &lt;element name="m_boundedCategory" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="m_boundedCountTaxRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="m_boundedCountToLerance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="m_boundedTaxNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_bulkUom" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&gt;
 *         &lt;element name="m_catalogNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_code1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_code2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_converRatioRule" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="m_costCategory" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&gt;
 *         &lt;element name="m_costCurrency" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&gt;
 *         &lt;element name="m_costUOM" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&gt;
 *         &lt;element name="m_createdBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_createdOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="m_creditCategory" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&gt;
 *         &lt;element name="m_customNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_customTaxRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="m_descFlexField" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.Base.FlexField.DescFlexField.DescFlexSegmentsData" minOccurs="0"/&gt;
 *         &lt;element name="m_drawbackRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="m_effective" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.Base.PropertyTypes.EffectiveData" minOccurs="0"/&gt;
 *         &lt;element name="m_endGrade" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="m_endPotency" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="m_entranceInfo" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.ISV.Item.EntranceInfoDTOData" minOccurs="0"/&gt;
 *         &lt;element name="m_iD" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="m_inspectionInfo" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.ISV.Item.ItemInspectionInfoDTOData" minOccurs="0"/&gt;
 *         &lt;element name="m_internalTransCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="m_inventoryInfo" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.ISV.Item.ItemInvInfoDTOData" minOccurs="0"/&gt;
 *         &lt;element name="m_inventorySecondUOM" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&gt;
 *         &lt;element name="m_inventoryUOM" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&gt;
 *         &lt;element name="m_inventoryUOMGroup" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="m_isBOMEnable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="m_isBounded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="m_isBuildEnable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="m_isCanFlowStat" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="m_isCostCalByGrade" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="m_isCostCalByPotency" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="m_isDualQuantity" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="m_isDualUOM" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="m_isGradeControl" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="m_isIncludedCostCa" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="m_isIncludedStockAsset" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="m_isInventoryEnable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="m_isMRPEnable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="m_isMultyUOM" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="m_isNeedLicence" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="m_isOutsideOperationEnable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="m_isPotencyControl" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="m_isPurchaseEnable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="m_isSalesEnable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="m_isSpecialItem" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="m_isTrademark" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="m_isVMIEnable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="m_isVarRatio" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="m_isVersionQtyControl" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="m_itemBulk" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="m_itemForm" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="m_itemFormAttribute" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="m_itemMasterVersions" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.ISV.Item.ItemMasterVersionDTOData" minOccurs="0"/&gt;
 *         &lt;element name="m_itemSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_itemTradeMarkInfos" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.ISV.Item.ItemTradeMarkDTOData" minOccurs="0"/&gt;
 *         &lt;element name="m_mRPCategory" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&gt;
 *         &lt;element name="m_mainItemCategory" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&gt;
 *         &lt;element name="m_manufactureUOM" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&gt;
 *         &lt;element name="m_materialOutUOM" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&gt;
 *         &lt;element name="m_mfgInfo" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.ISV.Item.ItemMFGInfoDTOData" minOccurs="0"/&gt;
 *         &lt;element name="m_modifiedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_modifiedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="m_mrpInfo" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.ISV.Item.ItemMRPInfoDTOData" minOccurs="0"/&gt;
 *         &lt;element name="m_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_needInspect" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="m_org" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&gt;
 *         &lt;element name="m_picture" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="m_planCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="m_priceCategory" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&gt;
 *         &lt;element name="m_priceUOM" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&gt;
 *         &lt;element name="m_productionCategory" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&gt;
 *         &lt;element name="m_purchaseCategory" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&gt;
 *         &lt;element name="m_purchaseInfo" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.ISV.Item.ItemPurchaseInfoDTOData" minOccurs="0"/&gt;
 *         &lt;element name="m_purchaseUOM" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&gt;
 *         &lt;element name="m_recentlyCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="m_refrenceCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="m_sPECS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_saleCategory" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&gt;
 *         &lt;element name="m_saleInfo" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.ISV.Item.ItemSaleInfoDTOData" minOccurs="0"/&gt;
 *         &lt;element name="m_salesUOM" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&gt;
 *         &lt;element name="m_searchCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_standardBatchQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="m_standardCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="m_standardGrade" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="m_standardPotency" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="m_startGrade" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="m_startPotency" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="m_state" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="m_stateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="m_stateUser" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&gt;
 *         &lt;element name="m_status" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&gt;
 *         &lt;element name="m_statusLastModify" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="m_stockCategory" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&gt;
 *         &lt;element name="m_sysVersion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="m_tradeMark" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&gt;
 *         &lt;element name="m_version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_versionID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="m_weight" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="m_weightUom" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UFIDA.U9.ISV.Item.ItemMasterDTOData", propOrder = {
    "aliasName",
    "description",
    "multiAliasName",
    "multiDescription",
    "mAssetCategory",
    "mBoundedCategory",
    "mBoundedCountTaxRate",
    "mBoundedCountToLerance",
    "mBoundedTaxNO",
    "mBulkUom",
    "mCatalogNO",
    "mCode",
    "mCode1",
    "mCode2",
    "mConverRatioRule",
    "mCostCategory",
    "mCostCurrency",
    "mCostUOM",
    "mCreatedBy",
    "mCreatedOn",
    "mCreditCategory",
    "mCustomNumber",
    "mCustomTaxRate",
    "mDescFlexField",
    "mDrawbackRate",
    "mEffective",
    "mEndGrade",
    "mEndPotency",
    "mEntranceInfo",
    "mid",
    "mInspectionInfo",
    "mInternalTransCost",
    "mInventoryInfo",
    "mInventorySecondUOM",
    "mInventoryUOM",
    "mInventoryUOMGroup",
    "mIsBOMEnable",
    "mIsBounded",
    "mIsBuildEnable",
    "mIsCanFlowStat",
    "mIsCostCalByGrade",
    "mIsCostCalByPotency",
    "mIsDualQuantity",
    "mIsDualUOM",
    "mIsGradeControl",
    "mIsIncludedCostCa",
    "mIsIncludedStockAsset",
    "mIsInventoryEnable",
    "mIsMRPEnable",
    "mIsMultyUOM",
    "mIsNeedLicence",
    "mIsOutsideOperationEnable",
    "mIsPotencyControl",
    "mIsPurchaseEnable",
    "mIsSalesEnable",
    "mIsSpecialItem",
    "mIsTrademark",
    "mIsVMIEnable",
    "mIsVarRatio",
    "mIsVersionQtyControl",
    "mItemBulk",
    "mItemForm",
    "mItemFormAttribute",
    "mItemMasterVersions",
    "mItemSource",
    "mItemTradeMarkInfos",
    "mmrpCategory",
    "mMainItemCategory",
    "mManufactureUOM",
    "mMaterialOutUOM",
    "mMfgInfo",
    "mModifiedBy",
    "mModifiedOn",
    "mMrpInfo",
    "mName",
    "mNeedInspect",
    "mOrg",
    "mPicture",
    "mPlanCost",
    "mPriceCategory",
    "mPriceUOM",
    "mProductionCategory",
    "mPurchaseCategory",
    "mPurchaseInfo",
    "mPurchaseUOM",
    "mRecentlyCost",
    "mRefrenceCost",
    "mspecs",
    "mSaleCategory",
    "mSaleInfo",
    "mSalesUOM",
    "mSearchCode",
    "mStandardBatchQty",
    "mStandardCost",
    "mStandardGrade",
    "mStandardPotency",
    "mStartGrade",
    "mStartPotency",
    "mState",
    "mStateTime",
    "mStateUser",
    "mStatus",
    "mStatusLastModify",
    "mStockCategory",
    "mSysVersion",
    "mTradeMark",
    "mVersion",
    "mVersionID",
    "mWeight",
    "mWeightUom"
})
public class UFIDAU9ISVItemItemMasterDTOData
    extends UFSoftUBFBusinessDataTransObjectBase
{

    @XmlElementRef(name = "AliasName", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> aliasName;
    @XmlElementRef(name = "Description", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "Multi_AliasName", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<MultiLangDataDict> multiAliasName;
    @XmlElementRef(name = "Multi_Description", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<MultiLangDataDict> multiDescription;
    @XmlElementRef(name = "m_assetCategory", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mAssetCategory;
    @XmlElement(name = "m_boundedCategory")
    protected Integer mBoundedCategory;
    @XmlElement(name = "m_boundedCountTaxRate")
    protected BigDecimal mBoundedCountTaxRate;
    @XmlElement(name = "m_boundedCountToLerance")
    protected BigDecimal mBoundedCountToLerance;
    @XmlElementRef(name = "m_boundedTaxNO", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mBoundedTaxNO;
    @XmlElementRef(name = "m_bulkUom", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mBulkUom;
    @XmlElementRef(name = "m_catalogNO", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCatalogNO;
    @XmlElementRef(name = "m_code", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCode;
    @XmlElementRef(name = "m_code1", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCode1;
    @XmlElementRef(name = "m_code2", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCode2;
    @XmlElement(name = "m_converRatioRule")
    protected Integer mConverRatioRule;
    @XmlElementRef(name = "m_costCategory", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mCostCategory;
    @XmlElementRef(name = "m_costCurrency", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mCostCurrency;
    @XmlElementRef(name = "m_costUOM", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mCostUOM;
    @XmlElementRef(name = "m_createdBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCreatedBy;
    @XmlElement(name = "m_createdOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mCreatedOn;
    @XmlElementRef(name = "m_creditCategory", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mCreditCategory;
    @XmlElementRef(name = "m_customNumber", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCustomNumber;
    @XmlElement(name = "m_customTaxRate")
    protected BigDecimal mCustomTaxRate;
    @XmlElementRef(name = "m_descFlexField", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9BaseFlexFieldDescFlexFieldDescFlexSegmentsData> mDescFlexField;
    @XmlElement(name = "m_drawbackRate")
    protected BigDecimal mDrawbackRate;
    @XmlElementRef(name = "m_effective", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9BasePropertyTypesEffectiveData> mEffective;
    @XmlElement(name = "m_endGrade")
    protected Integer mEndGrade;
    @XmlElement(name = "m_endPotency")
    protected Integer mEndPotency;
    @XmlElementRef(name = "m_entranceInfo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9ISVItemEntranceInfoDTOData> mEntranceInfo;
    @XmlElement(name = "m_iD")
    protected Long mid;
    @XmlElementRef(name = "m_inspectionInfo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9ISVItemItemInspectionInfoDTOData> mInspectionInfo;
    @XmlElement(name = "m_internalTransCost")
    protected BigDecimal mInternalTransCost;
    @XmlElementRef(name = "m_inventoryInfo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9ISVItemItemInvInfoDTOData> mInventoryInfo;
    @XmlElementRef(name = "m_inventorySecondUOM", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mInventorySecondUOM;
    @XmlElementRef(name = "m_inventoryUOM", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mInventoryUOM;
    @XmlElement(name = "m_inventoryUOMGroup")
    protected Integer mInventoryUOMGroup;
    @XmlElement(name = "m_isBOMEnable")
    protected Boolean mIsBOMEnable;
    @XmlElement(name = "m_isBounded")
    protected Boolean mIsBounded;
    @XmlElement(name = "m_isBuildEnable")
    protected Boolean mIsBuildEnable;
    @XmlElement(name = "m_isCanFlowStat")
    protected Boolean mIsCanFlowStat;
    @XmlElement(name = "m_isCostCalByGrade")
    protected Boolean mIsCostCalByGrade;
    @XmlElement(name = "m_isCostCalByPotency")
    protected Boolean mIsCostCalByPotency;
    @XmlElement(name = "m_isDualQuantity")
    protected Boolean mIsDualQuantity;
    @XmlElement(name = "m_isDualUOM")
    protected Boolean mIsDualUOM;
    @XmlElement(name = "m_isGradeControl")
    protected Boolean mIsGradeControl;
    @XmlElement(name = "m_isIncludedCostCa")
    protected Boolean mIsIncludedCostCa;
    @XmlElement(name = "m_isIncludedStockAsset")
    protected Boolean mIsIncludedStockAsset;
    @XmlElement(name = "m_isInventoryEnable")
    protected Boolean mIsInventoryEnable;
    @XmlElement(name = "m_isMRPEnable")
    protected Boolean mIsMRPEnable;
    @XmlElement(name = "m_isMultyUOM")
    protected Boolean mIsMultyUOM;
    @XmlElement(name = "m_isNeedLicence")
    protected Boolean mIsNeedLicence;
    @XmlElement(name = "m_isOutsideOperationEnable")
    protected Boolean mIsOutsideOperationEnable;
    @XmlElement(name = "m_isPotencyControl")
    protected Boolean mIsPotencyControl;
    @XmlElement(name = "m_isPurchaseEnable")
    protected Boolean mIsPurchaseEnable;
    @XmlElement(name = "m_isSalesEnable")
    protected Boolean mIsSalesEnable;
    @XmlElement(name = "m_isSpecialItem")
    protected Boolean mIsSpecialItem;
    @XmlElement(name = "m_isTrademark")
    protected Boolean mIsTrademark;
    @XmlElement(name = "m_isVMIEnable")
    protected Boolean mIsVMIEnable;
    @XmlElement(name = "m_isVarRatio")
    protected Boolean mIsVarRatio;
    @XmlElement(name = "m_isVersionQtyControl")
    protected Boolean mIsVersionQtyControl;
    @XmlElement(name = "m_itemBulk")
    protected BigDecimal mItemBulk;
    @XmlElement(name = "m_itemForm")
    protected Integer mItemForm;
    @XmlElement(name = "m_itemFormAttribute")
    protected Integer mItemFormAttribute;
    @XmlElementRef(name = "m_itemMasterVersions", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9ISVItemItemMasterVersionDTOData> mItemMasterVersions;
    @XmlElementRef(name = "m_itemSource", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mItemSource;
    @XmlElementRef(name = "m_itemTradeMarkInfos", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9ISVItemItemTradeMarkDTOData> mItemTradeMarkInfos;
    @XmlElementRef(name = "m_mRPCategory", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mmrpCategory;
    @XmlElementRef(name = "m_mainItemCategory", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mMainItemCategory;
    @XmlElementRef(name = "m_manufactureUOM", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mManufactureUOM;
    @XmlElementRef(name = "m_materialOutUOM", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mMaterialOutUOM;
    @XmlElementRef(name = "m_mfgInfo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9ISVItemItemMFGInfoDTOData> mMfgInfo;
    @XmlElementRef(name = "m_modifiedBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mModifiedBy;
    @XmlElement(name = "m_modifiedOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mModifiedOn;
    @XmlElementRef(name = "m_mrpInfo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9ISVItemItemMRPInfoDTOData> mMrpInfo;
    @XmlElementRef(name = "m_name", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mName;
    @XmlElement(name = "m_needInspect")
    protected Boolean mNeedInspect;
    @XmlElementRef(name = "m_org", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mOrg;
    @XmlElementRef(name = "m_picture", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> mPicture;
    @XmlElement(name = "m_planCost")
    protected BigDecimal mPlanCost;
    @XmlElementRef(name = "m_priceCategory", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mPriceCategory;
    @XmlElementRef(name = "m_priceUOM", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mPriceUOM;
    @XmlElementRef(name = "m_productionCategory", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mProductionCategory;
    @XmlElementRef(name = "m_purchaseCategory", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mPurchaseCategory;
    @XmlElementRef(name = "m_purchaseInfo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9ISVItemItemPurchaseInfoDTOData> mPurchaseInfo;
    @XmlElementRef(name = "m_purchaseUOM", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mPurchaseUOM;
    @XmlElement(name = "m_recentlyCost")
    protected BigDecimal mRecentlyCost;
    @XmlElement(name = "m_refrenceCost")
    protected BigDecimal mRefrenceCost;
    @XmlElementRef(name = "m_sPECS", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mspecs;
    @XmlElementRef(name = "m_saleCategory", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mSaleCategory;
    @XmlElementRef(name = "m_saleInfo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9ISVItemItemSaleInfoDTOData> mSaleInfo;
    @XmlElementRef(name = "m_salesUOM", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mSalesUOM;
    @XmlElementRef(name = "m_searchCode", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mSearchCode;
    @XmlElement(name = "m_standardBatchQty")
    protected BigDecimal mStandardBatchQty;
    @XmlElement(name = "m_standardCost")
    protected BigDecimal mStandardCost;
    @XmlElement(name = "m_standardGrade")
    protected Integer mStandardGrade;
    @XmlElement(name = "m_standardPotency")
    protected Integer mStandardPotency;
    @XmlElement(name = "m_startGrade")
    protected Integer mStartGrade;
    @XmlElement(name = "m_startPotency")
    protected Integer mStartPotency;
    @XmlElement(name = "m_state")
    protected Integer mState;
    @XmlElement(name = "m_stateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mStateTime;
    @XmlElementRef(name = "m_stateUser", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mStateUser;
    @XmlElementRef(name = "m_status", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mStatus;
    @XmlElement(name = "m_statusLastModify")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mStatusLastModify;
    @XmlElementRef(name = "m_stockCategory", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mStockCategory;
    @XmlElement(name = "m_sysVersion")
    protected Long mSysVersion;
    @XmlElementRef(name = "m_tradeMark", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mTradeMark;
    @XmlElementRef(name = "m_version", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mVersion;
    @XmlElement(name = "m_versionID")
    protected Long mVersionID;
    @XmlElement(name = "m_weight")
    protected BigDecimal mWeight;
    @XmlElementRef(name = "m_weightUom", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mWeightUom;

    /**
     * ��ȡaliasName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAliasName() {
        return aliasName;
    }

    /**
     * ����aliasName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAliasName(JAXBElement<String> value) {
        this.aliasName = value;
    }

    /**
     * ��ȡdescription���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * ����description���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = value;
    }

    /**
     * ��ȡmultiAliasName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public JAXBElement<MultiLangDataDict> getMultiAliasName() {
        return multiAliasName;
    }

    /**
     * ����multiAliasName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public void setMultiAliasName(JAXBElement<MultiLangDataDict> value) {
        this.multiAliasName = value;
    }

    /**
     * ��ȡmultiDescription���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public JAXBElement<MultiLangDataDict> getMultiDescription() {
        return multiDescription;
    }

    /**
     * ����multiDescription���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public void setMultiDescription(JAXBElement<MultiLangDataDict> value) {
        this.multiDescription = value;
    }

    /**
     * ��ȡmAssetCategory���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMAssetCategory() {
        return mAssetCategory;
    }

    /**
     * ����mAssetCategory���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMAssetCategory(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mAssetCategory = value;
    }

    /**
     * ��ȡmBoundedCategory���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMBoundedCategory() {
        return mBoundedCategory;
    }

    /**
     * ����mBoundedCategory���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMBoundedCategory(Integer value) {
        this.mBoundedCategory = value;
    }

    /**
     * ��ȡmBoundedCountTaxRate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMBoundedCountTaxRate() {
        return mBoundedCountTaxRate;
    }

    /**
     * ����mBoundedCountTaxRate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMBoundedCountTaxRate(BigDecimal value) {
        this.mBoundedCountTaxRate = value;
    }

    /**
     * ��ȡmBoundedCountToLerance���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMBoundedCountToLerance() {
        return mBoundedCountToLerance;
    }

    /**
     * ����mBoundedCountToLerance���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMBoundedCountToLerance(BigDecimal value) {
        this.mBoundedCountToLerance = value;
    }

    /**
     * ��ȡmBoundedTaxNO���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMBoundedTaxNO() {
        return mBoundedTaxNO;
    }

    /**
     * ����mBoundedTaxNO���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMBoundedTaxNO(JAXBElement<String> value) {
        this.mBoundedTaxNO = value;
    }

    /**
     * ��ȡmBulkUom���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMBulkUom() {
        return mBulkUom;
    }

    /**
     * ����mBulkUom���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMBulkUom(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mBulkUom = value;
    }

    /**
     * ��ȡmCatalogNO���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMCatalogNO() {
        return mCatalogNO;
    }

    /**
     * ����mCatalogNO���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMCatalogNO(JAXBElement<String> value) {
        this.mCatalogNO = value;
    }

    /**
     * ��ȡmCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMCode() {
        return mCode;
    }

    /**
     * ����mCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMCode(JAXBElement<String> value) {
        this.mCode = value;
    }

    /**
     * ��ȡmCode1���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMCode1() {
        return mCode1;
    }

    /**
     * ����mCode1���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMCode1(JAXBElement<String> value) {
        this.mCode1 = value;
    }

    /**
     * ��ȡmCode2���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMCode2() {
        return mCode2;
    }

    /**
     * ����mCode2���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMCode2(JAXBElement<String> value) {
        this.mCode2 = value;
    }

    /**
     * ��ȡmConverRatioRule���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMConverRatioRule() {
        return mConverRatioRule;
    }

    /**
     * ����mConverRatioRule���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMConverRatioRule(Integer value) {
        this.mConverRatioRule = value;
    }

    /**
     * ��ȡmCostCategory���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMCostCategory() {
        return mCostCategory;
    }

    /**
     * ����mCostCategory���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMCostCategory(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mCostCategory = value;
    }

    /**
     * ��ȡmCostCurrency���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMCostCurrency() {
        return mCostCurrency;
    }

    /**
     * ����mCostCurrency���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMCostCurrency(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mCostCurrency = value;
    }

    /**
     * ��ȡmCostUOM���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMCostUOM() {
        return mCostUOM;
    }

    /**
     * ����mCostUOM���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMCostUOM(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mCostUOM = value;
    }

    /**
     * ��ȡmCreatedBy���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMCreatedBy() {
        return mCreatedBy;
    }

    /**
     * ����mCreatedBy���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMCreatedBy(JAXBElement<String> value) {
        this.mCreatedBy = value;
    }

    /**
     * ��ȡmCreatedOn���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMCreatedOn() {
        return mCreatedOn;
    }

    /**
     * ����mCreatedOn���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMCreatedOn(XMLGregorianCalendar value) {
        this.mCreatedOn = value;
    }

    /**
     * ��ȡmCreditCategory���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMCreditCategory() {
        return mCreditCategory;
    }

    /**
     * ����mCreditCategory���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMCreditCategory(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mCreditCategory = value;
    }

    /**
     * ��ȡmCustomNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMCustomNumber() {
        return mCustomNumber;
    }

    /**
     * ����mCustomNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMCustomNumber(JAXBElement<String> value) {
        this.mCustomNumber = value;
    }

    /**
     * ��ȡmCustomTaxRate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMCustomTaxRate() {
        return mCustomTaxRate;
    }

    /**
     * ����mCustomTaxRate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMCustomTaxRate(BigDecimal value) {
        this.mCustomTaxRate = value;
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
     * ��ȡmDrawbackRate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMDrawbackRate() {
        return mDrawbackRate;
    }

    /**
     * ����mDrawbackRate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMDrawbackRate(BigDecimal value) {
        this.mDrawbackRate = value;
    }

    /**
     * ��ȡmEffective���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9BasePropertyTypesEffectiveData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9BasePropertyTypesEffectiveData> getMEffective() {
        return mEffective;
    }

    /**
     * ����mEffective���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9BasePropertyTypesEffectiveData }{@code >}
     *     
     */
    public void setMEffective(JAXBElement<UFIDAU9BasePropertyTypesEffectiveData> value) {
        this.mEffective = value;
    }

    /**
     * ��ȡmEndGrade���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMEndGrade() {
        return mEndGrade;
    }

    /**
     * ����mEndGrade���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMEndGrade(Integer value) {
        this.mEndGrade = value;
    }

    /**
     * ��ȡmEndPotency���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMEndPotency() {
        return mEndPotency;
    }

    /**
     * ����mEndPotency���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMEndPotency(Integer value) {
        this.mEndPotency = value;
    }

    /**
     * ��ȡmEntranceInfo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9ISVItemEntranceInfoDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9ISVItemEntranceInfoDTOData> getMEntranceInfo() {
        return mEntranceInfo;
    }

    /**
     * ����mEntranceInfo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9ISVItemEntranceInfoDTOData }{@code >}
     *     
     */
    public void setMEntranceInfo(JAXBElement<UFIDAU9ISVItemEntranceInfoDTOData> value) {
        this.mEntranceInfo = value;
    }

    /**
     * ��ȡmid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMID() {
        return mid;
    }

    /**
     * ����mid���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMID(Long value) {
        this.mid = value;
    }

    /**
     * ��ȡmInspectionInfo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9ISVItemItemInspectionInfoDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9ISVItemItemInspectionInfoDTOData> getMInspectionInfo() {
        return mInspectionInfo;
    }

    /**
     * ����mInspectionInfo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9ISVItemItemInspectionInfoDTOData }{@code >}
     *     
     */
    public void setMInspectionInfo(JAXBElement<UFIDAU9ISVItemItemInspectionInfoDTOData> value) {
        this.mInspectionInfo = value;
    }

    /**
     * ��ȡmInternalTransCost���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMInternalTransCost() {
        return mInternalTransCost;
    }

    /**
     * ����mInternalTransCost���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMInternalTransCost(BigDecimal value) {
        this.mInternalTransCost = value;
    }

    /**
     * ��ȡmInventoryInfo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9ISVItemItemInvInfoDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9ISVItemItemInvInfoDTOData> getMInventoryInfo() {
        return mInventoryInfo;
    }

    /**
     * ����mInventoryInfo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9ISVItemItemInvInfoDTOData }{@code >}
     *     
     */
    public void setMInventoryInfo(JAXBElement<UFIDAU9ISVItemItemInvInfoDTOData> value) {
        this.mInventoryInfo = value;
    }

    /**
     * ��ȡmInventorySecondUOM���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMInventorySecondUOM() {
        return mInventorySecondUOM;
    }

    /**
     * ����mInventorySecondUOM���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMInventorySecondUOM(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mInventorySecondUOM = value;
    }

    /**
     * ��ȡmInventoryUOM���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMInventoryUOM() {
        return mInventoryUOM;
    }

    /**
     * ����mInventoryUOM���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMInventoryUOM(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mInventoryUOM = value;
    }

    /**
     * ��ȡmInventoryUOMGroup���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMInventoryUOMGroup() {
        return mInventoryUOMGroup;
    }

    /**
     * ����mInventoryUOMGroup���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMInventoryUOMGroup(Integer value) {
        this.mInventoryUOMGroup = value;
    }

    /**
     * ��ȡmIsBOMEnable���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsBOMEnable() {
        return mIsBOMEnable;
    }

    /**
     * ����mIsBOMEnable���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsBOMEnable(Boolean value) {
        this.mIsBOMEnable = value;
    }

    /**
     * ��ȡmIsBounded���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsBounded() {
        return mIsBounded;
    }

    /**
     * ����mIsBounded���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsBounded(Boolean value) {
        this.mIsBounded = value;
    }

    /**
     * ��ȡmIsBuildEnable���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsBuildEnable() {
        return mIsBuildEnable;
    }

    /**
     * ����mIsBuildEnable���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsBuildEnable(Boolean value) {
        this.mIsBuildEnable = value;
    }

    /**
     * ��ȡmIsCanFlowStat���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsCanFlowStat() {
        return mIsCanFlowStat;
    }

    /**
     * ����mIsCanFlowStat���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsCanFlowStat(Boolean value) {
        this.mIsCanFlowStat = value;
    }

    /**
     * ��ȡmIsCostCalByGrade���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsCostCalByGrade() {
        return mIsCostCalByGrade;
    }

    /**
     * ����mIsCostCalByGrade���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsCostCalByGrade(Boolean value) {
        this.mIsCostCalByGrade = value;
    }

    /**
     * ��ȡmIsCostCalByPotency���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsCostCalByPotency() {
        return mIsCostCalByPotency;
    }

    /**
     * ����mIsCostCalByPotency���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsCostCalByPotency(Boolean value) {
        this.mIsCostCalByPotency = value;
    }

    /**
     * ��ȡmIsDualQuantity���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsDualQuantity() {
        return mIsDualQuantity;
    }

    /**
     * ����mIsDualQuantity���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsDualQuantity(Boolean value) {
        this.mIsDualQuantity = value;
    }

    /**
     * ��ȡmIsDualUOM���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsDualUOM() {
        return mIsDualUOM;
    }

    /**
     * ����mIsDualUOM���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsDualUOM(Boolean value) {
        this.mIsDualUOM = value;
    }

    /**
     * ��ȡmIsGradeControl���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsGradeControl() {
        return mIsGradeControl;
    }

    /**
     * ����mIsGradeControl���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsGradeControl(Boolean value) {
        this.mIsGradeControl = value;
    }

    /**
     * ��ȡmIsIncludedCostCa���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsIncludedCostCa() {
        return mIsIncludedCostCa;
    }

    /**
     * ����mIsIncludedCostCa���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsIncludedCostCa(Boolean value) {
        this.mIsIncludedCostCa = value;
    }

    /**
     * ��ȡmIsIncludedStockAsset���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsIncludedStockAsset() {
        return mIsIncludedStockAsset;
    }

    /**
     * ����mIsIncludedStockAsset���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsIncludedStockAsset(Boolean value) {
        this.mIsIncludedStockAsset = value;
    }

    /**
     * ��ȡmIsInventoryEnable���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsInventoryEnable() {
        return mIsInventoryEnable;
    }

    /**
     * ����mIsInventoryEnable���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsInventoryEnable(Boolean value) {
        this.mIsInventoryEnable = value;
    }

    /**
     * ��ȡmIsMRPEnable���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsMRPEnable() {
        return mIsMRPEnable;
    }

    /**
     * ����mIsMRPEnable���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsMRPEnable(Boolean value) {
        this.mIsMRPEnable = value;
    }

    /**
     * ��ȡmIsMultyUOM���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsMultyUOM() {
        return mIsMultyUOM;
    }

    /**
     * ����mIsMultyUOM���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsMultyUOM(Boolean value) {
        this.mIsMultyUOM = value;
    }

    /**
     * ��ȡmIsNeedLicence���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsNeedLicence() {
        return mIsNeedLicence;
    }

    /**
     * ����mIsNeedLicence���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsNeedLicence(Boolean value) {
        this.mIsNeedLicence = value;
    }

    /**
     * ��ȡmIsOutsideOperationEnable���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsOutsideOperationEnable() {
        return mIsOutsideOperationEnable;
    }

    /**
     * ����mIsOutsideOperationEnable���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsOutsideOperationEnable(Boolean value) {
        this.mIsOutsideOperationEnable = value;
    }

    /**
     * ��ȡmIsPotencyControl���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsPotencyControl() {
        return mIsPotencyControl;
    }

    /**
     * ����mIsPotencyControl���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsPotencyControl(Boolean value) {
        this.mIsPotencyControl = value;
    }

    /**
     * ��ȡmIsPurchaseEnable���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsPurchaseEnable() {
        return mIsPurchaseEnable;
    }

    /**
     * ����mIsPurchaseEnable���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsPurchaseEnable(Boolean value) {
        this.mIsPurchaseEnable = value;
    }

    /**
     * ��ȡmIsSalesEnable���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsSalesEnable() {
        return mIsSalesEnable;
    }

    /**
     * ����mIsSalesEnable���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsSalesEnable(Boolean value) {
        this.mIsSalesEnable = value;
    }

    /**
     * ��ȡmIsSpecialItem���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsSpecialItem() {
        return mIsSpecialItem;
    }

    /**
     * ����mIsSpecialItem���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsSpecialItem(Boolean value) {
        this.mIsSpecialItem = value;
    }

    /**
     * ��ȡmIsTrademark���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsTrademark() {
        return mIsTrademark;
    }

    /**
     * ����mIsTrademark���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsTrademark(Boolean value) {
        this.mIsTrademark = value;
    }

    /**
     * ��ȡmIsVMIEnable���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsVMIEnable() {
        return mIsVMIEnable;
    }

    /**
     * ����mIsVMIEnable���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsVMIEnable(Boolean value) {
        this.mIsVMIEnable = value;
    }

    /**
     * ��ȡmIsVarRatio���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsVarRatio() {
        return mIsVarRatio;
    }

    /**
     * ����mIsVarRatio���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsVarRatio(Boolean value) {
        this.mIsVarRatio = value;
    }

    /**
     * ��ȡmIsVersionQtyControl���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsVersionQtyControl() {
        return mIsVersionQtyControl;
    }

    /**
     * ����mIsVersionQtyControl���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsVersionQtyControl(Boolean value) {
        this.mIsVersionQtyControl = value;
    }

    /**
     * ��ȡmItemBulk���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMItemBulk() {
        return mItemBulk;
    }

    /**
     * ����mItemBulk���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMItemBulk(BigDecimal value) {
        this.mItemBulk = value;
    }

    /**
     * ��ȡmItemForm���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMItemForm() {
        return mItemForm;
    }

    /**
     * ����mItemForm���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMItemForm(Integer value) {
        this.mItemForm = value;
    }

    /**
     * ��ȡmItemFormAttribute���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMItemFormAttribute() {
        return mItemFormAttribute;
    }

    /**
     * ����mItemFormAttribute���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMItemFormAttribute(Integer value) {
        this.mItemFormAttribute = value;
    }

    /**
     * ��ȡmItemMasterVersions���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVItemItemMasterVersionDTOData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9ISVItemItemMasterVersionDTOData> getMItemMasterVersions() {
        return mItemMasterVersions;
    }

    /**
     * ����mItemMasterVersions���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVItemItemMasterVersionDTOData }{@code >}
     *     
     */
    public void setMItemMasterVersions(JAXBElement<ArrayOfUFIDAU9ISVItemItemMasterVersionDTOData> value) {
        this.mItemMasterVersions = value;
    }

    /**
     * ��ȡmItemSource���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMItemSource() {
        return mItemSource;
    }

    /**
     * ����mItemSource���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMItemSource(JAXBElement<String> value) {
        this.mItemSource = value;
    }

    /**
     * ��ȡmItemTradeMarkInfos���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVItemItemTradeMarkDTOData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9ISVItemItemTradeMarkDTOData> getMItemTradeMarkInfos() {
        return mItemTradeMarkInfos;
    }

    /**
     * ����mItemTradeMarkInfos���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVItemItemTradeMarkDTOData }{@code >}
     *     
     */
    public void setMItemTradeMarkInfos(JAXBElement<ArrayOfUFIDAU9ISVItemItemTradeMarkDTOData> value) {
        this.mItemTradeMarkInfos = value;
    }

    /**
     * ��ȡmmrpCategory���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMMRPCategory() {
        return mmrpCategory;
    }

    /**
     * ����mmrpCategory���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMMRPCategory(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mmrpCategory = value;
    }

    /**
     * ��ȡmMainItemCategory���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMMainItemCategory() {
        return mMainItemCategory;
    }

    /**
     * ����mMainItemCategory���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMMainItemCategory(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mMainItemCategory = value;
    }

    /**
     * ��ȡmManufactureUOM���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMManufactureUOM() {
        return mManufactureUOM;
    }

    /**
     * ����mManufactureUOM���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMManufactureUOM(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mManufactureUOM = value;
    }

    /**
     * ��ȡmMaterialOutUOM���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMMaterialOutUOM() {
        return mMaterialOutUOM;
    }

    /**
     * ����mMaterialOutUOM���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMMaterialOutUOM(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mMaterialOutUOM = value;
    }

    /**
     * ��ȡmMfgInfo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9ISVItemItemMFGInfoDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9ISVItemItemMFGInfoDTOData> getMMfgInfo() {
        return mMfgInfo;
    }

    /**
     * ����mMfgInfo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9ISVItemItemMFGInfoDTOData }{@code >}
     *     
     */
    public void setMMfgInfo(JAXBElement<UFIDAU9ISVItemItemMFGInfoDTOData> value) {
        this.mMfgInfo = value;
    }

    /**
     * ��ȡmModifiedBy���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMModifiedBy() {
        return mModifiedBy;
    }

    /**
     * ����mModifiedBy���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMModifiedBy(JAXBElement<String> value) {
        this.mModifiedBy = value;
    }

    /**
     * ��ȡmModifiedOn���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMModifiedOn() {
        return mModifiedOn;
    }

    /**
     * ����mModifiedOn���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMModifiedOn(XMLGregorianCalendar value) {
        this.mModifiedOn = value;
    }

    /**
     * ��ȡmMrpInfo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9ISVItemItemMRPInfoDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9ISVItemItemMRPInfoDTOData> getMMrpInfo() {
        return mMrpInfo;
    }

    /**
     * ����mMrpInfo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9ISVItemItemMRPInfoDTOData }{@code >}
     *     
     */
    public void setMMrpInfo(JAXBElement<UFIDAU9ISVItemItemMRPInfoDTOData> value) {
        this.mMrpInfo = value;
    }

    /**
     * ��ȡmName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMName() {
        return mName;
    }

    /**
     * ����mName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMName(JAXBElement<String> value) {
        this.mName = value;
    }

    /**
     * ��ȡmNeedInspect���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMNeedInspect() {
        return mNeedInspect;
    }

    /**
     * ����mNeedInspect���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMNeedInspect(Boolean value) {
        this.mNeedInspect = value;
    }

    /**
     * ��ȡmOrg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMOrg() {
        return mOrg;
    }

    /**
     * ����mOrg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMOrg(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mOrg = value;
    }

    /**
     * ��ȡmPicture���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getMPicture() {
        return mPicture;
    }

    /**
     * ����mPicture���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setMPicture(JAXBElement<byte[]> value) {
        this.mPicture = value;
    }

    /**
     * ��ȡmPlanCost���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMPlanCost() {
        return mPlanCost;
    }

    /**
     * ����mPlanCost���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMPlanCost(BigDecimal value) {
        this.mPlanCost = value;
    }

    /**
     * ��ȡmPriceCategory���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMPriceCategory() {
        return mPriceCategory;
    }

    /**
     * ����mPriceCategory���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMPriceCategory(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mPriceCategory = value;
    }

    /**
     * ��ȡmPriceUOM���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMPriceUOM() {
        return mPriceUOM;
    }

    /**
     * ����mPriceUOM���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMPriceUOM(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mPriceUOM = value;
    }

    /**
     * ��ȡmProductionCategory���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMProductionCategory() {
        return mProductionCategory;
    }

    /**
     * ����mProductionCategory���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMProductionCategory(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mProductionCategory = value;
    }

    /**
     * ��ȡmPurchaseCategory���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMPurchaseCategory() {
        return mPurchaseCategory;
    }

    /**
     * ����mPurchaseCategory���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMPurchaseCategory(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mPurchaseCategory = value;
    }

    /**
     * ��ȡmPurchaseInfo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9ISVItemItemPurchaseInfoDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9ISVItemItemPurchaseInfoDTOData> getMPurchaseInfo() {
        return mPurchaseInfo;
    }

    /**
     * ����mPurchaseInfo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9ISVItemItemPurchaseInfoDTOData }{@code >}
     *     
     */
    public void setMPurchaseInfo(JAXBElement<UFIDAU9ISVItemItemPurchaseInfoDTOData> value) {
        this.mPurchaseInfo = value;
    }

    /**
     * ��ȡmPurchaseUOM���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMPurchaseUOM() {
        return mPurchaseUOM;
    }

    /**
     * ����mPurchaseUOM���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMPurchaseUOM(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mPurchaseUOM = value;
    }

    /**
     * ��ȡmRecentlyCost���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRecentlyCost() {
        return mRecentlyCost;
    }

    /**
     * ����mRecentlyCost���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRecentlyCost(BigDecimal value) {
        this.mRecentlyCost = value;
    }

    /**
     * ��ȡmRefrenceCost���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRefrenceCost() {
        return mRefrenceCost;
    }

    /**
     * ����mRefrenceCost���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRefrenceCost(BigDecimal value) {
        this.mRefrenceCost = value;
    }

    /**
     * ��ȡmspecs���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMSPECS() {
        return mspecs;
    }

    /**
     * ����mspecs���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMSPECS(JAXBElement<String> value) {
        this.mspecs = value;
    }

    /**
     * ��ȡmSaleCategory���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMSaleCategory() {
        return mSaleCategory;
    }

    /**
     * ����mSaleCategory���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMSaleCategory(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mSaleCategory = value;
    }

    /**
     * ��ȡmSaleInfo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9ISVItemItemSaleInfoDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9ISVItemItemSaleInfoDTOData> getMSaleInfo() {
        return mSaleInfo;
    }

    /**
     * ����mSaleInfo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9ISVItemItemSaleInfoDTOData }{@code >}
     *     
     */
    public void setMSaleInfo(JAXBElement<UFIDAU9ISVItemItemSaleInfoDTOData> value) {
        this.mSaleInfo = value;
    }

    /**
     * ��ȡmSalesUOM���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMSalesUOM() {
        return mSalesUOM;
    }

    /**
     * ����mSalesUOM���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMSalesUOM(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mSalesUOM = value;
    }

    /**
     * ��ȡmSearchCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMSearchCode() {
        return mSearchCode;
    }

    /**
     * ����mSearchCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMSearchCode(JAXBElement<String> value) {
        this.mSearchCode = value;
    }

    /**
     * ��ȡmStandardBatchQty���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMStandardBatchQty() {
        return mStandardBatchQty;
    }

    /**
     * ����mStandardBatchQty���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMStandardBatchQty(BigDecimal value) {
        this.mStandardBatchQty = value;
    }

    /**
     * ��ȡmStandardCost���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMStandardCost() {
        return mStandardCost;
    }

    /**
     * ����mStandardCost���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMStandardCost(BigDecimal value) {
        this.mStandardCost = value;
    }

    /**
     * ��ȡmStandardGrade���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMStandardGrade() {
        return mStandardGrade;
    }

    /**
     * ����mStandardGrade���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMStandardGrade(Integer value) {
        this.mStandardGrade = value;
    }

    /**
     * ��ȡmStandardPotency���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMStandardPotency() {
        return mStandardPotency;
    }

    /**
     * ����mStandardPotency���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMStandardPotency(Integer value) {
        this.mStandardPotency = value;
    }

    /**
     * ��ȡmStartGrade���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMStartGrade() {
        return mStartGrade;
    }

    /**
     * ����mStartGrade���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMStartGrade(Integer value) {
        this.mStartGrade = value;
    }

    /**
     * ��ȡmStartPotency���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMStartPotency() {
        return mStartPotency;
    }

    /**
     * ����mStartPotency���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMStartPotency(Integer value) {
        this.mStartPotency = value;
    }

    /**
     * ��ȡmState���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMState() {
        return mState;
    }

    /**
     * ����mState���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMState(Integer value) {
        this.mState = value;
    }

    /**
     * ��ȡmStateTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMStateTime() {
        return mStateTime;
    }

    /**
     * ����mStateTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMStateTime(XMLGregorianCalendar value) {
        this.mStateTime = value;
    }

    /**
     * ��ȡmStateUser���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMStateUser() {
        return mStateUser;
    }

    /**
     * ����mStateUser���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMStateUser(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mStateUser = value;
    }

    /**
     * ��ȡmStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMStatus() {
        return mStatus;
    }

    /**
     * ����mStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMStatus(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mStatus = value;
    }

    /**
     * ��ȡmStatusLastModify���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMStatusLastModify() {
        return mStatusLastModify;
    }

    /**
     * ����mStatusLastModify���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMStatusLastModify(XMLGregorianCalendar value) {
        this.mStatusLastModify = value;
    }

    /**
     * ��ȡmStockCategory���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMStockCategory() {
        return mStockCategory;
    }

    /**
     * ����mStockCategory���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMStockCategory(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mStockCategory = value;
    }

    /**
     * ��ȡmSysVersion���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMSysVersion() {
        return mSysVersion;
    }

    /**
     * ����mSysVersion���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMSysVersion(Long value) {
        this.mSysVersion = value;
    }

    /**
     * ��ȡmTradeMark���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMTradeMark() {
        return mTradeMark;
    }

    /**
     * ����mTradeMark���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMTradeMark(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mTradeMark = value;
    }

    /**
     * ��ȡmVersion���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMVersion() {
        return mVersion;
    }

    /**
     * ����mVersion���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMVersion(JAXBElement<String> value) {
        this.mVersion = value;
    }

    /**
     * ��ȡmVersionID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMVersionID() {
        return mVersionID;
    }

    /**
     * ����mVersionID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMVersionID(Long value) {
        this.mVersionID = value;
    }

    /**
     * ��ȡmWeight���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMWeight() {
        return mWeight;
    }

    /**
     * ����mWeight���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMWeight(BigDecimal value) {
        this.mWeight = value;
    }

    /**
     * ��ȡmWeightUom���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMWeightUom() {
        return mWeightUom;
    }

    /**
     * ����mWeightUom���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMWeightUom(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mWeightUom = value;
    }

}
