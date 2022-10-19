public class Main {
    public static void main(String[] args) {

        char harf='i';

        switch (harf){
            case'A':
            case'I':
            case'O':
            case'U':
                System.out.println("Kalın Sesli Harf");
                break;
            default: // Yukarıdaki durumların dışında olan durumlar
                System.out.println("İnce Sesli Harf");
        }

    }
}