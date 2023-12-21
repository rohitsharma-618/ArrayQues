import java.sql.SQLOutput;
import java.util.Scanner;

public class matrix {
    static void PrintMatrix(int [] [] matrix){
        int n = matrix.length;
        for (int i = 0 ; i < matrix.length;i ++){
            for (int j = 0;j< matrix.length;j++){

                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void multiply(int[][] a,int r1,int c1 ,int[][]b,int r2,int c2){
        if(r2 != c1){
            System.out.println("404 ERROR !!! CHECK r2 and c1....");
            return;
        }
        int [][]mul= new int [r1][c1];
        for (int i =0;i <r1;i++){
            for (int j =0; j< c1;j++){
                for (int k =0; k< c1 ;k++) {
                    mul[i][j] += (a[i][k] * b[k][j]);
                }
            }
        }
        System.out.println("MULTIPLY OF MATRIX : - ");
        PrintMatrix(mul);
    }


    static void add (int[][] a,int r1,int c1 ,int[][]b,int r2,int c2){
        if (r1 != r2 && c1 != c2 ){
            System.out.println("404 ERROR...! ADDITION NOT POSSIBLE !!!");
            return;
        }

        int [][] sum = new int [r1][c1];
        for (int i =0;i< r1;i++){
            for (int j =0;j< c1;j++){
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("sum of matrix 1 and 2:- " );
        PrintMatrix(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter NUMBER OF ROWS AND COLUMNS of 1 :- ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int [][] a = new int [r1][c1];

        System.out.println("Enter the value of matrix 1 :- ");
        for (int i =0 ;i <r1;i++ ){
            for (int j = 0;j< c1 ; j++) {
                a[i][j] = sc.nextInt();
            }
                }

                System.out.println("Enter NUMBER OF ROWS AND COLUMNS of 2 :- ");
                int r2 = sc.nextInt();
                int c2 = sc.nextInt();
                int [][] b = new int [r2][c2];

                System.out.println("Enter the value of matrix 2 :- ");
                for (int i =0 ;i <r2;i++ ){
                    for (int j = 0;j< c2 ; j++){
                        b[i][j] = sc.nextInt();


            }
        }
        System.out.println("MATRIX 1 :- ");
                PrintMatrix(a);
        System.out.println("MATRIX 2 :- ");
        PrintMatrix(b);

//        add(a,r1,c1,b,r2,c2);
        multiply(a,r1,c1,b,r2,c2);
    }
}
