package lab1;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
       if(a>b && a>c)
        {
            System.out.print("Largest no" + a);
        }
        else if(b>c && a>c)
        {
             System.out.print("Largest no" + b);
        }
        else
        {
        System.out.print("Largest no" + c);
        sc.close();
     }}
}
