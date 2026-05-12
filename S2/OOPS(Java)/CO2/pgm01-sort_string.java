import java.util.Scanner;

public class SortString
{
    public static void main(String[] args)
    {
        String temp;
        int i, j, count;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of strings you would like to enter:");
        count = scan.nextInt();
        scan.nextLine();

        String[] str = new String[count];

        System.out.println();
        System.out.println("Enter the strings one by one:");
        for (i = 0; i < count; i++)
        {
            str[i] = scan.nextLine();
        }

        System.out.println();
        System.out.println("The strings before sorting:");
        for (i = 0; i < count; i++)
        {
            System.out.println(str[i]);
        }

        for (i = 0; i < count; i++)
        {
            for (j = i + 1; j < count; j++)
            {
                if ((str[i].compareTo(str[j])) > 0)
                {
                    temp   = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }

        System.out.println();
        System.out.println("The strings after sorting:");
        for (i = 0; i < count; i++)
        {
            System.out.println(str[i]);
        }

        scan.close();
    }
}