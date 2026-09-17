public class constructorOverloading {

    public static void main(String[]args){
        sum s1 = new sum(2,2);
        sum s2 = new sum(3,4,5);
        s1.display();
        s2.display();
    }
    static class sum{
        int a,b,c;
        int result;
        sum(int a, int b){

            result=a+b;
        }
        sum(int a,int b,int c){
            result=a+b+c;
        }
        public void display(){
            System.out.println(result);
        }
    }
}

/*
constructor overloading means coding two or more constructor for the same classs with different paarameters
 */