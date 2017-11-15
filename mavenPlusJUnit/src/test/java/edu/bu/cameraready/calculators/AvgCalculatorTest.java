package edu.bu.cameraready.calculators;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Assert.*;
import org.junit.Test;

public class AvgCalculatorTest {
	@Test
	public void testGetAvg() {
		AvgCalculator avgCalculator = new AvgCalculator();
		double average = avgCalculator.getAverage(Arrays.asList(1, 2));
		assertEquals(1.5, average, 0);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testGetAvgWithNullList() {
		AvgCalculator avgCalculator = new AvgCalculator();
		avgCalculator.getAverage(null);
	}
}
