package com.libertymutual.gofocode.viscious_valet.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.libertymutual.gofocode.viscious_valet.models.Car;
import com.libertymutual.gofocode.viscious_valet.models.Lot;

@Controller
public class AppController {

	private Lot carLot; // declares
	// WRONG private boolean fullVariable = carLot.isLotFull();

	public AppController() { // constructor (same name as the class, no return value)
		carLot = new Lot(); // initializes carLot
	}



	@RequestMapping("/")
	public ModelAndView showApp(String license, String state, String make, String model, String color) { // matches form
																											// names
		// if license is not null and the length of license is greater than 0
		if (license != null && license.length() > 0) { // have to put null check first.
			// create a new instance of the car class from the values submitted
			Car customerCar;
			customerCar = new Car(license, state, make, model, color); // order must match constructor order

			// park car in lot
			// we need to add a method to the Lot class and call that method
			carLot.parkCarInLot(customerCar);
		}
		ModelAndView mv; // declare
		mv = new ModelAndView();// set it
		mv.setViewName("app");
		mv.addObject("lot", carLot);
		return mv;

	}
	@RequestMapping("/remove")
	public ModelAndView removeCar(int carIndex) {
		carLot.removeCarFromLot(carIndex);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("app");
		mv.addObject("lot", carLot);
		return mv;
	}
}
