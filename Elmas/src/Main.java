import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x,i,j,k;
        Scanner inp = new Scanner(System.in);
        System.out.print(" Bir Sayı gırınız : ");
        x = inp.nextInt();
        for ( i = 1; i <= x; i++) {
            for ( j = 1; j <= (x - i); j++) {
                System.out.print(" ");

            }
            for ( k = 1; k <= ( 2* i - 1 ); k++) {
                System.out.print("*");

            }
            System.out.println(" ");

        }
        for ( i = 1; i < x; i++) {
            for ( j = 1; j <= i; j++) {
                System.out.print(" ");

            }
            for ( k = 1; k <= ( 2 * x - (2 * i + 1) ); k++) {
                System.out.print("*");

            }
            System.out.println(" ");

        }

    }
}