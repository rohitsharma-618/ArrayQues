import java.util.ArrayList;

public class ArrayL {
    public static void main(String[] args) {
        //wrapper class
        Integer in = Integer.valueOf(4);
//        System.out.println(in);
//        System.out.println(".....");
//    Float f = Float.valueOf(4.5f);
//    Boolean b = Boolean.valueOf(4.56845,45,);


        //ArrayList import class OR methods
        ArrayList<Integer> l1 = new ArrayList<>();


        //add new element
        l1.add(5);
        l1.add(3);
        l1.add(8);
        l1.add(6);

         // get an element at index i
        System.out.println(l1.get(3));
        System.out.println(".....");

        //print with for loop
//        for (int i =0; i < l1.size();i++){
//            System.out.println(l1.get(i)); // 5,3,8,6
//        }
//        System.out.println(".....");

        // printing the array list directly
        System.out.println(l1);
        System.out.println(".....");

        //adding an element at index i
        l1.add(1,20);
        System.out.println(l1);
        System.out.println(".....");

        //modify element at index i
        l1.set(1, 30);
        System.out.println(l1);
        System.out.println(".....");

        // removing an element at index i
        l1.remove(1);
        System.out.println(l1);
        System.out.println(".....");

        //remove an element e
        l1.remove(Integer.valueOf(8));
        System.out.println(l1);
        System.out.println(".....");

        // if be want a boolean vale (true /false) we can write as
        System.out.println(l1.remove(Integer.valueOf(17)));
        System.out.println(l1);
        System.out.println(".....");

        // checking if an element exist     // it will give you the true or false
        boolean ans = l1.contains(Integer.valueOf(3)); //true
        System.out.println(ans);
        System.out.println("...");
        boolean ans1 = l1.contains(Integer.valueOf(8));   // false
        System.out.println(ans1);
        System.out.println("...");

        // if you don't specify class , you can put anything inside l
        ArrayList l = new ArrayList();
        l.add("Rohit");   // string value
        l.add(6);         // int value
        l.add(true);        // boolean value

                    // though this style we can print anything witch we do not print in pervious methods

        System.out.println(l);
        System.out.println(".....");
    }
}
