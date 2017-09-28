/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlyptgt;
import java.util.*;
/**
 *
 * @author Administrator
 */
public class OTo extends PTGT {
    private String KieuDongCo;
    private int SeatNum;
    public void OTo(){};
    public OTo(String HangSX, String Mau, int NamSX, int Gia, String KieuDongCo, int SeatNum){
        this.setHangSX(HangSX);
        this.setMau(Mau);
        this.setNamSX(NamSX);
        this.setGia(Gia);
        this.KieuDongCo = KieuDongCo;
        this.SeatNum = SeatNum;
    }
    
    //setters
    public void setKieuDongCo(String KieuDongCo){
        this.KieuDongCo = KieuDongCo;
    }
    public void setSeatNum(int SeatNum){
        this.SeatNum = SeatNum;
    }
    
    //getters
    public String getKieuDongCo(){
        return KieuDongCo;
    }
    public int getSeatNum(){
        return SeatNum;
    }
    
    @Override
    public String toString(){
        return getHangSX() + "\t" + getMau() + "\t" + KieuDongCo + "\t" + SeatNum + "\t" +
                    getNamSX() + "\t" + getGia() + "\n";
    }
}
