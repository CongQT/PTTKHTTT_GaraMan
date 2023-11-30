/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author 84382
 */
public class HoaDon096 {
    private int id;
    private float tongTien;
    private Date date;
    private String ghiChu;
    private DonDat096 donDat096;
    private NhanVienBanHang096 nhanVienBanHang096;
    private KhachHang096 khachHang096;

    public HoaDon096(int id, float tongTien, Date date, String ghiChu, KhachHang096 khachHang096) {
        this.id = id;
        this.tongTien = tongTien;
        this.date = date;
        this.ghiChu = ghiChu;
        this.khachHang096 = khachHang096;
    }

    
    public HoaDon096() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getTongTien() {
        return tongTien;
    }

    public void setTongTien(float tongTien) {
        this.tongTien = tongTien;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public DonDat096 getDonDat096() {
        return donDat096;
    }

    public void setDonDat096(DonDat096 donDat096) {
        this.donDat096 = donDat096;
    }

    public NhanVienBanHang096 getNhanVienBanHang096() {
        return nhanVienBanHang096;
    }

    public void setNhanVienBanHang096(NhanVienBanHang096 nhanVienBanHang096) {
        this.nhanVienBanHang096 = nhanVienBanHang096;
    }

    public KhachHang096 getKhachHang096() {
        return khachHang096;
    }

    public void setKhachHang096(KhachHang096 khachHang096) {
        this.khachHang096 = khachHang096;
    }
    
}
