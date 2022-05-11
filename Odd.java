
import java.util.Scanner;

class Odd
{
public static void main(String args[])                      
{
    int n;
    System.out.println("enter a no");
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    sc.close();
    if(n%2==0)
    {
        System.out.println("even no");

}
else{
     System.out.println("odd no");

}
}}