<%-- 
    Document   : GDHoaDonChiTiet
    Created on : Nov 14, 2023, 1:47:07 PM
    Author     : 84382
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            section{
                margin: 0;
                display: flex;
                justify-content: center;
                align-items: center;
                min-height: 100vh;
                width: 100%; 
                background-color: #E3EFE5;
                background-image: linear-gradient(140deg, #8BA38F 5%, #b4dfbb 50%, #E3EFE5 95%);
                background-position: center;
                background-size: cover;
            }
            .form-box{
                position: relative;
                width: 700px;
                height: 550px;
                background: transparent;
                border: 2px solid rgba(255,255,255,0.5);
                border-radius: 20px;
                backdrop-filter: blur(15px);
                display: flex;
                justify-content: center;
                align-items: center;
            }
            h2{
                font-size: 2em;
                color: #fff;
                text-align: center;
               
            }
            
            .button{
                background-color: #fff;
                border:none;
                border-radius: 30px;
                text-decoration: none;
            }
            table {
                border-collapse: collapse;
                
                text-align: center;
            }
            table, th, td {
                border: 1px solid #ffffff   ;
            }
            th, td {
                padding: 10px;
            }
        </style>
    </head>
    <body>
        <section>
            <div class="form-box">
                <div class="form-value">
                    <c:if test="${not empty dondatdv}">
                        <h2>Hoá đơn chi tiết</h2>
                        Mã hoá đơn: ${donDatid}<br>
                        Mã khách hàng: ${khachHang096id}<br>
                        Tên khách hàng: ${name}<br>
                        Tổng doanh thu khách hàng: ${tongDoanhThu}<br>
                        Tổng tiền hoá đơn: ${tongTien}<br><br>
                        <table border="1">
                                <thead>
                                    <tr>
                                        <th>Mã dịch vụ/phụ tùng</th>
                                        <th>Tên dịch vụ/phụ tùng</th>
                                        <th>Giá</th>

                                    </tr>
                                </thead>
                                <tbody>
                                <c:forEach var="hd" items="${dondatdv}" varStatus="loop">
                                    <tr>
                                        <td><c:out value="${hd.getDichVu096().getId()}" /></td>
                                        <td><c:out value="${hd.getDichVu096().getTen()}" /></td>
                                        <td><c:out value="${hd.getDichVu096().getGia()}" /></td>

                                    </tr>
                                </c:forEach>
                                <c:forEach var="hd" items="${dondatpt}" varStatus="loop">
                                    <tr>
                                        <td><c:out value="${hd.getPhuTung096().getId()}" /></td>
                                        <td><c:out value="${hd.getPhuTung096().getTen()}" /></td>
                                        <td><c:out value="${hd.getPhuTung096().getGia()}" /></td>

                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>

                    </c:if>
                </div>
        </div>
    </section> 
    </body>
</html>
