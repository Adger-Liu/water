package cn.hr.modulessy.entity;

import java.math.BigDecimal;
import java.util.Date;

public class PyBill {
    private String billNo;

    private Integer readId;

    private String userNo;

    private Date createDate;

    private BigDecimal billMoney;

    private BigDecimal realMoney;

    private Boolean balance;

    private Date balanceDate;

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
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

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public BigDecimal getBillMoney() {
        return billMoney;
    }

    public void setBillMoney(BigDecimal billMoney) {
        this.billMoney = billMoney;
    }

    public BigDecimal getRealMoney() {
        return realMoney;
    }

    public void setRealMoney(BigDecimal realMoney) {
        this.realMoney = realMoney;
    }

    public Boolean getBalance() {
        return balance;
    }

    public void setBalance(Boolean balance) {
        this.balance = balance;
    }

    public Date getBalanceDate() {
        return balanceDate;
    }

    public void setBalanceDate(Date balanceDate) {
        this.balanceDate = balanceDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", billNo=").append(billNo);
        sb.append(", readId=").append(readId);
        sb.append(", userNo=").append(userNo);
        sb.append(", createDate=").append(createDate);
        sb.append(", billMoney=").append(billMoney);
        sb.append(", realMoney=").append(realMoney);
        sb.append(", balance=").append(balance);
        sb.append(", balanceDate=").append(balanceDate);
        sb.append("]");
        return sb.toString();
    }
}