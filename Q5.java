package E2;

import java.util.Arrays;
import java.util.Scanner;

public  class Q5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(checkPossible(arr,n));
    }
    static boolean checkPossible(int [] arr , int n){
        if(n % 2==1){
            return false;
        }
        int xor = 0;
        for(int i = 0;i<n;i++){
            xor^=arr[i]
        }
        return xor == 0;

    }
}
