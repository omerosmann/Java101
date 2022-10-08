import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double kg,boy,vucutKitleIndeksi;

        Scanner scanner  = new Scanner(System.in);
        System.out.print("Lütfen Boyunuzu (metre cinsinden) Giriniz :");
        boy = scanner.nextDouble();
        System.out.print("Lütfen Kilonuzu Giriniz :");
        kg = scanner.nextDouble();

        vucutKitleIndeksi = kg / (boy * boy);
        System.out.println("Vücut Kitle İndeksiniz : " + vucutKitleIndeksi);
    }
}