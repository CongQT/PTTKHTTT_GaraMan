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
import model.DonDat096;
import model.HoaDon096;
import model.KhachHang096;
import model.TKKhachHang;

/**
 *
 * @author 84382
 */
public class TKKhachHangChiTiet096DAO extends DAO{
    public TKKhachHangChiTiet096DAO() {
        super();
    }

    public static List<HoaDon096> getDSHoaDonMotKH(int khachHangId) {
        List<HoaDon096> kq = new ArrayList<>();
        String sql = "SELECT H.id,H.thoigian,H.tongTien,H.ghiChu, H.donDat096id from hoadon096 H JOIN khachhang096 K ON K.ThanhVien096id= H.khachHang096id JOIN thanhvien096 T ON T.id=K.ThanhVien096id WHERE khachHang096id = ?";
        try (Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement(sql)){           
            ps.setInt(1,khachHangId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id =rs.getInt("id");                
                Date thoigian = rs.getDate("thoigian");
                float tongTien = rs.getFloat("tongTien");
                String ghiChu = rs.getString("ghiChu");
                int donDatid=rs.getInt("donDat096id");
                HoaDon096 hoadon=new HoaDon096();
                hoadon.setDate(thoigian);
                hoadon.setGhiChu(ghiChu);
                hoadon.setId(id);
                hoadon.setTongTien(tongTien);
                DonDat096 dd =new DonDat096();
                dd.setId(donDatid);
                hoadon.setDonDat096(dd);
                kq.add(hoadon);
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kq;
    }
}
    
