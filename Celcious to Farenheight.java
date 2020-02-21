import java.util.Scanner;

public class Cel_to_Far {
	
	public static void main(String args[]) {
		
		double cels,Faren;
		
		Scanner input = new Scanner(System.in);
        
		System.out.println("Enter the temperature in celsious:");
		cels = input.nextDouble();
		
		Faren = (9.0/5)*cels+32;
		System.out.println("Farenheit = "+Faren);
		
	}

}
