package cn.hr.modulessy.entity;

import java.math.BigDecimal;
import java.util.Date;

public class PyUserHistory {
    private Integer id;

    private String userNo;

    private Integer type;

    private String orderNo;

    private Date date;

    private Integer preValue;

    private Integer curValue;

    private Integer amount;

    private BigDecimal billMoney;

    private BigDecimal payMoney;

    private BigDecimal userMoney;

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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getPreValue() {
        return preValue;
    }

    public void setPreValue(Integer preValue) {
        this.preValue = preValue;
    }

    public Integer getCurValue() {
        return curValue;
    }

    public void setCurValue(Integer curValue) {
        this.curValue = curValue;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public BigDecimal getBillMoney() {
        return billMoney;
    }

    public void setBillMoney(BigDecimal billMoney) {
        this.billMoney = billMoney;
    }

    public BigDecimal getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(BigDecimal payMoney) {
        this.payMoney = payMoney;
    }

    public BigDecimal getUserMoney() {
        return userMoney;
    }

    public void setUserMoney(BigDecimal userMoney) {
        this.userMoney = userMoney;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userNo=").append(userNo);
        sb.append(", type=").append(type);
        sb.append(", orderNo=").append(orderNo);
        sb.append(", date=").append(date);
        sb.append(", preValue=").append(preValue);
        sb.append(", curValue=").append(curValue);
        sb.append(", amount=").append(amount);
        sb.append(", billMoney=").append(billMoney);
        sb.append(", payMoney=").append(payMoney);
        sb.append(", userMoney=").append(userMoney);
        sb.append("]");
        return sb.toString();
    }
}