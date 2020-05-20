package cn.hr.modulessy.entity;

import java.math.BigDecimal;
import java.util.Date;

public class PyBalance {
    private Integer id;

    private String userNo;

    private Date balanceDate;

    private BigDecimal balanceMoney;

    private String billNo;

    private BigDecimal billRealMoney1;

    private BigDecimal billRealMoney2;

    private String payNo;

    private BigDecimal payUseMoney1;

    private BigDecimal payUseMoney2;

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

    public Date getBalanceDate() {
        return balanceDate;
    }

    public void setBalanceDate(Date balanceDate) {
        this.balanceDate = balanceDate;
    }

    public BigDecimal getBalanceMoney() {
        return balanceMoney;
    }

    public void setBalanceMoney(BigDecimal balanceMoney) {
        this.balanceMoney = balanceMoney;
    }

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    public BigDecimal getBillRealMoney1() {
        return billRealMoney1;
    }

    public void setBillRealMoney1(BigDecimal billRealMoney1) {
        this.billRealMoney1 = billRealMoney1;
    }

    public BigDecimal getBillRealMoney2() {
        return billRealMoney2;
    }

    public void setBillRealMoney2(BigDecimal billRealMoney2) {
        this.billRealMoney2 = billRealMoney2;
    }

    public String getPayNo() {
        return payNo;
    }

    public void setPayNo(String payNo) {
        this.payNo = payNo;
    }

    public BigDecimal getPayUseMoney1() {
        return payUseMoney1;
    }

    public void setPayUseMoney1(BigDecimal payUseMoney1) {
        this.payUseMoney1 = payUseMoney1;
    }

    public BigDecimal getPayUseMoney2() {
        return payUseMoney2;
    }

    public void setPayUseMoney2(BigDecimal payUseMoney2) {
        this.payUseMoney2 = payUseMoney2;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userNo=").append(userNo);
        sb.append(", balanceDate=").append(balanceDate);
        sb.append(", balanceMoney=").append(balanceMoney);
        sb.append(", billNo=").append(billNo);
        sb.append(", billRealMoney1=").append(billRealMoney1);
        sb.append(", billRealMoney2=").append(billRealMoney2);
        sb.append(", payNo=").append(payNo);
        sb.append(", payUseMoney1=").append(payUseMoney1);
        sb.append(", payUseMoney2=").append(payUseMoney2);
        sb.append("]");
        return sb.toString();
    }
}