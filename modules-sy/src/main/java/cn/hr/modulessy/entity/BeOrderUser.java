package cn.hr.modulessy.entity;

import java.math.BigDecimal;

public class BeOrderUser {
    private Integer id;

    private String orderNo;

    private String userName;

    private String phone;

    private String smsPhone;

    private String address;

    private BigDecimal projectMoney;

    private BigDecimal realMoney;

    private String invoiceNo;

    private String formula;

    private String contractNum;

    private Integer meterTypeId;

    private String meterName;

    private Integer maxValue;

    private Integer startValue;

    private String meterFactory;

    private String docNum;

    private String userNo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSmsPhone() {
        return smsPhone;
    }

    public void setSmsPhone(String smsPhone) {
        this.smsPhone = smsPhone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BigDecimal getProjectMoney() {
        return projectMoney;
    }

    public void setProjectMoney(BigDecimal projectMoney) {
        this.projectMoney = projectMoney;
    }

    public BigDecimal getRealMoney() {
        return realMoney;
    }

    public void setRealMoney(BigDecimal realMoney) {
        this.realMoney = realMoney;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public String getContractNum() {
        return contractNum;
    }

    public void setContractNum(String contractNum) {
        this.contractNum = contractNum;
    }

    public Integer getMeterTypeId() {
        return meterTypeId;
    }

    public void setMeterTypeId(Integer meterTypeId) {
        this.meterTypeId = meterTypeId;
    }

    public String getMeterName() {
        return meterName;
    }

    public void setMeterName(String meterName) {
        this.meterName = meterName;
    }

    public Integer getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(Integer maxValue) {
        this.maxValue = maxValue;
    }

    public Integer getStartValue() {
        return startValue;
    }

    public void setStartValue(Integer startValue) {
        this.startValue = startValue;
    }

    public String getMeterFactory() {
        return meterFactory;
    }

    public void setMeterFactory(String meterFactory) {
        this.meterFactory = meterFactory;
    }

    public String getDocNum() {
        return docNum;
    }

    public void setDocNum(String docNum) {
        this.docNum = docNum;
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderNo=").append(orderNo);
        sb.append(", userName=").append(userName);
        sb.append(", phone=").append(phone);
        sb.append(", smsPhone=").append(smsPhone);
        sb.append(", address=").append(address);
        sb.append(", projectMoney=").append(projectMoney);
        sb.append(", realMoney=").append(realMoney);
        sb.append(", invoiceNo=").append(invoiceNo);
        sb.append(", formula=").append(formula);
        sb.append(", contractNum=").append(contractNum);
        sb.append(", meterTypeId=").append(meterTypeId);
        sb.append(", meterName=").append(meterName);
        sb.append(", maxValue=").append(maxValue);
        sb.append(", startValue=").append(startValue);
        sb.append(", meterFactory=").append(meterFactory);
        sb.append(", docNum=").append(docNum);
        sb.append(", userNo=").append(userNo);
        sb.append("]");
        return sb.toString();
    }
}