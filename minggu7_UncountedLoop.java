public class minggu7_UncountedLoop {
    public static void main(String[] args) {

        int i = 1;
        while (i <= 4) {
            System.out.println(i);
            i++;
        }
        System.out.println("pemisah while dengan do-while");
        do {
            System.out.println(i);
            i++;
        } while ( i <= 8);
    }
}
