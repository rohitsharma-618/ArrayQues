import java.util.Scanner;

public class preSumApproach {
    static int FindSumArray(int []array){
        int totalSum = 0;
        for (int i =  0; i < array.length;i++){
            totalSum += array[i];
        }
        return totalSum;
    }
    static boolean equalSumPartition(int [] array){
        int totalSum = FindSumArray(array);
        int prefixSum =0;
        for (int i = 0 ;i< array.length;i++){
            prefixSum += array[i];
            int suffixSum = totalSum - prefixSum;
            if (suffixSum== prefixSum){
                return true;
            }

        }
        return false;
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
        System.out.println("equal partition possible: " + equalSumPartition(array));
    }
}
