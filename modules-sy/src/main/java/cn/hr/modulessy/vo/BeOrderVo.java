package cn.hr.modulessy.vo;

import cn.hr.modulessy.entity.BeOrder;

/**
 * Created with IntelliJ IDEA.
 * 显示列表页面中的所有字段
 * @Auther: Adger
 * @Date: 2020/05/22/11:46
 * 显示列表页面中的所有字段
 */
public class BeOrderVo extends BeOrder {
  //流程步骤的名称
  private String stepname;
  //部门名称
  private String deptName;

  public String getStepname() {
    return stepname;
  }

  public void setStepname(String stepname) {
    this.stepname = stepname;
  }

  public String getDeptName() {
    return deptName;
  }

  public void setDeptName(String deptName) {
    this.deptName = deptName;
  }
}
