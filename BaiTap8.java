/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT;

import java.util.Scanner;
public class BaiTap8 {

    public static void main(String[] args) {
        CongCu cc = new CongCu();
        CongCu.BaiTap8 BT8 = cc. new BaiTap8();
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = in.nextInt();
        System.out.println("Cac so Fibo la SNT va nho hon " + n + ": " + BT8.LietKe(n));
        // TODO code application logic here
    }
    
}
