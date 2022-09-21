package javadersleriodev;

public class RecapDemo02 {
    public static void main(String[] args) {
        double[] myList = {1.2, 6.3, 4.3, 5.6};  //  = new double[4];  ile aynı şey
        double total = 0;
        double max = myList[0];

        for (double number : myList) {  // myList içerisindeki değerleri gez ve ismi number olsun datası ise double
            if (max < number) {
                max = number;
            }
            total = total + number;
            System.out.println(number);
        }

        System.out.println("Toplam = " + total);
        System.out.println("En büyük = " + max);

    }
}
