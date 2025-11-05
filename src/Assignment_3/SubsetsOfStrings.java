package Assignment_3;

public class SubsetsOfStrings {
    public static void main(String[] args){
        String s="FUN";

        for(int i=0; i<s.length();i++){
            String sub="";
            for(int j=i; j<s.length();j++){
                sub+=s.charAt(j);
                System.out.print(sub+",");
            }
        }
    }
}
