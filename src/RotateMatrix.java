import java.util.Scanner;
public class RotateMatrix {
    static void PrintMatrix(int [] [] matrix){
        for (int i = 0 ; i < matrix.length;i ++){
            for (int j = 0;j< matrix.length;j++){

                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
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

    static void reverseArray(int []array){
        int i =0,j= array.length-1;
        while (i<j){
            int temp = array[i];
            array[i]=array [j];
            array[j]=temp;
            i++;
            j--;
        }
    }
    static void rotate (int[][] matrix, int n ){

        transposeInplace(matrix,n,n);
        for (int i=0; i<n;i++){
            reverseArray(matrix[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NUMBER OF ROWS AND COLUMNS :- ");
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

        rotate(matrix,r);
        System.out.println("Rotation Of Matrix Is :- ");
        PrintMatrix(matrix);
    }
}
