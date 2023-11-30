/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author acer
 */
public class NhanVien096 extends ThanhVien096{
    private int thanhvien096id;
    private String vitri;

    public NhanVien096(int thanhvien096id, String vitri) {
        this.thanhvien096id = thanhvien096id;
        this.vitri = vitri;
    }

    public NhanVien096(int thanhvien096id, String vitri, int id, String username, String matKhau, String hoTen, String diaChi, String sdt, String email, String vaiTro) {
        super(id, username, matKhau, hoTen, diaChi, sdt, email, vaiTro);
        this.thanhvien096id = thanhvien096id;
        this.vitri = vitri;
    }

    public int getThanhvien096id() {
        return thanhvien096id;
    }

    public void setThanhvien096id(int thanhvien096id) {
        this.thanhvien096id = thanhvien096id;
    }

    public String getVitri() {
        return vitri;
    }

    public void setVitri(String vitri) {
        this.vitri = vitri;
    }

    
}
