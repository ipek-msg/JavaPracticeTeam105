package day02;

import java.util.Scanner;

public class Q2_Scanner_IfStatements {

    /*
    bir dersten vize,final ve devam puanlarını girip ortalamayı hesapladıktan sonra
    dersten geçilip geçilmedigini consola yazdıran bir program yazın

     */
    //ortalama =vizenin %10 'u + finalin %80 'ni + ortalama puanının %10'u


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double vize, finalNotu, devam;

        System.out.println("Vize Notunuzu Giriniz : " );
        vize = scan.nextDouble();
        System.out.println("Final Notunuzu Giriniz : ");
        finalNotu = scan.nextDouble();
        System.out.println("Devam Notunuzu Giriniz : ");
        devam= scan.nextDouble();


        double ort = (vize * 0.1) + (finalNotu * 0.8) + (devam * 0.1);//burada yüzdeliklerini aldık
         //adını değiştirmek için sağ tıkla refactor re name olarak bütün verdiğiniz isimleri değistirebilriiz
        // soutv yapınca yazdıracagınız ort final devam yazdırabilirsiniz otomatik olarak

        if (ort >= 100 || ort < 0) {
            System.out.println("Yanlıs giriş yaptınız");
        } else if (ort >= 70) {
            System.out.println("Ortalamanız :" + ort + " Tebrikler ,çalışkan"); }
        else if (ort >= 60) {
            System.out.println("Ortalamanız :" + ort +" Sartlı gectiniz Ganonunuz 1.8'in üzerindeyse gecmiş olursunuz");}
        else System.out.println("Ortalamanız :" + ort +" Bu sefer olmadı müjgan ");

            {

            }

        }
    }

