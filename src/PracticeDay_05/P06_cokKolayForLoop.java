package PracticeDay_05;

import java.util.Scanner;

public class P06_cokKolayForLoop {
    public static void main(String[] args) {
         /*
  Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
  dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
  baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin
   */
            Scanner wise = new Scanner(System.in);
            System.out.print("Başlangıç Değerini Giriniz: ");
            int basDeger = wise.nextInt();
            System.out.print("Bitiş Değerini Giriniz: ");
            int bitDeger = wise.nextInt();
            int toplam = 0;
            if (basDeger > bitDeger) {
                System.out.println("Başlangıç değeri Bitiş Değerinden büyük olamaz");
            } else {
                for (int i = basDeger; i <= bitDeger; i++) {
                    toplam += i;
                }
                System.out.println("Girilen degeler arasındaki sayıların toplamı = "+toplam);
            }




    }
}
