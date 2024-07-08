//Write a program that calculates and prints the sum of integers from 1 to N, where N is
//        taken as user input.


import java.util.*;
public class task3 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);


        int b=sc.nextInt();

        int sum=0;

        for(int i=0; i<=b; i++)
        {
            sum=sum+i;
        }
        System.out.println(sum);



    }

//    public static int sum(int b){
//        for(int i=0; i<b; i++)
//        {
//            sum=sum+i;
//        }
//        return sum;
//    }


}