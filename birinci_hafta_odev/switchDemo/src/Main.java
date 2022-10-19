public class Main {
    public static void main(String[] args) {

        char grade = 'H';

        switch (grade){
            case 'A':
                System.out.println("Not Ortalaması Mükemmel");
                break;
            case 'B':
                System.out.println("Not Ortalaması Çok İyi");
                break;
            case 'C':
                System.out.println("Not Ortalaması İyi");
                break;
            case 'D':
                System.out.println("Not Ortalaması Koşullu Geçtiniz");
                break;
            case 'F':
                System.out.println("Not Ortalaması Kaldınız");
                break;
                default:
                    System.out.println("Geçersiz Not Girdiniz");
        }

    }
}