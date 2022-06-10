package week2;

import java.util.Scanner;

public class Q1238 {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n= Integer.parseInt(scn.nextLine());
        for (int i = 0; i <n ; i++) {
            String input= scn.nextLine();
            String [] arr=input.split(" ");
            String word="";

            int c=0;
            while (c != arr[0].length() || c != arr[1].length()){
                if(c==arr[0].length() || c==arr[1].length()) break;

                word+=String.valueOf(arr[0].charAt(c));
                word+=String.valueOf(arr[1].charAt(c));
                c++;

            }
            if(arr[0].length()>c){
                word += arr[0].substring(c);
            }
            if(arr[1].length()>c){
                word += arr[1].substring(c);
            }
            System.out.println(word);
            c=0;
        }
    }
}
