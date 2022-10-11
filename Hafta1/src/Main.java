import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Scanner scanname = new Scanner(System.in);
        System.out.println("Please write name");
        String Name = scanname.nextLine();
        System.out.println("Welcome : "+Name);
        */

        /*
        Scanner scan = new Scanner(System.in);
        System.out.println("Please write length");
        double length = scan.nextDouble();
        double alan = Math.PI*Math.pow(length,2);
        double evnvironment = 2*Math.PI*length;
        System.out.println("Yaricapi verilen dairenin alanı : "+alan+"\nCevresi : "+evnvironment);
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Iki sayi giriniz");
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        float harmonikOrt = (float) (2 * n1 * n2) / (n1 + n2);
        System.out.println("Harmınik ortalama : " + harmonikOrt);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Dort haneli sayiyi giriniz");
        int number = scan.nextInt();
        int b1 = number % 10;
        int b2 = (number % 100 - b1) / 10;
        int b3 = (number % 1000 - b2 * 10 - b1) / 100;
        int b4 = (number - b3 * 100 - b2 * 10 - b1) / 1000;
        System.out.println("Sayi basamkalari toplami : " + (b1 + b2 + b3 + b4));

        Scanner scanning = new Scanner(System.in);
        System.out.println("Kdv orani giriniz");
        int kdv = scan.nextInt();
        System.out.println("Tutar giriniz");
        int tutar = scan.nextInt();
        float kdvharic = (float) tutar - ((float)tutar * kdv / 100);
        float kdvsadece = (float) tutar - kdvharic;
        System.out.println("Kdv haric tutar : " + kdvharic);
        System.out.println("Kdv tutari : " + kdvsadece);

    }
}