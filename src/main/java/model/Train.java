package model;

import java.util.List;

public class Train {
	private long trainNumber;
	private String trainName;
	private String source;
	private String destination;
	private List<Station> stations;
	private double trainPrice;
	
	public Train() {
		System.out.println("Welcome to Indian Railway");
	}
	
	public Train(long trainNumber, String trainName, String source, String destination, List<Station> stations,
			double trainPrice) {
		super();
		this.trainNumber = trainNumber;
		this.trainName = trainName;
		this.source = source;
		this.destination = destination;
		this.stations = stations;
		this.trainPrice = trainPrice;
	}



	@Override
	public String toString() {
		return "Train [trainNumber=" + trainNumber + ", trainName=" + trainName + ", source=" + source
				+ ", destination=" + destination + ", stations=" + stations + ", trainPrice=" + trainPrice + "]";
	}
	
	

	



	
	
	
	
}
