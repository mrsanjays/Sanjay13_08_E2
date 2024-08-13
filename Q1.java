package E2;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int [] arr = new int [n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        if( k > n) System.out.println("Not Possible");
        else findSubMax(arr,n,k);
    }
    static void findSubMax(int[] arr , int n , int k){
        
        for(int i = 0;i<=n-k;i++){
            int maxN = arr[i];
            int j  = i+1;
            int times = 1;
            while(++times <= k){
                maxN = Math.max(maxN,arr[j]);
                j++;
            }
            System.out.print(maxN+" ");
        }


    }
}
