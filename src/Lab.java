
public class Lab {

	
	static double area(FigureMode mode) {
		double area = 0;
		switch(mode) {
		case CIRCLE:
			System.out.print("Input circle radius: ");
			double radius = UserInput.getDouble();
			area = AreaCalculator.circleArea(radius);
			System.out.println("circle radius="+radius+"\narea="+area);
			break;
		case TRIANGLE:
			System.out.print("Input triangle length: ");
			double length = UserInput.getDouble();
			area = AreaCalculator.triangleArea(length);
			System.out.println("Triangle area="+area);
			break;
		case RECTANGLE:
			System.out.print("Input rectangle width/height: ");
			double width = UserInput.getDouble();
			double height = UserInput.getDouble();
			area = AreaCalculator.rectangleArea(width, height);
			System.out.println("Rectangle area="+area);
			break;
		case TRAPEZOID:
			System.out.print("Input trapezoid top/bottom/height: ");
			double top = UserInput.getDouble();
			double bottom = UserInput.getDouble();
			height = UserInput.getDouble();
			area = AreaCalculator.trapezoidArea(top, bottom, height);
			System.out.println("Trapezoid area="+area);
			break;
		case PARALLELOGRAM:
			System.out.print("Input parallelogram width/height: ");
			width = UserInput.getDouble();
			height = UserInput.getDouble();
			area = AreaCalculator.parallelogramArea(width, height);
			System.out.println("Parallelogram area="+area);
			break;
		case RHOMBUS:
			System.out.print("Input rhombus width/height: ");
			double horizon = UserInput.getDouble();
			double vertical = UserInput.getDouble();
			area = AreaCalculator.rhombusArea(horizon, vertical);
			System.out.println("Rhombus area="+area);
			break;
		default:
			area = -1;
			System.out.println("Unknown Shape");
		}
		return area;
	}
	
	static double area(String name) {
		FigureMode mode = FigureMode.valueOf(name); //String -> FigureMode
		return area(mode); //double area(FigureMode mode)
	}
	static double area(int value) {
		FigureMode mode = FigureMode.valueOf(value); //integer -> FigureMode
		return area(mode); //double area(FigureMode mode)
	}

	static void printAreaSize(double area) {
		//print by area size
		if(area < 0)
			System.out.println("��Ȯ�� ������ �̸��� �Է����ּ���.");
		else if(area <= 50 && area >= 0)
			System.out.println("������ 50����");
		else if(area > 50 && area <= 70)
			System.out.println("������ 51~70");
		else
			System.out.println("������ 71�̻�");
	}
	
	static void calculate(FigureMode mode) {
		double area = area(mode);
		printAreaSize(area);
	}
	
	
	
	public static void main(String[] args) {
		//for each�� ����Ͽ� ��� ������ ���� ���� ���
		//1D/2D/3D array�� ������ ������ �����͸� for each���� �̿��ؼ� ������ ����Ͽ� ���̺��� ���·� ����Ѵ�
		double[] circleData = {5.5, 3.5, 1.5};
		double[] triangleData = {6.5, 3.5, 1.5};
		double[][] rectangleData = {{4, 8}, {6, 7.5}, {4.5, 2}};
		double[][] trapezoidData = {{16.5,15.5,14.5}, {14.5,13.5,12.5}};
		double[][] parallelogramData = {{7,3.5}, {6.5, 12}, {8, 4.5}};
		double[][] rhombusData = {{5, 10}, {7, 12}, {9, 4.5}};
		
		System.out.println(FigureMode.valueOf(0));
		System.out.println("radius\t" + "Area");
		for(double radius : circleData) {
			double area = AreaCalculator.circleArea(radius);
			System.out.println(radius + "\t" + area);
		}
		System.out.println(FigureMode.valueOf(1));
		System.out.println("length\t" + "Area");
		for(double length : triangleData) {
			double area = AreaCalculator.triangleArea(length);
			System.out.println(length + "\t" + area);
		}
		System.out.println(FigureMode.valueOf(2));
		System.out.println("width\t" + "height\t" + "Area");
		for(double[] num : rectangleData) {
			double area = AreaCalculator.rectangleArea(num[0], num[1]);
			System.out.println(num[0] + "\t" + num[1] + "\t" + area);
		}
		System.out.println(FigureMode.valueOf(3));
		System.out.println("top\t" + "bottom\t" + "height\t" + "Area");
		for(double[] num : trapezoidData) {
			double area = AreaCalculator.trapezoidArea(num[0], num[1], num[2]);
			System.out.println(num[0] + "\t" + num[1] + "\t" + num[2] + "\t" + area);
		}
		System.out.println(FigureMode.valueOf(4));
		System.out.println("width\t" + "height\t" + "Area");
		for(double[] num : parallelogramData) {
			double area = AreaCalculator.parallelogramArea(num[0], num[1]);
			System.out.println(num[0] + "\t" + num[1] + "\t" + area);
		}
		System.out.println(FigureMode.valueOf(5));
		System.out.println("horizon\t" + "vertical " + "Area");
		for(double[] num : rhombusData) {
			double area = AreaCalculator.rhombusArea(num[0], num[1]);
			System.out.println(num[0] + "\t" + num[1] + "\t" + area);
		}
						
		//for each�� FigureMode �������� ����Ͽ� ��� Figure�� ���� ���� ��� 
		for(String name : FigureMode.names()) {
			area(name);
		}
		
		//����ڰ� ���ϴ� ������ �Է¹޾� ������ ����ϰ� ũ�Ⱑ 50����, 51~70, 71�̻��� ����ϴ� calculate �޼ҵ� �����Ѵ�.
		int check = 1;
		do {
			System.out.println("����� ������ �̸��� ����� �Է��ϼ���");
			FigureMode mode = UserInput.getFigureMode();
			calculate(mode);
			System.out.println("�����Ϸ��� q�� �����ÿ�.");
			String cmd = UserInput.getString();
			if(cmd == "q")
				check = 0;
		}while(check == 1);
	}
}

