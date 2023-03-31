//Write a function that takes a positive integer n and returns the sum of all integers from 1 to n.
import java.util.*;
import java.util.Scanner;
public class Main 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int i=1,sum=0;
        while(i<=num)
        {
            sum=sum+i;
            i++;
        }
        System.out.print("Sum of "+num+" is : "+sum);
    }
}