package PracticeDay_03;

import java.util.Scanner;

public class P01_IfElseStatements {
    public static void main(String[] args) {
        /*
        Kullanicidan mesafeyi kilometre olarak alin ve cevirmek istedigi birimi
        sorun, istedigi birim metre veya santimetre ise cevirip yazdirin, yoksa
      "istediginiz birim sisteme kayitli degil" yazdirin.
     */
        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen mesafeyi km olarak giriniz: ");
        double km= scan.nextDouble();
        System.out.println("Dönüştürnek istediğiniz birim cinsini yazınız: ");
        char birim=scan.next().charAt(0);
        if (birim=='m'|| birim=='M'){
            System.out.println("Girdiğiniz KM degeri: "+km*1000+" m'dir");
        } else if (birim=='s'|| birim=='S'|| birim=='c'|| birim=='C') {
            System.out.println("Girdiğiniz Km degeri: "+ km*100000+" cm'dir");

        }else{
            System.out.println("Hatali birim girdiniz");
        }

        /*
       Not: Birden fazla if,elseif,else durumlarında en son adıma bakılır.
           else ile ile bitiyorda if else bloğu tüm ihtimalleri kapsamalıdır.
           else ile bitiyorsa kapsanmayan ihtimaller de vardır.
         */


    }

}
