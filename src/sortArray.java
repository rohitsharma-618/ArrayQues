import java.util.Collections;
import java.util.Scanner;

import static java.util.Collections.swap;


public class sortArray {
    static void printArray(int []array){
        int n  = array.length;
        for (int i =  0 ; i < n ; i++){
            System.out.println(array[i] + " ");
        }
    }

    static void swap(int []array, int i, int j ){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    static void sortZerosAndOne(int []array){
    int n = array.length;

    int left = 0 ,right = n - 1;

    while (left < right){
        if (array[left] == 1 && array[right] ==0 ){
            swap(array, left, right);
            left++;
            right--;
        }
        if (array[left]==0){
            left++;
        }
            if (array[right] == 1){
                right--;
            }
        }
    }

   
//    static void sortZerosAndOne(int[] array){
//        int n = array.length;
//        int countZeros = 0;
//
//        for (int i = 0; i < n ; i ++){
//            if (array[i] == 0 ){
//                countZeros++;
//            }
//        }
//
//        for (int i = 0;i < n ; i++){
//            if (i < countZeros ){
//                array[i] = 0;
//            }
//            else {
//                array[i] = 1;
//            }
//        }
//    }

        public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("ENTER SIZE OF ARRAY:- ");
        int n =  sc.nextInt();
        int [ ] array = new int[n];
        System.out.println("Enter " +n+ "Elements :-");

        for (int i = 0;i < n; i++) {
            array[i] = sc.nextInt();
        }
            System.out.println("ORIGINAL ARRAY:- ");
            printArray(array);
            sortZerosAndOne(array);

            System.out.println("AFTER SORT ARRAY :- ");
            printArray(array);
    }
}
