package Assignment_3;

//public class CountConsonentsInString {
//    public static void main(String[]args){
//        String str="krishnaveni";
//        str=str.toLowerCase().replaceAll("[!@& ?]","");
//        System.out.println(str);
//        String vowels="aeiou";
//        int count=0;
//
//        for(int i=0; i<str.length();i++){
//            String ch=String.valueOf(str.charAt(i));// Converting character to string
//            if(!vowels.contains(ch)){
//                count++;
//            }
//        }
//        System.out.println("Consonents count:"+count);
//    }
//}




//2.One more way using regular expression
public class CountConsonentsInString {
    public static void main(String[] args){
        String name="krishnaveni";
        String consonents=name.replaceAll("[aeiou]","");
        System.out.println(consonents+"->"+consonents.length());
    }
}
