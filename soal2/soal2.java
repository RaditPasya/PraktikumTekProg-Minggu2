
import java.io.IOException;
import java.util.*;  

/**
* <h1>Soal 2 !</h1>
* Soal 2 - adalah soal yang diberikan di minggu kedua praktikum teknik pemrograman
* tujuan dari soal 2 ini adalah mengecek apabila suatu input itu dapat masuk ke data type mana saja
* dan ditunjukan di layar.
* <p>
* <b>Note:</b> Giving proper comments in your program makes it more
* user friendly and it is assumed as a high quality code.
*
* @author Raditya Pasya Heryandi
* @version 1.0
* @since 2022-02-10
*/

public class soal2{
/**
 * This method is used to check where some numbers it can be allocated into . This is
 * a the simplest form of a class method, just to
 * show the usage of various javadoc Tags.
 * @param num1 Angka yang akan di cek
 */
    public void cek(long num1){
    System.out.println("\n" + num1 + " can be fitted in:");
    if (num1 >= -128 && num1 <= 127) {
        System.out.println("* byte");
        
    }
    if (num1 >= -32768 && num1 <= 32767) {
        System.out.println("* short");
        
    }
    if (num1 >= -2147483648  && num1 <= 2147483647) {
        System.out.println("* int");
        
    }
    if (num1 >= -9223372036854775808L && num1 <= 9223372036854775807L) {
        System.out.println("* long");
    }else{
        System.out.println(num1 + " can not be fitted anywhere");
    }
    }

    /**
 * This is the main method which makes use of cek fit method.
 * @param args Unused.
 * @exception IOException On input error.
 * @see IOException
 */
    public static void main(String args[]) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan jumlah angka yang ingin di cek: ");
        int jumlah = input.nextInt();
        int[] numA= new int[jumlah];
        soal2 a = new soal2();
        

        for (int i = 0; i < jumlah; i++) {
        System.out.println("Masukan angka yang ingin di cek: ");
        numA[i] = input.nextInt();    
        }
        for (int i=0; i<jumlah; i++){
        a.cek(numA[i]);

        }
        

        
        
        input.close();
        }
}