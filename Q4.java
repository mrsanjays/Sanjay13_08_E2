package E2;

import java.util.Arrays;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String pat = sc.next();
        findOcc(s,pat);
    }
    static void findOcc(String s,String pat){
        
        int j = 0;
        int i = 1;
        String str = pat+"#"+s;
        int lps[] = new int[str.length()];
        while( i < str.length()){
            if(str.charAt(i) == str.charAt(j)){
                j++;
                lps[i++] = j; 
            }
            else{
                if(j == 0) i++;
                else{
                    j = lps[j-1];
                }
            }
        }
        boolean f = true;
        System.out.println(Arrays.toString(lps));
        j = 0;
        for( i = pat.length()+1;i<str.length();i++){
            if(lps[i] == pat.length()){
                System.out.println(j-pat.length()+1);
                f = false;
                break;
            }
            j++;
        }
        if(f) System.out.println(-1);
        

    }
}
