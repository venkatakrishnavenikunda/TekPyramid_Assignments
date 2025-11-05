package Assignment_3;

public class CountVowelsInString {
    public static void main(String[] args){
        String s="Hello! How are you";
        s=s.toLowerCase();
        String vowels="aeiou";
        int vowels_count=0;
        for(int i=0; i<s.length();i++){
            String ch=String.valueOf(s.charAt(i));//Converting character into string becoz contains() will works on Strings only.
            if(vowels.contains(ch)){
                vowels_count++;
            }
        }
        System.out.println("Total vowels count:"+vowels_count);
    }
}
