package numberPrograms;
import java.util.ArrayList;
public class PrimeNumBtwen {
	public static void main(String[] args) {
		int a = 1, b = 15;
		primeNumBtwen(a, b);
	}
	public static void primeNumBtwen(int a,int b) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int i =a;i<=b; i++) {
			if(isprime(i)) {
				result.add(i);
			}
		}
		System.out.println("The Prime Number Between "+a+" and "+b+" is :"+result);
	}
	public static boolean isprime(int num) {
		if(num <= 1){
			return false;
		}
		for(int i = 2; i <= num/2; i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
}
