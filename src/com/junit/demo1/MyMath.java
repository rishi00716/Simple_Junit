package com.junit.demo1;

public class MyMath {

	int sum(int[] numbers) {
		int sum = 0;
		for(int i: numbers) {
			sum += i;
		}
		return sum;
	}
}
