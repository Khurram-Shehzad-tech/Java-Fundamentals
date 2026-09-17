public class OverloadingFunctions {
    //overloading functions means a function with same name but accepting different data tpe parameters
    static int sum(int a, int b) {
        return a+b;
    }
    static int sum(int a, int b, int c) {
        return a+b+c;
    }
    public static void main(String[] args) {
        int sum1 = OverloadingFunctions.sum(1, 2, 3);
        System.out.println(sum1);
        int sum2 = OverloadingFunctions.sum(1, 2);
        System.out.println(sum2);
    }
}
