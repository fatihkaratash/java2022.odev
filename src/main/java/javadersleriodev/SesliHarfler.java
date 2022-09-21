package javadersleriodev;

import java.util.Scanner;

public class SesliHarfler {
    public static void main(String[] args) {
        //Kalın sesli harfler : a  o
        //ince sesli = e i

        Scanner input = new Scanner(System.in);
        System.out.println("Harf giriniz");
        String letter = input.next().toLowerCase();


        switch (letter) {
            case "a", "o" -> System.out.println("Kalın sesli harf");
            case "e", "i" -> System.out.println("Ince sesli harf");
            default -> System.out.println("Geçersiz harf girdiniz");
        }
    }
}
