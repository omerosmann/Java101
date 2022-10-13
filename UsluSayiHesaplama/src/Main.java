import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int x,y,total = 1;


        Scanner scanner = new Scanner(System.in);
        System.out.print("Üssü alınacak sayı : ");
        x = scanner.nextInt();
        System.out.print("Üs olacak sayı : ");
        y = scanner.nextInt();

        for(int i = 1; i <= y; i++){
                total *= x;
        }

        System.out.println("Sonuç : " + total);










    }
}