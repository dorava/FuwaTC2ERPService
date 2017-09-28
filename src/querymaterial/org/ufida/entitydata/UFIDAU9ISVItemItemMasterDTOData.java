
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
 * <p>UFIDA.U9.ISV.Item.ItemMasterDTOData complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取aliasName属性的值。
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
     * 设置aliasName属性的值。
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
     * 获取description属性的值。
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
     * 设置description属性的值。
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
     * 获取multiAliasName属性的值。
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
     * 设置multiAliasName属性的值。
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
     * 获取multiDescription属性的值。
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
     * 设置multiDescription属性的值。
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
     * 获取mAssetCategory属性的值。
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
     * 设置mAssetCategory属性的值。
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
     * 获取mBoundedCategory属性的值。
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
     * 设置mBoundedCategory属性的值。
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
     * 获取mBoundedCountTaxRate属性的值。
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
     * 设置mBoundedCountTaxRate属性的值。
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
     * 获取mBoundedCountToLerance属性的值。
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
     * 设置mBoundedCountToLerance属性的值。
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
     * 获取mBoundedTaxNO属性的值。
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
     * 设置mBoundedTaxNO属性的值。
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
     * 获取mBulkUom属性的值。
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
     * 设置mBulkUom属性的值。
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
     * 获取mCatalogNO属性的值。
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
     * 设置mCatalogNO属性的值。
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
     * 获取mCode属性的值。
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
     * 设置mCode属性的值。
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
     * 获取mCode1属性的值。
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
     * 设置mCode1属性的值。
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
     * 获取mCode2属性的值。
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
     * 设置mCode2属性的值。
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
     * 获取mConverRatioRule属性的值。
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
     * 设置mConverRatioRule属性的值。
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
     * 获取mCostCategory属性的值。
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
     * 设置mCostCategory属性的值。
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
     * 获取mCostCurrency属性的值。
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
     * 设置mCostCurrency属性的值。
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
     * 获取mCostUOM属性的值。
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
     * 设置mCostUOM属性的值。
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
     * 获取mCreatedBy属性的值。
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
     * 设置mCreatedBy属性的值。
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
     * 获取mCreatedOn属性的值。
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
     * 设置mCreatedOn属性的值。
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
     * 获取mCreditCategory属性的值。
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
     * 设置mCreditCategory属性的值。
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
     * 获取mCustomNumber属性的值。
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
     * 设置mCustomNumber属性的值。
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
     * 获取mCustomTaxRate属性的值。
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
     * 设置mCustomTaxRate属性的值。
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
     * 获取mDrawbackRate属性的值。
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
     * 设置mDrawbackRate属性的值。
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
     * 获取mEffective属性的值。
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
     * 设置mEffective属性的值。
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
     * 获取mEndGrade属性的值。
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
     * 设置mEndGrade属性的值。
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
     * 获取mEndPotency属性的值。
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
     * 设置mEndPotency属性的值。
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
     * 获取mEntranceInfo属性的值。
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
     * 设置mEntranceInfo属性的值。
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
     * 获取mid属性的值。
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
     * 设置mid属性的值。
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
     * 获取mInspectionInfo属性的值。
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
     * 设置mInspectionInfo属性的值。
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
     * 获取mInternalTransCost属性的值。
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
     * 设置mInternalTransCost属性的值。
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
     * 获取mInventoryInfo属性的值。
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
     * 设置mInventoryInfo属性的值。
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
     * 获取mInventorySecondUOM属性的值。
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
     * 设置mInventorySecondUOM属性的值。
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
     * 获取mInventoryUOM属性的值。
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
     * 设置mInventoryUOM属性的值。
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
     * 获取mInventoryUOMGroup属性的值。
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
     * 设置mInventoryUOMGroup属性的值。
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
     * 获取mIsBOMEnable属性的值。
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
     * 设置mIsBOMEnable属性的值。
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
     * 获取mIsBounded属性的值。
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
     * 设置mIsBounded属性的值。
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
     * 获取mIsBuildEnable属性的值。
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
     * 设置mIsBuildEnable属性的值。
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
     * 获取mIsCanFlowStat属性的值。
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
     * 设置mIsCanFlowStat属性的值。
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
     * 获取mIsCostCalByGrade属性的值。
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
     * 设置mIsCostCalByGrade属性的值。
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
     * 获取mIsCostCalByPotency属性的值。
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
     * 设置mIsCostCalByPotency属性的值。
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
     * 获取mIsDualQuantity属性的值。
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
     * 设置mIsDualQuantity属性的值。
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
     * 获取mIsDualUOM属性的值。
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
     * 设置mIsDualUOM属性的值。
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
     * 获取mIsGradeControl属性的值。
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
     * 设置mIsGradeControl属性的值。
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
     * 获取mIsIncludedCostCa属性的值。
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
     * 设置mIsIncludedCostCa属性的值。
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
     * 获取mIsIncludedStockAsset属性的值。
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
     * 设置mIsIncludedStockAsset属性的值。
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
     * 获取mIsInventoryEnable属性的值。
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
     * 设置mIsInventoryEnable属性的值。
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
     * 获取mIsMRPEnable属性的值。
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
     * 设置mIsMRPEnable属性的值。
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
     * 获取mIsMultyUOM属性的值。
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
     * 设置mIsMultyUOM属性的值。
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
     * 获取mIsNeedLicence属性的值。
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
     * 设置mIsNeedLicence属性的值。
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
     * 获取mIsOutsideOperationEnable属性的值。
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
     * 设置mIsOutsideOperationEnable属性的值。
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
     * 获取mIsPotencyControl属性的值。
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
     * 设置mIsPotencyControl属性的值。
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
     * 获取mIsPurchaseEnable属性的值。
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
     * 设置mIsPurchaseEnable属性的值。
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
     * 获取mIsSalesEnable属性的值。
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
     * 设置mIsSalesEnable属性的值。
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
     * 获取mIsSpecialItem属性的值。
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
     * 设置mIsSpecialItem属性的值。
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
     * 获取mIsTrademark属性的值。
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
     * 设置mIsTrademark属性的值。
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
     * 获取mIsVMIEnable属性的值。
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
     * 设置mIsVMIEnable属性的值。
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
     * 获取mIsVarRatio属性的值。
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
     * 设置mIsVarRatio属性的值。
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
     * 获取mIsVersionQtyControl属性的值。
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
     * 设置mIsVersionQtyControl属性的值。
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
     * 获取mItemBulk属性的值。
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
     * 设置mItemBulk属性的值。
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
     * 获取mItemForm属性的值。
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
     * 设置mItemForm属性的值。
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
     * 获取mItemFormAttribute属性的值。
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
     * 设置mItemFormAttribute属性的值。
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
     * 获取mItemMasterVersions属性的值。
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
     * 设置mItemMasterVersions属性的值。
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
     * 获取mItemSource属性的值。
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
     * 设置mItemSource属性的值。
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
     * 获取mItemTradeMarkInfos属性的值。
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
     * 设置mItemTradeMarkInfos属性的值。
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
     * 获取mmrpCategory属性的值。
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
     * 设置mmrpCategory属性的值。
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
     * 获取mMainItemCategory属性的值。
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
     * 设置mMainItemCategory属性的值。
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
     * 获取mManufactureUOM属性的值。
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
     * 设置mManufactureUOM属性的值。
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
     * 获取mMaterialOutUOM属性的值。
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
     * 设置mMaterialOutUOM属性的值。
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
     * 获取mMfgInfo属性的值。
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
     * 设置mMfgInfo属性的值。
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
     * 获取mModifiedBy属性的值。
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
     * 设置mModifiedBy属性的值。
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
     * 获取mModifiedOn属性的值。
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
     * 设置mModifiedOn属性的值。
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
     * 获取mMrpInfo属性的值。
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
     * 设置mMrpInfo属性的值。
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
     * 获取mName属性的值。
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
     * 设置mName属性的值。
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
     * 获取mNeedInspect属性的值。
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
     * 设置mNeedInspect属性的值。
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
     * 获取mOrg属性的值。
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
     * 设置mOrg属性的值。
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
     * 获取mPicture属性的值。
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
     * 设置mPicture属性的值。
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
     * 获取mPlanCost属性的值。
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
     * 设置mPlanCost属性的值。
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
     * 获取mPriceCategory属性的值。
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
     * 设置mPriceCategory属性的值。
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
     * 获取mPriceUOM属性的值。
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
     * 设置mPriceUOM属性的值。
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
     * 获取mProductionCategory属性的值。
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
     * 设置mProductionCategory属性的值。
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
     * 获取mPurchaseCategory属性的值。
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
     * 设置mPurchaseCategory属性的值。
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
     * 获取mPurchaseInfo属性的值。
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
     * 设置mPurchaseInfo属性的值。
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
     * 获取mPurchaseUOM属性的值。
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
     * 设置mPurchaseUOM属性的值。
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
     * 获取mRecentlyCost属性的值。
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
     * 设置mRecentlyCost属性的值。
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
     * 获取mRefrenceCost属性的值。
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
     * 设置mRefrenceCost属性的值。
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
     * 获取mspecs属性的值。
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
     * 设置mspecs属性的值。
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
     * 获取mSaleCategory属性的值。
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
     * 设置mSaleCategory属性的值。
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
     * 获取mSaleInfo属性的值。
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
     * 设置mSaleInfo属性的值。
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
     * 获取mSalesUOM属性的值。
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
     * 设置mSalesUOM属性的值。
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
     * 获取mSearchCode属性的值。
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
     * 设置mSearchCode属性的值。
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
     * 获取mStandardBatchQty属性的值。
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
     * 设置mStandardBatchQty属性的值。
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
     * 获取mStandardCost属性的值。
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
     * 设置mStandardCost属性的值。
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
     * 获取mStandardGrade属性的值。
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
     * 设置mStandardGrade属性的值。
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
     * 获取mStandardPotency属性的值。
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
     * 设置mStandardPotency属性的值。
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
     * 获取mStartGrade属性的值。
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
     * 设置mStartGrade属性的值。
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
     * 获取mStartPotency属性的值。
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
     * 设置mStartPotency属性的值。
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
     * 获取mState属性的值。
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
     * 设置mState属性的值。
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
     * 获取mStateTime属性的值。
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
     * 设置mStateTime属性的值。
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
     * 获取mStateUser属性的值。
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
     * 设置mStateUser属性的值。
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
     * 获取mStatus属性的值。
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
     * 设置mStatus属性的值。
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
     * 获取mStatusLastModify属性的值。
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
     * 设置mStatusLastModify属性的值。
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
     * 获取mStockCategory属性的值。
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
     * 设置mStockCategory属性的值。
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
     * 获取mSysVersion属性的值。
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
     * 设置mSysVersion属性的值。
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
     * 获取mTradeMark属性的值。
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
     * 设置mTradeMark属性的值。
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
     * 获取mVersion属性的值。
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
     * 设置mVersion属性的值。
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
     * 获取mVersionID属性的值。
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
     * 设置mVersionID属性的值。
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
     * 获取mWeight属性的值。
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
     * 设置mWeight属性的值。
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
     * 获取mWeightUom属性的值。
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
     * 设置mWeightUom属性的值。
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
