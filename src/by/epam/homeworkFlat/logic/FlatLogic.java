package by.epam.homeworkFlat.logic;

import java.util.ArrayList;
import java.util.List;

import by.epam.homeworkFlat.bean.Flat;
import by.epam.homeworkFlat.bean.House;

public class FlatLogic {
	
	public List<Flat> byNuberOfRooms(int rooms, House...houses){
		
		List<Flat> flats = new ArrayList<>();
		
		for (House house : houses) {
			
			for (Flat flat : house.getFlats()) {
				
				if (flat.getNumberOfRooms() == rooms) {
					flats.add(flat);
				}
			}
		}
		return flats;
	}
	
	public List<Flat> byNuberOfRooms(int rooms, List<Flat> flatsOfHouse){
		
		List<Flat> flats = new ArrayList<>();
		
		for (Flat flat : flatsOfHouse) {
			
			if (flat.getNumberOfRooms() == rooms) {
				flats.add(flat);
			}
		}
		return flats;
	}
	
	public List<Flat> byFloor(int minFloor, int maxFloor, House...houses) {
		
		List<Flat> flats = new ArrayList<>();
		
		for (House house : houses) {
			
			for (Flat flat : house.getFlats()) {
				
				if (flat.getFloor() >= Math.min(minFloor, maxFloor) && flat.getFloor() <= Math.max(minFloor, maxFloor)) {
					flats.add(flat);
				}
			}
		}
		return flats;
	}
	
	public List<Flat> byFloor(int minFloor, int maxFloor, List<Flat> flatsOfHouse) {
		
		List<Flat> flats = new ArrayList<>();
		
		for (Flat flat : flatsOfHouse) {
			
			if (flat.getFloor() >= Math.min(minFloor, maxFloor) && flat.getFloor() <= Math.max(minFloor, maxFloor)) {
				flats.add(flat);
			}
		}
		return flats;
	}
	
	public List<Flat> byArea(double area, House...houses) {
		
		List<Flat> flats = new ArrayList<>();
		
		for (House house : houses) {
			
			for (Flat flat : house.getFlats()) {
				
				if (flat.getArea() >= area) {
					flats.add(flat);
				}
			}
		}
		return flats;
	}
	
	public List<Flat> byArea(double area, List<Flat> flatsOfHouse) {
		
		List<Flat> flats = new ArrayList<>();
		
		for (Flat flat : flatsOfHouse) {
			
			if (flat.getArea() >= area) {
				flats.add(flat);
			}
		}
		return flats;
	}

}
