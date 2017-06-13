package com.register;

import org.openqa.selenium.By;

public class bidstatus {


	public static String bidstatus(String sid)  {
		com.register.openwebBroswer.webdriver.get("https://pre-investment.my089.net/credit/forBidding?sid="+sid);
		String  status = com.register.weblogin.status();
		if (status.equals("sub_s6")){
			System.out.println(sid+"标的为“正在还款”状态");
		}	else if (status.equals("sub_s0")){
			System.out.println(sid+"标的为“草稿”状态");
		}	else if (status.equals("sub_s1")){
			System.out.println(sid+"标的为“待审核”状态");
		}	else if (status.equals("sub_s2")){
			System.out.println(sid+"标的为“正在招标”状态");
		}	else if (status.equals("sub_s3")){
			System.out.println(sid+"标的为“正在复审”状态");
		}	else if (status.equals("sub_s7")){
			System.out.println(sid+"标的为“已还完”状态");
		}	
		return status;
	}
	
	
	
	public static void main(String[] args) {
		com.register.openwebBroswer.openwebBroswer();
		bidstatus("17032817-2233-0909-3847-692001179612");
		System.exit(0);
	}

}
