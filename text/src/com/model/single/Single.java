package com.model.single;

public class Single {
   private static Single single = new Single();
   
   private Single(){
   }
   
   public static Single newInstance(){
	   return single;
   }
}
