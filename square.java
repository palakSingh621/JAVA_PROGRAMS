import java.util.Scanner;
class Square
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter two values");
double l=sc.nextDouble();
double b=sc.nextDouble();
if(l>b)
System.out.println(l+"is greatest number");
else 
System.out.println(b+"is the greatest number");
}
}