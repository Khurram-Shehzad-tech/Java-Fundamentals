/*
ordinal is used to get index of enum constants
 */

import java.io.*;
enum Direction {
    UP,
    DOWN,
    LEFT,
    RIGHT;
}

public class Practice {
    public static void main(String[] args) throws IOException {
        Direction d1 =  Direction.UP;
        Direction d2 = Direction.DOWN;
       int i = d2.ordinal();
       System.out.println(i);

    }
}


