

public class JavaClasses {

    //java classes are the blueprints to store data in organized and understandable form,it is a non-primitive data type
    //java classes have the following components
    /*--1--characteristics aka data types
    ----2--Behaviors aka functions
    ----3--Objects of the classes
    Note:the reference of the objects store in stack memory and itself object stored in heap memory
    */
      static void  main(String args[]){
        student s1 = new student("Khurram Shehzad",25);
        System.out.println(s1.name+" "+s1.age);

    }
    static  class student{
        String name;
        int age;
        student(String name, int age){//this is constructore ,parameterized constructor ,it is used to initialized the variables of the class
            this.name=name;
            this.age=age;
        }

    }
}

