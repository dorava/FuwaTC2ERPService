package com.fuwa.services.model;

import java.math.BigDecimal;

public class LXBomModel {
	String material_code;
	String item_rev_id;
	String uom;
	BigDecimal usage_qty;
	BigDecimal parent_qty;
	String sequence_no;
	String installLocation;
	String openMaterialSize;
	String useWorkshop;
	public String getMaterial_code() {
		return material_code;
	}
	public void setMaterial_code(String material_code) {
		this.material_code = material_code;
	}
	public String getItem_rev_id() {
		return item_rev_id;
	}
	public void setItem_rev_id(String item_rev_id) {
		this.item_rev_id = item_rev_id;
	}
	public String getUom() {
		return uom;
	}
	public void setUom(String uom) {
		this.uom = uom;
	}
	public BigDecimal getUsage_qty() {
		return usage_qty;
	}
	public void setUsage_qty(BigDecimal usage_qty) {
		this.usage_qty = usage_qty;
	}
	public BigDecimal getParent_qty() {
		return parent_qty;
	}
	public void setParent_qty(BigDecimal parent_qty) {
		this.parent_qty = parent_qty;
	}
	public String getSequence_no() {
		return sequence_no;
	}
	public void setSequence_no(String sequence_no) {
		this.sequence_no = sequence_no;
	}
	public String getInstallLocation() {
		return installLocation;
	}
	public void setInstallLocation(String installLocation) {
		this.installLocation = installLocation;
	}
	public String getOpenMaterialSize() {
		return openMaterialSize;
	}
	public void setOpenMaterialSize(String openMaterialSize) {
		this.openMaterialSize = openMaterialSize;
	}
	public String getUseWorkshop() {
		return useWorkshop;
	}
	public void setUseWorkshop(String useWorkshop) {
		this.useWorkshop = useWorkshop;
	}
	

}
