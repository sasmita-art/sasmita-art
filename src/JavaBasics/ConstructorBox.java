package JavaBasics;

public class ConstructorBox {

	int height;
	int width;
	int depth;
	String colour;
	
	
	ConstructorBox( int h, int w, int d){
		height=h;
		width=w;
		depth=d;
		System.out.println(h);
		
	}
	public ConstructorBox(int h, int w, int d, String c) {
		this(h, w, d);// call to this
		colour=c;
		
	}
	
	public static void main(String[] args) {
		
		ConstructorBox obj= new ConstructorBox(10,8,6);
		ConstructorBox obj1= new ConstructorBox(100,80,6,"red");
				

	}

}
