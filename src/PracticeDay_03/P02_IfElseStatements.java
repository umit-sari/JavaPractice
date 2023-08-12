package PracticeDay_03;

import java.util.Scanner;

public class P02_IfElseStatements {
    public static void main(String[] args) {
       /*
        1- Öğrenci notunu harf notuna dönüştüren bir kod yazınız
        85-100 -----> AA
        80-85 ------> BA
        75-80 ------> BB
        65-75 ------> CB
        50-65 ------> CC
        50 Altı ise  ------> FF

       */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen öğrenci notunu giriniz");
        double not= scan.nextDouble();
        if (not>=85.0&& not<=100){
            System.out.println("Girdiğiniz"+ not+"'un harf karşılıgı AA'dır");
        } else if (not>=80&& not<85) {
            System.out.println("Girdiğiniz"+ not+"'un harf karşılıgı BA'dir");

        } else if (not>=75&& not<80) {
            System.out.println("Girdiğiniz"+ not +"un harf karşılıgı BB'dir");

        } else if (not>=65&& not<75) {
            System.out.println("Girdiğiniz"+ not+"'un harf karşılıgı CB'dir");

        } else if (not>=50&& not<65){
            System.out.println("Girdiğiniz"+ not+"'un harf karşılıgı CC'dir");

        }else{
            System.out.println("Girdiğiniz notunuzun harf karşılıgı FF'dir");
        }

    }
}
