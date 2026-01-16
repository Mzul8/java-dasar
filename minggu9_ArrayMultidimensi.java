public class minggu9_ArrayMultidimensi {
    public static void main(String[] args){

        int[][] arrayMultidimensi = {
                {1,2,3,4,5},
                {6,7,8,9,10}
        };
        for (int i = 0; i < arrayMultidimensi.length; i++) {          // baris
            for (int j = 0; j < arrayMultidimensi[i].length; j++) {   // kolom
                System.out.print(arrayMultidimensi[i][j] + " ");
            }
            System.out.println();
        }
    }
}
