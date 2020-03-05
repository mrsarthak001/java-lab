/*Write a java program to throw an exception for an employee details.
.If an employee name is a number, a name exception must be thrown.
.If an employee age is greater than 50, an age exception must be thrown.
.Or else an object must be created for the entered employee details.*/

import java.util.*;
class name extends Exception
{
boolean x;
name(String str)
{
int i;
char c;
x=false;
for(i=0;i<str.length();i++)
{
c=str.charAt(i);
if(c>=48&&c<=57)
{
x=true;
break;
}
}
}
public String toString()
{
return "NAME EXCEPTION!";
}
}

class age extends Exception
{
boolean x;
age(int a)
{
x=a>50;
}
public String toString()
{
return "AGE EXCEPTION!";
}
}

class employee
{
String nam;
int ag;
employee(String n,int a)
{
nam=n;
ag=a;
System.out.println("Object created");
System.out.println("____________________________");
System.out.println("Name:"+nam);
System.out.println("Age:"+ag);
}
}

class employeeMain
{
public static void main(String agr[])
{
String name;
int age;
employee em;
name n;
age a;
Scanner sc = new Scanner(System.in);
try
{
System.out.println("Enter name of an employee");
name=sc.nextLine();
n=new name(name);
if(n.x)
{
throw n;
}
System.out.println("Enter age of an employee");
age=sc.nextInt();
a=new age(age);
if(a.x)
{
throw a;
}
em=new employee(name,age);
}
catch(name e)
{
System.out.println(e);
}
catch(age f)
{
System.out.println(f);
}
}
}