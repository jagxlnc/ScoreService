package com.ibm;

import java.util.Random;

public class Score

{
	public int getRandomNumberInRange(int min, int max) {

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}

	
	public static void main(String args[]) {
		
		Score s = new Score();
		int myscore = s.getRandomNumberInRange(300, 850);
		System.out.println(" Hello " + myscore );
	}
}




