package test;

public class JavaSESyntax {

	public static void main(String[] args) {
		int arr[]={1,2,3,4,5};
		//traversing the array with for-each loop  
		for(int i:arr){  
		  System.out.println(i);  
		   }  
		// TODO Auto-generated method stub
		switch ( (int)(Math.random( )*8) ) {
        case 1:  System.out.println("Monday"); break;
        case 2:  System.out.println("Tuesday"); break;
        case 3:  System.out.println("Wednesday"); break;
        case 4:  System.out.println("Thursday"); break;
        case 5:  System.out.println("Friday"); break;
        case 6:  System.out.println("Saturday"); break;
        case 7:  System.out.println("Sunday"); break;
        default: System.out.println("Invalid Day!"); break;
		}
		
		//1. Variables
		System.out.println("Variables ##############################");
		var str ="string";
		var num = 4;
		System.out.println(str + " " + num);
		
		//2. Primitive Data Types
		System.out.println("Primitive Data Types ##############################");
		byte b = 127;
		short s = 32767;
		int i = 2147483647;
		long lon = 9223372036854775807l;
		float fl = 0.1234567f;
		double d = 0.123456789012345;
		boolean bool = true;
		char c = 'c';
		
		//3. Type Casting
		/*
		 * Widening Casting (automatically) - converting a smaller type to a larger type size
		 * byte -> short -> char -> int -> long -> float -> double
		 * Narrowing Casting (manually) - converting a larger type to a smaller size type
		 * double -> float -> long -> int -> char -> short -> byte
		*/
		System.out.println("Type Casting ##############################");
		int x = (int)3.14;
		System.out.println(x);
		
		//4. Strings
		System.out.println("Strings ##############################");
		String str1 = "Welcome to SE class!"; //array of char => 'W' 'e' 'l' ....
		System.out.println(str1);
		System.out.println(str1.charAt(1));
		System.out.println(String.valueOf(3.14)+5);
		
		//5. Math
		System.out.println("Math ##############################");
		System.out.println(Math.PI);
		System.out.println(Math.max(5, 6));
		System.out.println(Math.sqrt(80));
		int rand = (int)(Math.random()*100);
		System.out.println(rand);
		
		//6. Conditions
		//6.1. if .. else
		System.out.println("if .. else ##############################");
		int value = 6;
		if( value>5)
			System.out.println(value);
		else
			System.out.println(5);
		
		//6.2. switch
		System.out.println("switch ##############################");
		switch (value) {
		case 6:
			System.out.println(6);
			break;
		case 5: 
			System.out.println(5);
			break;
		default:
			System.out.println("Not valid number");
		}
	}
}