import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // Degiskenler olustur
        int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner inp = new Scanner(System.in);
        System.out.print("Mat Notunuz:");
        mat = inp.nextInt();

        System.out.print("Fizik Notunuz:");
        fizik = inp.nextInt();

        System.out.print("Kimya Notunuz:");
        kimya = inp.nextInt();

        System.out.print("turkce Notunuz:");
        turkce = inp.nextInt();

        System.out.print("tarih Notunuz:");
        tarih = inp.nextInt();

        System.out.print("Muzik Notunuz:");
        muzik = inp.nextInt();

        int toplam= (mat+ fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6.0;

        boolean Gecti = sonuc >= 60;
        String cevap = Gecti? "Sınıfı Geçtiniz." : "Sınıfta Kaldınız.";

        System.out.println(cevap);

        System.out.print("Ortalama Notunuz:");
        System.out.print(sonuc);

    }
}
