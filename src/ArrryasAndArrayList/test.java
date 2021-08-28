package ArrryasAndArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class test {

    //https://youtu.be/n60Dn0UsbEk

    public static void main(String[] args) {

        //Syntax
        // datatype[] variable_name = new datatype[5]

        //1 . by creating the object
     //   int[] rnos = new int[5];

        //2
     //   int[] rnos2 = {1,5,56,54};

      //  int[] ros;      //declaration of array, it is getting defined in stack
     //   ros = new int[5]; //initialisation -   creating the object in heap memory

        Scanner in = new Scanner(System.in);


        int[] arr = new int[5];
        arr[0] =23;
        arr[1] =30;
        arr[2] =66;
        arr[3] =55;
        arr[4] =77;

        System.out.println(arr[4]);

        for (int i = 0; i < arr.length; i++) {
            arr[i]= in.nextInt();
        }

        //way 1 -- iterating through array
      /*  for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }*/

        //way2
       /* for (Integer i : arr){
            System.out.println("Using enhance for loop: "+i);
        }
*/
        //way 3
        System.out.println("Using 3rd way: " + Arrays.toString(arr));


        
    }

}
