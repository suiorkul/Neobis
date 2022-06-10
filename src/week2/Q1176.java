package week2;

import java.util.Scanner;

public class Q1176 {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int input= scn.nextInt();
        long []arr=new long[61];
        arr[0]=0;
        arr[1]=1;
        for (int i = 2; i <61 ; i++) {
            arr[i]=arr[i-1]+arr[i-2];
        }
        for (int i = 0; i <input ; i++) {
            int n=scn.nextInt();
            if(n>=0 && n<=60){
                System.out.println("Fib("+n+") = "+arr[n]);
            }

        }
    }

}