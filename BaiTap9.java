/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT;

import java.util.Scanner;
public class BaiTap9 {

    
    public static void main(String[] args) {
        CongCu cc = new CongCu();
        CongCu.BaiTap9 BT9 = cc. new BaiTap9();
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = in.nextInt();
        System.out.println("Cac uoc: " + BT9.LKUoc(n));
        // TODO code application logic here
    }
    
}
