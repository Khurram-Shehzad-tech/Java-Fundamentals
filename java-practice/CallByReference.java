import java.util.Scanner;

class copy{
    int x;
    int y;
    copy(int x,int y){
        this.x=x;
        this.y=y;
    }
}
public class Practice {
    static void main() {
        copy c = new copy(22,23);
        System.out.println(c.x);
        System.out.println(c.y);
        AddTen(c);
        System.out.println(c.x);
        System.out.println(c.y);


    }
    public static void AddTen(copy c){
        c.x=c.x+10;
        c.y=c.y+10;

    }

}

