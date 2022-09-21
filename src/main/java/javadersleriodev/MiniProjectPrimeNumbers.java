package javadersleriodev;

import java.util.Scanner;

public class MiniProjectPrimeNumbers {
    public static void main(String[] args) {

        /* int number1 = 25;
        int remainder = number1 % 2; //remainder = kalan demek
        System.out.println(remainder); */

        System.out.println("ÇÖZÜM");

        Scanner input = new Scanner(System.in);
        System.out.println("Sayı giriniz");
        int number = input.nextInt();


        boolean isPrime;
        /* 1 sayısı BUG'a SEBEB oluyor
        if (number==1){
            System.out.println("Sayı asal değildir");
            return;
        }*/

        if (number < 2) {
            isPrime = false;
        } else
            isPrime = true;

        for (int i = 2; i < number; i++) { // Asal sayı kendisine bölüm hariç hiçbir şekilde kalanı 0 olmaz.
            if (number % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime) {
            System.out.println("Sayı asaldır");
        } else {
            System.out.println("Sayı asal değildir");
        }

    }
}       /*
            BİR SAYININ ASAL OLUP OLMADIGINI ANLAMAK : UZUN SUREC.
            AMA ASAL BİR SAYININ ASALLIĞINI KONTROL ETMEK DAHA KISA
            -YANİ ALGORİTMA KURARKEN *Olasılıkları Kısıtla*  /boolean
        */


//Defansif program : Olabilecek senaryolara karşı çözüm
//Çözüme ulaşırken ekstra değişken atayarak çözüm bulmak daha kolay.
