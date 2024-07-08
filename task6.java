//Create a method to check whether a number is Even or odd.

import java.util.*;
public class task6 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);


        int b=sc.nextInt();


        sum(b);




    }
    public static void sum(int b){
        if(b%4==0){
             System.out.println("Even");
        }
        else{
            System.out.println("Odd");}

    }




}