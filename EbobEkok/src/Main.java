import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi1, sayi2;
        boolean a = false;
        do {
            System.out.print("Enter Your First Number : ");
            sayi1 = input.nextInt();
            System.out.print("Enter Your Second Number : ");
            sayi2 = input.nextInt();
            if (sayi1 <= 0 || sayi2 <= 0) {
                System.out.println("Please Enter Positive Number!!");
            } else {
                a = true;
            }
        } while (!a);
        if (sayi2 < sayi1) {
            int tempN2 = sayi2;
            sayi2 = sayi1;
            sayi1 = tempN2;
        }
        int i = sayi1;
        while (i >= 1) {
            if ((sayi1 % i == 0) && (sayi2 % i == 0)) {
                System.out.println("OBEB : " + i);
                break;
            } else {
                i--;
            }
        }
        int k = sayi2;
        while (k <= (sayi1 * sayi2)) {
            if ((k % sayi1 == 0) && (k % sayi2 == 0)) {
                System.out.println("OKEK : " + k);
                break;
            } else {
                k++;
            }
        }
    }
}