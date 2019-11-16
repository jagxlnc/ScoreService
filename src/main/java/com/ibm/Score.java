package com.ibm;

import java.util.Random;

public class Score

{
	public int getRandomNumberInRange(int min, int max) {

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}

}




