/*
Equals(); is the one of the method it compares objects and their value or hasCode(); to return output 
 */

import java.util.*;
import java.io.*;

class Student{
    String name;
    int age;
    Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    @Override
    public String toString(){
        return "Name: "+name+" Age: "+age;
    }
    @Override
    public boolean equals(Object o){
        return this.name.equals(((Student)o).name)&&this.age==((Student)o).age;
    }

}
public class Practice {
    public static void main(String[] args) throws IOException {
        Student s1 = new Student("Shehzad",25);
        Student s2 = new Student("Shehzad",28);
        Boolean  b = s1.equals(s2);
        System.out.println(b);

    }
}


