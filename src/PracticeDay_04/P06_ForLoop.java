package PracticeDay_04;

import java.util.Scanner;

public class P06_ForLoop {
    /*
    Kulanıcıdan sıfırdan farklı pozitif bir tam sayı alalım ve 1'den o sayıya kadar olan sayılardan
    4 ile bölünebilenleri yazıdırın
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir tam sayı giriniz");
        int girilenSayi= scanner.nextInt();
            if (girilenSayi<=0){
                System.out.println("Yanlıs giris yaptınız");
            }else{
                for (int i = 1; i <=girilenSayi ; i++)
                    if (i%4==0){
                    System.out.print(i+"-");
            }

        }

    }
}
