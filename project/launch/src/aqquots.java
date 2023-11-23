import  java.util.Scanner;
public class aqquots {
    public static void main(String[] args) {


        int mat, fizik, turkce, kimya, muzik;
        String kural ;
        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik Notunuz :");
        mat = inp.nextInt();

        System.out.print("Fizik Notunuz :");
        fizik = inp.nextInt();

        System.out.print("Türkçe Notunuz :");
        turkce = inp.nextInt();

        System.out.print("Kimya Notunuz :");
        kimya = inp.nextInt();


        System.out.print("Müzik Notunuz :");
        muzik = inp.nextInt();


        double avarage = (mat + fizik + muzik + turkce + kimya) / 5;
        if (avarage <= 55) {
            System.out.println("Sınıfta kaldınız !");
        } else {
            System.out.println("Tebrikler Başarıyla Geçtiniz !!");
        }
        System.out.println("Ortalamanız :" + avarage);






    }
}