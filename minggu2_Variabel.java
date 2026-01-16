public class minggu2_Variabel {
    public static void main(String[] args){

//        Contoh Tipe data Primitif
        int angkaBulat = 1;
        double angkaDesimal = 1.2f;
        boolean benarAtauSalah = true;
        char karakter = 'a';

        System.out.println("Angka bulat: " + angkaBulat);
        System.out.println("Angka desimal: " + angkaDesimal);
        System.out.println("Ini boolean: " + benarAtauSalah);
        System.out.println("Ini karakter: " + karakter);
        System.out.println();

//      Contoh Tipe data Referensi
        String nama = "Jono";
        int[] tampungAngkaBulat = {1,9,10};

        System.out.println("Ini String: " + nama);
        System.out.println("Ini array: " +
                tampungAngkaBulat[0] +","+
                tampungAngkaBulat[1] +","+
                tampungAngkaBulat[2]);
    }
}

