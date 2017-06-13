package com.annotation.test;

import java.lang.reflect.InvocationTargetException;

public class Test {
  public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException{
	  System.out.println(new BaseMapping().callMethod("select_user", "薛奎"));
  }
}
