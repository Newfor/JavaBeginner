/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlyptgt;
import java.util.*;
import java.io.*;
/**
 *
 * @author Administrator
 */
public class YeuCau {
    Scanner in = new Scanner(System.in);
    public void Nhap() throws IOException{
        int choice = -1;
//        String HangSX, Mau, KieuDongCo;
//        int NamSX, Gia, SeatNum, CongSuat, TrongTai;
        File fn = new File("F:/BaiTap");
        fn.mkdir();
        Writer wn = new FileWriter("F:/BaiTap/PTGT.txt");
        wn.append(" asd");
        while(choice <0 || choice > 3){
            System.out.println("Lọai PTGT: \n\t1.Ô tô\n\t2.Xe máy\n\tt3.Xet tải\n\t0.Thoát");
            choice = in.nextInt();
            in.nextLine();
        }//end while
        System.out.print("Nhập hãng sản xuất: ");
        String HangSX = in.nextLine();
//        in.nextLine();
        System.out.print("Nhap mau: ");
        String Mau = in.nextLine();
        System.out.print("Nam san xuat: ");
        int NamSX = in.nextInt();
        System.out.print("Gia: ");
        int Gia = in.nextInt();
        in.nextLine();
        switch(choice){
            case 1:{
                System.out.print("Kieu dong co: ");
                String KieuDongCo = in.nextLine();
                System.out.print("So cho ngoi: ");
                int SeatNum = Integer.parseInt(in.nextLine());
                OTo oto = new OTo(HangSX, Mau, NamSX, Gia, KieuDongCo, SeatNum);
                System.out.println("" + oto.toString());
//                wn.write(oto.toString());
                wn.write("Hello");
                break;
            }//end case 1
            case 2:{
                System.out.print("Cong suat: ");
                int CongSuat = in.nextInt();
                // Viet vao file
                break;
            }//end case 2
            case 3:{
                System.out.print("Trong tai: ");
                int TrongTai = in.nextInt();
                //Viet vao file
                break;
            }//end case 3
            case 0:{
                break;
            }//end 0
        }// end switch
        System.out.print("Tiep tuc?\n\t1.Co\t2.Khong\n");
        choice = in.nextInt();
        if(choice == 1) Nhap();
        else ;
    }//end Nhap
    
}// end YC(class)
