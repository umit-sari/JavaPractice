package PracticeDay_02;

import java.util.Scanner;

public class P03_Swap {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen iki adet sayı giriniz");
        System.out.print("Birinci Sayı: ");
        double sayi1= scanner.nextDouble();
        System.out.print("İkinci Sayı: ");
        double sayi2= scanner.nextDouble();
        System.out.println("Girdiğiniz 1. Sayı:"+sayi1+"'dir\n" +
                "Girdiğiniz 2. sayı: "+sayi2+"'dir");
        System.out.println("------- Hokus Pokus -------");
        //sayi1=10 sayi2=15
        sayi1=sayi1+sayi2;   //sayi1=25
        sayi2=sayi1-sayi2;  //sayi2=10
        sayi1=sayi1-sayi2;  //sayi1=15
        System.out.println("Girdiğiniz değerler yer değiştirdi\n"+"1. Sayı: "+sayi1+" oldu\n"
                +"2. Sayı: "+sayi2+" oldu");
    }
}
