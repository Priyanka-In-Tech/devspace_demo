package devspace_demo;

import java.util.Scanner;

public class Index {
    public static void main (String[]args){
        System.out.println("Basic calculator");

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number 1=");
        int a=sc.nextInt();
        System.out.print("Enter the number 2=");
        int b=sc.nextInt();
        System.out.print("Enter an oprater= (+ ,-,*,/)");
        String operator=sc.next();

        switch (operator){
            case "+":
                Syastem.out.println("Result"+ (a+b));
                break;

                case "-":
                Syastem.out.println("Result"+ (a-b));
                break;

                case "*":
                Syastem.out.println("Result"+ (a*b));
                break;

                case "/":
                Syastem.out.println("Result"+ (a/b));
                break;

                default:System.out.println("invalid operator");
                break;
        }


        
    }
}
