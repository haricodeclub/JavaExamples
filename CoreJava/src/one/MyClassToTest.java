package one;

public class MyClassToTest implements Myinterface{

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Myinterface.method4();//no object is needed
		MyClassToTest myClassToTestobject = new MyClassToTest();
		myClassToTestobject.method7();
		myClassToTestobject.method5();
		System.out.println(Myinterface.a);
		System.out.println(Myinterface.c);
		
		//we can not call static methods by using objects of MyclassToTest
		//we need to call static methods without obj as in line 8 ,
		//so it doesnot allow to change static method code. 
		//if you want to change you need to redefine it in class again
		
	
		
	}

	private void method5() {
		// TODO Auto-generated method stub
		System.out.println("this is code written in MyClasstoTest inside method5 (private void)");
	}

	@Override
	public int method1() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method6() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String method8() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int method9() {
		// TODO Auto-generated method stub
		System.out.println("code is written in method 9 in MyClassToTest");
		return 0;
	}

}
