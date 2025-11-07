package Assignment_1;

//public class FrequencyOfElements {
//    public static void main(String[] args){
//    int[] a = {1, 2, 3, 2, 1};
//        for (int i = 0; i < a.length; i++) {
//            int count = 1;
//            boolean visit = false;
//            for (int j = 0; j < i; j++) {
//                if (a[i] == a[j]) {
//                    visit = true;
//                    break;
//                }
//            }
//            if(visit) continue;
//            for(int k=i+1;k<a.length;k++){
//                if(a[i]==a[k])
//                    count++;
//            }
//            System.out.println(a[i]+"->"+count);
//        }
//    }
//}



//Another way
//public class FrequencyOfElements {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("How many elements you want to store in array:");
//        int n=sc.nextInt();
//        int [] a=new int[n];
//        System.out.println("Enter the elements");
//        for(int i=0;i<n;i++) {
//            a[i] = sc.nextInt();
//        }
//        for (int i = 0; i < a.length; i++) {
//            int count = 1;
//            boolean visit = false;
//            for (int j = 0; j < i; j++) {
//                if (a[i] == a[j]) {
//                    visit = true;
//                    break;
//                }
//            }
//            if (!visit) {
//                for (int k = i + 1; k < a.length; k++) {
//                    if (a[i] == a[k])
//                        count++;
//                }
//                System.out.println(a[i] + " = " + count);
//            }
//        }
//    }
//}


//import java.util.Arrays;
//
//public class FrequencyOfElements {
//    public static void main(String[] args) {
//        int[] arr = {1,1,1,2,2,3,3,3,3,3,4,1,1,2};
//        int[] n = new int[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            int value = arr[i];
//            int currentCount = n[value];
//            currentCount = currentCount + 1;
//            n[value] = currentCount;
//        }
//        for (int i = 0; i < n.length; i++) {
//            if (n[i] > 0) {
//                System.out.println(i + " = " + n[i]);
//            }
//        }
//    }
//}


//using collections

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfElements {
    public static void main(String[] args){
        int[] a={1,2,3,1,3,4};
        System.out.println(Arrays.toString(a));
        Map<Integer, Integer> m= new LinkedHashMap<>();
        for(int x:a){
            m.put(x,m.getOrDefault(x,0)+1);
        }
        for(Map.Entry<Integer,Integer> x:m.entrySet()){
            System.out.println(x.getKey()+"->"+x.getValue());
        }
    }
}