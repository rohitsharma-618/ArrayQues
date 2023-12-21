import java.util.Scanner;

public class sortSquareMethod {
    static void swap(int[] array , int left,int right){
        int temp = array[right];
        array[right] = array[left];
        array[left] = temp ;

    }

    static void printArray(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            System.out.println(array[i] + " ");
        }
    }
    static int[] sortSquare(int []array){
        int n = array.length;
        int left = 0,right = n-1;
        int[] ans = new int[n];
        int k =0 ;

      while (left <= right){
          if (Math.abs(array[left]) > Math.abs(array[right])){
              ans[k++] = array[left] * array[left];

              left++;
          }
          else {
              ans[k++] = array[right] * array[right];
              right--;
          }
        }
      return ans;
    }


    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("ENTER SIZE OF ARRAY:- ");
        int n =  sc.nextInt();
        int [] array = new int[n];
        System.out.println("Enter " +n+ " Elements :-");

        for (int i = 0;i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("ORIGINAL ARRAY:- ");
        printArray(array);
       int [] ans= sortSquare(array);

        System.out.println("Sort Array:- ");
        printArray(ans);
    }
}
