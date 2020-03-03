interface A
{
void meth1();
void meth2();
}

class MyClass implements A
{
public void meth1()
{
System.out.println("meth1() called in class A");
}
public void meth2()
{
System.out.println("meth1() called in class A");
}
}

class meth12A
{
public static void main(String args[])
{
MyClass ob = new MyClass();
System.out.println("calling meth1() in class A");
ob.meth1();
System.out.println("calling meth2() in class A");
ob.meth2();
}
}
