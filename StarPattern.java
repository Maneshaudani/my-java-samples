package lk.manesha;

import java.util.Scanner;
public class StarPattern {
    public void sleepMethod(){
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException ex){
            System.out.println(ex);
        }
    }
    public static void main(String[] args) {
        StarPattern starPattern = new StarPattern();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a no: ");
        int n=scanner.nextInt();

        int m = n-1;
        for (int i = 0; i < n ; i++) {
            starPattern.sleepMethod();
            for (int j = n; j > i+1; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <=i ; k++) {
                System.out.print("*");
            }
            for (int l = 0; l< i ; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < m; i++) {
            starPattern.sleepMethod();
            for (int j = 0; j <=i ; j++) {
                System.out.print(" ");
            }
            for (int k = m; k >i ; k--) {
                System.out.print("*");
            }
            for (int l = m; l >i+1 ; l--) {
                System.out.print("*");
            }
            System.out.println();


        }
    }
}


