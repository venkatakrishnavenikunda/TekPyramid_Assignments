package Assignment_1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//public class Right2Rotate {
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        System.out.println("how many elements want to in array");
//        int n=sc.nextInt();
//        int[]a=new int[n];
//        System.out.println("Enter "+n+ " elements:");
//        for(int i=0;i<n;i++){
//            a[i]=sc.nextInt();
//        }
//        System.out.println("How many values to rotate:");
//        int rot=sc.nextInt();
//        for(int i=0;i<rot; i++){
//            int last=a[a.length-1];
//            for(int j=a.length-1;j>0;j--){
//                a[j]=a[j-1];
//            }
//            a[0]=last;
//        }
//        System.out.println(Arrays.toString(a));
//    }
//}



//Another way using collections
public class Right2Rotate{
    public static void main(String[] args){
        int [] a={1,2,3,4,5};
        int n=2;
        ArrayList list=new ArrayList();
        for(int i:a){
            list.add(i);
        }
        System.out.println(list);
        for(int i=0;i<2;i++){
            Object last= list.get(list.size()-1);
            list.remove(list.size()-1);
            list.add(0,last);
        }
        System.out.println(list);
    }
}