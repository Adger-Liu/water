package cn.hr.modulessy.entity;

public class BeFormula {
    private Integer id;

    private Integer orderUserId;

    private String waterTypeCode;

    private String alloText;

    private Integer alloType;

    private Integer alloValue;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderUserId() {
        return orderUserId;
    }

    public void setOrderUserId(Integer orderUserId) {
        this.orderUserId = orderUserId;
    }

    public String getWaterTypeCode() {
        return waterTypeCode;
    }

    public void setWaterTypeCode(String waterTypeCode) {
        this.waterTypeCode = waterTypeCode;
    }

    public String getAlloText() {
        return alloText;
    }

    public void setAlloText(String alloText) {
        this.alloText = alloText;
    }

    public Integer getAlloType() {
        return alloType;
    }

    public void setAlloType(Integer alloType) {
        this.alloType = alloType;
    }

    public Integer getAlloValue() {
        return alloValue;
    }

    public void setAlloValue(Integer alloValue) {
        this.alloValue = alloValue;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderUserId=").append(orderUserId);
        sb.append(", waterTypeCode=").append(waterTypeCode);
        sb.append(", alloText=").append(alloText);
        sb.append(", alloType=").append(alloType);
        sb.append(", alloValue=").append(alloValue);
        sb.append("]");
        return sb.toString();
    }
}