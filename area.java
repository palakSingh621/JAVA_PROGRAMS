import java.util.Scanner;
class Areas
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("\t\t\tChoose the pattern\t\t\t");
System.out.println("1 for Square");
System.out.println("2 for Rectangle");
System.out.println("3 for Circle");
System.out.println("4 for Triangle");
int ch=sc.nextInt();
switch(ch)
{
case 1:
System.out.println("Enter the side of the Square");
float side=sc.nextFloat();
float area1=side*side;
System.out.println("Area of the Square="+area1);
break;

case 2:
System.out.println("Enter the length of the Rectangle");
float l=sc.nextFloat();
System.out.println("Enter the width of the Rectangle");
float w=sc.nextFloat();
float area2=l*w;
System.out.println("Area of the Rectangle="+area2);
break;

case 3:
System.out.println("Enter the radius of the Circle");
double r=sc.nextDouble();
double area3=2*3.14*r;
System.out.println("Area of the Circle="+area3);
break;


case 4:
System.out.println("Enter the first side of the Triangle");
double s1=sc.nextDouble();
System.out.println("Enter the second side of the Triangle");
double s2=sc.nextDouble();
System.out.println("Enter the third side of the Triangle");
double s3=sc.nextDouble();
double s=(s1+s2+s3)/2;
double area4;
area4=Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
System.out.println("Area of the Triangle="+area4);
break;

default:
System.out.println("Invalid choice");
}
}
}