

import java.util.*;
import P1.*;
import P2.*;
class importer
{
public static void main(String [] args)
{
int a,b;
System.out.println("Testing Package P1");
System.out.println("_________________________________");
P1.K.visit();
System.out.println("_________________________________");
System.out.println("Tested!");
System.out.println("_________________________________");
System.out.println("\nTesting Package P2");
System.out.println("_________________________________");
Scanner sc = new Scanner(System.in);
P2.calc c = new P2.calc();
c.display();
System.out.println("_________________________________");
System.out.println("Enter value of a");
a=sc.nextInt();
System.out.println("Enter value of b");
b=sc.nextInt();
System.out.println("_________________________________");
c.add(a,b);
c.sub(a,b);
c.mul(a,b);
c.div(a,b);
System.out.println("_________________________________");
System.out.println("Tested!");
}
}


