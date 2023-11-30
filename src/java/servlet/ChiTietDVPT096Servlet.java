/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servlet;

import dao.ChiTietDVPT096DAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.DichVu096;
import model.PhuTung096;

/**
 *
 * @author 84382
 */
@WebServlet(name = "ChiTietDVPT096Controller", urlPatterns = {"/chitietdvpt"})
public class ChiTietDVPT096Servlet extends HttpServlet{
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            
            String type = request.getParameter("type");
            if(type.equals("dichvu")){
                int dichVuId = Integer.parseInt(request.getParameter("id"));
                DichVu096 chiTietDichVu = ChiTietDVPT096DAO.getTimKiemChiTietDichVu(dichVuId);
                request.setAttribute("chiTietDichVu", chiTietDichVu);          
            }
            if(type.equals("phutung")){
                int phuTungId = Integer.parseInt(request.getParameter("id"));
                PhuTung096 chiTietPhuTung = ChiTietDVPT096DAO.getTimKiemChiTietPhuTung(phuTungId);
                request.setAttribute("chiTietPhuTung", chiTietPhuTung);
                
            }
                    
            request.getRequestDispatcher("GDChiTietDVPT.jsp").forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
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
