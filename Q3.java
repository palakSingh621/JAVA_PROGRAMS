import java.util.Scanner;
class Shop
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
double bill;
System.out.println("Enter the quantity");
double l=sc.nextDouble();
if(l<=1000)
bill=l*100;
else 
bill=(l*100)-(l*100)*0.1;
System.out.print("Total cost= "+bill);
}
}