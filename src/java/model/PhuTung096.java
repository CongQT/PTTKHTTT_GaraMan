/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author acer
 */
public class PhuTung096 {
    private int id;
    private String ten;
    private float gia;
    private int soluong;
    private String mota;

    public PhuTung096() {
    }

    
    public PhuTung096(int id, String ten, float gia, int soluong, String mota) {
        this.id = id;
        this.ten = ten;
        this.gia = gia;
        this.soluong = soluong;
        this.mota = mota;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public int getSoLuong() {
        return soluong;
    }

    public void setSoLuong(int soLuong) {
        this.soluong = soLuong;
    }

    public String getMoTa() {
        return mota;
    }

    public void setMoTa(String moTa) {
        this.mota = moTa;
    }

    
}
