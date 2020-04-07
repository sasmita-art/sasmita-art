package JavaBasics;

import java.util.ArrayList;

public class DynamicArray {

	public static void main(String[] args) {
		
		//ArrayList
		
		ArrayList ar=new ArrayList();// here it is giving waring as Array is raw types means we didnt give the type, for that we can use generic
		
		ar.add("sasmita");// we can add n no of value and all type of data in Array list
		ar.add('c');
		ar.add(100);
		ar.add(12.33);
		ar.add(true);
		System.out.println("size of array is" +ar.size());// size of array in curect situation
		
		ar.add(200);
		ar.add(300);
		System.out.println("now size of array after added 2 values:" +ar.size());
		
		System.out.println(ar.get(3));// give the  3rd index value count start from 0 index
		
		//System.out.println(ar.get(7));//IndexOutOfBoundsException
		
		ar.remove(3);
		System.out.println("after remove index 3 value,new value:"+ ar.get(3));
		
		System.out.println(ar.add("sasmita"));// it will add in last
		
		
		
		// To replace value i arraylist there is no  direct method avilable but we can do like this
		
		ar.add(0, "Rinu");
		System.out.println("after Replace by add method" + ar.get(0));// it will give the new value
		
		System.out.println("*****************now iterationg the values***************");
		
		// iterate the value of Arraylist
		for( int i=0; i<ar.size();i++) {
			System.out.println(ar.get(i));
			
		}
		
		//Generic: is a term where we have to define what type of data we want to staore
		 ArrayList <Integer>ar1= new ArrayList <Integer>();
		 ar1.add(100);
		// ar1.add("string")// not allowed as we can only store integer
		 
		 ArrayList<String> ar2= new ArrayList<String>();// we can store String also
		 
		ar2.add("GUDU");
		 
	
	

	}

}
