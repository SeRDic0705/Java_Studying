
public class Lab {

	
	private static double area(String name) {
		double area = 0;
		if(name.contentEquals("CIRCLE")) {
			System.out.print("Input circle radius: ");
			double radius = UserInput.getDouble();
			area = AreaCalculator.circleArea(radius);
			System.out.println("circle radius="+radius+"\narea="+area);
			return area;
		}
		else if(name.contentEquals("TRIANGLE")) {
			System.out.print("Input triangle length: ");
			double length = UserInput.getDouble();
			area = AreaCalculator.triangleArea(length);
			System.out.println("Triangle area="+area);
			return area;
		}
		else if(name.contentEquals("RECTANGLE")) {
			System.out.print("Input circle width/height: ");
			double width = UserInput.getDouble();
			double height = UserInput.getDouble();
			area = AreaCalculator.rectangleArea(width, height);
			System.out.println("Rectangle area="+area);
			return area;
		}
		else if(name.contentEquals("TRAPEZOID")) {
			System.out.print("Input circle top/bottom/height: ");
			double top = UserInput.getDouble();
			double bottom = UserInput.getDouble();
			double height = UserInput.getDouble();
			area = AreaCalculator.trapezoidArea(top, bottom, height);
			System.out.println("Trapezoid area="+area);
			return area;
		}
		return area;
	}
	private static double area(int mode) {
		//switch
		switch(mode) {
		case AreaCalculator.CIRCLE:
			System.out.print("Input circle radius: ");
			double radius = UserInput.getDouble();
			double area = AreaCalculator.circleArea(radius);
			System.out.println("circle radius="+radius+"\narea="+area);
			break;
		case AreaCalculator.TRIANGLE:
			System.out.print("Input triangle length: ");
			double length = UserInput.getDouble();
			area = AreaCalculator.triangleArea(length);
			System.out.println("Triangle area="+area);
			break;
		case AreaCalculator.RECTANGLE:
			System.out.print("Input rectangle width/height: ");
			double width = UserInput.getDouble();
			double height = UserInput.getDouble();
			area = AreaCalculator.rectangleArea(width, height);
			System.out.println("Rectangle area="+area);
			break;
		case AreaCalculator.TRAPEZOID:
			System.out.print("Input trapezoid top/bottom/height: ");
			double top = UserInput.getDouble();
			double bottom = UserInput.getDouble();
			height = UserInput.getDouble();
			area = AreaCalculator.trapezoidArea(top, bottom, height);
			System.out.println("Trapezoid area="+area);
		}
		return 0.0;
	}
	
	private static void printAreaSize(double area) {
		//print by area size
		if(area <= 50)
			System.out.println("면적이 50이하");
		else if(area > 50 && area <= 70)
			System.out.println("면적이 51~70");
		else
			System.out.println("면적이 71이상");
	}
	
	private static void calculate(String name) {
		double area = area(name);
		printAreaSize(area);
	}
	private static void calculate(int mode) {
		 double area = area(mode);
		 printAreaSize(area);
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("사용할 기능의 번호:");
		int select= UserInput.getInteger();
		switch(select) {
		case 1:
			for(int i=0; i<5;i++) {
				System.out.println("계산할 도형을 대문자로 입력하세요");
				String shape = UserInput.getString();
				calculate(shape);
			}
			break;
		case 2:
			int array[]= {1,2,3,4};
			for(int number : array)
				calculate(number);
			break;
		case 3:
			int check = 0;
			do {
				System.out.println("계산할 도형을 대문자로 입력하세요");
				String shape = UserInput.getString();
				calculate(shape);
				System.out.println("종료하려면 q를 누르시오.");
				String cmd = UserInput.getString();
				if(cmd == "q")
					check = 1;
			}while(check == 1);
			break;
		}
		
	}
}

