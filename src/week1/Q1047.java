package week1;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.lang.Math;


public class Q1047 {

    public static void main(String[] args) throws IOException {
        int minutes;
        int hours;
        Scanner sc = new Scanner(System.in);
        String[] time = sc.nextLine().split(" ");
        if ((Integer.parseInt(time[0]) == Integer.parseInt(time[2])) && (Integer.parseInt(time[2]) == Integer.parseInt(time[2]))){
            hours = 24;
            minutes = 0;
            System.out.printf("0 JOGO ");
            System.out.printf(hours + " HORA(S) E ");
            System.out.printf(minutes + " MINUTO(S)");
        }
        else{
            if (Integer.parseInt(time[0]) > Integer.parseInt(time[2])){
                hours = 24 - Math.abs(Integer.parseInt(time[2]) - Integer.parseInt(time[0]));
            }
            else{
                hours = Integer.parseInt(time[2]) - Integer.parseInt(time[0]);
            }
            if (Integer.parseInt(time[3]) < Integer.parseInt(time[1])){
                minutes = 60 - Math.abs(Integer.parseInt(time[3]) - Integer.parseInt(time[1]));
            }
            else{
                minutes = Integer.parseInt(time[3]) - Integer.parseInt(time[1]);
            }
            System.out.printf("0 JOGO ");
            System.out.printf(hours + " HORA(S) E ");
            System.out.printf(minutes + " MINUTO(S)");
        }
    }
}