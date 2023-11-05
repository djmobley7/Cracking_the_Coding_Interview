package com.djmobley7.CrackingTheCodingInterview.Chapter15.ThreadsAndLocks;

public class RunnableThreadExample implements Runnable {
		
	@Override
	public void run() {
		System.out.println("Entering run()");
		
		for (int i = 1; i < 20; ++i) {
			System.out.println("Sleeping " + i);
			try {
				Thread.sleep(1_000);
			} catch (InterruptedException e) {
			}
		}
		
		System.out.println("Leaving run()");
	}
}
