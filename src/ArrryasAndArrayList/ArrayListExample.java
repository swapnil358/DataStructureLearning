package ArrryasAndArrayList;

import com.sun.org.apache.bcel.internal.generic.NameSignatureInstruction;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(50);
        list.add(60);

        //to print the arraylist
        System.out.println(list);

        //to get the element present at particular index
        System.out.println(list.get(0));

        //to update the arraylist
        System.out.println(list.set(1,55));

        System.out.println(list);

        // to add te element at particular index
        list.add(1, 20);

        System.out.println(list);

        //to remove the element present at particular index
        System.out.println(list.remove(3));

    }
}
