import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String cont = "E";
        int subject = 0;
        String not ;
        double topOrt =0;

        int ort = 0;
        int kredi = 0;
        int kredisay=0;
        while(cont.equalsIgnoreCase("E")){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ders kredisini giriniz : ");
            kredisay = scanner.nextInt();
            kredi+=kredisay;
            System.out.println("Dersten aldiginiz notu giriniz : ");
            not = scanner.next();
            if(not.equalsIgnoreCase("AA")){
                topOrt+=4*(float)kredisay;
            }if(not.equalsIgnoreCase("BA")){
                topOrt+=3.5*(float)kredisay;
            }if(not.equalsIgnoreCase("BB")){
                topOrt+=3*kredisay;
            }if(not.equalsIgnoreCase("BC")){
                topOrt+=2.5*kredisay;
            }if(not.equalsIgnoreCase("CC")){
                topOrt+=2*kredisay;
            }if(not.equalsIgnoreCase("CD")){
                topOrt+=1.5*kredisay;
            }if(not.equalsIgnoreCase("DD")){
                topOrt+=1*kredisay;
            }if(not.equalsIgnoreCase("DF")){
                topOrt+=0.5*kredisay;
            }if(not.equalsIgnoreCase("FF")){
                topOrt+=0*kredisay;
            }
            System.out.println("Ders giricekseniz e girmeyecekseniz h yazın");
            cont = scanner.next();
            subject++;
        }
        System.out.println("Aldığı ders sayısı : "+subject+"\nKredi sayısı : "+kredi+"\nAGNO : "+(topOrt/(kredi)));
        if(topOrt/kredi<=4&&topOrt/kredi>=3.5){
            System.out.println("Yuksek basari belgesi kazandiniz");
        } else if (topOrt/kredi<=3.5&&topOrt/kredi>=3) {
            System.out.println("Basari belgesi kazandiniz");
        }
    }
}