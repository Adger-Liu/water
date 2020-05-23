package cn.hr.modulessy.model;


import cn.hr.modulessy.entity.BeOrder;
import cn.hr.modulessy.entity.BeOrderUser;

import java.util.List;

/***
 * 通过继承主表，把主表的字段全部复制过来
 * 子表（多行）
 */
public class BeOrderModel extends BeOrder {
    public BeOrderModel() {
    }

    public BeOrderModel(List<BeOrderUser> users) {
        this.users = users;
    }

    private List<BeOrderUser> users;

    public List<BeOrderUser> getUsers() {
        return users;
    }

    public void setUsers(List<BeOrderUser> users) {
        this.users = users;
    }
}
