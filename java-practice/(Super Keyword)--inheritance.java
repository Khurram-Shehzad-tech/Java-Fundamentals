//import mycollege.Student;

class A{
    String st;
    A(String s){
        this.st=s;
    }

}
class B extends A{
    String st;
    B(String str){
        super("A class constructor called");
        System.out.println(super.st);
        this.st=str;
    }
}
class C extends B{
    C(){
        super("B class constructor called");
    }
    void display(){
        System.out.println(super.st);
    }
}
public class Practice {


    public static void main(String[] args) {
        C c=new C();
        c.display();
    }
}


