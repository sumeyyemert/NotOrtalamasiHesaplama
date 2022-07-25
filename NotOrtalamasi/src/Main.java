import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;
        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik notu : ");
        mat = inp.nextInt();

        System.out.print("Fizik notu : ");
        fizik = inp.nextInt();

        System.out.print("Kimya notu : ");
        kimya = inp.nextInt();

        System.out.print("Türkçe notu : ");
        turkce = inp.nextInt();

        System.out.print("Tarih notu : ");
        tarih = inp.nextInt();

        System.out.print("Müzik notu : ");
        muzik = inp.nextInt();

        int toplam = (mat+fizik+kimya+turkce+tarih+muzik);
        double sonuc = toplam / 6;
        System.out.println("Not ortalaması : "+sonuc);
        System.out.println( sonuc>60 ? "Sınıfı Geçti" : "Sınıfta kaldı");
    }
}