package JavaBasics;

import org.omg.Messaging.SyncScopeHelper;

public class StringManupulation {

	public static void main(String[] args) {
		String st="The rains have started here soon" ;// 0 to 31
		System.out.println(st.length());  //27
		System.out.println(st.charAt(5)); //a
		//System.out.println(s.charAt(32));// java.lang.StringIndexOutOfBoundsException
		
		System.out.println(st.indexOf('a'));
		System.out.println(st.indexOf('s'));//8 this is for first s
		System.out.println(st.indexOf('s',st.indexOf('s')+1));//  15 its for second s
		System.out.println(st.indexOf('s',st.indexOf('s',st.indexOf('s')+1)+1));// 28 this is 3rd s
		
		System.out.println(st.indexOf("have"));;//10
		System.out.println(st.indexOf("hello"));// -1  return typw of index is integer and this string is not avilable
		
		//*********** Imp data: System.out.println(s.indexOf("45632889"))***************
		
		String s1="The rains Have started here soon";
		System.out.println(st.equals(s1));// false
		System.out.println(st.equalsIgnoreCase(s1));// true
		// suppose I have give extra spac in s1 string andn will run equalignore case then it will give false becase index  will be more
		
	String str="   Hello world  ";
	System.out.println(str.trim());// trim only replace first and last space not middle space
	System.out.println(str.replace(" ", ""));// middle space will be deleted
	String str1="12/03/2018";
	System.out.println(str1.replace("/", "-"));
	
	// sub string
	String s2=" The rain have stared here";
	
	System.out.println(s2.substring(4, 9));// rain will print
	
	//Split : return type is String Array
	
	String s4="Hello_ selenium_ testing";
	String a[]= s4.split("_");
	System.out.println(a[0]);
	System.out.println(a[1]);
	System.out.println(a[2]);
	
	
	String h= "XxTestxxTestxxXtetingxxX";
	String arr[]= h.split("x");// try with splite Xx and see the result
	 for ( int j=0; j<arr.length;j++ ) {
		 System.out.println(j+"------>"+arr[j]);
	 }
	 
	 
	 String h1= "My name is sasmita";
	 //I want to display  only mita
	 
		System.out.println(h1.substring(h1.indexOf("sas")+3, h1.length()));	
	
	
	

	}

}
