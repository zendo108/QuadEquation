
import java.util.Scanner;

/**
 *
 * @author IvanAranda
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter A");
        int a = myObj.nextInt();  // Read user input
        System.out.println("Enter B");
        int b = myObj.nextInt();  // Read user input
        System.out.println("Enter C");
        int c = myObj.nextInt();  // Read user input
        try{//I use a try...catch statement to handle the possible 
            //Exception that rot throws IllegalArgumentException
            System.out.println(String.format( "%.2f", root(a,b,c)));
        }catch(IllegalArgumentException ia){
            System.out.println(ia.toString());
        }
        
    }
    /**
    * Returns the larger of the two roots of the quadratic equation
    * A*x*x + B*x + C = 0, provided it has any roots.  If A == 0 or
    * if the discriminant, B*B - 4*A*C, is negative, then an exception
    * of type IllegalArgumentException is thrown.
    */
   static public double root( double A, double B, double C ) 
                                 throws IllegalArgumentException {
       if (A == 0) {
         throw new IllegalArgumentException("A can't be zero.");
       }
       else {
          double disc = B*B - 4*A*C;
          if (disc < 0)
             throw new IllegalArgumentException("Discriminant < zero.");
          return  (-B + Math.sqrt(disc)) / (2*A);
       }
   }
}
