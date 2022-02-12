package soal6;
import java.util.*;

public class soal6 {
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);//input stream
        System.out.print("Ketik string 1: ");
        String str1= sc.nextLine();
        System.out.print("Ketik string 2: ");
        String str2= sc.nextLine();
        sc.close();
        System.out.print("String 1: " + str1 + "\nString 2: " + str2);

        int panjang1 = str1.length();
        int panjang2 = str2.length();

        System.out.print("\n\nPanjang string 1 :"  + panjang1 + "\nPanjang string 2 : " + panjang2);
        int lexo = str1.compareToIgnoreCase(str2);
        if (lexo <0) {
            System.out.print("\n\nYes");   
        } else if (lexo > 0) {
            System.out.print("\n\nNo");   
        } else{
            System.out.print("\nLexographically same");   
        }

        System.out.println("\n\n" + kapital(str1)+ " " + kapital(str2));

    }


public static String kapital(String str){
    if(str == null || str.isEmpty()) {
        return str;
    }

    return str.substring(0, 1).toUpperCase() + str.substring(1);
}

}