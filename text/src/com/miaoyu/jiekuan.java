package com.register;

import java.math.BigDecimal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class jiekuan {

	public static void jiekuan(String username, String type, String returnType, String time, String amount,
			String rate, String top, String xianzhi)  {
		String originId=null;
		originId = com.register.fabiao.fabiao(username, type, returnType, time, amount, rate, top, xianzhi);
		String sid =originId;
		String  status = com.register.bidstatus.bidstatus(sid);
		if (status.equals("sub_s6")){
			com.register.weblogin.check();
		}	else {
			//五分钟内手工完成标的投标及复审
			com.register.openwebBroswer.pause(120000);
			status = com.register.bidstatus.bidstatus(sid);
			if (status.equals("sub_s6")){
					com.register.weblogin.check();
				}	else 
					status = com.register.bidstatus.bidstatus(sid);
		 }
		
	}
	
	public static void jiekuanAmount(String username, String type, String returnType, String time, String amount,
			String rate, String top, String xianzhi){
		com.register.openwebBroswer.openwebBroswer();
		com.register.weblogin.weblogin(username);
		String list = com.register.weblogin.check();
		String[] arr =list.split(",");
		BigDecimal sspanTotalBorrowAmount=BigDecimal.valueOf(Double.parseDouble(arr[10]));//取自交易前的累计借款总额
		BigDecimal sspanTotalBorrowAccrual=BigDecimal.valueOf(Double.parseDouble(arr[11]));//取自交易前的累计实还利息
		BigDecimal sspanWaitRepayAmount=BigDecimal.valueOf(Double.parseDouble(arr[12]));//取自交易前的待还总额
		BigDecimal sspanUnPrincipal=BigDecimal.valueOf(Double.parseDouble(arr[13]));//取自交易前的待还本金
		BigDecimal sspanTotalRepayAccrual=BigDecimal.valueOf(Double.parseDouble(arr[14]));//取自交易前的待还利息
		//转换为打印模式
		String bspanTotalBorrowAmount=(sspanTotalBorrowAmount).toString();
		String bspanTotalBorrowAccrual=(sspanTotalBorrowAccrual).toString();
		String bspanWaitRepayAmount=(sspanWaitRepayAmount).toString();
		String bspanUnPrincipal=(sspanUnPrincipal).toString();
		String bspanTotalRepayAccrual=(sspanTotalRepayAccrual).toString();
		
//		System.out.printf(sspanTotalBorrowAmount,bspanTotalBorrowAmount);
		
		jiekuan(username,type,returnType,time,amount,rate,top,xianzhi);
		BigDecimal aamount=BigDecimal.valueOf(Double.parseDouble(amount));
		//去除中文函数
		String reg = "[\u4e00-\u9fa5]";
	    Pattern pat = Pattern.compile(reg);  
	    Matcher mat=pat.matcher(time); 
	    String time1 = mat.replaceAll("");
	 	BigDecimal ttime=BigDecimal.valueOf(Double.parseDouble(time1));
		BigDecimal rrate=BigDecimal.valueOf(Double.parseDouble(rate));
		String	spanTotalBorrowAmount=sspanTotalBorrowAmount.add(aamount).toString();//计算后的累计借款总额
		String	spanTotalBorrowAccrual=sspanTotalBorrowAccrual.toString();//应付利息计算方式
		String	spanWaitRepayAmount=sspanWaitRepayAmount.add(aamount).toString();//计算后的待还总额
		String	spanUnPrincipal=sspanUnPrincipal.add(aamount).toString();//计算后的待还本金
		String	spanTotalRepayAccrual=sspanTotalRepayAccrual.toString();//计算后的待还利息
		System.out.println("计算后累计借款总额:"+spanTotalBorrowAmount+" |计算后累计实还利息 "+spanTotalBorrowAccrual+" |计算后待还总额 "+spanWaitRepayAmount+" |计算后待还本金"+spanUnPrincipal+" |计算后待还利息 "+spanTotalRepayAccrual);	
		if(bspanTotalBorrowAmount==spanTotalBorrowAmount&&
			bspanTotalBorrowAccrual==spanTotalBorrowAccrual&&
			bspanWaitRepayAmount==spanWaitRepayAmount&&
			bspanUnPrincipal==spanUnPrincipal&&
			bspanTotalRepayAccrual==spanTotalRepayAccrual){
			System.out.println("我的账户计算正确");
		}else System.out.println("我的账户计算有误！！！！！！");
	}
	

	public static void main(String[] args)  {
		jiekuanAmount("小蜜蜂13000000000","净值标", "按天一次性还款", "1天", "500", "0.01", "4", "不设限制");
		
		System.exit(0);
	}

}
