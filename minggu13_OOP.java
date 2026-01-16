public class minggu13_OOP {
    static class Mahasiswa {
        String nama,kelas;
        int NIM;


        void tampilData() {
            System.out.println("=== Data Mahasiswa ===");
            System.out.println("Nama: " + nama + "\nNIM: " + NIM + "\nKelas: " + kelas);
        }
    }

    public static void main(String[] args) {
        Mahasiswa m = new Mahasiswa();
        m.nama = "Mahri";
        m.kelas = "42";
        m.NIM = 251220029;
        m.tampilData();
    }
}
