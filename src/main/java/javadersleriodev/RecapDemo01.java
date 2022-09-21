package javadersleriodev;

public class RecapDemo01 {
    public static void main(String[] args) {
        int number1=20, number2=20, number3=25;
        String message = "En buyuk sayı: ";

        if (number1>=number2 && number1>=number3){
            System.out.println(message + number1);
        }else if (number2>=number1 && number2>=number3){
            System.out.println(message + number2);
        } else if(number3>=number1 && number3>=number2) {
            System.out.println(message + number3);
        } // veya > yerine >= yaptık çünkü eşitlik durumu bozmasın diye
        System.out.println();

        //*BUG*if else if else if else = sadece tek durumu doğru kabul eder.  if if if yaparsak sürekli yeni değer atamış oluruz

        /*
        -elindeki veriler ne?
        -hangi veri isteniyor?   =  istenen veriyi tanımlamak işi kolaylaştırır
        -nasıl bulabilirim ve nasıl daha kısa/iyi yapabilirim?
         */

        //Video çözümü:
        int biggestNumber=number1;

        if (biggestNumber<number2){
            biggestNumber= number2;
        }
        if (biggestNumber<number3){
            biggestNumber=number3;
        }
        System.out.println("En büyük sayı = " + biggestNumber);


        //if()  çünkü conditionu içine yazacağız sonra {body}
        // else () olmaz çünkü durumu zaten if'te belirttik



    }
}
