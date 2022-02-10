package soal1;
import java.io.*;
/**
* <h1>Subtract Two Numbers!</h1>
* The Subtract program implements an application that
* simply subtract two given integer numbers and prints
* the output on the screen.
* <p>

* <b>Note:</b> Giving proper comments in your program makes it more
* user friendly and it is assumed as a high quality code.
*
* @author Raditya Pasya Heryandi
* @version 1.1
* @since 2022-02-10
*/
public class soal1 {
 /**
 * This method is used to add two integers. This is
 * a the simplest form of a class method, just to
 * show the usage of various javadoc Tags.
 * @param numA This is the first paramter to addNum method
 * @param numB This is the second parameter to addNum method
 * @return int This returns sum of numA and numB.
 */
 public int subtNum(int numA, int numB) {
 return numA - numB;
 }

 /**
 * This is the main method which makes use of addNum method.
 * @param args Unused.
 * @exception IOException On input error.
 * @see IOException
 */

 public static void main(String args[]) throws IOException {
 soal1 obj = new soal1();
 int hasil = obj.subtNum(10, 20);
 System.out.println("Sum of 10 and 20 is :" + hasil);
 }

}