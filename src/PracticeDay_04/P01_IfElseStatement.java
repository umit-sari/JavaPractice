package PracticeDay_04;

import java.awt.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class P01_IfElseStatement {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Üçgen için kenar uzunlukları giriniz ");
        System.out.print("1.kenar degerini girin :");
        double a= scanner.nextDouble();
        System.out.print("2.kenar degerini girin :");
        double b= scanner.nextDouble();
        System.out.print("3.kenar degerini girin :");
        double c= scanner.nextDouble();


       // if((a*a)+(b*b)==(c*c)){
         //  System.out.println("Dik üçgendir");
       // } else if ((a*a)+(c*c)==(b*b)) {
           // System.out.println("Dik üçgendir");
        //}else if ((b*b)+(c*c)==(a*a)){
          //  System.out.println("Dik üçgendir");

        //}else{
           // System.out.println("dik üçgen değildir");

        System.out.println("=============== 2.çözüm================");

        if ( (a*a)+(b*b)==(c*c) || (c*c)+(b*b)==(a*a) || (a*a)+(c*c)==(b*b)){
            System.out.println("Dik üçgendir");

        }else{
            System.out.println("Dik üçgen değildir");
        }
        }

}
