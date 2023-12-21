import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;

public class problums {

    static  void problum1(ArrayList<Integer> list){
        int i =0, j = list.size() - 1;

        while(i < j){
            /*
            int temp = a;
            a= b;
            b = temp;
             */
            Integer temp = Integer.valueOf(list.get(i));
            list.set(i, list.get(j));
            list.set(j,temp);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(1);
        list.add(6);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(9); 
        System.out.println("ORIGINAL ARRAY :- " +list);

//        problum1(list);

        Collections.reverse(list);
        System.out.println("reversed list array :-" +list);

        Collections.sort(list);      // by deflt ascanding order
        System.out.println("ascending order :-  " +list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println("desending order :- " +list );

        System.out.println("...................................................");

        ArrayList<String> l1 = new ArrayList<>();
        l1.add("WELCOME");
        l1.add("TO");
        l1.add("MY");
        l1.add("HEART");

        System.out.println("OG :- " +l1);

        Collections.sort(l1);

        System.out.println("SHORTED :- " +l1);


            }
    }