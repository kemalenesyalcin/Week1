import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        boolean asalMi=false;

        //kullanıcıdan sayı bilgisinin alınması
        System.out.print("Asal sayi bulma programına hoşgeldiniz! Lütfen Bir sayı giriniz:");
        int number= input.nextInt();

        //sayının for döngüsü ile asal olup olmadığını kontrol etme(döngünün başı ve sonu belli olduğu için for kullanıldı)
        for(int i=2; i<number; i++){
            if(number%i==0){
                asalMi=false;
                break;
            }else{
                asalMi=true;
            }
        }
        if(asalMi){
            System.out.print("Girdiğiniz "+number+" sayisi Asal sayidir");
        }
        else{
            System.out.print("Girdiğiniz "+number+" sayisi Asal sayi değildir");
        }





    }
}