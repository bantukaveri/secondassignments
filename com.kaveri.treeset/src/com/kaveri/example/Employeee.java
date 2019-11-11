package com.kaveri.example;

public class Employeee {
	int empId;
	String name;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empId;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employeee other = (Employeee) obj;
		if (empId != other.empId)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	public Employeee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employeee(int empId, String name) {
		super();
		this.empId = empId;
		this.name = name;
	}
	
	

}
