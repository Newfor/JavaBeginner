/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;
import java.lang.Math.*;
import java.util.Scanner;
public class CongCu {
    Scanner in = new Scanner(System.in);
    class BaiTap1{
        int UCLN(int a, int b){
            while(a != b){
                if(a > b) a = a - b;
                if(a < b) b = b - a;
            }
            return a;
    }
        int BCNN(int a, int b) {
            return a*b/UCLN(a, b);
        }
    }
//-------------------------------------------------
    class BaiTap2{
        int power(int a){
            int p = 1;
            for(int i = 0; i < a; i++) p *= 10;
            return p;
        }
        int Sum(int n){
            int s = 0;
            String a = Integer.toString(n);
            for(int i = a.length() - 1; i >= 0; i--){
                s += n/power(i);
                n = (int) (n- (n/power(i))*power(i));
//                System.out.println("" + n);
            }
            return s;
        }
    }
//----------------------------------------------------
    class BaiTap3{
        String s = "";
        String ptnt(int n){            
//            int k = n/2 + 1;
            while(n != 1){
                int k = 2;
                while(n%k != 0){
                    k += 1;
                }
                s += k + " * ";
                n = n/k;
            }
            
            return s;
        }
    }
//--------------------------------------------------------
    class BaiTap4{
        boolean test(int k){
            boolean a = TRUE;
            if(k <= 1) a = FALSE;
            for(int i = 2; i <= Math.sqrt(k); i++){
                if(k%i == 0) a = FALSE;
            }
            return a;
        }
        String LietKe(int n){
            String s = "";
            int i = 2;
            while(i <= n){
                if(test(i)){
                    s += i + ", ";
                    i += 1;
                }
                else i += 1;
            }
            return s;
        }
    }
//---------------------------------------------------------
    class BaiTap5{
//        boolean test(int k){
//            boolean a = TRUE;
//            for(int i = 2; i <= Math.sqrt(k); i++){
//                if(k%i == 0) a = FALSE;
//            }
//            return a;
//        }
        BaiTap4 BTS4 = new BaiTap4();
        String LietKe(int n){
            String s = "";
            int i = 2;
            int dem = 0;
            while(dem < n){
                if(BTS4.test(i)){
                    s += i + ", ";
                    dem += 1;
                    i += 1;
                }
                else i += 1;
            }
            return s;
        }
    }
//------------------------------------------------------------
    class BaiTap6{
        int Fibo(int n){
            if(n == 1) return 0;
            else if(n == 2) return 1;
            else return (Fibo(n-1) + Fibo(n-2));
        }
    }
//--------------------------------------------------------------
    class BaiTap7{
        BaiTap2 B2 = new BaiTap2();
        BaiTap4 B4 = new BaiTap4();
        String s = "";
        String LietKe(int a){
            for(int i = 10000; i <= 99999; i++){
                if((B2.Sum(i) == a) && B4.test(i)) s += i + ", ";
            }
            return s;
        }
    }
//----------------------------------------------------------------
    class BaiTap8{
        BaiTap4 B48 = new BaiTap4();
        BaiTap6 B68 = new BaiTap6();
        int i = 1;
        String s = "";
        String LietKe(int n){
            while(B68.Fibo(i) < n){
                if(B48.test(B68.Fibo(i))) s += B68.Fibo(i) + ", ";
                i++;
            }
            return s;
        }
    }
//------------------------------------------------------------------
    class BaiTap9{
        BaiTap4 B49 = new BaiTap4();
        int k = 0;
        String s = "";
        String t = "";
        String LKUoc(int n){
            for(int i = 2; i <= n/2 + 1; i++){
                if(n%i == 0){
                    s += i + ", ";
                    k += 1;
                    if(B49.test(i)) t += i + ", ";
                }
            }
            s = s + "\nSo uoc: " + k + "\nCac uoc la SNT: " + t;
            return s;
        }
        
    }
}

