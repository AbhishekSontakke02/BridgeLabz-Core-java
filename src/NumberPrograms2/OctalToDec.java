package NumberPrograms2;

public class OctalToDec {
	public static void main(String[] args) {
		String s = "11";
		int result = octToDec(s);
		System.out.println(result);
	}
	
	public static int octToDec(String oct) {
		int dec = 0;
		int length = oct.length();
		for(int i = 0 ; i<length;i++) {
			char octdigit = oct.charAt(length-1-i);
			int digit = Character.getNumericValue(octdigit);
				dec += digit * Math.pow(8,i);
			}
		return dec;
		}
}
