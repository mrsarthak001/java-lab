/*Create an exception class, which throws an exception if operand is nonnumeric in calculating modules. (Use command line arguments). */

class checknum extends Exception
{
boolean x;
checknum(String n,String a)
{
super(n);
int i;
char c;
x=false;
for(i=0;i<a.length();i++)
{
c=a.charAt(i);
if(!(c>=48&&c<=57))
{
x=true;
break;
}
}
}
public String toString()
{
return "its not a number";
}
}

class Num
{
public static void main(String args[])
{
checknum ob = new checknum("NUM Exception!",args[0]);
try
{
if(ob.x)
{
throw ob;
}
System.out.println("its a number");
}
catch(checknum e)
{
System.out.println(e);
}
}
}