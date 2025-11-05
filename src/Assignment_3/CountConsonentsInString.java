package Assignment_3;

public class CountConsonentsInString {
    public static void main(String[]args){
        String str="Hello! how are you?";
        str=str.toLowerCase().replaceAll("[!@& ?]","");
        System.out.println(str);
        String vowels="aeiou";
        int count=0;

        for(int i=0; i<str.length();i++){
            String ch=String.valueOf(str.charAt(i));// Converting character to string
            if(!vowels.contains(ch)){
                count++;
            }
        }
        System.out.println("Consonents count:"+count);
    }
}
