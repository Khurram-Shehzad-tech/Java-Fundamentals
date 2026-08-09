/*
Input Stream Reader read only single character of 1 byte and it only display ascii value of the input user
 */

import java.util.*;
import java.io.*;

public class Practice {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int n = br.read();
        System.out.println(n);
        char ch = (char)n;
        System.out.print(ch);
    }
}


