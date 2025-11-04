package Assignment_1;


import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

//public class RemoveDuplicates {
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        System.out.println("How elements want to add in an array:");
//        int n=sc.nextInt();
//        int[]a=new int[n];
//        System.out.println("Enter the elements:");
//        for(int i=0;i<n;i++){
//            a[i]= sc.nextInt();
//        }
//        System.out.println("After removing duplicates:");
//        for(int j=0; j<a.length;j++){
//            boolean ele=false;
//            for(int k=0;k<j;k++){
//                if(a[j]==a[k]){
//                    ele=true;
//                    break;
//                }
//            }
//            if(!ele)
//                System.out.println(a[j]);
//        }
//    }
//}


public class RemoveDuplicates {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("How elements want to add in an array:");
        int n=sc.nextInt();
        int[]a=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }

        Set<Integer> uniq = new LinkedHashSet<Integer>();
        for(int num:a){
            uniq.add(num);
        }
        System.out.println("After removing Duplicates elements:");
        for(int num:uniq){
            System.out.println(num);
        }
    }
}