import java.util.Scanner;

public class PRModul13C {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("Masukkan bilangan bulat pertama: ");
        int a = input.nextInt();

        System.out.print("Masukkan bilangan bulat kedua: ");
        int b = input.nextInt();

        // Perbandingan
        System.out.println(a + " == " + b + ": " + (a == b)
                + " - kedua bilangan sama");

        System.out.println(a + " != " + b + ": " + (a != b)
                + " - kedua bilangan tidak sama");

        System.out.println(a + " > " + b + ": " + (a > b)
                + " - bilangan pertama lebih besar");

        System.out.println(a + " >= " + b + ": " + (a >= b)
                + " - bilangan pertama lebih besar atau sama dengan");

        System.out.println(a + " < " + b + ": " + (a < b)
                + " - bilangan pertama lebih kecil");

        System.out.println(a + " <= " + b + ": " + (a <= b)
                + " - bilangan pertama lebih kecil atau sama dengan");

        input.close();
    }
}
