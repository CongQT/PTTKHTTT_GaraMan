/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author 84382
 */
public class TKKhachHang extends KhachHang096{
    private float tongDoanhThu;

    public TKKhachHang(float tongDoanhThu, int ThanhVien096id, int id, String username, String matKhau, String hoTen, String diaChi, String sdt, String email, String vaiTro) {
        super(ThanhVien096id, id, username, matKhau, hoTen, diaChi, sdt, email, vaiTro);
        this.tongDoanhThu = tongDoanhThu;
    }

    public TKKhachHang() {
    }

    public float getTongDoanhThu() {
        return tongDoanhThu;
    }

    public void setTongDoanhThu(float tongDoanhThu) {
        this.tongDoanhThu = tongDoanhThu;
    }

    
}
