package one;


interface Test //class (interface inside class) or interface (interface inside interface)
{
	 interface Yes //protected or default or private(but private is not possible for now) //need to public if interface inside interface
	{
		void show();
	}
}


class Testingtwo implements  Test.Yes
{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("code in method of interface in Testing class");
	}
	
}

class NestedInterfaceTest {
	
	public static void main(String[] args) {
		
		Test.Yes variableoftestdotyes;
		Testingtwo testingtwoclassobject=new Testingtwo();
		variableoftestdotyes=testingtwoclassobject;
		variableoftestdotyes.show();
		testingtwoclassobject.show();
		System.out.println(variableoftestdotyes+","+testingtwoclassobject);
		
	}

}
