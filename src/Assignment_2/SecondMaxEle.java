package Assignment_2;


public class SecondMaxEle {
    public static void main(String[] args){
        int[] a={5,-2,9,3,5,12,8};
        int max1=0;
        int max2=0;
        for(int i=0; i<a.length;i++) {
            if (a[i] > max1) {
                max2 = max1;
                max1 = a[i];
            }
//            else if (a[i]>max2 && a[i]!=max1){
//                max2=a[i];
//            }
        }
        System.out.println("First largest Element:"+max1);
        System.out.println("Second large Element:"+max2);
    }
}