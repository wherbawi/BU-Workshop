package edu.bu.cameraready.interfaces.comparators;

@FunctionalInterface
public interface ComparisonOperator {
	public boolean compare(Integer num2, Integer num1);
}
