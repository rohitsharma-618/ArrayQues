import java.util.Scanner;

public class spiralMatrix {
    
    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void spiralOrder(int [][]matrix , int r , int c){
        int topRow = 0 ,bottomROW = r - 1 , leftCol = 0, RightCol = c- 1 ;

        int total = 0;
        while (total < r*c){
            // topRow -> LeftCol to RightCol
            for (int j = leftCol; j <= RightCol && total < r*c;j++) {
                System.out.print(matrix[topRow][j] + " ");
                total++;
            }
                topRow++;

            //rightCol -> topRow to bottomRow
            for (int i  = topRow; i <= bottomROW && total < r*c;i++) {
                System.out.print(matrix[i][RightCol] +" ");
                total++;
            }
            RightCol --;
            //bottomRow -> RightCol to LeftCol
            for (int j = RightCol;j >= leftCol && total < r*c; j--) {
                System.out.print(matrix[bottomROW][j] +" ");
                total++;
            }
                bottomROW--;

            // LeftCol -> bottomRow to topRow
            for (int i = bottomROW; i >= topRow && total < r*c; i--) {
                System.out.print(matrix[i][leftCol] +" ");
                total++;
            }
                leftCol++;

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF ROWS AND COLUMNS IN THE MATRIX :- ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int [][] matrix = new int [r][c] ;

        System.out.println("ENTER " + r*c + " ELEMENTS  OF THE MATRIX :- ");

        for (int i= 0; i < r;i++){
            for (int j = 0 ; j < c ; j++){
                matrix[i][j] = sc.nextInt();

            }
        }
        System.out.println("INPUT MATRIX :- ");
        printMatrix(matrix);

        System.out.println("SPIRAL MATRIX :- ");
        spiralOrder(matrix, r , c);

    }
}
