package one;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class MySecondClassToTest implements Serializable,Cloneable{
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, CloneNotSupportedException, IOException  {
		
		
		//4 ways for creating object
		
		
		//#1
			MySecondClassToTest Object1OfMySecondClassToTest = new MySecondClassToTest();
			
			Object1OfMySecondClassToTest.methodinMySecondClassToTest();
			
		//#2	
		
			MySecondClassToTest Object2ofMySecondClassToTest= (MySecondClassToTest) Class.forName("one.MySecondClassToTest").newInstance();
			
			Object2ofMySecondClassToTest.methodinMySecondClassToTest();
		
		//#3
			MySecondClassToTest Object3ofMySecondClassToTest = (MySecondClassToTest) Object1OfMySecondClassToTest.clone();
			
			
			Object3ofMySecondClassToTest.methodinMySecondClassToTest();
			
		//#4 object of MyClasstoTest	
			/*MyClassToTest variableOfMyClassToTestInMySecondClass = null;
			
			 
			String filename="MyClassToTest";
			
			
			FileInputStream FileObject4ofMySecondClassToTest = new FileInputStream(filename);
			
			
			ObjectInputStream Object4ofInputStream = new ObjectInputStream(FileObject4ofMySecondClassToTest);
			
			
			variableOfMyClassToTestInMySecondClass  = (MyClassToTest) Object4ofInputStream.readObject();
			
			
			variableOfMyClassToTestInMySecondClass.method9();
			*/
			
			
			
			
			
			
			
			
			
			
			
			
		
	}
	
	
	
	public interface NestedMyInterfaceInMySecondClass
	{
		void methodInsideNestedMyInterfaceInMySecondClassToTest();
	}
	
	
	void  methodinMySecondClassToTest()
	{
		System.out.println("code written in methodinMySecondClassToTest ");
	}
	
	
	
	
	
	

}

