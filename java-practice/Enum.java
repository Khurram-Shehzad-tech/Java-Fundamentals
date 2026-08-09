/*
enum are defien enumeration it is a final public object of the enum class that will not be change
 the variable act like a object in the enum class 
 */

import java.util.*;
import java.io.*;
enum Direction {
    UP(100){
        @Override
        public void dist(){
            System.out.println("we are "+this.degree+"up to distance");
        }
    },
    DOWN(200){
        @Override
        public void dist(){
            System.out.println("we are "+this.degree+"Down t0 distance");
        }
    },
    LEFT(300){
        @Override
        public void dist(){
            System.out.println("we are "+this.degree+"left to distance");
        }
    },
    RIGHT(400){
        @Override
        public void dist(){
            System.out.println("we are "+this.degree+"right to distance");
        }
    };




    int degree;
    Direction(int degree) {
        this.degree = degree;
    }
    public int getDegree() {
        return degree;
    }


    public abstract void dist();
}
public class Practice {
    public static void main(String[] args) throws IOException {
        Direction d = Direction.UP;
        d.dist();
        Direction d1 = Direction.DOWN;
        d1.dist();
        Direction d2 = Direction.LEFT;
        d2.dist();
        Direction d3 = Direction.RIGHT;
        d3.dist();

    }
}


