package by.epam.homeworkFlat.view;

import java.util.List;

import by.epam.homeworkFlat.bean.Flat;
import by.epam.homeworkFlat.bean.House;

public class OutputToConsole {
	
	public void flatToConsole(Flat flat) {
		
		System.out.println("Address: " + flat.getStreet() + " st. " + flat.getHouseNumber() + "/" + flat.getNumberOfApartment() + 
				". Floor " + flat.getFloor() + ". " + flat.getType() + ". Room " + flat.getNumberOfRooms() + ". Area " + flat.getArea() + 
				"m. Lifetime " + flat.getLifetime() + " years.");
	}
	
	public void flatToConsole(List<Flat> flats) {
		
		for(Flat flat : flats) {
			
			flatToConsole(flat);
		}
		System.out.println();
	}
	
	public void flatToConsole(House house) {
		
		flatToConsole(house.getFlats());
	}

}
