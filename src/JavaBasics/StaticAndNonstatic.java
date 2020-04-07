package JavaBasics;

public class StaticAndNonstatic {
	static int i=10;
	int j=20;

	public static void main(String[] args) {
		System.out.println("main start");
		System.out.println("i="+i);
		StaticAndNonstatic obj= new StaticAndNonstatic();
		System.out.println( "j="+obj.j);
		System.out.println("main ends");
		
	}

}
