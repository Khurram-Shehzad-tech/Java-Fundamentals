public class FunctionsChaining {
    static int sum(int a, int b) {
        int result = a+b;
        if(result>5){
            sub(9,10);
        }
        System.out.println(result);
        return result;
    }
    static int sub(int a , int b) {
        int sum = Functions.sum(1, 8);
        multi();
        int sub = a-b;
        System.out.println(sub);

        return sub;
    }
    static void multi() {
        System.out.println("multi called");
    }

public static void main(String[] args) {
        sum(3, 4);
    }
}
