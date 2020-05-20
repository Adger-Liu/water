package cn.hr.modulessy.entity;

import java.util.Date;

public class IvOutinvoice {
    private Integer id;

    private Integer empId;

    private Integer inId;

    private String startNo;

    private String endNo;

    private Integer counts;

    private Date outDate;

    private Integer outEmpId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public Integer getInId() {
        return inId;
    }

    public void setInId(Integer inId) {
        this.inId = inId;
    }

    public String getStartNo() {
        return startNo;
    }

    public void setStartNo(String startNo) {
        this.startNo = startNo;
    }

    public String getEndNo() {
        return endNo;
    }

    public void setEndNo(String endNo) {
        this.endNo = endNo;
    }

    public Integer getCounts() {
        return counts;
    }

    public void setCounts(Integer counts) {
        this.counts = counts;
    }

    public Date getOutDate() {
        return outDate;
    }

    public void setOutDate(Date outDate) {
        this.outDate = outDate;
    }

    public Integer getOutEmpId() {
        return outEmpId;
    }

    public void setOutEmpId(Integer outEmpId) {
        this.outEmpId = outEmpId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", empId=").append(empId);
        sb.append(", inId=").append(inId);
        sb.append(", startNo=").append(startNo);
        sb.append(", endNo=").append(endNo);
        sb.append(", counts=").append(counts);
        sb.append(", outDate=").append(outDate);
        sb.append(", outEmpId=").append(outEmpId);
        sb.append("]");
        return sb.toString();
    }
}