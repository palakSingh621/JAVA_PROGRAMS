import java.util.Scanner;
class Calculator
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
float a,b;
System.out.println("Enter first number");
a=sc.nextFloat();
System.out.println("Enter second number");
b=sc.nextFloat();
float sum=a+b;
System.out.println("sum of numbers"+sum);
float diff=a-b;
System.out.println("Difference of numbers"+diff);
float p=a*b;
System.out.println("Product of numbers"+p);
float d=a/b;
System.out.println("difference of numbers"+d);
}
}





