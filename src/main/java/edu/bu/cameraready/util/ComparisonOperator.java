package edu.bu.cameraready.util;

@FunctionalInterface
public interface ComparisonOperator {
	public boolean compare(Integer num1, Integer num2);
}
