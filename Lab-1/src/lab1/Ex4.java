package lab1;
import java.util.Scanner;
public class Ex4 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c = 0;
         System.out.println("Enter first number");
         a = sc.nextInt();
          System.out.println("Enter second number");
         b = sc.nextInt();
                  System.out.print("Enter an operator (+, -, *, /): ");
            char operator = sc.next().charAt(0);
         switch(operator)
       {
           case '+':
               c = a + b;
               break;
           case '-':
               c = a - b;
               break;
           case '*':
               c = a * b;
               break;
           case '/':
               c = a / b;
               break;
           default:
               System.out.println("Wrong value");
   }
       System.out.println(c);


	}

}
