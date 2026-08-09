import java.util.Scanner;

public class Practice {
    static void main(String[] args) {
       int result =  fib(5);
       System.out.println(result);
     }
     public static int fib(int n){
        if(n==0 || n==1){
            return 1;
        }
        int result = n*fib(n-1);
        return result;
    }
}