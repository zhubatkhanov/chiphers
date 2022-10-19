package chipher_caeser;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String word = sc.nextLine();
        word = word.toUpperCase();
        System.out.println("Enter the key: ");
        int key = sc.nextInt();
        System.out.println(encrypt(word,key));
    }

    public static String encrypt(String word, int key){
        String res = "";
        for (int i = 0; i < word.length(); i++){
            if(word.charAt(i) + key <= 90){
                int num = ((word.charAt(i) + key));
                res += (char)num;
            }else {
                int num = ((word.charAt(i) + key) - 90) + 64;
                res += (char)num;
            }
        }
        return res;
    }
}
