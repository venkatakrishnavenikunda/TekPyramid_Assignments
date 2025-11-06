package Assignment_4;

//public class ReverseWordByWord {
//    public static void main(String[] args){
//        String s="I Love Programming";
//        String res="";
//        int i=s.length()-1;
//        int j=s.length()-1;
//        while(i>=0){
//            while(i>=0 && s.charAt(i)!=' ')i--;
//            int k=i+1;
//            while(k<=j){
//                res+=s.charAt(k);
//                k++;
//            }
//            if(i>=0)
//                res+=" ";
//            i--;
//            j=i;
//        }
//        System.out.println("Before reverse:"+s);
//        System.out.println("After reverse:"+res);
//    }
//}




//2. One more method using arrays
import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseWordByWord {
    public static void main(String[] args){
        String s="I Love Programming";
        System.out.println("Before reverse:"+s);
        String[] s1=s.split(" ");
        System.out.println("After reverse:"+rev(s1));
    }

    public static String rev(String[] s1){
        String s2="";
        for(int i=s1.length-1;i>=0;i--){
            s2+=s1[i]+" ";
        }
        return s2;
    }

}