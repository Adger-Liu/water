package cn.hr.modulessy.entity;

import java.util.Date;

public class UsMeter {
    private String meterNo;

    private String userNo;

    private String meterName;

    private Integer meterTypeId;

    /**
     * 最大表码值
     */
    private Integer maxValue;

    private Integer startValue;

    /**
     * 装表日期
     */
    private Date setupDate;

    /**
     * 水表厂家
     */
    private String factory;

    private Boolean disabled;

    public String getMeterNo() {
        return meterNo;
    }

    public void setMeterNo(String meterNo) {
        this.meterNo = meterNo;
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public String getMeterName() {
        return meterName;
    }

    public void setMeterName(String meterName) {
        this.meterName = meterName;
    }

    public Integer getMeterTypeId() {
        return meterTypeId;
    }

    public void setMeterTypeId(Integer meterTypeId) {
        this.meterTypeId = meterTypeId;
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

    public Date getSetupDate() {
        return setupDate;
    }

    public void setSetupDate(Date setupDate) {
        this.setupDate = setupDate;
    }

    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        this.factory = factory;
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
        sb.append(", meterNo=").append(meterNo);
        sb.append(", userNo=").append(userNo);
        sb.append(", meterName=").append(meterName);
        sb.append(", meterTypeId=").append(meterTypeId);
        sb.append(", maxValue=").append(maxValue);
        sb.append(", startValue=").append(startValue);
        sb.append(", setupDate=").append(setupDate);
        sb.append(", factory=").append(factory);
        sb.append(", disabled=").append(disabled);
        sb.append("]");
        return sb.toString();
    }
}