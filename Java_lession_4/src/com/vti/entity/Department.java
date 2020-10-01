package com.vti.entity;

public class Department {
	byte id;
	String name;
	Account[] accounts;

//	@Override
	public String toString() {
		String result = "";
		result += "ID la: " + id + "\n";
		result += "Name la: " + name + "\n";
		return result;

	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		Department department2 = (Department) obj;
		String Name = department2.name;
		if (name.equals(Name)) {
			return true;
		}
		return false;

	}
}