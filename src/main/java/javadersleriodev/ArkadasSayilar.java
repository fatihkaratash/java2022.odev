package javadersleriodev;

import java.util.Scanner;

public class ArkadasSayilar {
    //220 - 284 :: kendileri hariç pozitif tam bölenleri toplamı = birbirine eşit

    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.println("ilk sayıyı giriniz");
        int number1 = girdi.nextInt();

        int max1 = 0;
        for (int i = 1; i < number1; i++) {
            if (number1 % i == 0) {
                max1 = i + max1;
            }
        }
        System.out.println("bölenlerinin toplamı : " + max1);

        System.out.println("ikinci sayıyı giriniz");
        int number2 = girdi.nextInt();

        int max2 = 0;
        for (int i = 1; i < number2; i++) {
            if (number2 % i == 0) {
                max2 = i + max2;
            }
        }
        System.out.println("bölenlerinin toplamı : " + max2);

        if (number1 == max2 && number2 == max1) {
            System.out.println("Arkadaş sayılar");
        } else {
            System.out.println("Arkadaş sayı değiller");
        }
        //if içinde if veya if && if
    }
}
