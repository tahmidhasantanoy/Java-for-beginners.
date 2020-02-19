import java.util.Scanner;

public class Vowel_Consonant {
	
	public static void main(String[] args) {
		
		char ch;
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("enter any letter:");
		ch = input.next().charAt(0);//tahmid--t;
		
		
		if(ch == 'a') {
			System.out.println("Vowel");
		}
		else if(ch == 'e') {
			System.out.println("Vowel");
		}
		else if(ch == 'i') {
			System.out.println("Vowel");
		}
		else if(ch == 'o') {
			System.out.println("Vowel");
		}
		else if(ch == 'u') {
			System.out.println("Vowel");
		}
		else{
			System.out.println("Consonant");
		}
		
	}

}
