import java.util.Scanner;

public class Basicmath {
	public static void main(String[]args) {

		int num1 ;
		int num2,result;
		
		System.out.println("Enter num1:\n");
		
		Scanner input = new Scanner(System.in);
		num1=input.nextInt();
		
		System.out.println("Enter num2:\n");
		num2=input.nextInt();
		result = num1 + num2;
		System.out.println("Summation = "+result);
		
		result = num1 - num2;
		System.out.println("Subtraction = "+result);
		
		result = num1 * num2;
		System.out.println("Mutiplication = "+result);
		
		result = num1 / num2;
		System.out.println("Divition = "+result);
		
		result = num1 % num2;
		System.out.println("Remainder = "+result);
		
	}

}
