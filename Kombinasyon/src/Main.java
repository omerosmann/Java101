import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 1, r = 1, nDeger = 1, rDeger = 1, xDeger = 1, x, c;

        System.out.print("Lütfen n değerini giriniz: ");
        n = scanner.nextInt();

        System.out.print("Lütfen r değerini giriniz: ");
        r = scanner.nextInt();

        x = (n - r);


        for (int i = 1; i <= n; i++) {
            nDeger *= i;

        }
        for (int i = 1; i <= r; i++) {
            rDeger *= i;

        }
        for (int i = 1; i <= x; i++) {
            xDeger *= i;

        }
        c = nDeger / (rDeger * xDeger);
        System.out.println(c);
    }
}