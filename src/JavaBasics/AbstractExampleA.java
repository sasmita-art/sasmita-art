package JavaBasics;

 abstract class AbstractExampleA {
	abstract void test1();
	abstract void test2();
}
	

 
  abstract class AbstractExampleB extends AbstractExampleA{
	  void test1()
	  {
System.out.println("test 1 class");
		} 
		
	}
	
		
  class AbstractExampleC extends AbstractExampleB{
	  void test2() {
		  System.out.println("test 2 method");
	  }
	  
  }
	