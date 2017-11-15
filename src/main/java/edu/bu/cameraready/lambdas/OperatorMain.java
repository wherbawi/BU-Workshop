package edu.bu.cameraready.lambdas;

import edu.bu.cameraready.util.ComparisonOperator;

public class OperatorMain {
	public static void main(String[] a) {
		ComparisonOperator comparisonOperator = false ? (num1, num2) -> num1 < num2 : (num1, num2) -> num1 <= num2;
	}
}
