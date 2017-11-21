package edu.bu.cameraready.calculators;

import java.util.List;

import javax.inject.Inject;

public class CompoundAvgCalculator {
@Inject	private SumCalculator sumCalculator;

	public int getAverage(List<Integer> numbers) {

		return getSumCalculator().getSum(numbers) / numbers.size();
	}

	public SumCalculator getSumCalculator() {
		return sumCalculator;
	}

	public void setSumCalculator(SumCalculator sumCalculator) {
		this.sumCalculator = sumCalculator;
	}

}
