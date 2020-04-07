package JavaBasics;

public class StaticAndNonStaticConcept {
 static int i=10;
 int j=20;
	public static void main(String[] args) {
		StaticAndNonStaticConcept obj= new StaticAndNonStaticConcept();
		System.out.println( "main() start");
		System.out.println("i=" +i);
		System.out.println("j=" +obj.j);
		System.out.println( "main() ends");
		

	}

}
