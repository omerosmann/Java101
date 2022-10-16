import java.util.Scanner;

public class Main {

    static void asal(int a, int i){
        if(a == i){
            System.out.println(a + " Asal sayıdır.");
            return;
        }else if(a % i == 0){
            System.out.println(a + " Asal sayı değildir.");
            return;
        }
        asal(a,i + 1);
    }

    public static void main(String[] args) {
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        a = scanner.nextInt();
        asal(a,2);
    }
}