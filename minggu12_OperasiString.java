public class minggu12_OperasiString {
    public static void main(String[] args){
        String bahasaJava = "Java";
        String bahasaPHP = "PHP";

        System.out.println("Panjang string " + bahasaJava + " = " + bahasaJava.length());
        System.out.println("2 Karakter dari Java " + "= " + bahasaJava.substring(0, 2));
        System.out.println("Apakah String " + bahasaJava + " sama dengan " + bahasaPHP + " = " + bahasaJava.equals(bahasaPHP));
        System.out.println("Uppercase String" + bahasaJava + " = " + bahasaJava.toUpperCase());
    }
}
