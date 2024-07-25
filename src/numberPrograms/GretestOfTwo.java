package numberPrograms;

public class GretestOfTwo {

	public static void main(String[] args) {
		int a = 10, b = 20;
		System.out.println("Gretest Number Among a = "+ a +" and b = "+ b +" is : "+gretest(a,b));
	}
	
	public static int gretest(int a, int b) {
		if(a>b) {
			return a;
		}
		else {
			return b;
		}
	}
}
