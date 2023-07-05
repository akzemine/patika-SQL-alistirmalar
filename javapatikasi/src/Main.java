import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notu: ");
        mat = input.nextInt();
        System.out.println(mat);

        System.out.print("Fizik notu: ");
        fizik = input.nextInt();

        System.out.print("Kimya notu: ");
        kimya = input.nextInt();

        System.out.print("Türkçe notu: ");
        turkce = input.nextInt();

        System.out.print("Tarih notu: ");
        tarih = input.nextInt();

        System.out.print("Müzik notu: ");
        muzik = input.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6.0;
        System.out.println("Ortalama: " + sonuc);

        boolean kosul1 = sonuc > 60;

        String str = kosul1 ? "Geçti" : "Kaldı";
        System.out.println(str);
    }
}