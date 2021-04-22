import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
     
    Scanner in = new Scanner(System.in);

    System.out.println();
    int userInp = in.nextInt();
    
    // first loop for collumn
    for (int x = userInp; x > 0; x--)
    {      
      // second loop for row
      for (int y = x; y > 0; y--)
      {
        System.out.print("*");
      }
      System.out.println();
    }

  }
}
