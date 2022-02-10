package soal2;

/**
* <h1>Soal 2 !</h1>
* Soal 2 - adalah soal yang diberikan di minggu kedua praktikum teknik pemrograman
* tujuan dari soal 2 ini adalah mengecek apabila suatu input itu dapat masuk ke data type mana saja
* dan ditunjukan di layar
* <p>
* <b>Note:</b> Giving proper comments in your program makes it more
* user friendly and it is assumed as a high quality code.
*
* @author Raditya Pasya Heryandi
* @version 1.0
* @since 2022-02-10
*/

public class soal2{

    public void cek(long num1){
    System.out.println(num1 + "can be fitted in: \n");
    if (num1 >= -128 && num1 <= 127) {
        System.out.println("byte");
        
    }
    if (num1 >= -32768 && num1 <= 32767) {
        System.out.println("short");
        
    }
    if (num1 >= -2147483648  && num1 <= 2147483647) {
        System.out.println("int");
        
    }
    if (num1 >= -9223372036854775808L && num1 <= 9223372036854775807L) {
        System.out.println("long");
    }else{
        System.out.println(num1 + " can not be fitted anywhere");
    }
    }
}