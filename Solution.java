import java.util.Scanner;
class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insert an input number please: ");
		int n = sc.nextInt();
		while(n != 1) {
			if (n % 5 == 0) {
				n /= 5;
			} else if (n % 3 == 0) {
				n /= 3;
			} else if (n % 2 == 0) {
				n /= 2;
			} else {
				System.out.println("This is not an ugly number");
				break;
			}
		}
		if (n == 1) {
			System.out.println("This is an ugly number!");
		}
	}
}