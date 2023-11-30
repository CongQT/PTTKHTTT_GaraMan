/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servlet;

import dao.ThongKeKHTheoDoanhThu096DAO;
import dao.TimKiemDVPT096DAO;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.TKKhachHang;
import model.PhuTung096;

/**
 *
 * @author 84382
 */
@WebServlet(name = "TKKhachHangTheoDoanhThu096", urlPatterns = {"/tkkh"})
public class TKKhachHangTheoDoanhThu096 extends HttpServlet{
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String startDate = request.getParameter("startDate");
            String endDate = request.getParameter("endDate");
            request.setAttribute("startDate", startDate);
            request.setAttribute("endDate", endDate);
            List<TKKhachHang> thongKeKH = ThongKeKHTheoDoanhThu096DAO.getKhachHangTK(startDate, endDate); 
            request.setAttribute("thongKeKH", thongKeKH);
            
        } catch (Exception e) {
            // Log the exception for debugging
            e.printStackTrace();
        }
        
        // Forward to index.jsp
        request.getRequestDispatcher("GDThongKeKH096.jsp").forward(request, response);
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
