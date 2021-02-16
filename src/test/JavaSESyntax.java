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
	}

}
