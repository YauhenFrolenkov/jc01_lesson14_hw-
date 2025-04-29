package edu.training.jc.task_10;

/*Найти и вывести:   
a) список рейсов для заданного пункта назначения;   
b) список рейсов для заданного дня недели;   
c) список рейсов для заданного дня недели, время вылета для которых больше заданного.*/

import java.util.ArrayList;
import java.util.List;

public class Airport {

	private List<Airline> airlines = new ArrayList<>();

	public Airport() {

	}

	public Airport(List<Airline> airlines) {
		this.airlines = airlines;
	}

	public boolean add(Airline a) {
		return airlines.add(a);
	}

	public boolean delete(int flightNumber) {
		int deleteFlight = -1;

		for (int i = 0; i < airlines.size(); i++) {
			if (airlines.get(i).getFlightNumber() == flightNumber) {
				deleteFlight = i;
				break;
			}
		}

		if (deleteFlight < 0) {
			return false;
		}

		airlines.remove(deleteFlight);
		return true;
	}

	public List<Airline> findByDestination(String destination) {
		List<Airline> result = new ArrayList<>();
		for (Airline airline : airlines) {
			if (airline.getDestination().equalsIgnoreCase(destination)) {
				result.add(airline);
			}
		}
		return result;
	}

	public List<Airline> findByDaysOfWeek(String daysOfWeek) {
		List<Airline> result = new ArrayList<>();
		for (Airline airline : airlines) {
			if (airline.getDaysOfWeek().equalsIgnoreCase(daysOfWeek)) {
				result.add(airline);
			}
		}
		return result;
	}

	public List<Airline> findByDepartureTimeAndDayOfWeek(double departureTime, String daysOfWeek) {
		List<Airline> result = new ArrayList<>();
		for (Airline airline : airlines) {
			if (airline.getDepartureTime() > departureTime && airline.getDaysOfWeek().equalsIgnoreCase(daysOfWeek)) {
				result.add(airline);
			}
		}
		return result;
	}

	public boolean isInAirport(Airline airline) {
		return airlines.contains(airline);
	}

	public void showAirlines() {
		System.out.println("----------------------Airport----------------------");
		for (int i = 0; i < airlines.size(); i++) {
			Airline a = airlines.get(i);
			System.out.println("Airline: destination: " + a.getDestination());
			System.out.println("\t flightNumber: " + a.getFlightNumber());
			System.out.println("\t aircraftType: " + a.getAircraftType());
			System.out.println("\t departureTime: " + a.getDepartureTime());
			System.out.println("\t daysOfWeek: " + a.getDaysOfWeek());
			System.out.println("-------------------------------------------------");
		}
		System.out.println("-------------------------------------------------");
	}

}
