package com.djmobley7.CrackingTheCodingInterview.Chapter15.ThreadsAndLocks.DiningPhilosophers;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Chopstick {
	private Lock lock = new ReentrantLock();
	
	public boolean pickup() {
		// using just lock can cause deadlock, so do tryLock() instead
		//lock.lock();
		return lock.tryLock();
	}
	
	public void putdown() {
		lock.unlock();
	}
}
