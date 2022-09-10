import java.util.Scanner;
class Rev
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int n=sc.nextInt();
int c=0,d;
int num=n;
while(n!=0)
{
n=n/10;
c++;
}
if(c==4)
{
while(num!=0)
{
d=num%10;
num=num/10;
System.out.print(+d);
}
}
else
System.out.print(num);
}
}







