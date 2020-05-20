package cn.hr.modulessy.entity;

import java.util.Date;

public class RdChangeValue {
    private Integer id;

    private Date date;

    private Integer empId;

    private String userNo;

    private Integer preValue1;

    private Integer preValue2;

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

    public Integer getPreValue1() {
        return preValue1;
    }

    public void setPreValue1(Integer preValue1) {
        this.preValue1 = preValue1;
    }

    public Integer getPreValue2() {
        return preValue2;
    }

    public void setPreValue2(Integer preValue2) {
        this.preValue2 = preValue2;
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
        sb.append(", preValue1=").append(preValue1);
        sb.append(", preValue2=").append(preValue2);
        sb.append(", remark=").append(remark);
        sb.append("]");
        return sb.toString();
    }
}