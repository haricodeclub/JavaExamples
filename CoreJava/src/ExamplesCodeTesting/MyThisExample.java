package ExamplesCodeTesting;

public class MyThisExample {
	
	int a=22;
	int b=60;
	
	 MyThisExample() {
		// TODO Auto-generated constructor stub
		 // this(45,54); //intilization done in parametarised construtor
		   a= 79; b= 78;
		 System.out.println("this is defalut constructor");
		 ExampleTestClass objectrefOfExampleTestClass = new ExampleTestClass(this);
		 
	}
	 
	 MyThisExample method()
	 
	 {
		 System.out.println("this is from method in MyThisExample");
	
		return this;
		
		
	 }
	
	MyThisExample(int localref , int  localref2)
	{
		this.a=localref;
		this.b=localref2;
		System.out.println("this is from constructor with 2 parameters");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		MyThisExample objectref  = new MyThisExample(66,99 );
		objectref.method1();
		System.out.println("==============");
		System.out.println("this is object 2");
		MyThisExample objectreftwo  = new MyThisExample( );
		objectreftwo.method1();
		System.out.println("==============");
		System.out.println("this is object 3");
		MyThisExample objectrefThree = new MyThisExample();
		objectrefThree.method().method1();
		System.out.println("==============");
		System.out.println("this is object 4");
		MyThisExample objectrefFour = new MyThisExample();
		objectrefFour.method3();
		
		MyThisExample objectrefFive = new MyThisExample();
		
		
		
		
		int  a =1;
		int b=2;
		

	}

	void method1()
	{
		int a=21;
		int b=16;
		this.method3();
		System.out.println(this.a+ "                        " + a);
		System.out.println(this.b +  "                       " +b);
		System.out.println("global values -----local method values");
		
		
	}
	
	void method2(MyThisExample objectref)
	{
		System.out.println("this is method2 from MyThisExample ");
		System.out.println(a +"    =====    "+ b);
		
	}
	void method3()
	{
		method2(this);
	}
	void method4()
	{
		System.out.println("this code is in method 4"+" -------------------- "+a);
	}
	
}


class ExampleTestClass
{
	MyThisExample refrencevaribleInExampleClass;
	
	public ExampleTestClass(MyThisExample variable) {
		// TODO Auto-generated constructor stub
		
		this.refrencevaribleInExampleClass=variable;
		
		refrencevaribleInExampleClass.method4();
	}
}
