package day01;

public class Q1_Print {

    /*
    konsolda  :
    "Hello " \ / 'world'"
    yazdirin
     */

    /*
    \n (or \r) :Metni alt satırdan itibaren yazdırır.//Starts from a new line
           \t  :Metni yatayda 1 tab miktari kaydirir.//Horizantal tab
           \\  :\ters slash yazdirir.                //Prints a back slash
           \'  : Tek tırnak yazdirir.                //Prints single quote
           \"  :Cift Tırnak yazdirir.                //Prints double quote
     */
    public static void main(String[] args) {
        System.out.println("\"Hello \" \\ / 'World'\""); //ters slash tümünü yazdırır
        System.out.println('\'');
        //CTRL+D hangi satırdaysa onu kopyalar
        //print satırı yazdırır
        //println aşagı indirir
        /*
        ***************************************
                " ATM 'ye  Hosgeldiniz "

            1-Bakiye Sorgulama
            2-Para Yatırma
            3-Para Cekme
            4-Menuden Cıkıs
       ******************************************
         */
        System.out.println("******************************************" +
                "\n\t\t\"ATM'ye Hosgeldiniz\""+
                "\n\n\t1-Bakiye Sorgulama" +
                "\n\t2-Para Yatırma" +
                "\n\t3-Para Cekme" +
                "\n\t4-Menuden Cıkıs\n\n" +
                "\n******************************************"); // \n boşluk ta yapıyor


        System.out.println(3+7);//burada toplama degeri olarak görür
        System.out.println("ali"+"ayse");//bu işleme concatination denir //aliayse
    }

}
