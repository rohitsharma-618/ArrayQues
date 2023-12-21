import java.util.Scanner;

public class Array2D {
    static void PrintArray(int [] [] array){
        int n = array.length;
        for (int i = 0 ; i < n;i ++){
            for (int j = 0;j< n;j++){
                System.out.println(array[i][j] + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of row:- ");
        int r = sc.nextInt();

        System.out.println("Enter the no of columns :- ");
        int c = sc.nextInt();

        int [][] array = new int [r][c];

        System.out.println("Enter " +r*c + " elements :- ");
        for (int i = 0 ;i < r ; i++){
            for (int j =0; j < c ; j++){
                array[i][j] =sc.nextInt();
            }
        }
        System.out.println();
        PrintArray(array);
    }
}
