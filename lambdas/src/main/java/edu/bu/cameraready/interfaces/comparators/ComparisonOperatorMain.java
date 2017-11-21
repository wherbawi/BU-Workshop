package edu.bu.cameraready.interfaces.comparators;

public class ComparisonOperatorMain {
	public static void main(String[] a) {
		ComparisonOperator comparisonOperator = false ? (num1, num2) -> num1 < num2 : (num1, num2) -> num1 <= num2;
	}
}
