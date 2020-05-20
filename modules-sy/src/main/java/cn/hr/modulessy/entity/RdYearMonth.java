package cn.hr.modulessy.entity;

import java.util.Date;

public class RdYearMonth {
    private Integer id;

    private Integer readYear;

    private Integer readMonth;

    private Boolean isCurrent;

    private Integer initEmpId;

    private Date initDate;

    private Date endDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getReadYear() {
        return readYear;
    }

    public void setReadYear(Integer readYear) {
        this.readYear = readYear;
    }

    public Integer getReadMonth() {
        return readMonth;
    }

    public void setReadMonth(Integer readMonth) {
        this.readMonth = readMonth;
    }

    public Boolean getIsCurrent() {
        return isCurrent;
    }

    public void setIsCurrent(Boolean isCurrent) {
        this.isCurrent = isCurrent;
    }

    public Integer getInitEmpId() {
        return initEmpId;
    }

    public void setInitEmpId(Integer initEmpId) {
        this.initEmpId = initEmpId;
    }

    public Date getInitDate() {
        return initDate;
    }

    public void setInitDate(Date initDate) {
        this.initDate = initDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", readYear=").append(readYear);
        sb.append(", readMonth=").append(readMonth);
        sb.append(", isCurrent=").append(isCurrent);
        sb.append(", initEmpId=").append(initEmpId);
        sb.append(", initDate=").append(initDate);
        sb.append(", endDate=").append(endDate);
        sb.append("]");
        return sb.toString();
    }
}