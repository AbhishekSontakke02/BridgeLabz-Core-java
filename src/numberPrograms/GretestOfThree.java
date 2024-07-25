package numberPrograms;

public class GretestOfThree {

	public static void main(String[] args) {
		int a = 32, b = 45, c= 30;
		System.out.println("Gretest Number Among a = "+ a +", b = "+ b +", c = "+c+" is : "+gretest(a,b,c));
	}
	
	public static int gretest(int a, int b,int c) {
		if(a>b && a>c) {
			return a;
		}
		else if(b>a && b>c) {
			return b;
		}
		else {
			return c;
		}
	}
}
