import java.util.Scanner;
class cause
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
System.out.println("Do you have a medical cause...if yes thn write Y or write N");
char c=sc.next().charAt(0);
if(per<75 && c=='N')
System.out.println("You are not allowed to sit in the exam");
else 
System.out.println("You are allowed to sit in the exam");
}
}






