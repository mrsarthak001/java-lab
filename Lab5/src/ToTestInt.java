import java.util.Scanner;
interface test
{
void square(int a);
}

class arithmetic implements test
{
public void square(int a)
{
System.out.println("The square of a "+a+" is : "+(a*a));
}
}

class ToTestInt
{
public static void main(String args[])
{
int n;
Scanner sc = new Scanner(System.in);
arithmetic ob = new arithmetic();
System.out.println("Enter a number");
n=sc.nextInt();
ob.square(n);
}
}
