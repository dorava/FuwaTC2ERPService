package com.teamcenter.clientx;

public class  ConstantUtils {

	
//=========================================服务名常量====================================================
	
	/**
	 * UserService:修订配置FORM流水号
	 */
	public static final String STR_USERSERVICE_FUNCTION_MODIFY_CONFIGUR_FORM = "ModifyProperty";
	
	/**
	 * UserService:修订Item和ItemRevision的属性
	 */
	public static final String STR_USERSERVICE_FUNCTION_MODIFY_ITEM_REVISION = "ModifyObjectProperty";
	
//=========================================转阶段相关属性====================================================	
	
	/**
	 * 转阶段要修订的属性名
	 */
	public static final String STR_TURN_PHASES_MODIFY_PROPERTY = "fw9phase";
	
	/**
	 * 转阶段要修订的属性名值
	 */
	public static final String STR_TURN_PHASES_MODIFY_PROPERTY_VALUE = "MassProduction";
	
	/**
	 * 发布状态为"转阶段中"
	 */
	public static final String STR_TURN_PHASES_RELEASD_STATUS = "转阶段中";
	
	/**
	 * 申请单和要转阶段对象之间的Relation
	 */
	public static final String STR_TURN_PHASES_RELATION = "IMAN_specification";
	
	/**
	 * 转阶段对象类型
	 */
	public static final String STR_TURN_PHASES_ITEM_TYPE = "Fw9ChgPhaseReq";
	
//=========================================图号生成相关属性====================================================	
	
	/**
	 * 零件分类
	 */
	public static final String STR_TU_HAO_CLASS_Property = "fw9class";
	
	/**
	 * 零件类型
	 */
	public static final String STR_TU_HAO_TYPE_property = "fw9Type";
	
	/**
	 * Process Level
	 */
	public static final String STR_TU_HAO_PROCESS_property = "fw9process";
	
	/**
	 * 设计图号
	 */
	public static final String STR_TU_HAO_ITEM_ID_property = "fw9item_id";
	
	/**
	 * 工艺图号
	 */
	public static final String STR_TU_HAO_PROCESS_ITEM_ID_PROPERTY = "fw9technics_item_id";
	
	/**
	 * 要查询的FORM类型
	 */
	public static final String STR_QUERY_FORM_TYPE = "Fw9Configure";
	
	/**
	 * 要查询的FORM名称
	 */
	public static final String STR_QUERY_FORM_NAME = "ConfigureTemplate";
	
	/**
	 * 要使用的查询：FW9_ConfigureQuery
	 */
	public static final String STR_QUERY_COMPONENT = "Fw9ConfigureQuery";
	
	/**
	 * ImanQuery
	 */
	public static final String STR_QUERY = "ImanQuery";
	
	/**
	 * 流水号规则：与生产相关
	 */
	public static final String STR_CONSTANT_RELATION_PRODUCT = "与生产相关";
	
	/**
	 * 流水号规则: 与基本相关
	 */
	public static final String STR_CONSTANT_RELATION_BASE = "与基本型相关";
	
	/**
	 * BMIDE配置：与生产相关:0001--8999
	 */
	public static final String STR_CONFIGURE_ITEM_TYPE_PRODUCT = "Fw9ConfProduct";
	
	/**
	 * BMIDE配置: 与基本型相关：9000---9999
	 */
	public static final String STR_CONFIGURE_ITEM_TYPE_BASE = "Fw9ConfBase";
	
//=========================================U9ERP在Teamcenter的Option选项配置相关参数====================================================
	
	/**
	 * U9账号在Teamcenter的Option中的参数名
	 */
	public static final String U9_ACCOUNT_PREFERENCE = "FW9_U9_ACCOUNT"; 
	
	/**
	 * 企业编号
	 */
	public static final String U9_ACCOUNT_ENTERPRISE_CODE = "ENTERPRISE_CODE";
	
	/**
	 * 组织CODE
	 */
	public static final String U9_ACCOUNT_ORG_CODE = "ORG_CODE";
	
	/**
	 * 总部组织ID
	 */
	public static final String U9_ACCOUNT_ZB_ORG_ID = "ZB_ORG_ID";
	
	/**
	 * 总部组织CODE
	 */
	public static final String U9_ACCOUNT_ZB_ORG_CODE = "ZB_ORG_CODE";
	
	/**
	 * 组织ID
	 */
	public static final String U9_ACCOUNT_ORG_ID = "ORG_ID";
	
	/**
	 * SD组织ID
	 */
	public static final String U9_ACCOUNT_SD_ORG_ID = "SD_ORG_ID";
	
	/**
	 * 用户编码
	 */
	public static final String U9_ACCOUNT_USER_CODE = "USER_CODE";
	
