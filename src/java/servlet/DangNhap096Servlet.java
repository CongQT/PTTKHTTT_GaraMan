/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlet;

import dao.ThanhVien096DAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.ThanhVien096;


@WebServlet(name = "DangNhapController", urlPatterns = {"/dangnhap"})
public class DangNhap096Servlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            String username = request.getParameter("username");
            String pass = request.getParameter("matkhau");
            ThanhVien096 thanhvien = new ThanhVien096();
            thanhvien.setUsername(username);
            thanhvien.setMatKhau(pass);
            boolean kq = ThanhVien096DAO.kiemtraDangnhap(thanhvien);
            if(kq){
                HttpSession session = request.getSession();
                session.setAttribute("id", thanhvien.getId());
                if (thanhvien.getVaiTro().equals("quanly")) {                   
                    
                    response.sendRedirect("GDQuanLy096.jsp");
                } else {
                    response.sendRedirect("GDKhachHang096.jsp");
                }
            } else {
                response.sendRedirect("index.jsp");
            }
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
