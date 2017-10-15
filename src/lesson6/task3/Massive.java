package lesson6.task3;

public class Massive {
    public static void main(String[] args) {
        String twoD[][] = new String[3][6];
        int i, j, k;
        char a = 'a';
        for (i =0; i < 3; i++){
            for (j = 0; j < 6; j++){
                twoD[i][j] = a+ "" + (j+1) + " ";
            }
            a++;
        }
        for (i = 0; i < 3; i++) {
            for (k = 0; k < 6; k++) {
                System.out.print(twoD[i][k] + " ");
            }
            System.out.println();
        }
    }
}