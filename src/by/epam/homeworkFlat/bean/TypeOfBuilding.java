package by.epam.homeworkFlat.bean;

import java.io.Serializable;
import java.util.Objects;

public class TypeOfBuilding implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private boolean isResidential;
	private String type;
	
	public TypeOfBuilding() {
		this.type = "Non-residential";
	}

	public TypeOfBuilding(boolean isResidential) {
		this.isResidential = isResidential;
		this.setType(isResidential);
	}

	public boolean isResidential() {
		return isResidential;
	}

	public void setResidential(boolean isResidential) {
		this.isResidential = isResidential;
	}

	public void setType(boolean isResidential) {
		if (isResidential) {
			this.type = "Residential";
		}
		else {
			this.type = "Non-residential";
		}
	}
	
	public String getType() {
		return type;
	}

	@Override
	public int hashCode() {
		return Objects.hash(isResidential, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TypeOfBuilding other = (TypeOfBuilding) obj;
		return isResidential == other.isResidential && Objects.equals(type, other.type);
	}

	@Override
	public String toString() {
		return "TypeOfBuilding [isResidential=" + isResidential + ", type=" + type + "]";
	}
	
	


	
	
	
	
	

}
