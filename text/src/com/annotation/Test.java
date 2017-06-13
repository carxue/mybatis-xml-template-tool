package com.annotation;

import java.lang.reflect.Method;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

@DocumentAnnotation(name="薛奎")
public class Test {
	public static void main(String[] args) throws Exception {
		SuppressWarningsTest supp = new SuppressWarningsTest();
		Class<SuppressWarningsTest> suppclass = SuppressWarningsTest.class;
		Method tmethod = suppclass.getMethod("tests", new Class[] {});
		System.out.println(tmethod.getAnnotations().length);
		if (tmethod.isAnnotationPresent(MyAnnotation.class)) {
			tmethod.invoke(supp, new Object[] {});
			MyAnnotation ann = tmethod.getAnnotation(MyAnnotation.class);
			System.out.println(ann.country() + " ：" + ann.address());
		}
//		System.out.println(Pattern.matches("[1-9][0-9]{7}", null));
		
		Class strInt =new ArrayList<Integer>().getClass();
		Class strStr =new ArrayList<String>().getClass();
		System.out.println(strInt==strStr);
		

		
		String str="登录验证码为{code}，5分钟内有效，请尽快输入验证（乐言评论）".replace("{code}", "123456");
		System.out.println(str);
		
		
	}
}
