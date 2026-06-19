import java.util.*;
public class Ch9 {
    public static void main(String[]args){
        Scanner s = new Scanner (System.in);
        System.out.println("Enter a non-negative number: ");
        int num = s.nextInt();
        System.out.println("The factorial of " + num +" = " + factorial(num));
        System.out.println("The addition of factorial " + num +" = " + addition(num));
        System.out.println("Enter a non-negative number for the index ");
        int index = s.nextInt();
        System.out.println("The fibonacci of index "+ index + " = " + fibonacci(index));
    }
    public static int factorial(int n){
        if (n == 0)
         return 1;
        else
            return n * factorial(n -1);
    }
    public static int addition(int n){
        if (n == 0)
            return 0;
        else
            return n + addition(n-1);
    }
    public static int fibonacci(int n){
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return fibonacci(n-1) + fibonacci(n -2);
    }
}
