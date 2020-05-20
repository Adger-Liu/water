package cn.hr.modulessy.entity;

import java.math.BigDecimal;
import java.util.Date;

public class PyPay {
    private String payNo;

    private String userNo;

    private String payType;

    private Date payDate;

    private String invoice;

    private BigDecimal payMoney;

    private BigDecimal useMoney;

    private Integer empId;

    public String getPayNo() {
        return payNo;
    }

    public void setPayNo(String payNo) {
        this.payNo = payNo;
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public Date getPayDate() {
        return payDate;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }

    public String getInvoice() {
        return invoice;
    }

    public void setInvoice(String invoice) {
        this.invoice = invoice;
    }

    public BigDecimal getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(BigDecimal payMoney) {
        this.payMoney = payMoney;
    }

    public BigDecimal getUseMoney() {
        return useMoney;
    }

    public void setUseMoney(BigDecimal useMoney) {
        this.useMoney = useMoney;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", payNo=").append(payNo);
        sb.append(", userNo=").append(userNo);
        sb.append(", payType=").append(payType);
        sb.append(", payDate=").append(payDate);
        sb.append(", invoice=").append(invoice);
        sb.append(", payMoney=").append(payMoney);
        sb.append(", useMoney=").append(useMoney);
        sb.append(", empId=").append(empId);
        sb.append("]");
        return sb.toString();
    }
}