/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT;

import java.util.Scanner;
public class BaiTap4 {
    public static void main(String[] args) {
        // TODO code application logic here
        CongCu cc = new CongCu();
        CongCu.BaiTap4 BT4 = cc. new BaiTap4();
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = in.nextInt();
        System.out.println("Cac so nguyen to nho hon " + n + ": " + BT4.LietKe(n));
    }
    
}
