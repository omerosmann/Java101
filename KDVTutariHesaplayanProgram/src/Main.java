import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double tutar, kdvOrani ,kdvTutar, kdvliTutar;
        boolean kdvDurum;
        Scanner inp = new Scanner(System.in);
        System.out.print("Ücret tutarını giriniz : ");
        tutar = inp.nextDouble();

        kdvDurum = (0 < tutar) && (tutar < 1000);
        kdvOrani = kdvDurum ? 0.18 : 0.8;
        kdvTutar = tutar * kdvOrani;
        kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV'siz Tutar : " + tutar);
        System.out.println("KDV Oranı : " + kdvOrani);
        System.out.println("KDV Tutarı : " + kdvTutar);
        System.out.println("KDV'li Tutar : " + kdvliTutar);


    }
}