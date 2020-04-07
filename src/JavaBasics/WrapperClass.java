package JavaBasics;

public class WrapperClass {

	public static void main(String[] args) {
//1.String to int
		
		String x="100";
		System.out.println(x+20);//10020
		// if I want to print 120 then I need to use wrapper class
		
	int x1=Integer.parseInt(x);//100
	System.out.println(x1+20);
	
	
	//2: String to Double
	String y="12.33";
	System.out.println(y+10);
	double d=Double.parseDouble(y);//12.33
	System.out.println(d+10);
	
	//3: int to String
	int i=10;
	String s=String.valueOf(i);
	System.out.println(s+20);
	
	
	//String h="100A";
	//int g=Integer.parseInt(h);
	//System.out.println(g);// Number format exception
	
	// I need to solve this question
	String s1="your total amount is: 500";// if I told like I need to add some amount in 500 then how will it performed
	
	String arr[]=s1.split(":");
	for(i=0; i<arr.length;i++) {
		System.out.println(i+"..........>"+arr[i]);
System.out.println(arr[1]);
 

		
		
		
	}
	
	
	
	
	
			

	}

}
