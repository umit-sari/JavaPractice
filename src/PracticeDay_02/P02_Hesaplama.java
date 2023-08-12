package PracticeDay_02;

import java.sql.SQLOutput;
import java.util.Scanner;

public class P02_Hesaplama {
    public static void main(String[] args) {
        /*Kullanıcıdan üçgenin kenarını ve o kenarın yüksekliğini
        girmesini isteyerek üçgenin alanını hesaplayıp yazdırın
        */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen üçgenin kenar uzunlugunu giriniz");
        double uzunluk= scanner.nextDouble();
        System.out.println("o kenara ait yüksekliği giriniz");
        double yukseklik= scanner.nextDouble();
        System.out.println("Bilgileri girilen üçgenin alani:"+(uzunluk*yukseklik/2));





    }
}
