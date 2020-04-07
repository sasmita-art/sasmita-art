package JavaBasics;

public class LoopConcept {

	public static void main(String[] args) {
		//print 1to 10 using while loop
//		 int i= 1;//intialization
//		 while(i<=10) {// conditional
//			 System.out.println(i);
//			 i++;//increamental
//		 }
//		System.out.println("****************"); 
//		 // 2.for loop
//		 for( int j=1;j<=10;j++) {
//			 System.out.println(j);
//		 }
// print value 10 to 1
		for(int i=10;i>=1;i--) {
			System.out.println(i);
			if(i==1){
			break;	
			}
		}
		System.out.println("while loop is ened and for loop is started");
		//print value 10 to 1 using while loop
		
		int j=10;
		while(j>=1) {
			System.out.println(j);
			j--;
			if(j==0) {
				break;
			}
		}
		
		
		 
			 
		 }
	}


