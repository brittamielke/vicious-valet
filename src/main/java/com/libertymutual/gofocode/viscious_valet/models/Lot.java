package com.libertymutual.gofocode.viscious_valet.models;

import java.util.ArrayList;

public class Lot {

	private ArrayList<Car> carList; // declare (now its available)
	private int capacity = 5;

	public Lot() {
		carList = new ArrayList<Car>(); // set it to an initial value
	}
	
	public void removeCarFromLot(int index) {
		carList.remove(index - 1);
	}

	public void parkCarInLot(Car carToAdd) {
		// add car to lot if it has the capacity to accept it.
		if(!isLotFull()) {//only if it is equal to false "if(isLotFull() == false" is another way to say it
			carList.add(carToAdd);
		}

	}

	public boolean isLotFull() {
		if (carList.size() < capacity) {
			return false;
		} else {
			return true;
		}
	}

	public ArrayList<Car> getCarList() {
		return carList;
	}
	
	public int size() {
		return carList.size();
	}
}
