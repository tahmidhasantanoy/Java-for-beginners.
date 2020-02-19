import java.util.Scanner;

public class Odd_Even {
	
	public static void main(String[] args) {
		
		int x;
		
		Scanner input = new Scanner(System.in);
		
		System .out.println("Enter any Number:");
		x = input.nextInt();
		
		if(x%2==0) {
			System.out.println("Odd Number.");
		}
		else {
			System .out.println("Even Number.");
		}
	}

}
