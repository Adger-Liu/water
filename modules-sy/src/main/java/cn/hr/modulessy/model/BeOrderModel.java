package cn.hr.modulessy.model;

import cn.hr.modulessy.entity.BeOrder;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: Adger
 * @Date: 2020/05/21/9:03
 * 通过继承，把主表的字段全部复制过来
 */
public class BeOrderModel extends BeOrder {
  private List<BeOrder> users;

  public List<BeOrder> getUsers() {
    return users;
  }

  public void setUsers(List<BeOrder> users) {
    this.users = users;
  }
}
