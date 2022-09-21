package javadersleriodev;

import java.util.Scanner;

public class SayiBulma {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 5, 7, 9};

        Scanner input = new Scanner(System.in);
        System.out.println("Sayı giriniz");
        int find = input.nextInt();

        boolean exist = false;

        for (int finder : numbers) {
            if (find == finder) {
                exist = true;
                break; //true yakalayınca döngü biter . yakalamazsa tek tek hepsini tarar ve dizi bitince biter
            }
        }
        if (exist) {
            System.out.println(find + " Dizinin içinde var");
        } else {
            System.out.println(find + " Dizinin içinde yok");
        }
    }
}
