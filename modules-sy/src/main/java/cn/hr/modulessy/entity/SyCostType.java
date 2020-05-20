package cn.hr.modulessy.entity;

import java.math.BigDecimal;

public class SyCostType {
    private Integer id;

    private Integer kind;

    private String code;

    private String costTypeName;

    private String fullName;

    private BigDecimal price;

    private String surchargeText;

    private String remark;

    private Boolean disabled;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getKind() {
        return kind;
    }

    public void setKind(Integer kind) {
        this.kind = kind;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCostTypeName() {
        return costTypeName;
    }

    public void setCostTypeName(String costTypeName) {
        this.costTypeName = costTypeName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getSurchargeText() {
        return surchargeText;
    }

    public void setSurchargeText(String surchargeText) {
        this.surchargeText = surchargeText;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Boolean getDisabled() {
        return disabled;
    }

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", kind=").append(kind);
        sb.append(", code=").append(code);
        sb.append(", costTypeName=").append(costTypeName);
        sb.append(", fullName=").append(fullName);
        sb.append(", price=").append(price);
        sb.append(", surchargeText=").append(surchargeText);
        sb.append(", remark=").append(remark);
        sb.append(", disabled=").append(disabled);
        sb.append("]");
        return sb.toString();
    }
}