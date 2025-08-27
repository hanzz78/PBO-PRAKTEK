
public class soal3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukan jumlah case yang ingin dicoba = ");
        int T = sc.nextInt(); // jumlah test case
        
        
        for (int i = 0; i < T; i++) {
            System.out.print("masukan angka yang ingin dicek = ");
            String numStr = sc.next(); // baca angka sebagai string (bisa super besar)
            
            try {
                // coba parsing ke long
                long n = Long.parseLong(numStr);
                System.out.println(n + " can be fitted in:");
                
                // cek satu per satu dari kecil ke besar
                if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                // pasti bisa kalau sudah masuk long
                System.out.println("* long");
                
            } catch (NumberFormatException e) {
                // kalau gak muat di long, berarti terlalu besar/kecil
                System.out.println(numStr + " can't be fitted anywhere.");
            }
        }
    }
}

