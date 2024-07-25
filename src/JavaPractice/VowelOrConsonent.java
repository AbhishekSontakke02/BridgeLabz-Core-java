package JavaPractice;

import java.util.Scanner;

public class VowelOrConsonent {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Character : ");
		String c  = sc.nextLine().toLowerCase(); 
		System.out.println(checkVowel(c));
		sc.close();
	}
	public static String checkVowel(String s) {
		switch (s) {
			case "a":
			case "e":
			case "i":
			case "o":
			case "u":
				return ("The Character " + s +" is a Vowel!");
			default :
				return ("The Character " + s +" is a Consonent");
				
		}
	}
}

