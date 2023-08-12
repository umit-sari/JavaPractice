package PracticeDay_05;

import java.util.Scanner;

public class P05_forLoop {
    public static void main(String[] args) {
      /*
         Kullanicidan 150'den küçük pozitif bir sayi alin, 1’den baslayarak tum
        tamsayilari yazdirin, sira
        - 3 ile bolunebilen bir sayiya gelirse, sayi yerine WISE
        - 5 ile bolunebilen bir sayiya gelirse sayi yerine QUARTER
        - hem 3 hem 5 ile bolunebilen bir sayiya gelirse sayi yerine WISE QUARTER
        yazdirin
     */
            Scanner scan=new Scanner(System.in);
            System.out.print("Lütfen 150'den küçük pozitif bir sayı giriniz: ");
            int sayi= scan.nextInt();
            // 15 girilirse
            //1 2 WISE4 QUARTERWISE7 8 WISEQUARTER 11 WISE13 14 WISE- önce  3 ve 5 e bölümü yazmazsak
            //1 2 WSIE4 QUARTERWSIE7 8 WSIEQUARTER 11 WSIE13 14 WISE QUARTER
            for (int i = 1; i <=sayi ; i++) {
                if(i%3==0&&i%5==0){
                    System.out.print("WISE QUARTER ");
                } else if (i%5==0) {
                    System.out.print("QUARTER ");
                } else if (i%3==0) {
                    System.out.print("WISE ");
                }else{
                    System.out.print(i+" ");
                }
            }
    }
}
