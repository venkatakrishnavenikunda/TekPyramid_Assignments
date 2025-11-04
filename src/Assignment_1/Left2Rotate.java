package Assignment_1;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//Without using Collection (using normal for loops)
//public class Left2Rotate {
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
//        for(int i=0;i<rot;i++){
//            int first=a[0];
//            for(int j=0;j<a.length-1;j++){
//                a[j]=a[j+1];
//            }
//            a[a.length-1]=first;
//        }
//        System.out.println(Arrays.toString(a));
//    }
//}


// Another using collections
public class Left2Rotate{
    public static void main(String[] args){
        System.out.println("how many elements want to in array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]a=new int[n];
        System.out.println("Enter "+n+ " elements:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("How many values to rotate:");
        int rot=sc.nextInt();
        System.out.println(Arrays.toString(a));
        ArrayList list=new ArrayList();
        for(int i:a)
        {
            list.add(i);
            System.out.println(i);
        }
        for(int i=0;i<rot;i++){
            Object one=list.get(0);
            list.remove(0);
            list.add(one);
        }
        System.out.println(list);
    }
}