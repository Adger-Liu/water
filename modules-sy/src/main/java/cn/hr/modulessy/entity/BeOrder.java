package cn.hr.modulessy.entity;

import java.math.BigDecimal;
import java.util.Date;

public class BeOrder {
    private String orderNo;

    private Integer orderType;

    private Integer stpeId;

    private Integer createEmp;

    private Date createDate;

    private Integer completeEmp;

    private Date completeDate;

    private Integer lastEditEmp;

    private String userName;

    private String userType;

    private String address;

    private String linkMan;

    private String phone;

    private String useTarget;

    private Integer houseHeight;

    private Integer maxAmount;

    private Integer meterTypeId;

    private Integer meterCount;

    private String userRemark;

    private String payType;

    private String bankCompany;

    private String bankNum;

    private String oldUserNo;

    private String oldUserName;

    private String oldUserPhone;

    private String oldUserAddr;

    private String oldMeter;

    private Integer auditEmpId;

    private String auditMessage;

    private BigDecimal projectMoney;

    private BigDecimal realMoney;

    private Date payDate;

    private Date projectDate1;

    private Date projectDate2;

    private Integer areaId;

    private String abortCause;

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public Integer getStpeId() {
        return stpeId;
    }

    public void setStpeId(Integer stpeId) {
        this.stpeId = stpeId;
    }

    public Integer getCreateEmp() {
        return createEmp;
    }

    public void setCreateEmp(Integer createEmp) {
        this.createEmp = createEmp;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getCompleteEmp() {
        return completeEmp;
    }

    public void setCompleteEmp(Integer completeEmp) {
        this.completeEmp = completeEmp;
    }

    public Date getCompleteDate() {
        return completeDate;
    }

    public void setCompleteDate(Date completeDate) {
        this.completeDate = completeDate;
    }

    public Integer getLastEditEmp() {
        return lastEditEmp;
    }

    public void setLastEditEmp(Integer lastEditEmp) {
        this.lastEditEmp = lastEditEmp;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLinkMan() {
        return linkMan;
    }

    public void setLinkMan(String linkMan) {
        this.linkMan = linkMan;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUseTarget() {
        return useTarget;
    }

    public void setUseTarget(String useTarget) {
        this.useTarget = useTarget;
    }

    public Integer getHouseHeight() {
        return houseHeight;
    }

    public void setHouseHeight(Integer houseHeight) {
        this.houseHeight = houseHeight;
    }

    public Integer getMaxAmount() {
        return maxAmount;
    }

    public void setMaxAmount(Integer maxAmount) {
        this.maxAmount = maxAmount;
    }

    public Integer getMeterTypeId() {
        return meterTypeId;
    }

    public void setMeterTypeId(Integer meterTypeId) {
        this.meterTypeId = meterTypeId;
    }

    public Integer getMeterCount() {
        return meterCount;
    }

    public void setMeterCount(Integer meterCount) {
        this.meterCount = meterCount;
    }

    public String getUserRemark() {
        return userRemark;
    }

    public void setUserRemark(String userRemark) {
        this.userRemark = userRemark;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getBankCompany() {
        return bankCompany;
    }

    public void setBankCompany(String bankCompany) {
        this.bankCompany = bankCompany;
    }

    public String getBankNum() {
        return bankNum;
    }

    public void setBankNum(String bankNum) {
        this.bankNum = bankNum;
    }

    public String getOldUserNo() {
        return oldUserNo;
    }

    public void setOldUserNo(String oldUserNo) {
        this.oldUserNo = oldUserNo;
    }

    public String getOldUserName() {
        return oldUserName;
    }

    public void setOldUserName(String oldUserName) {
        this.oldUserName = oldUserName;
    }

    public String getOldUserPhone() {
        return oldUserPhone;
    }

    public void setOldUserPhone(String oldUserPhone) {
        this.oldUserPhone = oldUserPhone;
    }

    public String getOldUserAddr() {
        return oldUserAddr;
    }

    public void setOldUserAddr(String oldUserAddr) {
        this.oldUserAddr = oldUserAddr;
    }

    public String getOldMeter() {
        return oldMeter;
    }

    public void setOldMeter(String oldMeter) {
        this.oldMeter = oldMeter;
    }

    public Integer getAuditEmpId() {
        return auditEmpId;
    }

    public void setAuditEmpId(Integer auditEmpId) {
        this.auditEmpId = auditEmpId;
    }

    public String getAuditMessage() {
        return auditMessage;
    }

    public void setAuditMessage(String auditMessage) {
        this.auditMessage = auditMessage;
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

    public Date getPayDate() {
        return payDate;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }

    public Date getProjectDate1() {
        return projectDate1;
    }

    public void setProjectDate1(Date projectDate1) {
        this.projectDate1 = projectDate1;
    }

    public Date getProjectDate2() {
        return projectDate2;
    }

    public void setProjectDate2(Date projectDate2) {
        this.projectDate2 = projectDate2;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getAbortCause() {
        return abortCause;
    }

    public void setAbortCause(String abortCause) {
        this.abortCause = abortCause;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderNo=").append(orderNo);
        sb.append(", orderType=").append(orderType);
        sb.append(", stpeId=").append(stpeId);
        sb.append(", createEmp=").append(createEmp);
        sb.append(", createDate=").append(createDate);
        sb.append(", completeEmp=").append(completeEmp);
        sb.append(", completeDate=").append(completeDate);
        sb.append(", lastEditEmp=").append(lastEditEmp);
        sb.append(", userName=").append(userName);
        sb.append(", userType=").append(userType);
        sb.append(", address=").append(address);
        sb.append(", linkMan=").append(linkMan);
        sb.append(", phone=").append(phone);
        sb.append(", useTarget=").append(useTarget);
        sb.append(", houseHeight=").append(houseHeight);
        sb.append(", maxAmount=").append(maxAmount);
        sb.append(", meterTypeId=").append(meterTypeId);
        sb.append(", meterCount=").append(meterCount);
        sb.append(", userRemark=").append(userRemark);
        sb.append(", payType=").append(payType);
        sb.append(", bankCompany=").append(bankCompany);
        sb.append(", bankNum=").append(bankNum);
        sb.append(", oldUserNo=").append(oldUserNo);
        sb.append(", oldUserName=").append(oldUserName);
        sb.append(", oldUserPhone=").append(oldUserPhone);
        sb.append(", oldUserAddr=").append(oldUserAddr);
        sb.append(", oldMeter=").append(oldMeter);
        sb.append(", auditEmpId=").append(auditEmpId);
        sb.append(", auditMessage=").append(auditMessage);
        sb.append(", projectMoney=").append(projectMoney);
        sb.append(", realMoney=").append(realMoney);
        sb.append(", payDate=").append(payDate);
        sb.append(", projectDate1=").append(projectDate1);
        sb.append(", projectDate2=").append(projectDate2);
        sb.append(", areaId=").append(areaId);
        sb.append(", abortCause=").append(abortCause);
        sb.append("]");
        return sb.toString();
    }
}