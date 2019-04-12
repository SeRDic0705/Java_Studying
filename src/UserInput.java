import java.util.Scanner;

public class UserInput {

	private static Scanner scan = new Scanner(System.in);
	
	public static double getDouble() {
		double input = 0;
		while(true) {
			try {
				input = Double.parseDouble(scan.nextLine());
				break;
			}
			catch(NumberFormatException e) {
				System.out.println("올바른 값(실수)를 입력해주세요.");
			}
		}
		return input;
	}
	public static int getInteger() {
		int input = 0;
		while(true) {
			try {
				input = Integer.parseInt(scan.nextLine());
				break;
			}
			catch(NumberFormatException e) {
				System.out.println("올바른 값(정수)를 입력해주세요.");
			}
		}
		return input;
	}
	public static String getString() {
		return scan.nextLine();
	}
	
	public static FigureMode getFigureMode() {
		FigureMode input;
		while(true) {
			try {
				input = FigureMode.valueOf(scan.nextLine().toUpperCase());
				break;
			}
			catch(NumberFormatException e) {
				System.out.println("올바른 값(실수)를 입력해주세요.");
			}
		}
		return input;
	}

}

