import java.util.Scanner;

public class prefixSum {
    static void prefix(int[] array) {}

        static int[] makePrefixSum(int[] array){
            int n = array.length;
            int[] prefix = new int[n];
            prefix[0] = array[0];
            for (int i = 1; i < n; i++) {
                prefix[i] = prefix[i - 1] + array[i];
            }
            return prefix;
        }


        static void printArray ( int[] array){
            int n = array.length;
            for (int i = 0; i < n; i++) {
                System.out.println(array[i] + " ");
            }
        }

        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.println("ENTER SIZE OF ARRAY:- ");
            int n = sc.nextInt();
            int[] array = new int[n];
            System.out.println("Enter " + n + " Elements :-");

            for (int i = 0; i < n; i++) {
                array[i] = sc.nextInt();
            }
            System.out.println("ORIGINAL ARRAY:- ");
            printArray(array);

            int[] prefix = makePrefixSum(array);
            System.out.println("Prefix sum array :- ");
            printArray(prefix);
        }

    }
