package com.djmobley7.CrackingTheCodingInterview.Chapter15.ThreadsAndLocks;

import java.util.concurrent.locks.Lock;

public class LockedATM {
	int balance = 0;
	Lock lock;
	
	public LockedATM(int balance) {
		this.balance = balance;
	}
	
	public void withdraw(int value) {
		lock.lock();
		
		System.out.println("Withdrawing " + value + " from balance " + balance);
		balance -= balance;
		
		lock.unlock();
	}
	
	public void deposit(int value) {
		lock.lock();
		
		System.out.println("Depositing " + value + " to balance " + balance);
		balance += balance;
		
		lock.unlock();
	}
}
