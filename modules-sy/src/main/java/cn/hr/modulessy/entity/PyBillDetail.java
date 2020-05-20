package cn.hr.modulessy.entity;

import java.math.BigDecimal;
import java.util.Date;

public class PyBillDetail {
    private Integer id;

    private String billNo;

    private String userNo;

    private String costTypeCode;

    private Integer amount;

    private BigDecimal price;

    private BigDecimal detailMoney;

    private BigDecimal realMoney;

    private Boolean balance;

    private Date balanceDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public String getCostTypeCode() {
        return costTypeCode;
    }

    public void setCostTypeCode(String costTypeCode) {
        this.costTypeCode = costTypeCode;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getDetailMoney() {
        return detailMoney;
    }

    public void setDetailMoney(BigDecimal detailMoney) {
        this.detailMoney = detailMoney;
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
        sb.append(", id=").append(id);
        sb.append(", billNo=").append(billNo);
        sb.append(", userNo=").append(userNo);
        sb.append(", costTypeCode=").append(costTypeCode);
        sb.append(", amount=").append(amount);
        sb.append(", price=").append(price);
        sb.append(", detailMoney=").append(detailMoney);
        sb.append(", realMoney=").append(realMoney);
        sb.append(", balance=").append(balance);
        sb.append(", balanceDate=").append(balanceDate);
        sb.append("]");
        return sb.toString();
    }
}