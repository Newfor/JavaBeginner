/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT;
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class Bai2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CongCu cc = new CongCu();
        CongCu.BaiTap2 BT2 = cc.new BaiTap2();
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap so n: ");
        int n = in.nextInt();
        System.out.println("" + BT2.Sum(n));
        // TODO code application logic here
    }
    
}
