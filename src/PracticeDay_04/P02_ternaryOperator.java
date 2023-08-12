package PracticeDay_04;

import java.util.Scanner;

public class P02_ternaryOperator {
    public static void main(String[] args) {
        /*

         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Üçgen için kenar uzunlukları giriniz ");
        System.out.print("1.kenar :");
        double a= scanner.nextDouble();
        System.out.print("2.kenar :");
        double b= scanner.nextDouble();
        System.out.print("3.kenar :");
        double c= scanner.nextDouble();
        System.out.println((a*a)+(b*b)==(c*c) || (c*c)+(b*b)==(a*a) || (a*a)+(c*c)==(b*b)? "dik üçgendir":"dik üçgen degildir");

        System.out.println("==============2.çözüm================="); // ikizkenar için
        System.out.println(a>0&&b>0&&c>0 ?
                (a==b || b==c || a==c ? "ikizkenar üçgendir":"ikizkenar üçgen değildir"):
        "Yanlıs deger girdiniz");







    }
}
