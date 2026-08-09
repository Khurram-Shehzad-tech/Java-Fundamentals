/*
    There is four method for enum which are built in these are .values(){which return the actaul
     value inside enum
    we use forEach loop to iterate with the enums }
 */

import java.util.*;
import java.io.*;
enum direction {
    UP,
    DOWN,
    LEFT,
    RIGHT;
}

public class Practice {
    public static void main(String[] args) throws IOException {
        direction[] d1 = direction.values();
        for(direction d : d1) {
            System.out.println(d);
        }

    }
}


