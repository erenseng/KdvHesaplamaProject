import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // create variables
        double fiyat, kdv, sayi;
        // create scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Fiyatı giriniz: ");
        fiyat = input.nextDouble();
        // condition part
        kdv = (fiyat >= 1000) ? 0.08 : 0.18;
        sayi = fiyat + fiyat * kdv;
        // output
        System.out.println("-----------------------");
        System.out.println("KDV Dahil : " + sayi);
    }
}