/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;
public class BaiTap3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        CongCu cc = new CongCu();
        CongCu.BaiTap3 BT3 = cc. new BaiTap3();
        System.out.print("Nhap n: ");
        int n = in.nextInt();
        System.out.println(n + " = " + BT3.ptnt(n));
        // TODO code application logic here
    }
    
}
