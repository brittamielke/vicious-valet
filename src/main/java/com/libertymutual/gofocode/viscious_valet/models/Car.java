package com.libertymutual.gofocode.viscious_valet.models;

public class Car {
	private String make;
	private String model;
	private String color;
	private String license;
	private String state;

	public Car(String license, String state, String make, String model, String color) {
		this.make = make;
		this.model = model;
		this.license = license;
		this.state = state;
		this.color = color;
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public String getColor() {
		return color;
	}

	public String getLicense() {
		return license;
	}

	public String getState() {
		return state;
	}
}
