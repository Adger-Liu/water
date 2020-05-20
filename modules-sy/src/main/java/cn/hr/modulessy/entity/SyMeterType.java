package cn.hr.modulessy.entity;

public class SyMeterType {
    private Integer id;

    private String meterTypeName;

    private Integer aperture;

    private Integer mavvalue;

    private Integer minvalue;

    private Integer life;

    private String remark;

    private Boolean disabled;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMeterTypeName() {
        return meterTypeName;
    }

    public void setMeterTypeName(String meterTypeName) {
        this.meterTypeName = meterTypeName;
    }

    public Integer getAperture() {
        return aperture;
    }

    public void setAperture(Integer aperture) {
        this.aperture = aperture;
    }

    public Integer getMavvalue() {
        return mavvalue;
    }

    public void setMavvalue(Integer mavvalue) {
        this.mavvalue = mavvalue;
    }

    public Integer getMinvalue() {
        return minvalue;
    }

    public void setMinvalue(Integer minvalue) {
        this.minvalue = minvalue;
    }

    public Integer getLife() {
        return life;
    }

    public void setLife(Integer life) {
        this.life = life;
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
        sb.append(", meterTypeName=").append(meterTypeName);
        sb.append(", aperture=").append(aperture);
        sb.append(", mavvalue=").append(mavvalue);
        sb.append(", minvalue=").append(minvalue);
        sb.append(", life=").append(life);
        sb.append(", remark=").append(remark);
        sb.append(", disabled=").append(disabled);
        sb.append("]");
        return sb.toString();
    }
}