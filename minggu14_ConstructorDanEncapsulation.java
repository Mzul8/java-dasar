public class minggu14_ConstructorDanEncapsulation {
    static class Mahasiswa {
        private String nama;

//      setter
        void setNama(String n){
            nama = n;
        }
//        getter
        String getNama(){
            return nama;
        }
    }

    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setNama("Mahri Zul");
        System.out.println("Nama Mahasiswa: " + mahasiswa.getNama());
    }
}
