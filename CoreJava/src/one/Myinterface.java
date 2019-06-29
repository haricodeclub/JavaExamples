package one;

public interface Myinterface extends MyInterfaceTwo,MyInterfaceThree{
	
	public  int method1();//all methods are public
	public void method2();
	       void  method3();
	
	public static void method4() {
		System.out.println("something is need to be coded here method 4");
	}
	
	public static strictfp void method5() {
		System.out.println("something is need to be coded here");
	}
	public abstract void method6();
	//default is like = public static
	default  int method7() {
		System.out.println("something is need to be coded here method 7");
		return 0;
	}
	
	abstract String method8();
	
	public abstract int method9();
	
	public static String method10() {
		System.out.println("something is need to be coded here");
		return null;
	}
	 
	int a=10;//defalut way
	static int b=11;
	public static final int c =12;//by default public stati final
	
	
	//from java 9
	//private void method11();
	//private static void method12() {
	//}
	
	
	
}
