import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.*;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizinin boyutu : " );
        int n = scanner.nextInt();
        int[] value = new int[n];

        for(int i = 0; i < value.length;i++){
            System.out.print((i+1) + ". Elemanı : ");
            value[i] = scanner.nextInt();
        }
        Arrays.sort(value);
        System.out.println(Arrays.toString(value));

    }
}