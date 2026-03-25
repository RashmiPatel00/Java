package Strings;

import java.util.*;

public class String01 {

    public static boolean ispallin(String str) {
        int p = 0;
        int q = str.length() - 1;
        while (p < q) {
            if (str.charAt(p) != str.charAt(q))
                return false;
            p++;
            q--;
        }
        return true;
    }

    // FREQUENCY OF EACH CHARACTER SHOULD BE SAME
    public static boolean isAnagram(String s1, String s2) {
        HashMap<Character, Integer> hm1 = new HashMap<>();
        HashMap<Character, Integer> hm2 = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            hm1.put(s1.charAt(i), hm1.getOrDefault(s1.charAt(i), 0) + 1);
        }
        for (int i = 0; i < s2.length(); i++) {
            hm2.put(s2.charAt(i), hm2.getOrDefault(s2.charAt(i), 0) + 1);
        }
        if (hm1.equals(hm2))
            return true;
        return false;
    }

    public static String removevowel(String s) {
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                continue;
            ans += ch;
        }
        return ans;
    }

    public static String remove_char(String s1, String s2) {
        String ans = "";
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s2.length(); i++) {
            set.add(s2.charAt(i));
        }
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (!set.contains(ch))
                ans += ch;
        }
        return ans;
    }

    public static String remove_other_then_alphabet(String s) {
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ' ')
                ans += " ";
            if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
                ans += ch;
            }
        }
        return ans;
    }

    public static String[] long_small_word(String s) {
        String[] ans = new String[2];
        String[] words = s.split(" ");
        String small = words[0];
        String large = "";
        for (String word : words) {
            int count = 0;
            for (int i = 0; i < word.length(); i++) {
              //  char ch = word.charAt(i);
                count++;
            }
            if (count > large.length()) {
                large = word;
            }
            if (count < small.length()) {
                small = word;
            }

        }
        ans[0] = large;
        ans[1] = small;
        return ans;

    }
    //  Input-> aabcceeed
    // Output-> a2b1c2e3d1 -> 1b1d2a2c3e
public static String encrypt(String s){
    StringBuilder ans= new StringBuilder("");
    HashMap<Character, Integer>hm= new HashMap<>();
    for(int i=0;i<s.length();i++){
        hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i),0)+1);
    }
  for(char ch:hm.keySet()){
    ans.append(hm.get(ch)).append(ch);
  }
  return ans+"";

}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE STRING");
        String str1 = sc.nextLine();
        System.out.print("ENTER THE STRING");
        String str2 = sc.nextLine();

        System.out.println("PALLINDROME :" + ispallin(str1));
        System.out.println("ANAGRAM :" + isAnagram(str1, str2));
        System.out.println("REMOVE STRING :" + removevowel(str1));
        System.out.println("REMOVE CHARACTER FROM S1: " + remove_char(str1, str2));
        System.out.println("REMOVE OTHER CHARACTER :" + remove_other_then_alphabet(str2));
        System.out.println(encrypt(str2));

sc.close();
    }

}
