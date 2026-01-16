import java.util.Scanner;

public class minggu3_OperasiMatematika {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan angka pertama");
        int a = input.nextInt();
        System.out.println("Masukkan angka kedua");
        int b = input.nextInt();

        System.out.println("Hasil Penjumlahan: " + a + " dengan " + b + " = " + (a+b));
        System.out.println("Hasil Pengurangan: " + a + " dengan " + b + " = " + (a-b));
        System.out.println("Hasil Perkalian: " + a + " dengan " + b + " = " + (a*b));
        System.out.println("Hasil Pembagian: " + a + " dengan " + b + " = " + (a/b));

    }
}
