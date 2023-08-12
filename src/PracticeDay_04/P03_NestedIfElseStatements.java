package PracticeDay_04;

import java.util.Scanner;

public class P03_NestedIfElseStatements {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Üçgen için kenar uzunlukları giriniz ");
        System.out.print("1.kenar :");
        double a= scanner.nextDouble();
        System.out.print("2.kenar :");
        double b= scanner.nextDouble();
        System.out.print("3.kenar :");
        double c= scanner.nextDouble();

        if (a>0 && b>0 && c>0){
            if (a==b||b==c||a==c){
                System.out.println("ikiz kenarlı üçgendir");
            }else{
                System.out.println("ikiz kenarlı üçgen değildir");
            }
        }else{
                System.out.println("hatalı giriş yaptınız");
        }
    }
}
