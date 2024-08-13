package E2;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int threshold = sc.nextInt();
        int [] arr = new int[n];
        
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(findCount(arr,n,threshold));
    }
    static int findCount(int[] arr,int n,int threshold){
        int count = 0;
        for(int i = 0;i<n;i++){
            int copThres = threshold;
            int ele = arr[i];
            
            while (ele >= 1) {
                
                if(ele >= copThres){
                    count += ele/copThres;
                    ele= ele % copThres;
                }
                else{
                    copThres--;
                }
                
            }
        }
        return count;
    }
}
