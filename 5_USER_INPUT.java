/* USER INPUT */

// 1) Taking user input

import java.util.Scanner;

class USER_INPUT
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);   // Scanner class takes input from the user and System.in mean raed fromt he keyboard.

        System.out.print("Enter a no: ");
        int a = sc.nextInt();    // Takes Integer input.
        // System.out.println(a);

        System.out.print("Enter another no: ");
        int b = sc.nextInt();
        // System.out.println(b);

        int c = a + b;
        System.out.println("Sum = "+ c);

        // next() --> reads the first word.
        System.out.print("Enter word: ");
        String s1 = sc.next();
        System.out.println(s1);

        // nextLine() --> reads the whole string.
        // System.out.print("Enter a string: ");
        // String s2 = sc.nextLine();
        // System.out.print(s2);


        // hasNext(data_type) --> Checks if the input is the same data type as that of the variable
        System.out.print("Enter float value: ");
        boolean f = sc.hasNextFloat();
        System.out.println("It is "+f+" that it is a Float value.");

        sc.close();  // --> Closes the scanner class.
    }
}