//import mycollege.Student;
/*
Wrapper Classes:
These are non primitive classes these clases are used with collection frameworks
Syntax: Integer x = new Integer(10);
int---->Integer
short---->Short
double---->Double
 */


public class Practice {
   public  static void main() {
       int x = 10;
       Integer y = new Integer(x); //Autoboxing
       System.out.println(y);
       Integer a = new Integer(10);
       int b = a; //Unboxing
       System.out.println(b);
    }
}


