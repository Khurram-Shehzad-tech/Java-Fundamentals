/*

 */

import java.io.*;

class Student implements Cloneable{
    String name;
    int roll;
    int age;
    Student(String name,int roll,int age){
        this.name=name;
        this.roll=roll;
        this.age=age;
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
public class Practice {
    public static void main(String[] args) throws IOException, ClassNotFoundException, CloneNotSupportedException {
        Student s1 = new Student("Khurram Shehzad",2323,24);
        Student s2;
        s2 = (Student) s1.clone();
        System.out.println(s2.age);
    }
}


