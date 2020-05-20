package cn.hr.modulessy.entity;

import java.util.Date;

public class RdChangeMaxValue {
    private Integer id;

    private Date date;

    private Integer empId;

    private String userNo;

    private String meterNo;

    private Integer maxValue1;

    private Integer maxValue2;

    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public String getMeterNo() {
        return meterNo;
    }

    public void setMeterNo(String meterNo) {
        this.meterNo = meterNo;
    }

    public Integer getMaxValue1() {
        return maxValue1;
    }

    public void setMaxValue1(Integer maxValue1) {
        this.maxValue1 = maxValue1;
    }

    public Integer getMaxValue2() {
        return maxValue2;
    }

    public void setMaxValue2(Integer maxValue2) {
        this.maxValue2 = maxValue2;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", date=").append(date);
        sb.append(", empId=").append(empId);
        sb.append(", userNo=").append(userNo);
        sb.append(", meterNo=").append(meterNo);
        sb.append(", maxValue1=").append(maxValue1);
        sb.append(", maxValue2=").append(maxValue2);
        sb.append(", remark=").append(remark);
        sb.append("]");
        return sb.toString();
    }
}