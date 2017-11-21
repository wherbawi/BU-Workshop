package edu.bu.cameraready.interfaces.comparators;

@FunctionalInterface
public interface ComparisonOperator {
	public boolean compare(Integer num1, Integer num2);
}
