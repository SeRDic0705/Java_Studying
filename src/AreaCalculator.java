
public class AreaCalculator {
	
	public static final int CIRCLE = 1;
	public static final int TRIANGLE = 2;
	public static final int RECTANGLE = 3;
	public static final int TRAPEZOID = 4;
	
	
	
	public static double circleArea(double radius) {
		return Math.PI*radius*radius;
	}
	public static double triangleArea(double length) {
		return Math.sqrt(3)*length/4;
	}
	public static double rectangleArea(double width, double height) {
		return width*height;
	}
	public static double trapezoidArea(double top, double bottom, double height) {
		return (top+bottom)*height/2;
	}
	
}
