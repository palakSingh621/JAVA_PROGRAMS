import java.util.Scanner;
class Attendence
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Number of classes held");
double h=sc.nextDouble();
System.out.println("Number of classes attended");
double a=sc.nextDouble();
double per;
per=(a*100)/h;
System.out.println("Your attendence persentage "+per);
if(per<75)
System.out.println("You are not allowed to sit in the exam");
else 
System.out.println("You are allowed to sit in the exam");
}
}






