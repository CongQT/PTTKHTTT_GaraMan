/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author acer
 */
public class KhachHang096 extends ThanhVien096{
	private int ThanhVien096id;

        public KhachHang096() {
        }
    
        public KhachHang096(int ThanhVien096id, int id, String username, String matKhau, String hoTen, String diaChi, String sdt, String email, String vaiTro) {
            super(id, username, matKhau, hoTen, diaChi, sdt, email, vaiTro);
            this.ThanhVien096id = ThanhVien096id;
        }

        public int getThanhVien096id() {
            return ThanhVien096id;
        }

        public void setThanhVien096id(int ThanhVien096id) {
            this.ThanhVien096id = ThanhVien096id;
        }


}
