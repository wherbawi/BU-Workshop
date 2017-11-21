package edu.bu.cameraready.calculators;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Matchers;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CompoundAvgCalculatorTest {
	@Test
	public void testGetAverage() {
		CompoundAvgCalculator cut = new CompoundAvgCalculator();
		SumCalculator sumCalculator = Mockito.mock(SumCalculator.class);
		when(sumCalculator.getSum(Matchers.anyList())).thenReturn(100);
		cut.setSumCalculator(sumCalculator);
		int average = cut.getAverage(Arrays.asList(20, 20, 20, 20, 20));
		assertEquals(20, average);
	}

}
