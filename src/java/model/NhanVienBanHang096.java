/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author 84382
 */
public class NhanVienBanHang096 extends NhanVien096{
    private int NhanVien096ThanhVien096id;

    public NhanVienBanHang096(int NhanVien096ThanhVien096id, int thanhvien096id, String vitri) {
        super(thanhvien096id, vitri);
        this.NhanVien096ThanhVien096id = NhanVien096ThanhVien096id;
    }

    public NhanVienBanHang096(int NhanVien096ThanhVien096id, int thanhvien096id, String vitri, int id, String username, String matKhau, String hoTen, String diaChi, String sdt, String email, String vaiTro) {
        super(thanhvien096id, vitri, id, username, matKhau, hoTen, diaChi, sdt, email, vaiTro);
        this.NhanVien096ThanhVien096id = NhanVien096ThanhVien096id;
    }

    public int getNhanVien096ThanhVien096id() {
        return NhanVien096ThanhVien096id;
    }

    public void setNhanVien096ThanhVien096id(int NhanVien096ThanhVien096id) {
        this.NhanVien096ThanhVien096id = NhanVien096ThanhVien096id;
    }

    
}
