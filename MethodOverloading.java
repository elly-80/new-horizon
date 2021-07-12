//Class assignment: July 12th


/*Write short note on the following with examples: 

Overlloading: Overloading allows a class to have different methods of the same name, but different signatures.
					The signature can differ by the number of input parameters or type of input parameters or both. 
					Overloading is related to compile-time (or static) polymorphism.
					
					Example: 


  */
public class MethodOverloading {
  
      // Overloaded MethodOverloading() method. This sum class takes two int parameters
    public int MethodOverloading(int x, int y)
    {
        return (x + y);
    }
  
    // Overloaded MethodOverloading() method. This sum takes three int parameters
    public int MethodOverloading(int x, int y, int z)
    {
        return (x + y + z);
    }
  
    // Overloaded MethodOverloading() method. This sum takes two double parameters
    public double MethodOverloading(double x, double y)
    {
        return (x + y);
    }
  
    // Main class
    public static void main(String [] assignment)
    {
        MethodOverloading method = new MethodOverloading();
        System.out.println("Out put of the first method is: " + method.MethodOverloading(100, 200));
        System.out.println("Out put of the second method is: " + method.MethodOverloading(100, 200, 300));
        System.out.println("Out put of the third method is: " + method.MethodOverloading(100.5, 200.5));
    }
}