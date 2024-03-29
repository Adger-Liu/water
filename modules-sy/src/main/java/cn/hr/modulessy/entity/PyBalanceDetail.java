package cn.hr.modulessy.entity;

import java.math.BigDecimal;
import java.util.Date;

public class PyBalanceDetail {
    private Integer id;

    private Integer parentId;

    private String userNo;

    private Date balanceDate;

    private BigDecimal balanceMoney;

    private String billNo;

    private Integer billDetailId;

    private String costTypeCode;

    private BigDecimal detailRealMoney1;

    private BigDecimal detailRealMoney2;

    private String payNo;

    private BigDecimal payUseMoney1;

    private BigDecimal payUseMoney2;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
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

    public Integer getBillDetailId() {
        return billDetailId;
    }

    public void setBillDetailId(Integer billDetailId) {
        this.billDetailId = billDetailId;
    }

    public String getCostTypeCode() {
        return costTypeCode;
    }

    public void setCostTypeCode(String costTypeCode) {
        this.costTypeCode = costTypeCode;
    }

    public BigDecimal getDetailRealMoney1() {
        return detailRealMoney1;
    }

    public void setDetailRealMoney1(BigDecimal detailRealMoney1) {
        this.detailRealMoney1 = detailRealMoney1;
    }

    public BigDecimal getDetailRealMoney2() {
        return detailRealMoney2;
    }

    public void setDetailRealMoney2(BigDecimal detailRealMoney2) {
        this.detailRealMoney2 = detailRealMoney2;
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
        sb.append(", parentId=").append(parentId);
        sb.append(", userNo=").append(userNo);
        sb.append(", balanceDate=").append(balanceDate);
        sb.append(", balanceMoney=").append(balanceMoney);
        sb.append(", billNo=").append(billNo);
        sb.append(", billDetailId=").append(billDetailId);
        sb.append(", costTypeCode=").append(costTypeCode);
        sb.append(", detailRealMoney1=").append(detailRealMoney1);
        sb.append(", detailRealMoney2=").append(detailRealMoney2);
        sb.append(", payNo=").append(payNo);
        sb.append(", payUseMoney1=").append(payUseMoney1);
        sb.append(", payUseMoney2=").append(payUseMoney2);
        sb.append("]");
        return sb.toString();
    }
}