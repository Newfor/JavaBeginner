
package BT;

import java.util.Scanner;
public class BaiTap7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CongCu cc = new CongCu();
        CongCu.BaiTap7 BT7 = cc. new BaiTap7();
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap S: ");
        int a = in.nextInt();
        System.out.println("Cac so thoa man: " + BT7.LietKe(a));
        // TODO code application logic here
    }
    
}
