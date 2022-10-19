package DecryptionVigenere;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter decryption word: "); // LXFOPVEFRNHR
        String decryptWord = sc.nextLine();            // ATTACKATDAWN
        decryptWord = decryptWord.toUpperCase();
        int lengthWord = decryptWord.length();
        System.out.println("Enter key word: "); // LEMON
        String key = sc.nextLine();
        key = key.toUpperCase();
        String fillKey = fillKey(key, lengthWord);

        System.out.println(decrypt(decryptWord,fillKey));
    }

    public static String fillKey(String key, int length){
        int keyLen = key.length();
        String res = key;
        while (keyLen != length){
            for(int i = 0; i < key.length(); i++){
                res += key.charAt(i);
                keyLen++;
                if(keyLen == length)
                    break;
            }
        }
        return res;
    }

    public static String decrypt(String word, String key){
        String res = "";
        for(int i = 0; i < key.length(); i++){
            int num = Math.abs(word.charAt(i) - key.charAt(i));
            if(word.charAt(i) >= key.charAt(i)){
                char a = (char)(num + 65);
                res += a;
            }else{
                char a = (char)(key.charAt(i) + num);
                res += a;
            }
        }
        return res;
    }
}
