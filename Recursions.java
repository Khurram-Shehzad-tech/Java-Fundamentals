public class Recursions {
    // a function calling itself within its own boundry known as recursion
    static void Table(int num) {
        if (num == 0) {
            return;
        }
        Table(num -1);
        System.out.println(num*5);

    }

    public static void main(String[] args) {
        Table(10);
    }
}
