package Assignment_1;
import java.util.Scanner;

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
public class FrequencyOfElements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many elements you want to store in array:");
        int n=sc.nextInt();
        int [] a=new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            int count = 1;
            boolean visit = false;

            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    visit = true;
                    break;
                }
            }
            if (!visit) {
                for (int k = i + 1; k < a.length; k++) {
                    if (a[i] == a[k])
                        count++;
                }
                System.out.println(a[i] + " = " + count);
            }
        }
    }
}