import java.util.Scanner;

public class Conditional_operator {
	
	public static void main(String[] args) {
		
		int num1,num2,large;
		Scanner input = new Scanner(System.in);
		System.out.println("Ente num1:");
		num1 = input.nextInt();
		
		System.out.println("Ente num2:");
		num2 = input.nextInt();
		
		large = (num1>num2) ? num1 : num2;/*Conditional operator
		                                      When the condition is true
		                                      the num1 is printed.
		                                      Otherwise,the condition is false
		                                      Then num2 is printed.*/
		
		System.out.println("Large Number ="+large);
	}

}
