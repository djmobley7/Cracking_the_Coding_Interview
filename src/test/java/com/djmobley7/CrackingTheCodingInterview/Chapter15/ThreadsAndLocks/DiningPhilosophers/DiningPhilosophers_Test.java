package com.djmobley7.CrackingTheCodingInterview.Chapter15.ThreadsAndLocks.DiningPhilosophers;

import java.util.List;
import java.util.ArrayList;

import org.junit.Test;

public class DiningPhilosophers_Test {
	@Test
	public void test() {
		Chopstick chopstick1 = new Chopstick();
		Chopstick chopstick2 = new Chopstick();
		Chopstick chopstick3 = new Chopstick();
		Chopstick chopstick4 = new Chopstick();
		Chopstick chopstick5 = new Chopstick();
		
		List<Philosopher> philosphers = new ArrayList<>();
		philosphers.add(new Philosopher(1, chopstick1, chopstick2));
		philosphers.add(new Philosopher(2, chopstick2, chopstick3));
		philosphers.add(new Philosopher(3, chopstick3, chopstick4));
		philosphers.add(new Philosopher(4, chopstick4, chopstick5));
		philosphers.add(new Philosopher(5, chopstick5, chopstick1));
		
		for(Philosopher philosopher : philosphers) {
			philosopher.start();
		}
		
		try {
			Thread.sleep(1_000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("All done");
	}
}
