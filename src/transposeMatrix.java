import java.util.Scanner;

public class transposeMatrix {
    static void PrintMatrix(int [] [] matrix){
        int n = matrix.length;
        for (int i = 0 ; i < matrix.length;i ++){
            for (int j = 0;j< matrix.length;j++){

                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int [] [] trans(int[][] matrix ,int r , int c){
        int [][] ans = new int [r][c];
        for (int i = 0 ; i<r;i++){
            for (int j =0; j<c ; j++){
                ans[i][j] = matrix[j][i];
            }
        }
        return ans;
    }
    static void transposeInplace(int[][] matrix,int r,int c){
        for (int i = 0; i< r;i++){
            for (int j = i; j< c ;j++){

                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;

            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter NUMBER OF ROWS AND COLUMNS :- ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int [][] matrix = new int [r][c];
        int totalElement = r*c;
        System.out.println("Enter " +r*c + " elements :- ");
        for (int i = 0 ;i < r ; i++){
            for (int j =0; j < c ; j++){
                matrix[i][j] =sc.nextInt();
            }
        }
        System.out.println("INPUT MATRIX :- ");
        PrintMatrix(matrix);

        System.out.println("TRANSPOSE OF MATRIX IS :- ");
//        int[][] ans = trans(matrix,r,c);
//        PrintMatrix(ans);
        transposeInplace(matrix,r,c);
        PrintMatrix(matrix);
    }
}
