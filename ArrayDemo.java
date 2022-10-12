     import java.util.Scanner;
     public class ArrayDemo{
         public static void main(String[]args)
        {
            Scanner input = new Scanner(System.in);
            int y= input.nextInt();
            int []array= new int [y];
            for(int i=0;i<y;i++)
            {
                array[i] = input.nextInt();

            }
            Difference va = new Difference();
            int finalvalue=va.sumwintoutoutSmallest(array);
            System.out.println(finalvalue);


        }
    }

