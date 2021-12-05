package com.hsbcselfpractice.springboot_h2_database.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bus {
	@Id
	private int busNumber;
	private String busName;
	private String busType;
	private String driverName;
	private double busTiming;

	public Bus() {

	}

	public Bus(String busName, int busNumber, String busType, String driverName, double busTiming) {

		this.busName = busName;
		this.busNumber = busNumber;
		this.busType = busType;
		this.driverName = driverName;
		this.busTiming = busTiming;

	}

	public String getBusName() {
		return busName;
	}

	public void setBusName(String busName) {
		this.busName = busName;
	}

	public int getBusNumber() {
		return busNumber;
	}

	public void setBusNumber(int busNumber) {
		this.busNumber = busNumber;
	}

	public String getBusType() {
		return busType;
	}

	public void setBusType(String busType) {
		this.busType = busType;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public double getBusTiming() {
		return busTiming;
	}

	public void setBusTiming(double busTiming) {
		this.busTiming = busTiming;
	}


}
