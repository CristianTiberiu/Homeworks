package homeWorkC8;

public class Main {
	public static void main(String[] args) {

		Vehicle Tibys = new Vehicle("A241fg1", 4);

		Tibys.addFuel(30.5);
		Tibys.printInfo();

		OnRoad aVehicleOnRoad = new OnRoad("A2b2234gfF", 4, "Mario");

		aVehicleOnRoad.goTo(2.3, 1.8);
		aVehicleOnRoad.addFuel(38);
		aVehicleOnRoad.printInfo();

		OnWater aVasseOnWater = new OnWater("New2Boat", 80, "The Tank", 3, 2000.5);

		aVasseOnWater.goTo(12.5, 129.48);
		aVasseOnWater.addFuel(2530);
		aVasseOnWater.printInfo();

		OnAir aPlaneOnAir = new OnAir("A2z432b4", 320, "The Sonic", 6, true);

		aPlaneOnAir.goTo(1246.8, 2541.4);
		aPlaneOnAir.addFuel(14500.8);
		aPlaneOnAir.printInfo();

	}

}
