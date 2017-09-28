/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT;

import java.util.Scanner;
public class BaiTap5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CongCu cc =new CongCu();
        CongCu.BaiTap5 BT5 = cc.new BaiTap5();
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = in.nextInt();
        System.out.println(n + " so nguyen to dau tien: " + BT5.LietKe(n));
        // TODO code application logic here
    }
    
}
