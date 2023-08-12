package PracticeDay_05;

import java.util.Scanner;

public class P02_IstenenKadarYazdırma {
    public static void main(String[] args) {
        /*
         * Kullanicidan 3 harften uzun bir kelime ve 10'dan kucuk bir sayi alin,
         * Kelimenin son 2 harfini girilen sayi kadar yan yana yazdirin

         */

        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen Bir kelime giriniz: ");
        String kelime= scan.next();
        System.out.print("Lütfen bir rakam giriniz :");
        int rakam= scan.nextInt();
        String sonIkıHarf=kelime.substring(kelime.length()-2);
        if (rakam<=9) {
            for (int i = 1; i <=rakam; i++) {
                System.out.println(sonIkıHarf);

            }
        }else{
            System.out.println("Girdiğiniz rakam degildir.Rakamlar 0,1,2,3,4,5,6,7,8,9 ile sınırlıdır");
        }


    }
}
