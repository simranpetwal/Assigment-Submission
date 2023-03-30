/*Write a Java program that prompts the user to enter a number and determines whether the number is
positive or negative. If the number is positive, the program should print 
"The number is positive." If the number is negative, the program should print 
"The number is negative."*/
import java.util.*;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = scr.nextInt();
        if(n>0)
        {
            System.out.println("The number is positive");
        }
        else
        {
            System.out.println("The number is negative");
        }
    }
}