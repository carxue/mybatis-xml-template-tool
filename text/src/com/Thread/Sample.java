package com.Thread;

public class Sample
{
    private int number;
    public synchronized void increate()
    {
    	if(0!=number)
    	{
    		try
			{
				wait();
			}
			catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    	number++;
    	System.out.println(number);
    	notify();
    }
    public synchronized void decreate()
    {
    	if(0==number)
    	{
    		try
			{
				wait();
			}
			catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    	number--;
    	System.out.println(number);
    	notify();
    }
}
