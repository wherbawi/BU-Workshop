package edu.bu.cameraready.main;

import java.util.Arrays;

import javax.inject.Inject;

import edu.bu.cameraready.calculators.CompoundAvgCalculator;
import edu.bu.cameraready.calculators.DistanceCalculator;
import edu.bu.cameraready.calculators.Point;
import edu.bu.cameraready.calculators.SumCalculator;

public class MainClass {

	public static void main(String a[]) {
		DistanceCalculator calculator = new DistanceCalculator();
		int dist = calculator.calcDist(new Point(48.764011, 9.167515), new Point(48.764145, 9.169478));
		System.out.println(dist);

	}
}