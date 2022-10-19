public class Main {
    public static void main(String[] args) {

        //double[] myList = new double[4];
        double[] myList = {1.2, 7.5, 4.8, 5.3};
        double total = 0;
        double max = myList[0];

        for (double number : myList) {
            if (max < number) {
                max = number;
            }
            total = total + number;
            System.out.println(number);
            //System.out.println("Total: "+total);
        }
        System.out.println("Total: " + total);
        System.out.println("En Büyük: " + max);
        System.out.println("------------------");

    }
}