/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.KhachHang096;
import model.TKKhachHang;

/**
 *
 * @author 84382
 */
public class ThongKeKHTheoDoanhThu096DAO extends DAO{
    public ThongKeKHTheoDoanhThu096DAO() {
        super();
    }

    public static List<TKKhachHang> getKhachHangTK(String startDate, String endDate) {
        List<TKKhachHang> kq = new ArrayList<>();
        String sql = "SELECT K.ThanhVien096id as thanhvien096id,T.hoTen as hoten,T.diachi as diachi,T.email as email,T.sdt as sdt, SUM(tongTien) AS tongDoanhThu FROM thanhvien096 T Join  KhachHang096 K ON T.id = K.ThanhVien096id Join hoadon096 H ON k.ThanhVien096id=H.khachHang096id WHERE H.thoigian BETWEEN ? AND ? GROUP BY ThanhVien096id";
        try (Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement(sql)){
            
            ps.setString(1,startDate);
            ps.setString(2,endDate);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int ThanhVien096id =rs.getInt("thanhvien096id");               
                String hoten = rs.getString("hoten");
                String diachi = rs.getString("diachi");
                String sdt = rs.getString("sdt");
                String email = rs.getString("email");
                float tongDoanhThu= rs.getFloat("tongDoanhThu");
                TKKhachHang tk=new TKKhachHang();
                tk.setHoTen(hoten);
                tk.setThanhVien096id(ThanhVien096id);
                tk.setTongDoanhThu(tongDoanhThu);
                tk.setDiaChi(diachi);
                tk.setSdt(sdt);
                tk.setEmail(email);
                kq.add(tk);
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kq;
    }
}
