package NumberPrograms2;

public class BinToDec {
	public static void main(String[] args) {
		String s = "11";
		int result = binToDec(s);
		System.out.println(result);
	}
	
	public static int binToDec(String bin) {
		int dec = 0;
		int length = bin.length();
		for(int i = 0 ; i<length;i++) {
			char bindigit = bin.charAt(length-1-i);
			if(bindigit == '1') {
				dec += Math.pow(2,i);
			}
		}
		return dec;
	}
}
