import java.util.Scanner;
class Work
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the age");
int age=sc.nextInt();
System.out.println("Enter the sex....'M' for male and 'F' for female");
char sex=sc.next().charAt(0);
System.out.println("Enter the marital status....'Y' for yes and 'N' for no");
char stat=sc.next().charAt(0);
if(sex=='F')
System.out.println("urban areas");
else 
{
if(age>=20 && age<40)
System.out.println("Can work anywhere");
else
{
if(age>=40 && age<60)
System.out.println("urban areas");
else 
System.out.println("ERROR");
}
}
}
}






