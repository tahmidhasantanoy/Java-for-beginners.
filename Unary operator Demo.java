import java.util.Scanner;

public class UnaryDemo {
	
	public static void main(String[] args) {
		
		int x,y1,y2,y3,z1,z2,z3;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter x number:");
		x = input.nextInt();
		
		
		y1 = x++;//post increament
		System.out.println("y1 = "+y1);
		
		
		y2 = x;//Effect of above equation(y = x++)
		System.out.println("y2 = "+y2);
		
		y3 = ++x;//pre increament
		System.out.println("y3 = "+y3);
		
		z1 = x--;//post increament
		System.out.println("z1 = "+z1);
		
		z2 = x;//Effect of above equation(y = x--)
		System.out.println("z2 = "+z2);
		
		
		z3 = --x;//pre increament
		System.out.println("z3 = "+z3);
	}

}
