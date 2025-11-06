package Assignment_4;

//public class LCToUCToLC {
//    public static void main(String[] args){
//        String str="Java programming Language";
//        str= str.replaceAll("\\s+","");
//        String str2="";
//        System.out.println(str);
//        for(int i=0; i<str.length();i++){
//            char ch=str.charAt(i);
//            if(ch>='a' && ch<='z'){
//                str2+=(char)(ch-32);
//            }
//            else {
//                str2 += (char) (ch + 32);
//            }
//        }
//        System.out.println(str2);
//    }
//}



//2.One more way
public class LCToUCToLC {
    public static void main(String[] args){
        String s="Java ProgramMing lanGuage";
        String s2="";
        s=s.replaceAll("\\s+","");

        for(char ch:s.toCharArray()){
            if(Character.isUpperCase(ch))
                s2+=(Character.toLowerCase(ch));
            else
                s2+=(Character.toUpperCase(ch));
        }
        System.out.println(s);
        System.out.println(s2);
    }
}