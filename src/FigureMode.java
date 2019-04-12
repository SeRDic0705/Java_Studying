
public enum FigureMode {

	CIRCLE, TRIANGLE, RECTANGLE, TRAPEZOID, PARALLELOGRAM, RHOMBUS;
	
	public static FigureMode valueOf(int value) {
		switch(value) {
		case 0: return CIRCLE;
		case 1: return TRIANGLE;
		case 2: return RECTANGLE;
		case 3: return TRAPEZOID;
		case 4: return PARALLELOGRAM;
		case 5: return RHOMBUS;
		default: return null;
		}
	}
	
	public static String[] names() {
        String[] names = new String[FigureMode.values().length];
        for (FigureMode mode : FigureMode.values()) {
        	names[mode.ordinal()] = mode.toString();
        }
        return names;
	}
	
}
