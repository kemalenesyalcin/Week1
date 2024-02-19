import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan boy ve kilo bilgilerinin alınması
        System.out.print("Lütfen Boyunuzu Giriniz (metre cinsinden): ");
        double boy = input.nextDouble();

        System.out.print("Lütfen Kilonuzu (kilogram cinsinden): ");
        double kilo = input.nextDouble();

        // Vücut kitle İndeksinin(BMI)'nin hesaplanması
        double bmi = kilo / (boy * boy);

        // BMI'nin ekrana yazdırılması
        System.out.println("Vücut Kitle Endeksiniz (BMI): " + bmi);

        // BMI değerine göre tahmini bir kategorinin belirlenmesi ve ekrana yazdırılması
        if (bmi < 18.5) {
            System.out.println("Durumunuz: Zayıf");
        } else if (bmi < 25) {
            System.out.println("Durumunuz: Normal");
        } else if (bmi < 30) {
            System.out.println("Durumunuz: Kilolu");
        } else {
            System.out.println("Durumunuz: Obez");
        }

    }
}
