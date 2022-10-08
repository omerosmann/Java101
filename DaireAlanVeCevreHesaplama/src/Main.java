import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int r,a;
        double pi = 3.14,alan,cevre,dilimAlanı;

        Scanner scanner = new Scanner(System.in);

        //Kullanıcıdan yarıçap alınarak dairenin "Alanı ve Çevresini" hesaplama...
        /*System.out.print("Dairenin yarıçapı : ");
        r = scanner.nextInt();
        alan = pi * r * r;
        cevre = 2 * pi * r;
        System.out.println("Dairenin Alanı : " + alan);
        System.out.println("Dairenin Çevresi : " + cevre);*/

        //Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan program...
        System.out.print("Dairenin yarıçapı : ");
        r = scanner.nextInt();
        System.out.print("Dairenin a ölçüsü : ");
        a = scanner.nextInt();
        dilimAlanı = (pi * r * r * a) / 360;
        System.out.println("Dairenin Dilim Alanı : " + dilimAlanı);


    }
}