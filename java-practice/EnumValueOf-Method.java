/*
The .valueOf(); method is used to to get user neededd value like on using application we will be
 able to use the 
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
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        direction d1 = direction.valueOf(str);
        System.out.println(d1);

    }
}



