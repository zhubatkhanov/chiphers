package chipher_atbash;

import com.sun.security.jgss.GSSUtil;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word:");
        String word = sc.nextLine();
        word = word.toUpperCase();
        HashMap<Character,Integer> map = new HashMap<>();
        aplhabet(map);
        System.out.println(encrypt(word,map));

    }



    // i -> n - i + 1  (n - count letters in alphabet)
    public static String encrypt(String word,HashMap<Character,Integer> map){
        String res = "";
        int n = 26;
        int i = 0;
        while (i < word.length()){
            int num = ((int)word.charAt(i) + n) - map.get(word.charAt(i));
            num = num - (word.charAt(i) - 65);
            res = res + (char)num;
            i++;
        }

        return res;
    }

    public static void aplhabet(HashMap<Character,Integer> map){
        int ch = 65;
        for (int i = 1; i <= 26; i++){
            map.put((char)ch,i);
            ch++;
        }
    }
}
