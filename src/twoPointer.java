import java.util.Scanner;

public class twoPointer {
    static void swap(int[] array , int left,int right){
        int temp = array[right];
        array[right] = array[left];
        array[left] = temp ;

    }
    static void sortArrayByParity(int [] array){
        int n = array.length;
         int left = 0, right = n - 1 ;

         while(left < right){
             if (array[left] % 2 == 1 && array[right] % 2 == 0){
                 swap(array,left,right );
                 left++;
                 right--;
             }
             if (array[left] % 2 == 0){
                 left++;
             }
             if (array[right] % 2 == 1){
                 right--;
             }
         }
    }

    static void printArray(int[] array){
        int n = array.length;
        for (int i = 0 ; i < n ; i++){
            System.out.println(array[i] + " ");
        }
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
        sortArrayByParity(array);

        System.out.println("Sort Array:- ");
        printArray(array);
    }
}
