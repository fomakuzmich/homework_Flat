package by.epam.homeworkFlat.bean;

import java.io.Serializable;
import java.util.Objects;

public class Flat implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int numberOfApartment;
	private double area;
	private int floor;
	private int numberOfRooms;
	private String street;
	private TypeOfBuilding type;
	private int lifetime;
	private int houseNumber;
	
	
	public Flat() {
		
		this.numberOfApartment = 1;
		this.area = 20;
		this.floor = 1;
		this.numberOfRooms = 1;
		this.street = "Unknown";
		this.type = new TypeOfBuilding(false);
		this.lifetime = 0;
		this.houseNumber = 1;
	}

	public Flat(int numberOfApartment, double area, int floor, int numberOfRooms) {
		
		this.numberOfApartment = numberOfApartment;
		this.area = area;
		this.floor = floor;
		this.numberOfRooms = numberOfRooms;
		this.street = "Unknown";
		this.type = new TypeOfBuilding(false);
		this.lifetime = 0;
		this.houseNumber = 1;
	}
	
	public Flat(int numberOfApartment, double area, int floor, int numberOfRooms, boolean isResidential) {
		
		this.numberOfApartment = numberOfApartment;
		this.area = area;
		this.floor = floor;
		this.numberOfRooms = numberOfRooms;
		this.street = "Unknown";
		this.type = new TypeOfBuilding(isResidential);
		this.lifetime = 0;
		this.houseNumber = 1;
	}

	public int getNumberOfApartment() {
		return numberOfApartment;
	}

	public void setNumberOfApartment(int numberOfApartment) {
		this.numberOfApartment = numberOfApartment;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	public int getNumberOfRooms() {
		return numberOfRooms;
	}

	public void setNumberOfRooms(int numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getType() {
		return type.getType();
	}
	
	public void setType(TypeOfBuilding type) {
		this.type = type;
	}

	public void setType(boolean isResidential) {
		this.type = new TypeOfBuilding(isResidential);
	}

	public int getLifetime() {
		return lifetime;
	}

	public void setLifetime(int lifetime) {
		this.lifetime = lifetime;
	}

	public int getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}

	@Override
	public int hashCode() {
		return Objects.hash(area, floor, houseNumber, lifetime, numberOfApartment, numberOfRooms, street, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Flat other = (Flat) obj;
		return Double.doubleToLongBits(area) == Double.doubleToLongBits(other.area) && floor == other.floor
				&& houseNumber == other.houseNumber && lifetime == other.lifetime
				&& numberOfApartment == other.numberOfApartment && numberOfRooms == other.numberOfRooms
				&& Objects.equals(street, other.street) && Objects.equals(type, other.type);
	}

	@Override
	public String toString() {
		return "Flat [numberOfApartment=" + numberOfApartment + ", area=" + area + ", floor=" + floor
				+ ", numberOfRooms=" + numberOfRooms + ", street=" + street + ", type=" + type + ", lifetime="
				+ lifetime + ", houseNumber=" + houseNumber + "]";
	}
	
	
	
	
	
	

}
