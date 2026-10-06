public class PRModul14 {
    public static void main(String[] args) {

        // Mengecek angka dari 1 sampai 10
        for (int angka = 1; angka <= 10; angka++) {

            if (angka < 1 || angka > 10) {
                System.out.println(angka + " = angka di luar jangkauan");
            } else if (angka % 2 != 0) {
                System.out.println(angka + " = ganjil");
            } else {
                System.out.println(angka + " = genap");
            }
        }
    }
}