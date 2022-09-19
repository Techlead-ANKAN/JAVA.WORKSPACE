/* JAVA [chapter - 1] */

//  VARIABLES - These are the containers where we can store values taht can be changed anytime. 
// Example -> int a = 10; 

//  Rules:- 
//  1) Cannot start with a digit
//  2) Cannot contain space in the variable name
//  3) These are case-sensitive
//  4) Cannout use any keyword as variables
//  5) Can contain alphabets, special characters($ and _) and digits if other conditions are met


class VARIABLES
{
    public static void main(String [] args)
    {
        /*VALID*/
        int year = 2022;
        int age123 = 19;
        char Alpha = 'A';
        char vari_able = 'a';
        char dol$lar = 55;

        System.out.println(year);
        System.out.println(age123);
        System.out.println(Alpha);
        System.out.println(vari_able);
        System.out.println(dol$lar);

        
        /*NOT VALID*/
        //  int 123age = 19;
        //  char my name = 'A';
        //  int void = 0;
        //  int s%#ig@*ns = 1;
    }
}
