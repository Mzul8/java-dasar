public class Minggu11_Kalkulator {
    public static int tambah(int a, int b) {
        return a + b;
    }

    public static int kurang(int a, int b) {
        return a - b;
    }

    public static int bagi(int a, int b) {
        return a / b;
    }

    public static int kali(int a, int b) {
        return a * b;
    }

    public static int modulus(int a, int b) {
        return a % b;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 2;

        System.out.println("Hasil Penjumlahan : " + a + " + " + b + " = " + tambah(a, b));
        System.out.println("Hasil Pengurangan : " + a + " - " + b + " = " + kurang(a, b));
        System.out.println("Hasil Pembagian   : " + a + " / " + b + " = " + bagi(a, b));
        System.out.println("Hasil Perkalian   : " + a + " * " + b + " = " + kali(a, b));
        System.out.println("Hasil Modulus     : " + a + " % " + b + " = " + modulus(a, b));
    }
}
