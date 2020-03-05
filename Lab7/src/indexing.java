
import java.util.*;
class indexing
{
public static void main(String args[])
{
String str,sub;
int a,b,l,i;
indexing ob = new indexing();
Scanner sc = new Scanner(System.in);
System.out.println("Enter a String");
str=sc.nextLine();
System.out.println("Enter a subtring or a character");
sub=sc.nextLine();
for(i=0;i<str.length();i++)
{
a=str.indexOf(sub.charAt(0));
b=str.lastIndexOf(sub.charAt(0));
if(a!=-1)
{
l=ob.sub(str,sub,a);
if(l!=-1)
{
System.out.println("First index is : "+l);
break;
}
}
else if(b!=-1)
{
l=ob.sub(str,sub,b);
if(l!=-1)
{
System.out.println("Last index is : "+l);
break;
}
}
}
}

int sub(String a,String b,int l)
{
String e;
if(l+b.length()>a.length())
{
return -1;
}
e=a.substring(l,l+b.length());
if(e.equals(b))
{
return l;
}
return -1;
}
}
