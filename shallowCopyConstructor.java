import java.util.Arrays;
public class shallowCopyConstructor {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        shallow s1 = new shallow(2,3,numbers);
        System.out.println(s1.a+","+s1.b);
        shallow s2 = s1.copy(s1);
        System.out.println(s2.a+","+s2.b+ Arrays.toString(s2.numbers));
    }


    static class shallow{
         int a;
         int b;
         int[] numbers;
        shallow(int a,int b, int[] arr){
            this.a=a;
            this.b=b;
            this.numbers=arr;
        }
         shallow copy(shallow s){
            return new shallow(this.a,this.b,this.numbers);
        }
    }

}
/*
other way to do shallow copy is s2 = s1;
 */