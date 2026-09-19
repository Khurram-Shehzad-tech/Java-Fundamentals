import java.util.Arrays;
public class deepCopyConstructor {
    public static void main(String[] args) {
        int[] mks = {10,11,12,13,14};
        deepCopy dc = new deepCopy(mks);
        System.out.println(Arrays.toString(dc.marks));
        deepCopy dc2 = new deepCopy(mks);
        dc2.marks[4] = 15;
        System.out.println(Arrays.toString(dc2.marks));

    }
    static class deepCopy {
       int[] marks;
       deepCopy(int[] arr){
           this.marks=arr;
       }
       deepCopy deepCopy(deepCopy d){   // a deep is a copy which has different referenced to different object change to one does not effect other
           this.marks=d.marks;
           return this;
       }
    }
}

/*
"C:\Program Files\Eclipse Adoptium\jdk-25.0.1.8-hotspot\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2025.3.2\lib\idea_rt.jar=56827" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath D:\JavaPractice\JavaArrays\out\production\JavaArrays deepCopyConstructor
[10, 11, 12, 13, 14]
[10, 11, 12, 13, 15]

Process finished with exit code 0
 */
