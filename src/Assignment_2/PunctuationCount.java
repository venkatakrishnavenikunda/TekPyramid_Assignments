package Assignment_2;

import java.util.Scanner;

//public class PunctuationCount {
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the string:");
//        String s=sc.nextLine();
//        System.out.println(s);
//        char[] str=s.toCharArray();
//        int punccount=0;
//        for(int i=0; i<s.length();i++){
//            char ch=str[i];
//            if(ch=='@' || ch=='#' || ch=='%' || ch=='&' || ch=='*' || ch=='!'|| ch==' '){
//                punccount++;
//            }
//
//        }
//        System.out.println(punccount);
//    }
//}



public class PunctuationCount {
    public static void main(String[] args) {
        String s="Hell@o !Wo#r?d";
        String pun=s.replaceAll("[^\\p{Punct}]", "");
        System.out.println(pun+"="+pun.length());
    }

}