package Assignment_2;


public class MaxElement {
    public static void main(String[] args){
        int[] a={3,6,8,1,2,7};
        int max=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println("Largest element:"+max);
    }
}