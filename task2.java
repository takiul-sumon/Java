//Create a basic calculator that can perform addition, subtraction, multiplication, and
//        division.


import java.util.*;
public class task2 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();

        int su;
        su=sum(a,b);
        System.out.println(su);
        su=sub(a,b);
        System.out.println(su);
        su=mul(a,b);
        System.out.println(su);
        su=div(a,b);
        System.out.println(su);


    }

    public static int sum(int a,int b){
        int sum = a+b;
        return sum;
    }
    public static int sub(int a,int b){
        int sub = a-b;
        return sub;
    }
    public static int mul(int a,int b){
        int mul = a*b;
        return mul;
    }
    public static int div(int a,int b){
        int div = a/b;
        return div;
    }

}