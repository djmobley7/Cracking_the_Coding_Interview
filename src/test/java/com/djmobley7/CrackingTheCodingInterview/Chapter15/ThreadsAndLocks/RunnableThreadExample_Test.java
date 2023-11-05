package com.djmobley7.CrackingTheCodingInterview.Chapter15.ThreadsAndLocks;

import org.junit.Test;

public class RunnableThreadExample_Test {
	@Test
	public void test() {
		Thread thread = new Thread(new RunnableThreadExample());
		thread.start();
		
		try {
			Thread.sleep(5_000);
		} catch (InterruptedException e) {
		}
		
		thread.interrupt();
	}
}
