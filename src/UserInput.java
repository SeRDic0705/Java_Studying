import java.util.Scanner;

public class UserInput {

	private static Scanner scan = new Scanner(System.in);
	
	public static double getDouble() {
		return Double.parseDouble(scan.nextLine());
	}
	public static int getInteger() {
		return Integer.parseInt(scan.nextLine());
	}
	public static String getString() {
		return scan.nextLine();
	}

}

