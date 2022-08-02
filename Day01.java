package Day02;

public class Day01 {
    public static void main(String[] args) {
        int sparseArray11[][]  =new int[11][11];
        sparseArray11[1][2] =1;
        sparseArray11[2][3] =2;
        for (int[] ints : sparseArray11) {
            for (int anInt : ints) {
                System.out.printf("%d\t",anInt);
            }
            System.out.println("");
        }
        int sum  =0;
        for (int i = 0; i <11 ; i++) {
            for (int j = 0; j <11 ; j++) {
                if (sparseArray11[i][j]!=0){
                    sum++;
                }
            }
        }
        int sparseArray12[][] =new int[sum+1][3];
        sparseArray12[0][0] = 11;
        sparseArray12[0][1] = 11;
        sparseArray12[0][2] = sum;
         int conut = 0;
        for (int i = 0; i <11 ; i++) {
            for (int j = 0; j < 11; j++) {
                if (sparseArray11[i][j] != 0) {
                    conut++;
                    sparseArray12[conut][0] = i;
                    sparseArray12[conut][1] = j;
                    sparseArray12[conut][2] = sparseArray11[i][j];
                }
            }
        }
        for (int[] ints : sparseArray12) {
            for (int anInt : ints) {
                System.out.printf("%d\t",anInt);
            }
            System.out.println();
        }
        int sparseArray13[][] = new int[sparseArray12[0][0]][sparseArray12[0][1]];
        for (int i = 1; i <sparseArray12.length ; i++) {
            sparseArray13[sparseArray12[i][0]][sparseArray12[i][1]] = sparseArray12[i][2];

        }
        for (int[] ints : sparseArray13) {
            for (int anInt : ints) {
                System.out.printf("%d\t",anInt );

            }
            System.out.println("");
        }
    }
 
}
