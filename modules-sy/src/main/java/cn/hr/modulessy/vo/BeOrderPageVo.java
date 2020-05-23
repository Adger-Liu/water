package cn.hr.modulessy.vo;

import cn.hr.modulessy.entity.BeOrder;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: Adger
 * @Date: 2020/05/22/11:51
 */
public class BeOrderPageVo extends BeOrder {

  private Integer size;//每页数
  private Integer page;//当前页（1、2、3。。。）
  private Integer start;//开始位置

  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public Integer getStart() {
    return start;
  }

  public void setStart(Integer start) {
    this.start = start;
  }
}
