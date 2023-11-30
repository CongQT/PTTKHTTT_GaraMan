/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import static dao.DAO.getConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.DichVu096;
import model.PhuTung096;

/**
 *
 * @author 84382
 */
public class ChiTietDVPT096DAO extends DAO{
    public ChiTietDVPT096DAO() {
        super();
    }
    public static DichVu096 getTimKiemChiTietDichVu(int dichVuId) {
        DichVu096 chiTietDichVu = null;
        String sql = "SELECT * FROM dichvu096 WHERE id = ?";

        try (Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, dichVuId);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                int id = rs.getInt("id");
                String ten = rs.getString("ten");
                float gia = rs.getFloat("gia");
                String mota = rs.getString("mota");

                chiTietDichVu = new DichVu096(id, ten, gia, mota);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return chiTietDichVu;
    }
    public static PhuTung096 getTimKiemChiTietPhuTung(int phuTungId) {
        PhuTung096 chiTietPhuTung = null;
        String sql = "SELECT * FROM phutung096 WHERE id = ?";

        try (Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, phuTungId);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                int id = rs.getInt("id");
                String ten = rs.getString("ten");
                float gia = rs.getFloat("gia");
                int soluong = rs.getInt("soluong");
                String mota = rs.getString("mota");

                chiTietPhuTung = new PhuTung096(id, ten, gia, soluong, mota);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return chiTietPhuTung;
    }
}

