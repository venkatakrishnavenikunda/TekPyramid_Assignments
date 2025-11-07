package Assignment_2;


public class ThirdMaxEle {
    public static void main(String[] args){
        int[]a={3,5,18,22,12,20};
        int max1=a[0];
        int max2=a[0];
        int max3=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max1){
                max3=max2;
                max2=max1;
                max1=a[i];
            }
            else if (a[i]>max2 && a[i]<max1){
                max3=max2;
                max2=a[i];
            }
            else if(a[i]>max3){
                max3=a[i];
            }
        }
        System.out.println("First max:"+max1);
        System.out.println("Second max:"+max2);
        System.out.println("Third max:"+max3);
    }
}