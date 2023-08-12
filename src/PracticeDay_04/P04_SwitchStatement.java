package PracticeDay_04;

import java.util.Scanner;

public class P04_SwitchStatement {
    public static void main(String[] args) {
        /*
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen dogum tarihinizdeki aya ait rakamı giriniz");
        int ay = scanner.nextInt();
        switch (ay) {
            case 1:
                System.out.println("ocak");
                break;
            case 2:
                System.out.println("subat");
                break;
            case 3:
                System.out.println("mart");
                break;
            case 4:
                System.out.println("nisan");
                break;
            case 5:
                System.out.println("mayıs");
                break;
            case 6:
                System.out.println("haziran");
                break;
            case 7:
                System.out.println("temmuz");
                break;
            case 8:
                System.out.println("agustos");
                break;
            case 9:
                System.out.println("eylül");
                break;
            case 10:
                System.out.println("ekim");
                break;
            case 11:
                System.out.println("kasım");
                break;
            case 12:
                System.out.println("aralık");
            default:
                System.out.println("hatalı ay girişi yaptınız");

        }
    }
}
