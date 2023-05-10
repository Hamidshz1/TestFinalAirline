package Airline.controller;

import Airline.model.Customers;

public class ReservationService {
	private boolean Reserved;

	public void reserve(Customers customers) {
		
		if (!Reserved) {
			Reserved = true;
			System.out.println("Reservation successful!");
		} else {
			System.out.println("Sorry,already reserved.");
		}
	}

	public void cancel() {
		if (Reserved) {
			Reserved = false;
			System.out.println("Reservation cancelled.");
		} else {
			System.out.println("There is no reservation to cancel.");
		}
	}
}
