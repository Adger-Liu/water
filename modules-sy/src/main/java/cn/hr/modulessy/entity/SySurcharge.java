package cn.hr.modulessy.entity;

public class SySurcharge {
    private Integer id;

    private Integer surchargeId;

    private Integer waterTypeId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSurchargeId() {
        return surchargeId;
    }

    public void setSurchargeId(Integer surchargeId) {
        this.surchargeId = surchargeId;
    }

    public Integer getWaterTypeId() {
        return waterTypeId;
    }

    public void setWaterTypeId(Integer waterTypeId) {
        this.waterTypeId = waterTypeId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", surchargeId=").append(surchargeId);
        sb.append(", waterTypeId=").append(waterTypeId);
        sb.append("]");
        return sb.toString();
    }
}