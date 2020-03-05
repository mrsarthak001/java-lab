/*Write a program in Java to display the names and roll numbers of students. Initialize respective array variables for 10 students. Handle ArrayIndexOutOfBoundsExeption, so that any such problem doesn't cause illegal termination of program.*/

import java.util.*;
class ArrayException
{
public static void main(String args[])
{
int i,x;
Scanner sc = new Scanner(System.in);
int arr[] = new int[10];
for(i=0;i<10;i++)
{
arr[i]=(int)(Math.random()*100);
}
//printing array
System.out.println("Printing array");
for(i=0;i<10;i++)
{
System.out.println("("+i+") "+arr[i]);
}
System.out.println("Choose a index number");
i=sc.nextInt();
try
{
x=arr[i];
System.out.println(x+" is choosen");
}
catch (ArrayIndexOutOfBoundsException e)
{
System.out.println("Index does not exists!");
}
}
}