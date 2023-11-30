/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.ThanhVien096;

/**
 *
 * @author acer
 */
public class ThanhVien096DAO extends DAO {
    public ThanhVien096DAO() {
        super();
    }

    public static boolean kiemtraDangnhap(ThanhVien096 ThanhVien) {
        boolean kq = false;
        String sql = "select * from thanhvien096 where username = ? and matkhau = ?";
        try {
            Connection con = null;
            con = getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, ThanhVien.getUsername());
            ps.setString(2, ThanhVien.getMatKhau());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                ThanhVien.setId(rs.getInt("id"));
                ThanhVien.setVaiTro(rs.getString("vaiTro"));
                ThanhVien.setHoTen(rs.getString("hoTen"));
                ThanhVien.setDiaChi(rs.getString("diaChi"));
                ThanhVien.setEmail(rs.getString("email"));
                ThanhVien.setSdt(rs.getString("sdt"));
                kq = true;
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
            kq = false;
        }
        return kq;
    }
}
