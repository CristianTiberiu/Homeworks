package homeWorkC8;

public class OnAir extends Vehicle {
	private int noTurbines = 2;
	private boolean hasFirstClass;

	public OnAir(String serialNumber, int noPersons) {
		super(serialNumber, noPersons);
	}

	public OnAir(String serialNumber, int noPersons, String name) {
		super(serialNumber, noPersons, name);
	}

	public OnAir(String serialNumber, int noPersons, String name, int noTurbines) {
		super(serialNumber, noPersons, name);
		this.noTurbines = noTurbines;
	}

	public OnAir(String serialNumber, int noPersons, String name, int noTurbines, boolean hasFirstClass) {
		this(serialNumber, noPersons, name, noTurbines);
		this.hasFirstClass = hasFirstClass;
	}
	
	public boolean goTo(double positionX, double positionY) {
		System.out.println("Flying the airplane to coordinates: [ " + positionX + ", " + 
				positionY + "]");
		return true;
	}
	
	public boolean addFuel(double amount) {
		System.out.println("Adding " + amount + " l of fuel to the airplane");
		return true;
	}
	
	public void printInfo() {
		System.out.println("Vehicle properties: " + '\n' + '\t' + "- serial number: " + 
				serialNumber + '\n'	+ '\t' + "- capacity: " + noPersons + '\n' + '\t' + 
				"- name: " + name + '\n' + "Airplane properties: " + '\n' + '\t' +
				"- number of turbines: " + noTurbines + '\n' + '\t' + "- has first class: " + 
				hasFirstClass);
	}
}
