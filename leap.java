import java.util.Scanner;
class Leap
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
String x=(a%400==0)||(a%100!=0)&&(a%400==0)?"Leap year":"NOT A Leap year";
System.out.println(x);
}
}