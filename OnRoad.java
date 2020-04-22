package homeWorkC8;

public class OnRoad extends Vehicle {
	private int noWheels = 4;
	private int noDoors = 4;

	public OnRoad(String serialNumber, int noPersons) {
		super(serialNumber, noPersons);
	}

	public OnRoad(String serialNumber, int noPersons, String name) {
		super(serialNumber, noPersons, name);
	}

	public OnRoad(String serialNumber, int noPersons, String name, int noWheels) {
		super(serialNumber, noPersons, name);
		this.noWheels = noWheels;
	}

	public OnRoad(String serialNumber, int noPersons, String name, int noWheels, int noDoors) {
		this(serialNumber, noPersons, name, noWheels);
		this.noDoors = noDoors;
	}

	public boolean goTo(double positionX, double positionY) {
		System.out.println("Driving the vehicle on road to coordinates: [" + 
				positionX + ", " + positionY + "] ");
		return true;
	}

	public boolean addFuel(double amount) {
		System.out.println("Adding " + amount + " l of fuel to the driving vehicle");
		return true;
	}
	
	public void printInfo() {
		System.out.println("Vehicle properties: " + '\n' + '\t' + "- serial number: " + 
				serialNumber + '\n'	+ '\t' + "- capacity: " + noPersons + '\n' + '\t' + 
				"- name: " + name + '\n' + "Driving vehicle properties: " + '\n' + '\t' +
				"- number of wheels: " + noWheels + '\n' + '\t' + "- number of doors:" + 
				noDoors);
	}
}
