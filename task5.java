//Create a program that returns a reversed String

import java.util.*;
public class task5 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);


        int n=sc.nextInt();
        int[] array=new int [10];
        for(int i=0; i<n; i++)
        {
            array[i]=sc.nextInt();
        }


        System.out.println("Reversed");
        for(int i=n-1; i>=0; i--)
        {
            System.out.println(array[i]);




    }}}