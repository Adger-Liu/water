package cn.hr.modulessy.entity;

import java.util.Date;

public class IvIninvoice {
    private Integer id;

    private Integer invoiceType;

    private String startNo;

    private String endNo;

    private Integer counts;

    private Date inDate;

    private Integer inEmpId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(Integer invoiceType) {
        this.invoiceType = invoiceType;
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

    public Date getInDate() {
        return inDate;
    }

    public void setInDate(Date inDate) {
        this.inDate = inDate;
    }

    public Integer getInEmpId() {
        return inEmpId;
    }

    public void setInEmpId(Integer inEmpId) {
        this.inEmpId = inEmpId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", invoiceType=").append(invoiceType);
        sb.append(", startNo=").append(startNo);
        sb.append(", endNo=").append(endNo);
        sb.append(", counts=").append(counts);
        sb.append(", inDate=").append(inDate);
        sb.append(", inEmpId=").append(inEmpId);
        sb.append("]");
        return sb.toString();
    }
}