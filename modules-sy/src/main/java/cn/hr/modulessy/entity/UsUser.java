package cn.hr.modulessy.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

public class UsUser {
    /***
     * 用户编码
     */
    private String userNo;

    /***
     * 用户姓名
     */
    private String userName;

    private String abc;

    /***
     * 创建时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createDate;

    private String address;

    private String phone;

    private String smsPhone;

    private Integer areaId;

    private String userType;

    private String payType;

    private String bankName;

    private String bankNum;

    private String formula;

    private BigDecimal userMoney;

    private Integer meterId;

    private String docNum;

    private String pwd;

    private String contractNum;

    private Date contractDate;

    private Integer volumeId;

    private Integer volumeOrderindex;

    private Boolean disabled;

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAbc() {
        return abc;
    }

    public void setAbc(String abc) {
        this.abc = abc;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankNum() {
        return bankNum;
    }

    public void setBankNum(String bankNum) {
        this.bankNum = bankNum;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public BigDecimal getUserMoney() {
        return userMoney;
    }

    public void setUserMoney(BigDecimal userMoney) {
        this.userMoney = userMoney;
    }

    public Integer getMeterId() {
        return meterId;
    }

    public void setMeterId(Integer meterId) {
        this.meterId = meterId;
    }

    public String getDocNum() {
        return docNum;
    }

    public void setDocNum(String docNum) {
        this.docNum = docNum;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getContractNum() {
        return contractNum;
    }

    public void setContractNum(String contractNum) {
        this.contractNum = contractNum;
    }

    public Date getContractDate() {
        return contractDate;
    }

    public void setContractDate(Date contractDate) {
        this.contractDate = contractDate;
    }

    public Integer getVolumeId() {
        return volumeId;
    }

    public void setVolumeId(Integer volumeId) {
        this.volumeId = volumeId;
    }

    public Integer getVolumeOrderindex() {
        return volumeOrderindex;
    }

    public void setVolumeOrderindex(Integer volumeOrderindex) {
        this.volumeOrderindex = volumeOrderindex;
    }

    public Boolean getDisabled() {
        return disabled;
    }

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userNo=").append(userNo);
        sb.append(", userName=").append(userName);
        sb.append(", abc=").append(abc);
        sb.append(", createDate=").append(createDate);
        sb.append(", address=").append(address);
        sb.append(", phone=").append(phone);
        sb.append(", smsPhone=").append(smsPhone);
        sb.append(", areaId=").append(areaId);
        sb.append(", userType=").append(userType);
        sb.append(", payType=").append(payType);
        sb.append(", bankName=").append(bankName);
        sb.append(", bankNum=").append(bankNum);
        sb.append(", formula=").append(formula);
        sb.append(", userMoney=").append(userMoney);
        sb.append(", meterId=").append(meterId);
        sb.append(", docNum=").append(docNum);
        sb.append(", pwd=").append(pwd);
        sb.append(", contractNum=").append(contractNum);
        sb.append(", contractDate=").append(contractDate);
        sb.append(", volumeId=").append(volumeId);
        sb.append(", volumeOrderindex=").append(volumeOrderindex);
        sb.append(", disabled=").append(disabled);
        sb.append("]");
        return sb.toString();
    }
}