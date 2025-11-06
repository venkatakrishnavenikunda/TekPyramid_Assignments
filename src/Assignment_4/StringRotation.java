package Assignment_4;

public class StringRotation {
    public static void main(String[] args){
        String s1="ABCD";
        String s2="CDAB";
        String s3=s1+s1;
        for(int i=0; i<s3.length()-4;i++){
            if(s3.substring(i,i+4).equals(s2)){
                System.out.println("One string is rotation to another");
                return;
            }
        }
        System.out.println("One string is not rotation to another ");
    }
}
