import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Doğum yılınızı giriniz: ");
        int yil = input.nextInt();

        String[] cinZodyagi = {"Maymun", "Horoz", "Köpek", "Domuz", "Fare", "Öküz", "Kaplan", "Tavşan", "Ejderha", "Yılan", "At", "Koyun"};

        int indeks = yil % 12;
        String burc = cinZodyagi[indeks];

        System.out.println("Çin Zodyağı burcunuz: " + burc);

        input.close();
    }
}
