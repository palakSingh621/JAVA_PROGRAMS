import java.util.Scanner;
class Ages
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter 3 ages");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int o,y;
if(a>b && a>c)
o=a;
else
{
if(b>c)
o=b;
else 
o=c;
}
System.out.println("Oldest age="+o);
if(a<b && a<c)
y=a;
else {
if(b<c)
y=b;
else
y=c;
}
System.out.println("youngestest age="+y);
}
}






