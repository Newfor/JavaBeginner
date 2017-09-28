/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT;

import java.util.Scanner;
public class BaiTap6 {
    
    public static void main(String[] args) {
        CongCu cc = new CongCu();
        CongCu.BaiTap6 BT6 = cc.new BaiTap6();
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = in.nextInt();
        System.out.println("So Fibonacci thu " + n + " la: " + BT6.Fibo(n));
        // TODO code application logic here
    }
    
}
