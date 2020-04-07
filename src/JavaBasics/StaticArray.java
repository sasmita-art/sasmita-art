package JavaBasics;

public class StaticArray {

	public static void main(String[] args) {
		
		//limitation::size s fixed: static array: to overcome this we are using dynamic array/ Arraylist
	//2: we can use only same data types: to over come this we are using object array.
		
		//Int Array
		 int i[]= new int[3];
		 
		// int []i= new int[3]; we can write this also
		   i[0]=10;
		   i[1]=20;
		   i[2]=30;
		   System.out.println(i[1]);
		   System.out.println(i[0]+i[1]);
		  // System.out.println(i[3]); ArrayIndexOutofBoundExxeption
		   System.out.println( "Size of array is:"+i.length);// length of array
		   
		   //double
		   double d[]=new double[2];
		   d[0]=2.33;
		   d[1]=22.33;
	   
		   
		   //char array
		   char ch[]= new char[2];
		   
		   ch[0]='c';
		   ch[1]='h';
		   
		   
		   //boolean array
		   boolean b[]= new boolean[2];
		   
		   
		   //String array
		   
		   String s[]= new String[2];
		   s[0]="sasmita";
		   s[1]="sahoo";
		   
		   // object array
		   Object ob[]= new Object[5];
		   ob[0]="sasmita";
		   ob[1]=25;
		   ob[3]=12.4;
		   ob[4]='F';
		   
		   for(int k=0; k<ob.length; k++) {
			   System.out.println(k+"...........>"+ob[k]);
					   
		   }
				   
			   
		   }
		   
		   
		   
		   
		   
		   
		   
				   
				   
		   
				  
		 
		 

	}


