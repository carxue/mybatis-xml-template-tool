package com.test;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.util.HttpClientUtils;

public class Test {


	public static void main(String[] args) throws ParseException {
			/*Gson gson = new Gson();
			String params = "params=jm_igid:13260&orderfield=im_createdate&ordertype=1";
			Map<String,Object> retMap = HttpClientUtils.sendRequest("http://localhost:8080/etSearchService/imitem/queryImItemPage.xhtml?", params, Map.class);
			System.out.println(retMap);*/
		System.out.println(scienceE("3.40256010353E11"));
	}
	public static String scienceE(String value){
		BigDecimal bd = new BigDecimal(value); 
		return bd.toPlainString();
	}
	public static String converScience1(String value,int i){
		if(StringUtils.isBlank(value)){
			return "0";
		}
		DecimalFormat format=new DecimalFormat();
		format.applyPattern("##,###,###,###.00");
		return format.format(new BigDecimal(Double.parseDouble(value)).setScale(i,BigDecimal.ROUND_HALF_UP).doubleValue());
	}
	public static String deletePoint(String number){
		String ret = "0";
		if(StringUtils.isBlank(number))
			return ret;
		if(number.indexOf(".")!=-1){
			return number.substring(0, number.indexOf("."));
		}else
			return number;
	}
	
	public static String a() throws Exception{
		throw new Exception();
	}
}
