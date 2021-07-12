
/*
Overriding: If subclass (child class) has the same method as declared in the parent class, it is known as method overriding. 
				In other words, if a subclass provides the specific implementation of the method that has been declared by one of its parent class, 
				it is known as method overriding.
				Method overriding is used to provide the specific implementation of a method which is already provided by its superclass.
				Method overriding is used for runtime polymorphism
				The method must have the same name as in the parent class
				The method must have the same parameter as in the parent class.
				There must be an IS-A relationship (inheritance).
				
				Example:
				
				In this example, we have defined the run method in the subclass as defined in the parent class but it has
				some specific implementation. The name and parameter of the method are the same, and there is IS-A
				relationship between the classes, so there is method overriding.
*/
/Java Program to illustrate the use of Java Method Overriding
//Creating a parent class(Super class).
public class Vehicle{
	
//defining a method
public void run()
{
	System.out.println("Vehicle is running");
}

//end of class Vehicle
}
//Creating a child class(Subclass)
public class Bike2 extends Vehicle{
	
//defining the same method as in the parent class
public void run()
{
	System.out.println("Bike is running safely");
}

public static void main(String [] overridingAssignment)
{
	//creating object
	Bike2 obj = new Bike2();
	
	//calling method
	obj.run();
  }
  
}

//This programm would output: "Bike is running safely"