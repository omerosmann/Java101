import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Mayın tarlası oynuna hoş geldiniz...\n"+
                         "Mayın tarlasının boyutunu giriniz... (Örnek : 3 4) : ");
        int x , y ;
        x = scanner.nextInt();
        y = scanner.nextInt();
        MineSweeper mineSweeper = new MineSweeper(x, y);
        //mineSweeper.printMineMap();
        mineSweeper.run();
        scanner.close();

    }
}