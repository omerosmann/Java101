import java.util.Scanner;

public class Main {
    public static int recursivePow(int a, int b) {
        if (a == 0) {
            return 0;
        }
        if (a != 0 && b == 0) {
            return 1;
        }
        return recursivePow(a, b - 1) * a;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;
        System.out.print("Taban değeri giriniz : ");
        a = input.nextInt();
        System.out.print("Üs değerini giriniz : ");
        b = input.nextInt();
        int result = recursivePow(a, b);
        System.out.println("Sonuç: " + result);
    }
}