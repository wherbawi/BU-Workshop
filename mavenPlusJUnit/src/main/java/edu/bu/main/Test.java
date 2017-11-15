package edu.bu.main;

import edu.bu.utils.DistanceCalculator;
import edu.bu.utils.Point;

public class Test {
	public static void main(String a[]) {
		DistanceCalculator calculator = new DistanceCalculator();
		int dist = calculator.calcDist(new Point(48.764011, 9.167515), new Point(48.764145, 9.169478));
		System.out.println(dist);
	}
}
