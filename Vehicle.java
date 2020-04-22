package homeWorkC8;

public class Vehicle {
	final String serialNumber;
	final int noPersons;
	String name;

	public Vehicle(String serialNumber, int noPersons) {
		this.serialNumber = serialNumber;
		this.noPersons = noPersons;
	}

	public Vehicle(String serialNumber, int noPersons, String name) {
		this(serialNumber, noPersons);
		this.name = name;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public boolean goTo(double positionX, double positionY) {
		System.out.println("Error: unknown vehicle cannot move...");
		return false;
	}

	public boolean addFuel(double amount) {
		System.out.println("Error: unknown type of vehicle...");
		return false;
	}

	public void printInfo() {
		System.out.println("Vehicle properties: " + '\n' + '\t' + "- serial number: " + 
				serialNumber + '\n'	+ '\t' + "- capacity: " + noPersons + '\n' + '\t' + 
				"- name: " + name);
	}
}
