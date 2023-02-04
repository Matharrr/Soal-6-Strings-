package p2.w2soal6strings;

import java.util.Scanner;

/**
 *
 * @author Muhamad Mathar Rizqi
 */
public class P2W2Soal6Strings {
    public static void main(String[] args) {
    String A;
    String B;
    try (Scanner scan = new Scanner(System.in)) {
        A = scan.next();
        B = scan.next();
    }
    int panjang = A.length() + B.length();
    System.out.println(panjang);

    int hasil = A.compareTo(B);
    if (hasil > 0) {
        System.out.println("Yes");
    }else{
        System.out.println("No");
    }

    String kapitalA = A.substring(0, 1).toUpperCase() + A.substring(1);
    String kapitalB = B.substring(0, 1).toUpperCase() + B.substring(1);
    System.out.println(kapitalA + " " + kapitalB);
    }
}