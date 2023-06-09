// 

// brute force

import java.util.HashSet;
import java.util.Set;

public class prob24 {
    public static int uniqueSubstrings(String str) {
        int ans = 0;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                if (set.contains(str.charAt(j))) {
                    break;
                }
                set.add(str.charAt(j));
                ans = Math.max(ans, j - i);
            }
            set.clear();
        }
        System.out.println(ans);
        return ans;
    }

    public static void main(String[] args) {
        String str = "ababcdede";
        uniqueSubstrings(str);
    }
}

// optimal


// import java.util.HashSet;
// import java.util.Set;

// public class prob24 {
// public static int uniqueSubstrings(String input) {
// int ans = 0;
// int start = 0;
// Set<Character> set = new HashSet<>();

// for (int i = 0; i < input.length(); i++) {
// char currentChar = input.charAt(i);
// while (set.contains(currentChar)) {
// set.remove(input.charAt(start));
// start++;
// }
// set.add(currentChar);
// ans = Math.max(ans, i - start + 1);
// }

// return ans;
// }

// public static void main(String[] args) {
// String str = "ababcdede";
// uniqueSubstrings(str);
// }
// }