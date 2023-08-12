package PracticeDay_05;

import java.util.Scanner;

public class P01_EkokEbob {
    public static void main(String[] args) {
        // Kullanıcıdan 2 tamsayı alın ve EBOB (En Büyük Ortak Bölen) ve
        // EKOK(En Küçük Ortak Kat) değerlerini bulun

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen pozitif 2 tam sayi giriniz");
        int number1= scanner.nextInt();
        int number2= scanner.nextInt();

        int flag=0;
        System.out.println("Girdiginiz sayilar sırasıyla:"+number1+"- "+number2);

        // once Ebob hesaplaması yapalım.
        // ilk olarak kücük sayiyi ebob degiskenine atadık.
        // Daha sonra atanan limitEbob degerini birer azaltarak en büyük ortak böleni buluyoruz.
        //30 ve 40 sayıları için 30 degerinden baslayarak azaltarak ikisini de bölebilecek en büyük sayıyı arıyoruz.
        int limitEbob=0;
        if (number1<number2){ // kucuk rakamdan daha büyük bir ortak bölen olamaz
            limitEbob=number1;
        }else{
            limitEbob=number2;
        }
        for (int i = limitEbob; i >=2; i--) {
            if (number1%i==0 && number2%i==0){
                System.out.println("Bu sayilarin ebob degeri : "+ i);
                flag++; // flag degerinin artmaması ortak bölen olmadıgı anlamına gelir
                break;
            }

        }
        if (flag==0){
            System.out.println("Bu iki sayının ortak böleni yoktur");
        }

        //Girilen sayıların Ekok değerini bulalım
        flag=0;
        //for loop yazarken 1'den başlayıp bir limit koyarak i değerini 1'er arttırarak ilerleyeceğiz.
        //System.out.println("Lütfen Ekok değeri olabilecek maksimum limiti giriniz");
        //int limit= scan.nextInt();
        for (int i = 1; i <(number1*number2) ; i++) {
            if (i%number1==0 && i%number2==0){
                System.out.println("Girdiğiniz sayıların Ekok değeri: "+ i);
                flag++;
                break;
            }
        }
        if (flag==0){
            System.out.println("Girdiğiniz sayıların bir Ekok değeri yoktur");
        }

    }
}
