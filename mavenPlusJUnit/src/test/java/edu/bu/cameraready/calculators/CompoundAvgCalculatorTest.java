package edu.bu.cameraready.calculators;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CompoundAvgCalculatorTest {
	@InjectMocks
	CompoundAvgCalculator cut;
	@Mock
	SumCalculator sumCalculator;

	@Test
	public void testGetAverage() {
		cut.setSumCalculator(sumCalculator);
		when(sumCalculator.getSum(Matchers.anyList())).thenReturn(100);
		int average = cut.getAverage(Arrays.asList(20, 20, 20, 20, 20));
		assertEquals(20, average);
	}

}
