package homeWorkC8;

public class OnWater extends Vehicle {
	private int noEngines = 2;
	private double cargoCapacity;

	public OnWater(String serialNumber, int noPersons) {
		super(serialNumber, noPersons);
	}

	public OnWater(String serialNumber, int noPersons, String name) {
		super(serialNumber, noPersons, name);
	}

	public OnWater(String serialNumber, int noPersons, String name, int noEngines) {
		super(serialNumber, noPersons, name);
		this.noEngines = noEngines;
	}

	public OnWater(String serialNumber, int noPersons, String name, int noEngines, double cargoCapacity) {
		this(serialNumber, noPersons, name, noEngines);
		this.cargoCapacity = cargoCapacity;
	}
	
	public boolean goTo(double positionX, double positionY) {
		System.out.println("Sailing the vessel to coordinates: [" + positionX + ", " + 
				positionY + "]");
		return true;
	}
	
	public boolean addFuel(double amount) {
		System.out.println("Adding " + amount + " l of fuel to the vessel");
		return true;
	}
	
	public void printInfo() {
		System.out.println("Vehicle properties: " + '\n' + '\t' + "- serial number: " + 
				serialNumber + '\n'	+ '\t' + "- capacity: " + noPersons + '\n' + '\t' + 
				"- name: " + name + '\n' + "Vessel properties: " + '\n' + '\t' +
				"- number of engines: " + noEngines + '\n' + '\t' + "- cargo capacity: " + 
				cargoCapacity);
	}

}
