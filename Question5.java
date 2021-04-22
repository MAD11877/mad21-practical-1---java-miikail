import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);

    int num = in.nextInt();
    int numbers[] = new int[num];

    // Loop for number of input
    for (int n = 0; n < num; n++)
    {
      numbers[n] = in.nextInt();
    }

    int highest = 0;
    int mode = 0;

    // Loop through array; first number
    for (int x = 0; x < numbers.length; x++)
    {
      int count = 0;
      
      // second number
      for (int y = 0; y < numbers.length; y++)
      {
        // if same number, count + 1
        if (numbers[x] == numbers[y])
        {
          count += 1;
        }
      }

      // if count is greater than the highest count, update highest and mode
      if (count > highest)
      {
        highest = count;
        mode = numbers[x];
      }
    }

    System.out.println(mode);
  }
}
