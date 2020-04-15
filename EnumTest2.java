
public class EnumTest2 {
	Month month;
	
	public EnumTest2(Month month) {
		this.month = month;
	}
	public void tellHowItIs() {
		switch (month) {
		case DECEMBRE:
		case JANUARY:
			System.out.println("These months are so cold.");
				break;
				
		case JULY:
		case AUGUST:
			System.out.println("This month is so hot.");
				break;
			
		case SEPTEMBER:
		case NOVEMBRE:
			System.out.println("This moths are rainy");
				break;
				
				default:
					System.out.println("These months are just normal!");
					break;
		}
	}
		public static void main(String[] args) {
			EnumTest2 firstMonth = new EnumTest2(Month.JANUARY);
			firstMonth.tellHowItIs();
			EnumTest2 thirdMonth = new EnumTest2 (Month.MARCH);
			thirdMonth.tellHowItIs();
			EnumTest2 fivthMonth = new EnumTest2 (Month.JUNE);
			fivthMonth.tellHowItIs();
			EnumTest2 seventhMonth = new EnumTest2 (Month.JULY);
			seventhMonth.tellHowItIs();
	}
}
