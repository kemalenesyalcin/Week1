import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ürünlerin Fiyatları
        double armutPrice = 2.14;
        double elmaPrice = 3.67;
        double domatesPrice = 1.11;
        double muzPrice = 0.95;
        double patlıcanPrice = 5.00;

        // Kullanıcıdan alınacak kilogram değerleri
        System.out.println("Armut kaç kilogram? ");
        double armutKg = input.nextDouble();

        System.out.println("Elma kaç kilogram? ");
        double elmaKg = input.nextDouble();

        System.out.println("Domates kaç kilogram? ");
        double domatesKg = input.nextDouble();

        System.out.println("Muz kaç kilogram? ");
        double muzKg = input.nextDouble();

        System.out.println("Patlıcan kaç kilogram? ");
        double patlicanKg = input.nextDouble();

        // Toplam tutarın hesaplanması
        double totalPrice = (armutPrice * armutKg) + (elmaPrice * elmaKg) + (domatesPrice * domatesKg)
                + (muzPrice * muzKg) + (patlıcanPrice * patlicanKg);

        // Toplam tutarın ekrana yazdırılması
        System.out.println("Toplam Tutar: " + totalPrice + " TL");


    }
}
