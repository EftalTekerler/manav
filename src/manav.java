import java.net.BindException;
import java.util.Scanner;
public class manav {
    public static void main(String[] args) {
        double  Armut=2.14,Elma=3.67,Domates=1.11 ,Muz=0.95,Patlican=5.00,armutMiktari,
                elmaMiktari,domatesMiktari,muzMiktari,patlicanMiktari,toplamTutar;
            Scanner input = new Scanner(System.in);
            System.out.println(" Armut Kaç Kilo ? = ");
            armutMiktari = input.nextDouble();
        Scanner inputt = new Scanner(System.in);
        System.out.println(" Elma Kaç Kilo ? = ");
        elmaMiktari = input.nextDouble();
        Scanner inputtt = new Scanner(System.in);
        System.out.println(" Domates Kaç Kilo ? = ");
        domatesMiktari = input.nextDouble();
        Scanner inputttt = new Scanner(System.in);
        System.out.println(" Muz Kaç Kilo ? = ");
        muzMiktari = input.nextDouble();
        Scanner inputttttt = new Scanner(System.in);
        System.out.println(" Patlıcan Kaç Kilo ? = ");
        patlicanMiktari = input.nextDouble();
        toplamTutar =((armutMiktari*Armut)+(Elma*elmaMiktari)+(Domates*domatesMiktari)+(Muz+muzMiktari)+
        (Patlican*patlicanMiktari));
        System.out.println(toplamTutar);
    }
}
