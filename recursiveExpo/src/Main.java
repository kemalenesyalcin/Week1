import java.util.Scanner;

public class Main {
    static int expoFind(int base, int exponent) {
        if (exponent == 0) return 1;
        if (exponent == 1) return base;
        if (exponent < 0) return 1 ;

        // Recursive olarak üs alma işlemini gerçekleştirme
        return base * expoFind(base,exponent - 1);


    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Taban Değeri Giriniz: ");
        int base = input.nextInt();
        System.out.println("Üs Değeleri Giriniz ");
        int exponent = input.nextInt();

        int result=expoFind(base,exponent);
        System.out.print("Sonuç: "+result);


    }
}