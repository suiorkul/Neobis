package week1;
import java.io.IOException;
import java.util.Scanner;

public class Q1018 {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int input= scn.nextInt();
        System.out.println(input);
        int [] arr= {100,50,20,10,5,2,1};
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(input/arr[i]+" nota(s) de R$ "+arr[i]+",00");
            input=input-((input/arr[i])*arr[i]);
        }
    }
}