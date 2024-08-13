package E2;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int base = sc.nextInt();
        System.out.println(convertIntoBase(num1,num2,base));
    }
    static int convertIntoBase(int n1,int n2,int b){

        int res = 0;
        int carry = 0;
        while(n1>0 && n2>0){
            int rem = carry + (n1%10 + n2 % 10);
            res =  res*10 + rem%b;
            if(rem>=b){
                carry = 1;
            }
            else{
                carry = 0;
            }
            n1/=10;
            n2/=10;
        }
        if(carry == 0){
            if(n1 == 0){
                while(n2>0){
                    res = res * 10 + n2%10;
                    n2/=10;
                }
            }
            else{
                while(n1>0){
                    res = res * 10 + n1%10;
                    n1/=10;
                }
            }
        }
        else{
            if(n1 == 0){
                while(n2>0){
                    int rem = carry + (n2%10);
                    res = res * 10 + rem %b;
                    n2/=10;
                    if(rem>=carry) carry = 1;
                    else carry = 0;
                }
            }
            else{
                while(n1>0){
                    int rem = carry + (n1%10);
                    res = res * 10 + rem %b;
                    n1/=10;
                    if(rem>=carry) carry = 1;
                    else carry = 0;
                }
            }
        }
        if(carry == 1){
            res = res * 10 + 1;
        }
        
        return reverse(res);
    }
    static int reverse(int num){
        int res = 0;
        while(num>0){
            res = res * 10 + num % 10;
            num/=10;
        }
        return res;
    }
}
