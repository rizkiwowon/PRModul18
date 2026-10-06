public class PRModul15B {
    public static void main(String[] args) {

        String[] warna = {"hitam", "biru", "putih", "merah", "kuning"};

        for (String w : warna) {
            if (w.equals("putih")) {
                continue;
            }

            System.out.println(w);
        }
    }
}