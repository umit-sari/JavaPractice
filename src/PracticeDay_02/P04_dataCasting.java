package PracticeDay_02;

import java.util.Scanner;

public class P04_dataCasting {
    public static void main(String[] args) {
        //int a=3,b=8,c=9;
        //System.out.println("Sayılar toplamı:"+(double)(a+b+c));

        /*
     2- Kullanıcıdan iki double sayı alın ve ilk sayıyı ikinci sayıa bölün ve
     sonucu tam sayı yazdırın.
       */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen iki adet ondalıklı sayı giriniz");
        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();
        int sonuc= (int)(sayi1/sayi2); // data casting
        System.out.println("Sonuc:"+sonuc);




    }
}
