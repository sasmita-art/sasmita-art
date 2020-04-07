package JavaBasics;

public class ConditionalOperator {

	public static void main(String[] args) {
		int a=200;
		int b=100;
		if(a==b){
			System.out.println("a and b are equal");
			
			
		}
		else {
			System.out.println("a and b are not equal");
		}
		
		if(b>a) {
			System.out.println("b is greater than a");
		}
		else {
			System.out.println( "b is not graeter than a");
		}
		
		// program to find out which one is graetest number
		int x=300;
		int y=700;
		int z=400;
		
		if(x>y&& x>z) {
			System.out.println(" x is greatest number");
		}
		else if(y>z) {
			System.out.println("y is greatset number");
			 
			 
	 }
		else{
			System.out.println("z is the gratest number");
		}
		

	}

}
