package com.Thread.soulv.join;

import java.util.Random;

public class MyJoin extends Thread{
	private int time;

	public MyJoin(int time,String name) {
		super(name);
		this.time = time;
		start();
	}
	@Override
	public void run() {
		try {
			sleep(time);
		} catch (InterruptedException e) {
			System.out.println(getName()+" was interrupted. isInterrupted():"
					+ isInterrupted());
			return;
		}
		System.out.println(getName()+" has awakened");
	}
	
	public static void main(String[] args) {
		MyJoin mj = new MyJoin(1500, "Sleepy"),
		grumpy = new MyJoin(1500, "Grumpy");
		Joiner ji = new Joiner(mj,"Dopey"),
		doc = new Joiner(grumpy,"Doc");
		grumpy.interrupt();
		
	}
}

class Joiner extends Thread{
	private MyJoin myJoin;
	
	public Joiner(MyJoin myJoin,String name) {
		super(name);
		this.myJoin = myJoin;
		start();
	}

	@Override
	public void run() {
		try {
			myJoin.join();
		} catch (InterruptedException e) {
			System.out.println("Interrupted");
		}
		System.out.println(getName()+" join completed");
	}
}
