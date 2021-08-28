package ArrryasAndArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiArraylist {

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        Scanner in = new Scanner(System.in);

        //Initialising array list ---> without initialising array list you can not add in multi dimensional array list
        //Basically here it is creating individual list under the main array list
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                list.get(i).add(in.nextInt());
            }
        }
        System.out.println(list);



    }
}

