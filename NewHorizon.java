//Class assignment: July 12th


public class NewHorizon{

/*Write short note on the following with examples: 
1. Constructor: A constructor in Java is a block of code similar to a method that's called when an instance of an object is created.
					   A constructor doesn't have a return type. The name of the constructor must be the same as the name of the class.
					   Constructor are not considered members of a class.
					   A constructor is called automatically when a new instance of an object is created
					   
					   Example: 

					   A constructor allows us to provide initial values for class fields when we create the object. 
					   Suppose that we have a class named NewHorizon to take record of students that has fields named StudentfirstName and StudentlastName. 
					   We can create a constructor for the NewHorizon class:
*/	   
					   public NewHorizon(String first, String last)
								{
									StudentfirstName = Elijah;
									StudentlastName = Kalejaiye;
								}
					   
					   
				   //Then we can now create an instance of the NewHorizon class by calling this constructor:

					   NewHorizon a = new NewHorizon("Fawas", " Ogunmoloye");
					   
					   
					  //Like methods, constructors can be overloaded. In other words, you can provide more than one constructor for a class if each constructor has a unique signature. Here’s another constructor for the Actor class:

						public NewHorizon(String first, String last, boolean good)
							{
								StudentfirstName = Elijah;
								StudentlastName = Kalejaiye;
								StudentTuitionStatus = good;
							}
							
					/*This constructor lets you create an NewHorizon object with information besides the NewHorizon’s name:

					NewHorizon a = new NewHorizon("Arnold", "Schwarzenegger", false);
					//If you do not provide a constructor for a class, Java will automatically create a default constructor that has no parameters and doesn’t initialize any fields. 
					This default constructor is called if you specify the new keyword without passing parameters. 
					
					For example:

					Ball b = new Ball(); 
					Here, a variable of type Ball is created by using the default constructor for the Ball class.

					If you explicitly declare any constructors for a class, Java does not create a default constructor for the class. 
					As a result, if you declare a constructor that accepts parameters and still want to have an empty constructor (with no parameters and no body), 
					you must explicitly declare an empty constructor for the class.
					*/

	}