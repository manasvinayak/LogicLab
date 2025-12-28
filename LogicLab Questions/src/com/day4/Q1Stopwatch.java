package com.day4;

class Stopwatch {
	private boolean running = false;
	private int ticks = 0;
	
	public void incrementTick() {
		ticks++;
	}
	
	public boolean isRunning() {
		return running;
	}
	
	public void start() {
		if(isRunning()) {
			System.out.println("Stopwatch already running..");
			return;
		}
		running = true;
	}
	
	public void stop() {
		if(!isRunning()) {
			System.out.println("Please start the Stopwatch to stop it.");
			return;
		}
		running = false;
	}
	
	public void reset() {
		ticks = 0;
	}
	
	public int elapsed() {
		return ticks;
	}
}

public class Q1Stopwatch {

	public static void main(String[] args) {
		Stopwatch sw = new Stopwatch();
		sw.start();
		for(int i=0; i<1000; i++) {
			if(sw.isRunning()) {
				sw.incrementTick();
			}
		}
		sw.stop();
		System.out.println(sw.elapsed());
		sw.reset();
	}

}
