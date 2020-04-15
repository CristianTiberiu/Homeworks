import java.util.ArrayList;
import java.util.Arrays;

public class Exercitiul0_Curs5 {

	public static void main(String[] args) {

		ArrayList<String> guestList = new ArrayList<String>(
				Arrays.asList("Maria", "Ioana", "George", "Gabi", "Sergiu", "Rebeca", "Olivia", "Gabi"));
		
		guestList.add(1, "Ionelia");
		guestList.add("Laurentiu");
		
		
		
		
		guestList.remove("George");
		System.out.println(guestList);
		
		guestList.remove(3);
		
		
		System.out.println("Indexul unde se afla Rebeca este: " + guestList.indexOf("Rebeca"));
		System.out.println(guestList);
		System.out.println("Dimensiunea listei de invitati este: " + guestList.size());
		
		
		System.out.println(guestList.contains("Gabi"));
		System.out.println("Pe indexul 0 se afla: " + guestList.get(0));
		
		guestList.add(0, "Gigel");
		System.out.println("Pe indexul 0 se afla: " + guestList.get(0));
		
		System.out.println("Ultima aparitie a lui Gabi este pe indexul: " + guestList.lastIndexOf("Gabi"));
		
		guestList.set(1, "Roby");
		System.out.println(guestList);
		
		guestList.clear();
		System.out.println(guestList);
		System.out.println(guestList.size());
	}
}
