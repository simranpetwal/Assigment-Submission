//Write a function that returns the sum of two integers. 
import java.util.*;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
     int a,b,sum;
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter first number : ");
     a=sc.nextInt();
     System.out.print("Enter second number : ");
     b=sc.nextInt();
     sum=sum(a,b);
     System.out.println("The sum of "+a+" and "+b+ " is " +sum);
    }
    public static int sum(int x,int y)
    {
        int sum = x+y;
        return sum;
    }
}