import java.util.Scanner;

public class soal7{
    public static void main(String[] args) {
        System.out.println("masukan 2 huruf = ");
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        String B = sc.nextLine();
        
        // 1. Jumlah panjang string
        int totalLength = A.length() + B.length();
        System.out.println(totalLength);
        
        // 2. Perbandingan leksikografis
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        // 3. Kapitalisasi huruf pertama
        String capitalizedA = A.substring(0,1).toUpperCase() + A.substring(1);
        String capitalizedB = B.substring(0,1).toUpperCase() + B.substring(1);
        System.out.println(capitalizedA + " " + capitalizedB);
        
        sc.close();
    }
}
