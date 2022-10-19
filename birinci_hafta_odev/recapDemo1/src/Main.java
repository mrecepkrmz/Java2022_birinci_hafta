public class Main {
    public static void main(String[] args) {

        int sayi1 =20;
        int sayi2 =25;
        int sayi3 =45;

        int enBuyuk = sayi1;

        if(enBuyuk<sayi2){
            enBuyuk=sayi2;
            System.out.println("En Buyuk: "+enBuyuk);
        }
        if(enBuyuk<sayi3){
            enBuyuk=sayi3;
            System.out.println("En Buyuk: "+enBuyuk);
        }
    }
}