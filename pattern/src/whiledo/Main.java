package whiledo;

import java.util.Scanner;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("What is your number? ");
        int n=sc.nextInt();
        int number = 1;
        int space = n - 1;

        for ( int row = 1 ; row <= n ; row++ )
        {
            number = row;//creating rows

            for ( int col = 1 ; col <= space ; col++ )
                System.out.print(" ");
            space --;//creating space

            for ( int col = 1 ; col <= row ; col++ )
            {
                System.out.print(number);
                number++;//print first part of number
            }
            number--;
            number--;
            for ( int col = 1 ; col < row ; col++)
            {
                System.out.print(number);
                number--;//printing rest number
            }
            System.out.println();//this is for next line
        }
    }
}
