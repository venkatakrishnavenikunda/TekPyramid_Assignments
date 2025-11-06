package Assignment_4;

public class ReverseCharacterByCharacter {
    public static void main(String[] args) {
        String s = "java prgm";
        String res = "";
        for (int i = 0; i < s.length(); ) {
            int j = i;
            while (j < s.length() && s.charAt(j) != ' ') {
                j++;
            }
            int k = j - 1;
            while (k >= i) {
                res += s.charAt(k);
                k--;
            }
            if (j < s.length() && s.charAt(j) == ' ') {
                res += ' ';
                i = j + 1;
            } else {
                i = j;
            }
        }
        System.out.println("Before reverse:"+s);
        System.out.println("After reverse:"+res);
    }
}
