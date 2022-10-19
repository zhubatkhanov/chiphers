public class Vigenere {
    public static void main(String[] args) {
        String plainText = "ATTACKATDAWN";
        int length = plainText.length();
        String key = "LEMON";
        String res = str1(key,length);
        System.out.println("Plain text: " + plainText);
        System.out.println("Key word: " + key);
        System.out.println("Result: " + vigenere(plainText,res));
    }
    // encryption
    public static String str1(String key,int length){
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
        System.out.println(res);
        return res;
    }

    public static String vigenere(String plainText, String key){
        String res = "";
        for(int i = 0; i < plainText.length(); i++){
            int num = (key.charAt(i) - 65);
            int keyNum = plainText.charAt(i) + num;
            if(keyNum > 90){
                keyNum -= 26;
            }
            char a = (char)keyNum;
            res += a;
        }
        return res;
    }
}