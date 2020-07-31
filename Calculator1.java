package calculator1;
import java.util.Scanner;
public class Calculator1 {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int a,b,result;
        
        System.out.println("Enter 1st numbers");
        a=s.nextInt();
        System.out.println("Enter operator(+.-.*./.%):-");
        char operator=s.next().charAt(0);
        System.out.println("Enter 2nd numbers");
        b=s.nextInt();
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ __ _ _ _ _ __ _ _ _ _");
        System.out.println(+a);
        System.out.println(operator);
        System.out.println(+b);
        switch(operator)
        {
            case '+':
                result=a+b;
                System.out.println("Addition="+result);
                break;
            case '-':
                result=a-b;
                System.out.println("Substraction="+result);
                break;
            case '*':
                result=a*b;
                System.out.println("Multiplication="+result);
                break;
            case '/':
                result=a/b;
                System.out.println("Division="+result);
                break;
            case '%':
                result=a%b;
                System.out.println("Remainder="+result);
                break;
            default:
                System.out.println("Enter valid operator");
                return;
        }
    }
}
