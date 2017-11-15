package edu.bu.cameraready.calculators;

public class Point {
	private double lat;
	private double lon;

	/**
	 * @param lat
	 * @param lon
	 */
	public Point(double lat, double lon) {
		super();
		this.setLat(lat);
		this.setLon(lon);
	}

	public double getLat() {
		return lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	public double getLon() {
		return lon;
	}

	public void setLon(double lon) {
		this.lon = lon;
	}

}
