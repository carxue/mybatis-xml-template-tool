package com.register;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class weblogin {
	

//前台登录
		public static void weblogin(String username) {
			
			com.register.openwebBroswer.webdriver.get("https://pre-www.my089.net/");
			com.register.openwebBroswer.pause(2000);
			com.register.openwebBroswer.webdriver.findElement(By.xpath("//a[text()='会员登录']")).click();
			com.register.openwebBroswer.pause(1000);
			com.register.openwebBroswer.webdriver.findElement(By.id("username")).click();
			com.register.openwebBroswer.webdriver.findElement(By.id("username")).clear();
			com.register.openwebBroswer.webdriver.findElement(By.id("username")).sendKeys(username);
			com.register.openwebBroswer.webdriver.findElement(By.id("password")).click();
			com.register.openwebBroswer.webdriver.findElement(By.id("password")).clear();
			com.register.openwebBroswer.webdriver.findElement(By.id("password")).sendKeys("hlcs_1111");
			try {
				com.register.openwebBroswer.webdriver.findElement(By.id("checkCode")).click();
				com.register.openwebBroswer.webdriver.findElement(By.id("checkCode")).clear();
				com.register.openwebBroswer.webdriver.findElement(By.id("checkCode")).sendKeys("hlcs");
			} catch (Exception e) {
							}
			com.register.openwebBroswer.webdriver.findElement(By.xpath("//input[@value='立即登录']")).click();
			
			try {
				com.register.openwebBroswer.webdriver.findElement(By.id("username")).click();
				com.register.openwebBroswer.webdriver.findElement(By.id("username")).clear();
				com.register.openwebBroswer.webdriver.findElement(By.id("username")).sendKeys(username);
				com.register.openwebBroswer.webdriver.findElement(By.id("password")).click();
				com.register.openwebBroswer.webdriver.findElement(By.id("password")).clear();
				com.register.openwebBroswer.webdriver.findElement(By.id("password")).sendKeys("hlcs_1111");
				try {
					com.register.openwebBroswer.webdriver.findElement(By.id("checkCode")).click();
					com.register.openwebBroswer.webdriver.findElement(By.id("checkCode")).clear();
					com.register.openwebBroswer.webdriver.findElement(By.id("checkCode")).sendKeys("hlcs");
				} catch (Exception e) {
								}
				com.register.openwebBroswer.webdriver.findElement(By.xpath("//input[@value='立即登录']")).click();
			} catch (Exception e) {
				
			}
		}
		
		public static void webphonelogin(String phone) {
			
			com.register.openwebBroswer.webdriver.get("https://pre-www.my089.net/");
			com.register.openwebBroswer.pause(2000);
			com.register.openwebBroswer.webdriver.findElement(By.xpath("//a[text()='会员登录']")).click();
			com.register.openwebBroswer.pause(1000);
			com.register.openwebBroswer.webdriver.findElement(By.className("LIBturnIcon")).click();
			com.register.openwebBroswer.pause(1000);
			com.register.openwebBroswer.webdriver.findElement(By.id("phone")).click();
			com.register.openwebBroswer.webdriver.findElement(By.id("phone")).clear();
			com.register.openwebBroswer.webdriver.findElement(By.id("phone")).sendKeys(phone);
			com.register.openwebBroswer.webdriver.findElement(By.id("password")).click();
			com.register.openwebBroswer.webdriver.findElement(By.id("password")).clear();
			com.register.openwebBroswer.webdriver.findElement(By.id("password")).sendKeys("hl111111");
			try {
				com.register.openwebBroswer.webdriver.findElement(By.id("checkCode")).click();
				com.register.openwebBroswer.webdriver.findElement(By.id("checkCode")).clear();
				com.register.openwebBroswer.webdriver.findElement(By.id("checkCode")).sendKeys("hlcs");
			} catch (Exception e) {
							}
			com.register.openwebBroswer.webdriver.findElement(By.xpath("//input[@value='立即登录']")).click();
		}
		
		public static void webloginout() {
			com.register.openwebBroswer.webdriver.get("http://pre-www.my089.net/");
			com.register.openwebBroswer.pause(2000);
			com.register.openwebBroswer.webdriver.findElement(By.xpath("//a[text()='退出']")).click();
			com.register.openwebBroswer.pause(1000);
			
		}
		    
//我要投资列表-详情页面		    
		    public static void buy(String sid,String bidAmt) {
		  		com.register.openwebBroswer.pause(1000);
		  		//进入我要投资列表页面
		  		com.register.openwebBroswer.webdriver.findElement(By.xpath("//a[text()='我要投资']")).click();
		  		com.register.openwebBroswer.pause(1000);
		  		//进入指定标的详情
		  		com.register.openwebBroswer.webdriver.get("https://pre-investment.my089.net/credit/forBidding?sid="+sid);
		  		//点击立即投标
		  		com.register.openwebBroswer.webdriver.findElement(By.xpath("//a[contains(text(),'立即投标')]")).click();
				com.register.openwebBroswer.pause(1000);
				//需要确认利率偏低
				try {
					com.register.openwebBroswer.webdriver.findElement(By.xpath("//a[text()='确定']")).click();
				} catch (Exception e1) {
					
				}
				//输入投标金额
				com.register.openwebBroswer.webdriver.findElement(By.id("txtBidAmt")).click();
				com.register.openwebBroswer.webdriver.findElement(By.id("txtBidAmt")).clear();
				com.register.openwebBroswer.webdriver.findElement(By.id("txtBidAmt")).sendKeys(bidAmt);
				com.register.openwebBroswer.pause(1000);
				//需要录入验证码
				try {
					com.register.openwebBroswer.webdriver.findElement(By.id("verificationCode")).click();
					com.register.openwebBroswer.webdriver.findElement(By.id("verificationCode")).clear();
					com.register.openwebBroswer.webdriver.findElement(By.id("verificationCode")).sendKeys("hlcs");
					com.register.openwebBroswer.pause(1000);
				} 				catch (Exception e) {
					
				}
				//确认投标
				com.register.openwebBroswer.webdriver.findElement(By.xpath("//input[@value='确认无误，投标']")).click();
		      }
		    
		    
		    

			//		       选择标的类型   
		    public static void webtype(String type) {
				if(type.endsWith("信用标")){
					com.register.openwebBroswer.webdriver.findElement(By.className("SubL1")).click();
					com.register.openwebBroswer.pause(1000);
				}	else if (type.endsWith("资产标")){
					com.register.openwebBroswer.webdriver.findElement(By.className("SubL110")).click();
					com.register.openwebBroswer.pause(1000);
				}	else if (type.endsWith("快借标")){
					com.register.openwebBroswer.webdriver.findElement(By.className("SubL50")).click();
					com.register.openwebBroswer.pause(1000);
				}	else if (type.endsWith("推荐标")){
					com.register.openwebBroswer.webdriver.findElement(By.className("SubL60")).click();
					com.register.openwebBroswer.pause(1000);
				}	else if (type.endsWith("公信贷")){
					com.register.openwebBroswer.webdriver.findElement(By.className("SubL120")).click();
					com.register.openwebBroswer.pause(1000);
				}	else if (type.endsWith("特定标")){
					com.register.openwebBroswer.webdriver.findElement(By.className("SubL130")).click();
					com.register.openwebBroswer.pause(1000);
				}	else if (type.endsWith("议标")){
					com.register.openwebBroswer.webdriver.findElement(By.className("SubL150")).click();
					com.register.openwebBroswer.pause(1000);
				}	else if (type.endsWith("承销标")){
					com.register.openwebBroswer.webdriver.findElement(By.className("SubL160")	).click();
					com.register.openwebBroswer.pause(1000);
				}	else 	com.register.openwebBroswer.webdriver.findElement(By.className("SubL90")).click();

			}
//选择标的限制类型		    
		    public static void xianzhi(String xianzhi) {
		        if(xianzhi.endsWith("密码标")){
		        	com.register.openwebBroswer.webdriver.findElement(By.id("category5")).click();
					com.register.openwebBroswer.pause(500);
					com.register.openwebBroswer.webdriver.findElement(By.id("password")).click();
					com.register.openwebBroswer.webdriver.findElement(By.id("password")).clear();
					com.register.openwebBroswer.webdriver.findElement(By.id("password")).sendKeys("123456");	
					com.register.openwebBroswer.webdriver.findElement(By.id("formPublishSecondSubmitButton")).click();
					
				}	else if (xianzhi.endsWith("好友标")){
					com.register.openwebBroswer.webdriver.findElement(By.id("category4")).click();
					com.register.openwebBroswer.pause(500);
					com.register.openwebBroswer.webdriver.findElement(By.id("allFriends")).click();
					com.register.openwebBroswer.webdriver.findElement(By.id("formPublishSecondSubmitButton")).click();
				} com.register.openwebBroswer.webdriver.findElement(By.id("formPublishSecondSubmitButton")).click();
		    
		    }
//标的状态
			public static String status()  {
				String status=(com.register.openwebBroswer.webdriver.findElement(By.xpath("//div[@class='Bid_rt lf']/div"))).getAttribute("class");
//				System.out.println(status);
				return status;
			}
		
/*
 * 设置交易密码		    
 */
		    public static void TransPassword(String code,String mobile) {
		    	com.register.openwebBroswer.webdriver.get("https://pre-member.my089.net/security");
//		    	webdriver.findElement(By.xpath("//a[text()='安全中心']")).click();
		    	com.register.openwebBroswer.webdriver.findElement(By.className("Editor")).click();
		    	com.register.openwebBroswer.webdriver.findElement(By.xpath("//a[text()='设置']")).click();
		    	com.register.openwebBroswer.webdriver.findElement(By.id("prepassword")).click();
		    	com.register.openwebBroswer.webdriver.findElement(By.id("prepassword")).clear();
		    	com.register.openwebBroswer.webdriver.findElement(By.id("prepassword")).sendKeys("hl1111");
		    	com.register.openwebBroswer.webdriver.findElement(By.id("pretranspassword")).click();
		    	com.register.openwebBroswer.webdriver.findElement(By.id("pretranspassword")).clear();
		    	com.register.openwebBroswer.webdriver.findElement(By.id("pretranspassword")).sendKeys("hl2222");
		    	com.register.openwebBroswer.webdriver.findElement(By.id("preconfirmtranspassword")).click();
		    	com.register.openwebBroswer.webdriver.findElement(By.id("preconfirmtranspassword")).clear();
		    	com.register.openwebBroswer.webdriver.findElement(By.id("preconfirmtranspassword")).sendKeys("hl2222");
		    	com.register.openwebBroswer.webdriver.findElement(By.id("btnGetText")).click();
		    	com.register.openwebBroswer.pause(1000);
//		    	com.register.DBhelp.DBHelper("SELECT max(create_time),random_code from mc_verification_code  WHERE phone_number='" +mobile +"'  ORDER BY create_time DESC;");
		
		    	com.register.openwebBroswer.webdriver.findElement(By.id("phoneCode")).click();
		    	com.register.openwebBroswer.webdriver.findElement(By.id("phoneCode")).clear();
		    	com.register.openwebBroswer.webdriver.findElement(By.id("phoneCode")).sendKeys(code);
		    	com.register.openwebBroswer.webdriver.findElement(By.id("formsubmitbutton")).click();
		    	
		    }
		    
/*
 * 检查页面元素		    
 */
	    public static String check() {
    		com.register.openwebBroswer.pause(2000);
    		com.register.openwebBroswer.webdriver.findElement(By.xpath("//a[text()='我的账户']")).click();
    		com.register.openwebBroswer.pause(2000);
    		//获取页面上的值
    		String spanTotalAmount=(com.register.openwebBroswer.webdriver.findElement(By.id("spanTotalAmount"))).getText();//账户总额
    		String spanLockAmount=(com.register.openwebBroswer.webdriver.findElement(By.id("spanLockAmount"))).getText();//冻结总额
		    String spanAmount=(com.register.openwebBroswer.webdriver.findElement(By.id("spanAmount"))).getText();//可用余额
		    String spanIncomeAmount=(com.register.openwebBroswer.webdriver.findElement(By.id("spanIncomeAmount"))).getText();//累计净赚收益
		    String spanTomorrowEarnings=(com.register.openwebBroswer.webdriver.findElement(By.id("spanTomorrowEarnings"))).getText();//预计明日收益
		    String spanTotalLoanAmount=(com.register.openwebBroswer.webdriver.findElement(By.id("spanTotalLoanAmount"))).getText();//累计投资总额
		    String spanTotalProfit=(com.register.openwebBroswer.webdriver.findElement(By.id("spanTotalProfit"))).getText();	//累计净赚收益
		    String spanLoanAmount=(com.register.openwebBroswer.webdriver.findElement(By.id("spanLoanAmount"))).getText();	//待收总额
		    String spanCollectPrincipal=(com.register.openwebBroswer.webdriver.findElement(By.id("spanCollectPrincipal"))).getText();	//待收本金
		    String spanPlanAccrual=(com.register.openwebBroswer.webdriver.findElement(By.id("spanPlanAccrual"))).getText();	//待收利息
		    com.register.openwebBroswer.webdriver.findElement(By.xpath("//a[text()='我的借款']")).click();
		    String spanTotalBorrowAmount=(com.register.openwebBroswer.webdriver.findElement(By.id("spanTotalBorrowAmount"))).getText();	//累计借款总额
		    String spanTotalBorrowAccrual=(com.register.openwebBroswer.webdriver.findElement(By.id("spanTotalBorrowAccrual"))).getText();	//累计实还利息
		    String spanWaitRepayAmount=(com.register.openwebBroswer.webdriver.findElement(By.id("spanWaitRepayAmount"))).getText();	//待还总额
		    String spanUnPrincipal=(com.register.openwebBroswer.webdriver.findElement(By.id("spanUnPrincipal"))).getText();	//待还本金
		    String spanTotalRepayAccrual=(com.register.openwebBroswer.webdriver.findElement(By.id("spanTotalRepayAccrual"))).getText();	//待还利息
		  //该方法用于删除获取到字符前的￥符号
		    String sspanTotalAmount = (spanTotalAmount.substring(spanTotalAmount.indexOf("￥")+1)).replace(",","");
		    String sspanLockAmount = (spanLockAmount.substring(spanLockAmount.indexOf("￥")+1)).replace(",", "");
		    String sspanAmount = (spanAmount.substring(spanAmount.indexOf("￥")+1)).replace(",","");
		    String sspanIncomeAmount = (spanIncomeAmount.substring(spanIncomeAmount.indexOf("￥")+1)).replace(",","");
		    String sspanTomorrowEarnings = (spanTomorrowEarnings.substring(spanTomorrowEarnings.indexOf("￥")+1)).replace(",","");
		    String sspanTotalLoanAmount = (spanTotalLoanAmount.substring(spanTotalLoanAmount.indexOf("￥")+1)).replace(",","");
		    String sspanTotalProfit = (spanTotalProfit.substring(spanTotalProfit.indexOf("￥")+1)).replace(",","");
		    String sspanLoanAmount = (spanLoanAmount.substring(spanLoanAmount.indexOf("￥")+1)).replace(",","");
		    String sspanCollectPrincipal = (spanCollectPrincipal.substring(spanCollectPrincipal.indexOf("￥")+1)).replace(",","");
		    String sspanPlanAccrual = (spanPlanAccrual.substring(spanPlanAccrual.indexOf("￥")+1)).replace(",","");
		    
		    String sspanTotalBorrowAmount = (spanTotalBorrowAmount.substring(spanTotalBorrowAmount.indexOf("￥")+1)).replace(",","");
		    String sspanTotalBorrowAccrual = (spanTotalBorrowAccrual.substring(spanTotalBorrowAccrual.indexOf("￥")+1)).replace(",","");
		    String sspanWaitRepayAmount = (spanWaitRepayAmount.substring(spanWaitRepayAmount.indexOf("￥")+1)).replace(",","");
		    String sspanUnPrincipal = (spanUnPrincipal.substring(spanUnPrincipal.indexOf("￥")+1)).replace(",","");
		    String sspanTotalRepayAccrual = (spanTotalRepayAccrual.substring(spanTotalRepayAccrual.indexOf("￥")+1)).replace(",","");
		   
		    System.out.println("账户总额:"+sspanTotalAmount+" |冻结金额 "+sspanLockAmount+" |可用余额 "+sspanAmount+" |累计净赚收益 "+sspanIncomeAmount+" |预计明日收益 "+sspanTomorrowEarnings);
		    System.out.println("累计借款总额:"+sspanTotalBorrowAmount+" |累计实还利息 "+sspanTotalBorrowAccrual+" |待还总额 "+sspanWaitRepayAmount+" |待还本金"+sspanUnPrincipal+" |待还利息 "+sspanTotalRepayAccrual);	
		    return sspanTotalAmount+","+sspanLockAmount+","+sspanAmount+","+sspanIncomeAmount+","+sspanTomorrowEarnings+","+sspanTotalLoanAmount+","+sspanTotalProfit+","+sspanLoanAmount+","+sspanCollectPrincipal+","+sspanPlanAccrual+","+sspanTotalBorrowAmount+","+sspanTotalBorrowAccrual+","+sspanWaitRepayAmount+","+sspanUnPrincipal+","+sspanTotalRepayAccrual;
		    }	
	    

				public static void main(String[] args) {
		    	//1.打开浏览器
		    	com.register.openwebBroswer.openwebBroswer();
		    	//2.登录前台用户
//		    	weblogin("xr12300000003");
		    	webphonelogin("12300000008");
		    	//信用标,资产标,快借标,推荐标,公信贷,特定标,议标,承销标,净值标
		    	//按月分期还款,按天一次性还款,按季分期还款,按月到期全额还款,按天计息到期还款
		    	//不设限制，密码标，好友标
//		    	sell("议标","按天计息到期还款","2个月","500","9.00","5","密码标");
//		    	System.out.println("----开始投资----");
		    	//开始循环投标次数
//		    	for(int i=0;i<50;i++){
//		    	    buy("17010510-0933-8739-4100-948001109253","500");
//					System.out.println("第"+i+"笔");		
//		    		}
		    	com.register.openwebBroswer.pause(5000);
//		    	TransPassword("123456");
		    	check();
		    	System.exit(0);
		    	}

		}



