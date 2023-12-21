import java.util.Scanner;

public class GenerateSpiral {
    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] spiral(int n) {
        int[][] matrix = new int [n][n];
        int topRow = 0, bottomROW = n - 1, leftCol = 0, RightCol = n - 1;

        int current = 1;
        while (current <= n*n){
            // topRow -> LeftCol to RightCol
            for (int j = leftCol; j <= RightCol && current <= n*n;j++) {
                matrix[topRow][j] = current;
                current++;
            }
            topRow++;

            //rightCol -> topRow to bottomRow
            for (int i  = topRow; i <= bottomROW && current <= n*n;i++) {
                matrix[i][RightCol] = current;
                current++;
            }
            RightCol --;

            //bottomRow -> RightCol to LeftCol
            for (int j = RightCol;j >= leftCol && current <= n*n; j--) {
                matrix[bottomROW][j] = current;
                current++;
            }
            bottomROW--;

            // LeftCol -> bottomRow to topRow
            for (int i = bottomROW; i >= topRow && current <= n*n; i--) {
                matrix[i][leftCol] = current;
                current++;
            }
            leftCol++;

        }
        return matrix;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER n :- ");
        int n = sc.nextInt();

        System.out.println( n*n + " ELEMENTS  OF THE MATRIX ARE :- ");

        int[][] matrix = spiral(n);
        printMatrix(matrix);
    }
}