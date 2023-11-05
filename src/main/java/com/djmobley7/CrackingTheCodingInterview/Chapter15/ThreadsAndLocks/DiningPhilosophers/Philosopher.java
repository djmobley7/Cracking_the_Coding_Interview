package com.djmobley7.CrackingTheCodingInterview.Chapter15.ThreadsAndLocks.DiningPhilosophers;

import java.util.Random;

public class Philosopher extends Thread {
	private int seatNum;
	private Chopstick left, right;
	private Random random = new Random();
	
	public Philosopher(int num, Chopstick left, Chopstick right) {
		this.seatNum = num;
		this.left = left;
		this.right = right;
	}
	
	public boolean pickup() {
		if (!left.pickup()) {
			return false;
		}
		if (!right.pickup()) {
			left.putdown();
			return false;
		}
		return true;
	}
	
	public void putdown() {
		left.putdown();
		right.putdown();
	}
	
	public void chew() {
		System.out.println("Philosopher " + seatNum + " chewing");
		
//		int ms = random.nextInt(5);
//		try {
//			Thread.sleep(ms);
//		} catch (InterruptedException e) {
//		}
	}
	
	public void eat() {
		if (pickup()) {
			chew();
			putdown();
		}
		
//		int ms = random.nextInt(100);
//		try {
//			Thread.sleep(ms);
//		} catch (InterruptedException e) {
//		}
	}
	
	@Override
	public void run() {
		final int BITES = 10;
		for (int i = 0; i < BITES; ++i) {
			eat();
		}
	}
}
