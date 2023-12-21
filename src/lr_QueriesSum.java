import java.util.Scanner;

public class lr_QueriesSum {

    static void Queries(int[] array){}

    static int[] QueriesSum(int [] array) {
//        int n = array.length;
//        int [] sum = new int [n];
//        sum [0]=array[0];
//
//        for (int i = 1; i < n; i++){
//          sum[i] = sum[i-1] + array[i];

        for (int i = 1; i < array.length;i++){
            array[i] += array[i-1];
    }
        return array;
    }

    static void printArray ( int[] array){
        int n = array.length;
        for (int i = 0; i < n; i++) {
            System.out.println(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER SIZE OF ARRAY:- ");
        int n = sc.nextInt();
        int[] array = new int[n+1];
        System.out.println("Enter " + n + " Elements :-");

        for (int i = 1; i <= n; i++) {
            array[i] = sc.nextInt();
        }
//        System.out.println("ORIGINAL ARRAY:- ");
//        printArray(array);

        int[] PrefixSum = QueriesSum(array);
        System.out.println("Enter No. of Queries:- ");
        int q = sc.nextInt();

        while(q-- > 0 ){
            System.out.println("ENTER RANGE:- " );
            int l =sc.nextInt();
            int r = sc.nextInt();


            int ans = PrefixSum[r] -PrefixSum[l-1];
            System.out.println("sum :- " +ans);
        }

    }
}
