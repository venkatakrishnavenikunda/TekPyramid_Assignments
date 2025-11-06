package Assignment_4;

public class ReplaceSpace {
    public static void main(String[] args){
        String s="I love java programming";
        System.out.println("Before replacing:"+s);
        s=s.replaceAll("\\s+","@");
        System.out.println("After replacing:"+s);
    }
}
