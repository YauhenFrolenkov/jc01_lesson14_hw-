package edu.training.jc.task_10;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		Airport airport = new Airport();
		
		airport.add(new Airline("Monaco", 1234, "passenger", 12.30, "Monday"));
		airport.add(new Airline("New-York", 4553, "passenger", 15.26, "Tuesday"));
		airport.add(new Airline("San Francisco", 05623, "passenger", 17.16, "Wednesday"));
		airport.add(new Airline("Hong Kong", 333322, "passenger", 20.41, "Thursday"));
		airport.add(new Airline("Moscow", 324, "passenger", 09.56, "Friday"));
		airport.add(new Airline("Minsk", 4444555, "passenger", 11.56, "Saturday"));
		airport.add(new Airline("Warsaw", 213555, "passenger", 12.21, "Sunday"));
		
		System.out.println("----------------All airlines in airport---------------");
		airport.showAirlines();
		System.out.println();
		
		
		System.out.println("----------------Find airline by destination-----------------");
		List<Airline> findByDestination = airport.findByDestination("Monaco");
		if (findByDestination != null) {
			System.out.println(findByDestination);
		} else {
			System.out.println("Airlines not found.");
		}
		System.out.println();
		
		
		System.out.println("----------------Find airline by day of week-----------------");
		List<Airline> findByDaysOfWeek = airport.findByDaysOfWeek("Sunday");
		if (findByDaysOfWeek != null) {
			System.out.println(findByDaysOfWeek);
		} else {
			System.out.println("Airlines not found.");
		}
		System.out.println();
		
		
		System.out.println("----------------Find airline by day of week and departure-----------------");
		List<Airline> findByDepartureTimeAndDayOfWeek = airport.findByDepartureTimeAndDayOfWeek(10.00, "Sunday");
		if (findByDepartureTimeAndDayOfWeek != null) {
			System.out.println(findByDepartureTimeAndDayOfWeek);
		} else {
			System.out.println("Airlines not found.");
		}
		System.out.println();
		
		
		System.out.println("----------------Is airline in airport------------------");
		Airline airlineCheeck = new Airline("Monaco", 1234, "passenger", 12.30, "Monday"); 
		System.out.println("Is airline in airport? " + airport.isInAirport(airlineCheeck));
		System.out.println();
		
		System.out.println("--------------Delete book in library----------------");
		airport.delete(4); 
		airport.showAirlines();
		
		
		

	}

}
