/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import static dao.DAO.getConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.DichVu096;
import model.DichVuDonDat096;
import model.HoaDon096;
import model.PhuTung096;
import model.PhuTungDonDat096;

/**
 *
 * @author 84382
 */
public class HoaDonChiTiet096DAO extends DAO{
    public HoaDonChiTiet096DAO() {
        super();
    }

    public static List<DichVuDonDat096> getHoaDonDVChiTiet(int donDatid) {
        List<DichVuDonDat096> kq = new ArrayList<>();
        String sql = "SELECT D.id, D.ten, D.gia from dichvu096 D JOIN dichvudondat096 DD ON D.id= DD.DichVu096id JOIN dondat096 DON ON DON.id=DD.DonDat096id where DON.id=?";
        try (Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement(sql)){           
            ps.setInt(1,donDatid);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id=rs.getInt("id");
                float gia = rs.getFloat("gia");
                String ten = rs.getString("ten");
                DichVu096 dv=new DichVu096();
                dv.setId(id);
                dv.setTen(ten);
                dv.setGia(gia);
                DichVuDonDat096 dvdd=new DichVuDonDat096();
                dvdd.setDichVu096(dv);
                kq.add(dvdd);
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kq;
    }
    public static List<PhuTungDonDat096> getHoaDonPTChiTiet(int donDatid) {
        List<PhuTungDonDat096> kq = new ArrayList<>();
        String sql = "SELECT D.id, D.ten, D.gia from phutung096 D JOIN phutungdondat096 DD ON D.id= DD.PhuTung096id JOIN dondat096 DON ON DON.id=DD.DonDat096id where DON.id=?";
        try (Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement(sql)){           
            ps.setInt(1,donDatid);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id=rs.getInt("id");
                float gia = rs.getFloat("gia");
                String ten = rs.getString("ten");
                PhuTung096 dv=new PhuTung096();
                dv.setId(id);
                dv.setTen(ten);
                dv.setGia(gia);
                PhuTungDonDat096 dvdd=new PhuTungDonDat096();
                dvdd.setPhuTung096(dv);
                kq.add(dvdd);
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kq;
    }
}
