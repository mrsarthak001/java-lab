/*On a single track two vehicles are running. As vehicles are going in same direction there is no problem. If the vehicles are running in different direction there is a chance of collision. To avoid collisions write a Java program using exception handling. You are free to make necessary assumptions.*/

import java.util.*;
class collision extends Exception
{
boolean check(int a,int b,int da,int db)
{
if(a==b&&da!=db)
{
return true;
}
return false;
}

public String toString()
{
return "Vehicles will collide!";
}
}

class vehicleMain
{
public static void main(String args[])
{
int a,b,da,db;
a=(int)(Math.random()*2);
b=(int)(Math.random()*2);
da=(int)(Math.random()*2);
db=(int)(Math.random()*2);
vehicleMain ob = new vehicleMain();
collision c = new collision();
ob.display(a,b,da,db);
try
{
if(c.check(a,b,da,db))
{
throw c;
}
System.out.println("Vehicles will not collide");
}
catch(collision e)
{
System.out.println("Vehicles will collide");
}
}

void display(int a,int b,int da,int db)
{
String ra,rb;
ra=" ";
rb=" ";
if(a==0&&b==0)
{
ra=placecar(da)+placecar(db);
}
else if(a==1&&b==1)
{
rb=placecar(da)+placecar(db);
}
else
{
ra=placecar(da);
rb=placecar(db);
}
System.out.println("car 1:"+placecar(da));
System.out.println("car 2:"+placecar(db));
System.out.println("_____________________________________");
System.out.println("\t\t"+ra+"\t\t");
System.out.println("  __  __  __  __  __  __  __  __  __");
System.out.println("\t\t"+rb+"\t\t");
System.out.println("_____________________________________");
}

String placecar(int x)
{
return (x==0)?"<--":"-->";
}

}