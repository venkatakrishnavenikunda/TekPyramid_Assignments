package Assignment_2;

import java.util.Arrays;

//public class SortUsingBubbles{
//    public static void main(String[] args){
//        int[]a={16,9,5,4,7,12,3,20,15};
//        System.out.println("Before sorting:"+Arrays.toString(a));
//        for(int i=0; i<a.length;i++){
//            for(int j=0;j<a.length-1;j++){
//                if(a[j]>a[j+1]){
//                    int temp=a[j];
//                    a[j]=a[j+1];
//                    a[j+1]=temp;
//                }
//            }
//        }
//        System.out.println("After sorting:"+Arrays.toString(a));
//    }
//}


//Bubble sort Using one for loop
public class SortUsingBubble {
    public static void main(String[] args){
        int[]a={16,9,5,4,7,12,3,20,15};
        System.out.println("Before sorting:"+Arrays.toString(a));
        for(int i=0;i<a.length-1;i++){
            if(a[i]>a[i+1]){
                int temp=a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
                i=-1;
            }
        }
        System.out.println("After sorting:"+Arrays.toString(a));
    }
}


