package javadersleriodev;

import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        //kendinden başka tüm bolenlerinin toplamı kendisine eşitse = mukemmel sayı

        Scanner input = new Scanner(System.in);
        System.out.println("Sayı giriniz");
        int number = input.nextInt();

        //Çözüm
        int total = 0;  //toplamı bulamk için ekstra değişken

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total = total + i;
            }
        }
        if (total == number) {
            System.out.println("Perfect Number");
        } else {
            System.out.println("Not perfect number");
        }
    }
}
// verilen - istenen - hangi yöntem ...
// değişkenleri ilk belirle

