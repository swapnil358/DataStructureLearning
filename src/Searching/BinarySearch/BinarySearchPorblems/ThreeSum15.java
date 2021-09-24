package Searching.BinarySearch.BinarySearchPorblems;

import java.util.*;

//https://youtu.be/WdaeixEeAVs
public class ThreeSum15 {

    public static void main(String[] args) {
        int[] arr = {-2,0,1,1,2};
        List<List<Integer>> sum2 = threeSum2(arr);
        System.out.println(sum2);
    }


    public static List<List<Integer>> threeSum2(int[] arr){

        // we have to find x+y+z=0, that's means  y+z=-x;

        Set<List<Integer>> set = new HashSet<>();

        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 2; i++) {
            int left = i + 1;
            int right = arr.length - 1;

            while (left < right) {
                if (arr[left] + arr[right] == -arr[i]) {  //y+z=-x;
                    set.add(Arrays.asList(arr[i], arr[left], arr[right]));
                    left++;
                    right--;
                }
                else if (arr[left] + arr[right] > -arr[i]) {
                    right--;
                } else
                    left++;
            }
        }
        List<List<Integer>> list = new ArrayList<>(set);
        return list;
    }

}
