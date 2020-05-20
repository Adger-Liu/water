package cn.hr.modulessy.entity;

public class UsFormula {
    private Integer id;

    private String userNo;

    private String waterTypeCode;

    private String allotText;

    private Integer allotType;

    private Integer allotValue;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public String getWaterTypeCode() {
        return waterTypeCode;
    }

    public void setWaterTypeCode(String waterTypeCode) {
        this.waterTypeCode = waterTypeCode;
    }

    public String getAllotText() {
        return allotText;
    }

    public void setAllotText(String allotText) {
        this.allotText = allotText;
    }

    public Integer getAllotType() {
        return allotType;
    }

    public void setAllotType(Integer allotType) {
        this.allotType = allotType;
    }

    public Integer getAllotValue() {
        return allotValue;
    }

    public void setAllotValue(Integer allotValue) {
        this.allotValue = allotValue;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userNo=").append(userNo);
        sb.append(", waterTypeCode=").append(waterTypeCode);
        sb.append(", allotText=").append(allotText);
        sb.append(", allotType=").append(allotType);
        sb.append(", allotValue=").append(allotValue);
        sb.append("]");
        return sb.toString();
    }
}