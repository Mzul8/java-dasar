public class minggu5_SwitchCase {
    public static void main(String[] args)
    {
        int menu = 2;
        System.out.println("Menu pilihan yang dipilih: " + menu);
        switch (menu) {
            case 1:
                System.out.println("Ayam Lada Hitam");
                break;
            case 2:
                System.out.println("Ayam Saus Padang");
                break;
            default:
                System.out.println("menu tidak ada");
        }

    }
}
