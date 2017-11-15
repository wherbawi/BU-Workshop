package edu.bu.utils;

import org.geotools.referencing.GeodeticCalculator;

public class DistanceCalculator {
	public int calcDist(Point src, Point dst) {
		GeodeticCalculator calculator = new GeodeticCalculator();
		calculator.setStartingGeographicPoint(src.getLon(), src.getLat());
		calculator.setDestinationGeographicPoint(dst.getLon(), dst.getLat());
		return (int) calculator.getOrthodromicDistance();

	}
}
