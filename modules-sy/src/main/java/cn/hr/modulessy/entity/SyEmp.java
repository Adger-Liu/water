package cn.hr.modulessy.entity;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * 系统员工的实体类
 * @Auther: Adger
 * @Date: 2020/05/18/10:09
 */
public class SyEmp implements Serializable {
  private Integer id;
  private String empName;
  private String empNo;
  private String pwd;
  private Integer deptId;
  private String remark;
  private String disabled;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getEmpName() {
    return empName;
  }

  public void setEmpName(String empName) {
    this.empName = empName;
  }

  public String getEmpNo() {
    return empNo;
  }

  public void setEmpNo(String empNo) {
    this.empNo = empNo;
  }

  public String getPwd() {
    return pwd;
  }

  public void setPwd(String pwd) {
    this.pwd = pwd;
  }

  public Integer getDeptId() {
    return deptId;
  }

  public void setDeptId(Integer deptId) {
    this.deptId = deptId;
  }

  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

  public String getDisabled() {
    return disabled;
  }

  public void setDisabled(String disabled) {
    this.disabled = disabled;
  }

  @Override
  public String toString() {
    return "SyEmp{" +
      "id=" + id +
      ", empName='" + empName + '\'' +
      ", empNo='" + empNo + '\'' +
      ", pwd='" + pwd + '\'' +
      ", deptId=" + deptId +
      ", remark='" + remark + '\'' +
      ", disabled='" + disabled + '\'' +
      '}';
  }
}
