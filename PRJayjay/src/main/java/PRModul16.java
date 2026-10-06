import java.util.Scanner;
public class PRModul16 {

    public static boolean isAnagram(String stringA, String stringB) {

        // Mengabaikan huruf besar/kecil
        stringA = stringA.toLowerCase();
        stringB = stringB.toLowerCase();

        // Jika panjang berbeda, pasti bukan anagram
        if (stringA.length() != stringB.length()) {
            return false;
        }

        // Mengubah String menjadi array karakter
        char[] arrayA = stringA.toCharArray();
        char[] arrayB = stringB.toCharArray();

        // Mengurutkan karakter
        java.util.Arrays.sort(arrayA);
        java.util.Arrays.sort(arrayB);

        // Membandingkan kedua array
        return java.util.Arrays.equals(arrayA, arrayB);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan String A Anda: ");
        String stringA = input.nextLine();

        System.out.print("Masukkan String B Anda: ");
        String stringB = input.nextLine();

        boolean hasil = isAnagram(stringA, stringB);

        System.out.println(hasil);
    }
}