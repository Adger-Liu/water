package cn.hr.modulessy.util;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: Adger
 * @Date: 2020/05/21/11:08
 */
public class PrimaryGenerater {
  /*
   全新的业务单号
    */
  public static String newNumber(String type){
    StringBuffer s=new StringBuffer();
    s.append("B");
    SimpleDateFormat sfd = new SimpleDateFormat("yyyyMMdd");
    Date now=new Date();
    s.append(type).append("-").append(sfd.format(now)).append("-").append("0001");
    return s.toString();
  }

  /**
   * 业扩工单（规则：16位，如：B1-20140105-0001。前两位表示工单类型，中间8位表示建单日期，最后四位是按工单类型和月份的流水号）
   已经存在的最大单号
   *
   * B1-20200721-0011
   * 每月从0001开始计数
   * */
  public static String nextNumber(String maxCode){
    String business=maxCode.substring(0,2);
    String id = null;
    Date date = new Date();
    SimpleDateFormat formatter = new SimpleDateFormat("yyyyMM");
    String yearMonth = maxCode.substring(3, 9);
    String day = maxCode.substring(9, 11);
    SimpleDateFormat formatterDay = new SimpleDateFormat("dd");
    //这个判断就是判断你数据取出来的最后一个业务单号是不是当月的
    if(!formatter.format(date).equals(yearMonth)){
      System.out.println("新的一月");
      yearMonth = formatter.format(date);
      day=formatterDay.format(date);
      //如果是新的一月的就直接变成0001
      id = business+"-" + yearMonth +day+"-0001";
    }else{
      System.out.println("当月");
      DecimalFormat df = new DecimalFormat("0000");
      //不是新的一月就累加
      id =business+"-"+ formatter.format(date)+formatterDay.format(date)+"-"
        + df.format(1 + Integer.parseInt(maxCode.substring(12, 16)));
    }
    return id;
  }
}
