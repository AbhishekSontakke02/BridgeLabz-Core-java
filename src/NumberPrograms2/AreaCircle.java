package NumberPrograms2;

public class AreaCircle {
	static double PI = 3.14;
	public static void main(String[] args) {
		double r = 4;
		System.out.println("Area Of Circle Is : " + areaCircle(r));
		

	}
	
	public static double areaCircle(double r) {
		double area = PI*(r*r);
		return area;
	}
}
