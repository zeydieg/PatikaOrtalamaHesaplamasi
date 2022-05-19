import java.util.Scanner;

public class Giris {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int mat, tarih, turkce, muzik, fizik, kimya;

        System.out.print("Matematik notunuzu giriniz:");
        mat = inp.nextInt();

        System.out.print("Tarih notunuzu giriniz:");
        tarih = inp.nextInt();

        System.out.print("Türkçe notunuzu giriniz:");
        turkce = inp.nextInt();

        System.out.print("Müzik notunuzu giriniz:");
        muzik = inp.nextInt();

        System.out.print("Fizik notunuzu giriniz:");
        fizik = inp.nextInt();

        System.out.print("Kimya notunuzu giriniz:");
        kimya = inp.nextInt();

        int toplam = (mat + tarih + turkce + muzik + fizik + kimya);
        double ortalama = (toplam / 6);

        System.out.println("Ortalamanız:" + ortalama);

        boolean sonuc = ortalama >= 60;
        String karne = sonuc ? "Geçti" : "Kaldı";
        System.out.print(karne);
    }
}
