import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan bir tam sayı girişi alınır
        System.out.print("Bir tam sayı girin: ");
        int tamSayi = input.nextInt();

        // Kullanıcıdan bir ondalıklı sayı girişi alınır
        System.out.print("Bir ondalıklı sayı girin: ");
        double ondalikliSayi = input.nextDouble();

        // Tam sayıyı ondalıklı sayıya dönüştürme işlemi
        double tamSayiOndalikli = (double) tamSayi;

        // Ondalıklı sayıyı tam sayıya dönüştürme işlemi
        int ondalikliSayiTam = (int) ondalikliSayi;

        // Sonuçların ekrana yazdırılması
        System.out.println("Tam sayıyı ondalıklıya dönüştürme: " + tamSayiOndalikli);
        System.out.println("Ondalıklı sayıyı tam sayıya dönüştürme: " + ondalikliSayiTam);

    }
}
