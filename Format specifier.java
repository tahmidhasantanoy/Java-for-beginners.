
public class printf {
public static void main(String[] args) {
		
		boolean b = true;//Dynamic intialization.
		char c = 'a';
		short s = 32677;
		int i;
		float f = 10.2f;//this data type is little bit ddifference.
		double d = 2.00;
		
		b = true;
		c = 'a';
		System.out.printf("boolean b = %b\n",b);/* if we use format spacifier 
		                                       ,,the print method must have to printf*/
		System.out.printf("char c = %c\n",c);
		System.out.printf("short s = %d\n",s);
		System.out.printf("float f = %f\n",f);
		System.out.printf("double d = %f",d);
	}
}
