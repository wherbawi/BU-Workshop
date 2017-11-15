package edu.bu.cameraready.calculators;

import java.util.List;

public class AvgCalculator {
	public double getAverage(List<Integer> grades) {
		if (grades == null || grades.size() == 0)
			throw new IllegalArgumentException("not allowed here");
		int sum = 0;
		for (Integer integer : grades) {
			sum += integer;
		}
		return sum / (double) grades.size();
	}
}
