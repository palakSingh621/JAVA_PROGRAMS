import java.util.Scanner;
class Bonus
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the years of service ");
double y=sc.nextDouble();
System.out.println("Enter the salary");
double s=sc.nextDouble();
double salary;
if(y<=5)
salary=s;
else 
salary=s+s*0.05;
System.out.print("salary "+salary);
}
}