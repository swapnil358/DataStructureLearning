package Searching.LinearSearch;

public class StringSearch {
    public static void main(String[] args) {
        String s = "maharaja charan singh";
        boolean a = SearchChar(s, 'm');
        System.out.println(a);

        boolean g = searchChar2(s, 'g');
        System.out.println(g);


    }

    static boolean SearchChar(String s, char search ){

        if(s.length()==0){
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (search==s.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    private static boolean searchChar2(String str, char target) {
        char[] chars = str.toCharArray();
        if (str.length() == 0) {
            return false;
        }

        for (char ch: chars) {
            if (ch == target) {
                return true;
            }

        }
        return false;

    }

}
