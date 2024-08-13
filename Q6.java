package E2;

import java.util.Arrays;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        shiftArray(arr,n);
        System.out.println(Arrays.toString(arr));
    }
    static void shiftArray(int[] arr,int n){
        for(int i = n-2; i >= 0;i--){
            if(arr[i] == 0){
                for(int j = n - 2 ;j>=i;j-- ){
                    arr[j+1] = arr[j];
                }
            }
        }
    }
}