	/**
	 * 用户ID
	 */
	public static final String U9_ACCOUNT_USER_ID = "USER_ID";
	
	
//=========================================Teamcenter_TO_U9属性====================================================	
	
	
	/**
	 * 客户物料号
	 */
	public static final String TC_PROPERTY_PART_NO = "fw9_CP_LBJ_05";
	
	/**
	 * 单位
	 */
	public static final String TC_PROPERTY_FW9_UNIT = "fw9unit";
	
	/**
	 * 净重
	 */
	public static final String TC_PROPERTY_FW9_WEIGHT = "fw9weight";
	
	/**
	 * 分类
	 */
	public static final String TC_PROPERTY_FW9_CLASS = "fw9class";
	
	/**
	 * 客户名称
	 */
	public static final String TC_PROPERTY_FW9_CUSTOMERNAME = "fw9customerName";
	
	/**
	 * 材料
	 */
	public static final String TC_PROPERTY_FW9_MATERIAL = "fw9material";
	
	/**
	 * 编号
	 */
	public static final String TC_PROPERTY_FW9_NO = "fw9no";
	
	/**
	 * 备注
	 */
	public static final String TC_PROPERTY_FW9_NOTE = "fw9note";
	
	/**
	 * 规格
	 */
	public static final String TC_PROPERTY_FW9_SPECIF = "fw9specif";
	
	/**
	 * 图号
	 */
	public static final String TC_PROPERTY_FW9_DRAWNNO = "fw9drawnNo";
	
	/**
	 * 零部件名称
	 */
	public static final String TC_PROPERTY_FW9_NAME = "fw9partName";
	
	/**
	 * 阶段
	 */
	public static final String TC_PROPERTY_FW9_PHASE = "fw9phase";
	
	/**
	 * 桥型
	 */
	public static final String TC_PROPERTY_FW9_AXLE_TYPE = "fw9axleType";
	
	/**
	 * 是否正式号
	 */
	public static final String TC_PROPERTY_FW9_OFFICIALID = "fw9officialID";
	
	
	/**
	 * item_id
	 */
	public static final String TC_PROPERTY_ITEM_ID = "item_id";
	
	/**
	 * object_name
	 */
	public static final String TC_PROPERTY_OBJECT_NAME = "object_name";
	/**
	 * bl_rev_current_id
	 */
	public static final String TC_PROPERTY_BL_REV_CURRENT_ID = "bl_rev_current_id";
	/**
	 * rev id
	 */
	public static final String TC_PROPERTY_BL_REV_ID = "item_revision_id";
	
	/**
	 * bl_sequence_no
	 */
	public static final String TC_PROPERTY_BL_SEQUENCE_NO = "bl_sequence_no";
	
	/**
	 * 
	 */
	public static final String TC_PROPERTY_ITEMREVISION_STRUCTURE_REVISIONS = "structure_revisions";
	
	/**
	 * 流程状态列表
	 */
	public static final String TC_PROPERTY_ITEMREVISION_PROCESS_STAGE_LIST = "process_stage_list";
	
	/**
	 * EBOM:视图
	 */
	public static final String TC_PROPERTY_ITEMREVISION_EBOMVIEW = "视图";
	
	
	/**
	 * PBOM:PBOM
	 */
	public static final String TC_PROPERTY_ITEMREVISION_PBOMVIEW = "PBOM";
	

	/**
	 * fw9_CP_LBJRev_09  毛重
	 */
	public static final String TC_PROPERTY_fw9_CP_LBJRev_09 = "fw9_CP_LBJRev_09";
	

	/**
	 * fw9_LBJRev_03  零件类型
	 */
	public static final String TC_PROPERTY_fw9_LBJRev_03 = "fw9_LBJRev_03";

//	
//	/**
//	 * 
//	 */
//	public static final String TC_PROPERTY = "";
//	
//	/**
//	 * 
//	 */
//=========================================Teamcenter Process 相关信息====================================================	
	/**
	 * EBOM:审批流程
	 */
	public static final String TC_PROCESS_EBOM_APPROVAL = "EBOM审批流程";
	
	
	/**
	 * EBOM:审批流程节点:获取物料编码
	 */
	public static final String TC_PROCESS_EBOM_APPROVAL_NODE = "获取物料编码";
	
	/**
	 * PBOM:审批流程
	 */
	public static final String TC_PROCESS_PBOM_APPROVAL = "PBOM审批流程";
	
	/**
	 * PBOM:审批流程节点:获取物料编码
	 */
	public static final String TC_PROCESS_PBOM_APPROVAL_NODE = "获取物料编码";
	
	/**
	 * PBOM:审批流程节点：BOM传递
	 */
	public static final String TC_PROCESS_PBOM_SENND2U9_NODE = "BOM传递ERP";
	/**
	 * 冷箱产品版本属性对应ERP分类
	 */
	public static final String TC_LXCP_CLASS_PROPERTY = "fw9_CP_LXRev_03";
}
