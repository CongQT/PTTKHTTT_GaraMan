/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servlet;

import dao.TKKhachHangChiTiet096DAO;
import dao.ThongKeKHTheoDoanhThu096DAO;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.HoaDon096;
import model.TKKhachHang;

/**
 *
 * @author 84382
 */
@WebServlet(name = "TKKhachHangChiTiet096", urlPatterns = {"/hdct"})
public class TKKhachHangChiTiet096 extends HttpServlet{
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            int khachHang096id = Integer.parseInt(request.getParameter("khachHang096id"));
            String name = request.getParameter("name");
            float tongDoanhThu = Float.parseFloat(request.getParameter("tongDoanhThu"));
            request.setAttribute("khachHang096id", khachHang096id);
            request.setAttribute("name", name);
            request.setAttribute("tongDoanhThu", tongDoanhThu);
            List<HoaDon096> hoadonct = TKKhachHangChiTiet096DAO.getDSHoaDonMotKH(khachHang096id); 
            request.setAttribute("hoadonct", hoadonct);
           
        } catch (Exception e) {
            // Log the exception for debugging
            e.printStackTrace();
        }
        
        // Forward to index.jsp
        request.getRequestDispatcher("GDThongKeKHChiTiet096.jsp").forward(request, response);
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {
            processRequest(request, response);
        }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {
            processRequest(request, response);
        }

        /**
         * Returns a short description of the servlet.
         *
         * @return a String containing servlet description
         */
         @Override
    public String getServletInfo() {
            return "Short description";
        }// </editor-fold>
}

