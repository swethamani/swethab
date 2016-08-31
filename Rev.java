import java.util.*;

class Rev
{
public static void main(String ag[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int s=0;
int a;
while(n!=0)
{
a=n%10;
s=(s*10)+a;
n=n/10;
}
System.out.println(s);
}
}
