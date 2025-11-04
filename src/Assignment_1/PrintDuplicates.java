package Assignment_1;
import java.util.Scanner;

public class PrintDuplicates {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("How elements want to add in an array:");
        int n=sc.nextInt();
        int[]a=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }
        System.out.println("Duplicates elements:");
        for(int j=0; j<a.length;j++){
            boolean ele=false;
            for(int k=0; k<j;k++){
                if(a[j]==a[k]){
                    ele=true;
                    break;
                }
            }
            if(ele)
                System.out.println(a[j]);
        }
    }
}