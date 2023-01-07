package day02;

import java.util.Scanner;

public class Q1_Scanner_IfStatement {


    /*
     *Write a Java Program that asks to user 2 questions Question
     *Question 1 =how many tea do you drink in a day?Question
     * Question 2=how many sugar do you use for a glass of tea?
     *
     * Calculate how many sugar does user use as kilogramm in a year in 40 years
     * then print it on the console
     * ıf user doesn't use sugar print "Good Job, less sugar more health"
     *
     * (Hint 1 sugar =2.7 gr)
     *
     */
    /*
    kullanıcıya
     1 = günde kaç bardak çay içtiğini,
     2 = her bardak icin kac kup seker kullandıgını sorup,

     kullanıcının yıllık ve 40 yıllık seker tuketimini kg bazında
      consolda yazdıran bir program yazin.
      kullanıcı seker kullanmıyorsa"Aferin böyle devam et :)" cıktısını yazdırın
      (1 kup seker =2.77 gr)
     */
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Günde kaç bardak çay içersiniz?");
        double bardak = scan.nextDouble();

        System.out.println("bir bardağa kaç şeker kullanırsınız?");
        double seker = scan.nextDouble();


        double yillikTuketimKG = (bardak * seker * 2.77) * 365 / 1000; //1000 kullanmamızın nedeni
                                                                      // kg bazında aldıgımız icin
        double kirkyillikTuketim = yillikTuketimKG * 40;

        if (seker == 0) {
            System.out.println("Aferin böyle devam et :)");
        }else{
            System.out.println("Yıllık seker tuketiminiz : "+ yillikTuketimKG + " kg 'dir.  \n" +
                    "40 yillik seker tuketiminiz : "+ kirkyillikTuketim +"kg ' dir .");
    }
}
}


