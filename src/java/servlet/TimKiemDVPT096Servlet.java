/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servlet;

import dao.ThanhVien096DAO;
import dao.TimKiemDVPT096DAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.DichVu096;

import model.PhuTung096;
import model.ThanhVien096;

/**
 *
 * @author 84382
 */
@WebServlet(name = "TimKiemDVPT096Controller", urlPatterns = {"/timkiem"})
public class TimKiemDVPT096Servlet extends HttpServlet{
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String tenCanTim = request.getParameter("tenCanTim");
            request.setAttribute("tenCanTim", tenCanTim);
            if (tenCanTim != null && !tenCanTim.isEmpty()) {
                List<DichVu096> danhSachDichVu = TimKiemDVPT096DAO.getTimKiemDV(tenCanTim);
                List<PhuTung096> danhSachPhuTung = TimKiemDVPT096DAO.getTimKiemPT(tenCanTim);
                
                System.out.println("Danh sach phu tung: " + danhSachPhuTung);
                request.setAttribute("danhSachDichVu", danhSachDichVu);
                request.setAttribute("danhSachPhuTung", danhSachPhuTung);
                
            } else {
                // Handle the case where the search parameter is empty
                System.out.println("Empty search parameter");
            }
        } catch (Exception e) {
            // Log the exception for debugging
            e.printStackTrace();
        }
        
        // Forward to index.jsp
        request.getRequestDispatcher("GDTimKiemDVPT096.jsp").forward(request, response);
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
