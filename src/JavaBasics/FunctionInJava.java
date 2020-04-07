package JavaBasics;

public class FunctionInJava {

	public static void main(String[] args) {
		FunctionInJava obj= new FunctionInJava();// here we are creating object of class to call the method, and obj is object name and real object is new FunctionInjava
		 obj.test();// 1 method
		 int c1=obj.sum();// 2 method
		 System.out.println(c1);
		String s1= obj.name();
		System.out.println(s1);
		 int d=obj.div(30, 10);
		 System.out.println(d);
		 int a2= obj.div1("sasmita");// 3rd method with some diffrent combination 
		 System.out.println(a2);
		 
		
		

	}
	
	// 1.no i\p no o\p  method
	 public void test() {
		 System.out.println( "test method");
	 }
	 
	 
	 // 2. no i\p but some o\p method
	 
	 public int sum() {
		 System.out.println("sum method");
		 
		 int a=10;
		 int b=20;
		 int c= a+b;
		 return c;
		 
	 }
	 
	 public String name() {
		 System.out.println("  name method ");
		 String s="sasmita";
		 return s;
		 
	 }
	 
	 //3. some i\p and gettig some o\p method
	 
	 public int  div(int a, int b) {
		 System.out.println("div method");
		 
		 int c=a/b;
		 return c;
	 }
	  // some i\p and getting some o\p with different type of parameter. here we are passing string type but nit using as inside we are giving int type
	 public int div1(String s) {
		 System.out.println(" div1 method  with different combination ");
		  int c1=10;
		  return c1;
		  
		 
		 
	 }
	 

}
