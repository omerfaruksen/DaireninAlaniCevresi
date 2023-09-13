import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        //Değişkenleri tanımladık
        int r;
        double cevre, alan, pi=3.14;
        //Kullanıcıdan veri aldık
        Scanner input=new Scanner(System.in);
        System.out.print("Dairenin yarıçap değerini giriniz: ");
        r= input.nextInt();
        //Formüller
        cevre=2*pi*r;
        alan=pi*r*r;
        System.out.println("Dairenin alanı: " +alan);
        System.out.println("Dairenin çevresi: " +cevre);
    }
}
