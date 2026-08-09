//import mycollege.Student;
/*abstract classes are those classes which cannot be instantiated directly you cannot
make objetc of abstract classes they are blue prints for other classes that it can have concrete methods
abstract method and can have constructor
*/ 

abstract class Animal{
     String name;
     int age;
     abstract void speak();
     Animal(String n, int a){
         this.name=n;
         this.age=a;
     }
}
class Cat extends Animal{
    Cat(String n,int a){
        super(n,a);
    }
    @Override
    void speak() {
        System.out.println("I'm a " +name + "a cat" +"i am "+age+ " years old");
    }
}
class Dog extends Animal{
    Dog(String n,int a){
        super(n,a);
    }
    @Override
    void speak() {
        System.out.println("I'm a " + name+ " a dog " + "i am "+age+ " years old");
    }
}
public class Practice {


    public static void main(String[] args) {
        Animal d=new Dog("David",5);
        d.speak();
        Animal c=new Cat("Meeno",1);
        c.speak();
    }
}


