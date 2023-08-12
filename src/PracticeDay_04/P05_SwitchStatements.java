package PracticeDay_04;

import java.util.Scanner;

public class P05_SwitchStatements {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bugün günlerden hangi gün");
        String gun=scanner.nextLine();
        gun=gun.toLowerCase();
        switch (gun){ //switch case'de case sayı ise direk yazılır case metin ise " " arasında char ' ' arasında yazılır
            case"pazartesi":
                System.out.println(gun+ " " + "haftanın 1.günüdür");
                break;
            case"salı":
                System.out.println(gun +" " + "haftanın 2.günüdür");
                break;
            case"carsamba":
                System.out.println(gun+" " + "haftanın 3.günüdür");
                break;
            case"persembe":
                System.out.println(gun+ " " + "haftanın 4.günüdür");
                break;
            case"cuma":
                System.out.println(gun +" " + "haftanın 5.günüdür");
                break;
            case"cumartesi":
                System.out.println(gun+ " " + "haftanın 6.günüdür");
                break;

            case"pazar":
                System.out.println(gun+ " " + "haftanın 7.günüdür");
                break;
            default:
                System.out.println("gün bilgisi hatalıdır");

        }

    }
}
