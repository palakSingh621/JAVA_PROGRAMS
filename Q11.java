import java.util.Scanner;
class Case
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the character");
char c=sc.next().charAt(0);
if('c'>=65 || 'c'<=90)
System.out.println("UpperCase");
else 
{
if('c'>=97 || 'c'<=122)
System.out.println("Lowercase");
else
System.out.println("Invalid input");
}
}
}






