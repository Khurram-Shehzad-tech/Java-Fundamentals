/*
The .name(); function is used to get name of the enum constant it is used within foreach loop
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
        Direction[] d1 = Direction.values();
        for(Direction d : d1) {
            System.out.println(d.name());
        }

    }
}


