import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x,sayi1=0,sayi2=1,sayi3;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Eleman sayısını giriniz : ");
        x = scanner.nextInt();


        for (int i = 2; i <= x; i++){
            sayi3 = sayi1 + sayi2;
            System.out.print(sayi1 + " + " + sayi2 + " = " + sayi3);
            sayi1 = sayi2;
            sayi2 = sayi3;
            System.out.println();
        }
    }
}