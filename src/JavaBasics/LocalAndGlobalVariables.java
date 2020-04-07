package JavaBasics;

public class LocalAndGlobalVariables {
	String name="Tom";
	  int  age=25;
	
public static void main(String[] args) {
	LocalAndGlobalVariables obj= new LocalAndGlobalVariables();
	int k=100;
	System.out.println(k);
	//System.out.println(obj.name);
	System.out.println(obj.age);
	obj.sum();// it will call the sum method
	
}

public void sum() {
	int i=10;
	System.out.println(i);
	System.out.println("global var used in this method =" +age);// it will written without ref variable
	
	
}
public void sendmail() {
	 int j=20;
}

}


