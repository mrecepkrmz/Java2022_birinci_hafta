public class Main {
    public static void main(String[] args) {

        //kendileri hariç pozitif tam bölenleri toplamı birbirne eşit olan

        int number1 = 220;
        int number2 = 284;
        int total1 = 0;
        int total2 = 0;

        for (int i=1; i<number1; i++){
            if(number1 % i == 0){
                total1 =total1 + i;
            }
        }
        for(int j=1; j<number2; j++){
            if(number2 % j == 0){
                total2 = total2 + j;
            }
        }


        /*if(number1 == total2){
            if(number2 == total1){
                System.out.println("Bu 2 sayi arkadaş sayıdır");
            }else{
                System.out.println("Bu 2 sayi arkadaş sayı değildir");
            }
        }else{
            System.out.println("Bu 2 sayi arkadaş sayı değildir");
        }*/

        if(number1 == total2 && number2 == total1){
            System.out.println("Bu 2 sayi arkadaş sayıdır");
        }
    }
}