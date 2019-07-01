package one;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class MySecondClassToTest implements Serializable{
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, CloneNotSupportedException, IOException  {
		
		
		//4 ways for creating object
		
		
		//#1
			MySecondClassToTest Object1OfMySecondClassToTest = new MySecondClassToTest();
			
			
		//#2	
		
			MySecondClassToTest Object2ofMySecondClassToTest= (MySecondClassToTest) Class.forName("one.MySecondClassToTest").newInstance();
		
		//#3
		//	MySecondClassToTest Object3ofMySecondClassToTest = (MySecondClassToTest) Object1OfMySecondClassToTest.clone();
			
			
		//#4 object of MyClasstoTest	
			MyClassToTest objectOfMyClassToTestInMySecondClass = null;
			
			 
			String filenamevariable="MyClassToTest.ser";
			
			
			FileInputStream FileObject4ofMySecondClassToTest = new FileInputStream(filenamevariable);
			
			
			ObjectInputStream Object4ofInputStream = new ObjectInputStream(FileObject4ofMySecondClassToTest);
			
			
			objectOfMyClassToTestInMySecondClass  = (MyClassToTest) Object4ofInputStream.readObject();
			
			
			objectOfMyClassToTestInMySecondClass.method9();
			
			
			
			
			
			
			
			
			
			
			
			
			
		
	}
	
	
	
	public interface NestedMyInterfaceInMySecondClass
	{
		void methodInsideNestedMyInterfaceInMySecondClassToTest();
	}
	
	
	void  methodinMySecondClassToTest()
	{
		
	}
	
	
	
	
	
	

}

