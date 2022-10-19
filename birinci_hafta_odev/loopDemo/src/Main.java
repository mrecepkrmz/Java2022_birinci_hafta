public class Main {
    public static void main(String[] args) {

        //for
        for(int i=1; i<=10; i++){
            System.out.println("Merhaba Java "+i);
        }
        System.out.println("For Döngüsü Bitti");

        //while
        int i=1;
        while (i<=10){
            System.out.println("Merhaba "+i);
            i++;
        }
        System.out.println("While Döngüsü Bitti");

        //Do While
        int j=1;
        do{
            System.out.println("Java "+j);
            j++;
        }
        while (j<10);
        System.out.println("Do hile Döngüsü Bitti");
    }
}