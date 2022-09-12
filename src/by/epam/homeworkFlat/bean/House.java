package by.epam.homeworkFlat.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class House implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private List<Flat> flats;
	private String street;
	private int houseNumber;
	private int lifetime;
	private TypeOfBuilding type;
	
	public House() {
		
		this.flats = new ArrayList<Flat>();
		this.street = "Unknown";
		this.houseNumber = 1;
		this.lifetime = 0;
		this.type = new TypeOfBuilding(false);
		this.initFlatAll();
		
	}

	public House(List<Flat> flats, String street, int houseNumber, int lifetime, boolean isResidential) {
		
		this.flats = flats;
		this.street = street;
		this.houseNumber = houseNumber;
		this.lifetime = lifetime;
		this.type = new TypeOfBuilding(isResidential);
		this.initFlatAll();
		
	}
	
	public House(String street, int houseNumber, int lifetime, boolean isResidential, Flat...flats) {
		
		this.flats = new ArrayList<>();
		
		for (Flat f : flats) {
			this.flats.add(f);
		}
		this.street = street;
		this.houseNumber = houseNumber;
		this.lifetime = lifetime;
		this.type = new TypeOfBuilding(isResidential);
		this.initFlatAll();
		
	}
	
	public void initFlatAll() {
		for (Flat f : this.flats) {
			f.setType(this.type);
			f.setLifetime(this.lifetime);
			f.setStreet(this.street);
			f.setHouseNumber(this.houseNumber);
		}
	}

	public List<Flat> getFlats() {
		return flats;
	}

	public void setFlats(List<Flat> flats) {
		this.flats = flats;
		this.initFlatAll();
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
		this.initFlatAll();
	}

	public int getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
		this.initFlatAll();
	}

	public int getLifetime() {
		return lifetime;
	}

	public void setLifetime(int lifetime) {
		this.lifetime = lifetime;
		this.initFlatAll();
	}

	public TypeOfBuilding getType() {
		return type;
	}

	public void setType(TypeOfBuilding type) {
		this.type = type;
		this.initFlatAll();
	}

	@Override
	public int hashCode() {
		return Objects.hash(flats, houseNumber, lifetime, street, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		House other = (House) obj;
		return Objects.equals(flats, other.flats) && houseNumber == other.houseNumber && lifetime == other.lifetime
				&& Objects.equals(street, other.street) && Objects.equals(type, other.type);
	}

	@Override
	public String toString() {
		return "House [flats=" + flats + ", street=" + street + ", houseNumber=" + houseNumber + ", lifetime="
				+ lifetime + ", type=" + type + "]";
	}
	
	
	
	
	
	

}
