package JavaBasics;

public class Superextend extends SuperKeyword {
	public Superextend( int i) {
		super( 5, 10);
		
		System.out.println("child class  constructor i ="+ i);

	}

	public static void main(String[] args) {
		Superextend obj = new Superextend(20);

	}
}
