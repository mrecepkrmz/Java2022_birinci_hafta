public class Main {
    public static void main(String[] args) {

        String message = "Bugün Hava Çok Güzel.";
        System.out.println(message);

        /*System.out.println("--------------------");
        System.out.println("Eleman Sayısı: " +message.length());
        System.out.println("--------------------");
        System.out.println("5. Eleman : " +message.charAt(4));
        System.out.println("--------------------");
        System.out.println(message.concat(" Yaşasın! "));
        System.out.println("--------------------");
        System.out.println(message.startsWith("B"));
        System.out.println("--------------------");
        System.out.println(message.endsWith("."));
        System.out.println("--------------------");
        char[] karakterler = new char[5];
        message.getChars(0,5,karakterler,0);
        System.out.println(karakterler);
        System.out.println("--------------------");
        System.out.println(message.indexOf('a'));
        System.out.println(message.lastIndexOf('a'));*/

        System.out.println("--------------------");
        System.out.println(message.replace(' ','-'));
        System.out.println("--------------------");
        String newMessage = message.replace(' ','_');
        System.out.println(newMessage);
        System.out.println("--------------------");
        System.out.println(message.substring(2));
        System.out.println("--------------------");
        System.out.println(message.substring(2,4));
        System.out.println("--------------------");
        for (String kelime: message.split(" ")){
            System.out.println(kelime);
        }
        System.out.println("--------------------");
        System.out.println(message.toLowerCase());
        System.out.println("--------------------");
        System.out.println(message.toUpperCase());
        System.out.println("--------------------");
        System.out.println(message.trim());

    }
}