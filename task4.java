//Create a program that finds the maximum and minimum values in an array of integers.

import java.util.*;
public class task4 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);


        int n=sc.nextInt();
        int[] array=new int [10];
for(int i=0; i<n; i++)
{
 array[i]=sc.nextInt();
}



int max=0;
int min=0;

        for(int i=0; i<n; i++){
            if(array[i]>max){
                max=array[i];
            }

        }
        min=max;


        for(int i=0; i<n; i++){
            if(array[i]<min){
                min=array[i];

            }

        }

//        Arrays.sort(array);
        System.out.println("Maximum");
        System.out.println(max);
        System.out.println("Minimum");
        System.out.println(min);



}}