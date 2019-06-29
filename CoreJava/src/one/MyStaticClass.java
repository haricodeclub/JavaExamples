package one;

public class MyStaticClass { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyOuterClass.MyNestedStaticClass printNestedStatic = new MyOuterClass.MyNestedStaticClass();
		
		
		printNestedStatic.methodMyNestedStaticClass();
		
		
		MyOuterClass outerclassobject = new MyOuterClass();
		
		MyOuterClass.MyNonStaticNestedClass innerclassobjectnonstatic = outerclassobject.new MyNonStaticNestedClass();
		
		innerclassobjectnonstatic.methodMyNONstaticNestedClass();
		
		
		//another way of obj creation for inner class non static
		
		MyOuterClass.MyNonStaticNestedClass innerobjectofNonStatic = new MyOuterClass().new MyNonStaticNestedClass();
		
		System.out.println("second time object creation");
		innerobjectofNonStatic.methodMyNONstaticNestedClass();
	}

	
	
}

class MyOuterClass//outer class can never be static & only inner class can be static
{
			private static String sms="Static string private sms";
			public String sms2="this only print in methodMyNONstaticNestedClass";

			
			
			
			
	//=================================================		
	static class MyNestedStaticClass
	{
		//do not needs outerclass reference
		//can only access static  members of outer class
		//can not access non static members of outer class
		public void methodMyNestedStaticClass() {
			
			System.out.println("message from methodMyNestedStaticClass"+sms);
			//System.out.println("message from methodMyNestedStaticClass"+sms2);  not possible
			
			
		}
		
	}
	
	//====================================================
	class MyNonStaticNestedClass{
		//aslo called innerclass
		//needs outerclass reference
		//can access both static and non static members of outer class
		public void methodMyNONstaticNestedClass()
		{
			System.out.println("message from methodMyNONstaticNestedClass"+sms);
			System.out.println("message from methodMyNONstaticNestedClass"+sms2);
		}
		
	}
}