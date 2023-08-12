package PracticeDay_02;

import java.sql.SQLOutput;
import java.util.Scanner;

public class P01_Scanner {
    public static void main(String[] args) {
        /*
    1- Kullanıcıdan ad/soyad/yas/mail adresi/şifre bilgileirini alıp
    sisteme kaydedildiğini aşağıdaki formatta yazdırın.
    *****       KAYIT BAŞARILI      *****
    Adınız: Tarık
    Soyadınız: Yiğit
    Yaşınız:42
    Mail Adresiniz:tarik@yigit.com
    Şifreniz: A2e365
    şeklinde sistemimize kaydınız başarıyla tamamlanmıştır.
    */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen asagidaki bilgileri giriniz");
        System.out.print("Adiniz: ");
        String name= scan.nextLine();
        System.out.println("");
        System.out.print("Soyadiniz: ");
        String surName=scan.nextLine();
        System.out.println(); // 22 satır ile aynı şeyi ifade ediyor.
        System.out.print("Yasiniz: ");
        int age=scan.nextInt();
        System.out.println();
        System.out.print("Mail adresiniz: ");
        String mail=scan.next();
        System.out.println();
        System.out.print("Şifreniz: ");
        String pass=scan.next();
        System.out.println();
        System.out.println("*****       KAYIT BAŞARILI      *****");
        System.out.println("Adınız: "+name);
        System.out.println("Soyadınız: "+surName);
        System.out.println("Yaşınız: "+age);
        System.out.println("Mail Adresiniz: "+mail);
        System.out.println("Şifreniz: "+pass);
        System.out.println("şeklinde sistemimize kaydınız başarıyla tamamlanmıştır.");


        /*
        Scanner scanner = new Scanner(System.in);
            System.out.print("Adınızı Soyadınız: ");
            String name = scanner.nextLine();
            System.out.print("Yaşınız: ");
            int age = scanner.nextInt();

            //scanner.nextInt() ile değer aldıktan sonra  scanner.nextLine(); ile değer istenirse sorun çıkıyor.
            Atlama problemi oluşuyor.
            Sorunu çözmek için alttaki satır ekleniyor. Bu satırsonu arabellekte kalan karakteri kullanalım.
            Alttaki satırı yoruma alarak çalıştırıp sorunu görebilirsiniz.

            System.out.print("Mesleğiniz nedir?: ");
            String job = scanner.nextLine();
            System.out.printf("Güzel bir meslek: "+ job);
            scanner.close();
         */



    }
}
