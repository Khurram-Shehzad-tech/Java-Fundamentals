public class constructorWithObjectAsParameter {
    public static void main(String[] args) {
        Addition a1 = new Addition(2,3);         // pass parameters as a value
        System.out.println(a1.a+","+a1.b);
        Addition a2 = new Addition(a1);              //passing parameters as object
        System.out.println(a2.a+","+a2.b);
         Addition r3 = a2.sub(a2);                   // here creating new object r3 and assigning and changing values of a2 object by calling function that accepts object as parameter
        System.out.println(r3.a+","+r3.b);
    }
    static class Addition {
        int a, b;
        Addition(int a, int b) {
            this.a = a;
            this.b = b;
        }
         Addition(Addition r){                    // another constructor which accepts
            this.a = r.a+4;
            this.b = r.b+3;
        }
         Addition sub(Addition r){                // this is a function with return type same as class and it will accept object of the class
            this.a = r.a+4;
            this.b = r.b+3;
            return r;
        }
    }
}
/*
This time i am giving object of the class as parameter to prove that non-primitive data types can be given as a
parameters in constructor as well in functions or behavior
 */