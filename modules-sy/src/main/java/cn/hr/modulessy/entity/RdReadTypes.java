package cn.hr.modulessy.entity;

public class RdReadTypes {
    private Integer id;

    private Integer readId;

    private String userNo;

    private String waterTypeCode;

    private String allotText;

    private Integer amount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getReadId() {
        return readId;
    }

    public void setReadId(Integer readId) {
        this.readId = readId;
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

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", readId=").append(readId);
        sb.append(", userNo=").append(userNo);
        sb.append(", waterTypeCode=").append(waterTypeCode);
        sb.append(", allotText=").append(allotText);
        sb.append(", amount=").append(amount);
        sb.append("]");
        return sb.toString();
    }
}