
package BT;

import java.util.Scanner;
//import BT.CongCu.BaiTap1;
public class Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a, b;
        CongCu cc = new CongCu();
        CongCu.BaiTap1 BT1 = cc. new BaiTap1();
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap 2 so a va b: ");
        a = in.nextInt();
        b = in.nextInt();
        System.out.println("UCLN cua a va b: " + BT1.UCLN(a, b));
        System.out.println("BCNN cua a va b la: " + BT1.BCNN(a, b));
        // TODO code application logic here
    }
    
}
