package cn.hr.modulessy.util;

/**
 * 分页的工具类：
 * 存储数据：翻页信息、当前页的列表数据
 * 分页逻辑代码
 * 前端展示
 */
public class Page {
  private Integer total;//总记录数
  private Integer size=10;//每页数（默认是每页10行记录）
  private Integer page;//当前页（1、2、3。。。）

  //动态产生页面上的html代码
  @Override
  public String toString() {
    if(size==null){
      size=10;//默认为10
    }
    StringBuffer s=new StringBuffer();



    //计算总页数
    int pageCount=total/size;
    if(total%size>0){
      pageCount++;
    }

    //上一页：当已经是第一页时就不能跳转
    if(page==1){
      s.append("上一页");
    }else{
      //第一页
      s.append("<a href='javascript:tijiao(1);'>第一页</a>");
      //上一页
      s.append("<a href='javascript:tijiao(")
        .append(page-1).append(");'>上一页</a>");
    }


    //输入框跳转
    s.append("&nbsp;&nbsp;<input class='pageIndex' type='text' name='page' id='page' size='2' value='")
      .append(page).append("' />");
    //分页提交按钮
    s.append("/").append(pageCount).append("&nbsp;&nbsp;&nbsp;&nbsp");
    s.append("<button type='submit' width='20' >GO</button>");




    //下一页：当已经是最后一页就不能跳转
    if(page==pageCount){
      s.append("&nbsp;&nbsp;下一页");
    }else{
      s.append("&nbsp;&nbsp;<a href='javascript:tijiao(")
        .append(page+1).append(");'>下一页</a>");
      //最后一页
      s.append("&nbsp;&nbsp;<a href='javascript:tijiao(")
        .append(pageCount).append(");'>最后一页</a>");
    }


    return s.toString();
  }

  public Page(Integer total, Integer size, Integer page) {
    this.total = total;
    this.size = size;
    this.page = page;
  }

  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

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

}
