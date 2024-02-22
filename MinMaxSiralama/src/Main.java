import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a, b, c;

        //Kullanıcıdan sayıların alınamsı
        System.out.println("İlk Numarayı Giriniz");
        a = inp.nextInt();
        System.out.println("İkinci Numarayı Giriniz");
        b = inp.nextInt();
        System.out.println("Üçüncü Numarayı Giriniz");
        c = inp.nextInt();

        //Numaraların Sıralandırılması ve sonuc
        if (a > b && a > c) {
            if (b > c) {
                System.out.println("Sıralama: " + a + ", " + b + ", " + c);
            } else {
                System.out.println("Sıralama: " + a + ", " + c + ", " + b);
            }
        } else if (b > a && b > c) {
            if (a > c) {
                System.out.println("Sıralama: " + b + ", " + a + ", " + c);
            } else {
                System.out.println("Sıralama: " + b + ", " + c + ", " + a);
            }
        }else if (c > a && c > b){
            if (a > b) {
                System.out.println("Sıralama: " + c + ", " + a + ", " + b);
            } else {
                System.out.println("Sıralama: " + c + ", " + b + ", " + a);
            }
        }


    }
}