package cn.hr.modulessy.entity;

import java.util.Date;

public class IvInvoice {
    private String invoiceNo;

    private Integer invoiceType;

    private Integer empId;

    private Integer inId;

    private Integer outId;

    private Integer archiveId;

    private Boolean used;

    private Date useDate;

    private Boolean invalid;

    private Date invalidDate;

    private Boolean archived;

    private Date archiveDate;

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public Integer getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(Integer invoiceType) {
        this.invoiceType = invoiceType;
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

    public Integer getOutId() {
        return outId;
    }

    public void setOutId(Integer outId) {
        this.outId = outId;
    }

    public Integer getArchiveId() {
        return archiveId;
    }

    public void setArchiveId(Integer archiveId) {
        this.archiveId = archiveId;
    }

    public Boolean getUsed() {
        return used;
    }

    public void setUsed(Boolean used) {
        this.used = used;
    }

    public Date getUseDate() {
        return useDate;
    }

    public void setUseDate(Date useDate) {
        this.useDate = useDate;
    }

    public Boolean getInvalid() {
        return invalid;
    }

    public void setInvalid(Boolean invalid) {
        this.invalid = invalid;
    }

    public Date getInvalidDate() {
        return invalidDate;
    }

    public void setInvalidDate(Date invalidDate) {
        this.invalidDate = invalidDate;
    }

    public Boolean getArchived() {
        return archived;
    }

    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    public Date getArchiveDate() {
        return archiveDate;
    }

    public void setArchiveDate(Date archiveDate) {
        this.archiveDate = archiveDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", invoiceNo=").append(invoiceNo);
        sb.append(", invoiceType=").append(invoiceType);
        sb.append(", empId=").append(empId);
        sb.append(", inId=").append(inId);
        sb.append(", outId=").append(outId);
        sb.append(", archiveId=").append(archiveId);
        sb.append(", used=").append(used);
        sb.append(", useDate=").append(useDate);
        sb.append(", invalid=").append(invalid);
        sb.append(", invalidDate=").append(invalidDate);
        sb.append(", archived=").append(archived);
        sb.append(", archiveDate=").append(archiveDate);
        sb.append("]");
        return sb.toString();
    }
}