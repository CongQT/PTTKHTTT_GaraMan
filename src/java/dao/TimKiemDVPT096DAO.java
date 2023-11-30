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
import java.util.List;
import model.DichVu096;
import model.PhuTung096;

/**
 *
 * @author 84382
 */
public class TimKiemDVPT096DAO extends DAO {
    public TimKiemDVPT096DAO() {
        super();
    }

    public static List<DichVu096> getTimKiemDV(String tenCanTim) {
        List<DichVu096> kq = new ArrayList<>();
        String sql = "SELECT * FROM dichvu096 WHERE LOWER(ten) LIKE LOWER(?)";
        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql)){
            
            ps.setString(1,"%"+tenCanTim.toLowerCase()+"%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String ten = rs.getString("ten");
                float gia = rs.getFloat("gia");
          
                String mota=rs.getString("mota");
                DichVu096 dichVu=new DichVu096(id,ten,gia,mota);
                
                kq.add(dichVu);
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kq;
    }
    public static List<PhuTung096> getTimKiemPT(String tenCanTim) {
        List<PhuTung096> kq = new ArrayList<>();
        String sql = "SELECT * FROM phutung096 WHERE LOWER(ten) LIKE LOWER(?)";
        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql)){
            
            ps.setString(1,"%"+tenCanTim.toLowerCase()+"%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String ten = rs.getString("ten");
                float gia = rs.getFloat("gia");
                int soluong=rs.getInt("soluong");
                String mota=rs.getString("mota");
                PhuTung096 phuTung=new PhuTung096(id,ten,gia,soluong,mota);
                
                kq.add(phuTung);
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kq;
    }
}
