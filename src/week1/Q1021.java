package week1;

import java.util.Scanner;

public class Q1021 {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);

        String input= scn.nextLine();
        String [] arr2=input.split("\\.");
        int [] arr= {100,50,20,10,5,2,  1, 50, 25, 10, 5 , 1};

        int dig=Integer.parseInt(arr2[0]);
        int dec=Integer.parseInt(arr2[1]);
        System.out.println("NOTAS:");
        for (int i = 0; i <6 ; i++) {
            System.out.println(dig/arr[i]+" nota(s) de R$ "+arr[i]+".00");
            if(dig/arr[i]>0) dig=dig-(dig/arr[i])*arr[i];
        }
        System.out.println("MOEDAS:");
        for (int i = 6; i < arr.length ; i++) {
            if(i==6){
                System.out.println(dig/arr[i]+" moeda(s) de R$ "+arr[i]+".00");
            }
            if (6 < i && i< arr.length-2){
                System.out.println(dec/arr[i]+" moeda(s) de R$ 0."+arr[i]);
                if(dec/arr[i]>0) dec= dec-(dec/arr[i])*arr[i];
            }
            if( i>=arr.length-2 && i<=arr.length-1){
                System.out.println(dec/arr[i]+" moeda(s) de R$ 0.0"+arr[i]);
                if(dec/arr[i]>0) dec= dec-(dec/arr[i])*arr[i];

            }        }

    }
}
