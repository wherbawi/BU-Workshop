package edu.bu.cameraready.calculators;

import java.util.List;

public class SumCalculator {
	public int getSum(List<Integer> numbers) {
		int sum = 0;
		for (Integer integer : numbers) {
			sum += integer;
		}
		return sum;
	}
}
