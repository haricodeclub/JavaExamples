package one;

public class TestStatcic {
	static 
	{
		System.out.println("first static block");
	}
	
	static int a = method1();
	static int variable= 99;
	
	static int method1() {
		// TODO Auto-generated method stub
		 System.out.println("from method1");
		//static int localvariable =12; we can not create static local variables in java
		return 20;
	}
	
	static void method2() {
		System.out.println("code in method2");
		variable= 66;
		System.out.println(variable);
	}
	
	
	{
		System.out.println("we can not run code");
	}
	
	static
	{
		variable=22;
		System.out.println("we can run code in static block");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Value of a :"+a);
		System.out.println("from main");
		System.out.println(variable);
		//System.out.println(this.variable); can not use this on static
		method2();
		 TestStatcic object = new TestStatcic();
		 object.method3();
		
	}

	 
	 
	 void method3()
	 
	 {
		 System.out.println("code in method3");
		 System.out.println(this.variable);
		 variable= 44;
		  System.out.println(this.variable);
		  System.out.println(variable);
			
	 }
	 
	 
	 
}
