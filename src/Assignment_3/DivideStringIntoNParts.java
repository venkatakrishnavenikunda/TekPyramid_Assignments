package Assignment_3;

//1.To divide the string equal N parts

//public class DivideStringIntoNParts {
//    public static void main(String[] args) {
//        String str = "HELLOWORL";
//        int n = 5;
//        int len = str.length();
//        if(len%n!=0)
//            System.out.println("can't divide equal parts");
//        else {
//        int size = len / n;
//        char[] arr = str.toCharArray();
//        for (int i = 0; i < len; i += size) {
//            for (int j = i; j < i + size; j++) {
//                System.out.print(arr[j]);
//            }
//            System.out.println();
//        }
//        }
//    }
//}



//2.To divide the string into N parts
//public class DivideStringIntoNParts{
//    public static void main(String[] args){
//        String s="HELLOWORL";
//        int n=3;
//        int len=s.length();
//        int size=len/n;
//        int start=0, end=size;
//        for(int i=0; i<size;i++){
//            System.out.println(s.substring(start,end));
//            start+=size;
//            end+=size;
//        }
//        if(start<len) {
//            System.out.println("Extra characters after dividing " + n + " parts");
//            System.out.println(s.substring(start));
//        }
//    }
//}





//3. To divide string into N parts  using if condition if string length is not divided with n otherwise use else condition
public class DivideStringIntoNParts {
    public static void main(String[] args){
        String s="HELLOWORLD";
        int n=3;
        int len=s.length();
        int size=len/n;
        //System.out.println(size);
        if(len%n!=0){
            System.out.println("Using if condition");
            int i;
            for(i=0;i+size<len;i+=size){
                System.out.println(s.substring(i,i+size));
            }
            if(i<len) {
                System.out.println("Extra characters after dividing "+n+" parts");
                System.out.println(s.substring(i));
            }
        }
        else{
            System.out.println("Using else condition");
            for(int i=0;i<len;i+=size){
                System.out.println(s.substring(i,i+size));
            }
            System.out.println();
        }
    }
}