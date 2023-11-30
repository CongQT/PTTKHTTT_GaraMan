<%-- 
    Document   : GDThongKeKHChiTiet096
    Created on : Nov 14, 2023, 10:56:53 AM
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
                    <c:if test="${not empty hoadonct}">
                        <h2>Thống kê khách hàng chi tiết</h2>
                        <div>
                            Mã khách hàng: ${khachHang096id}<br>
                            Tên khách hàng: ${name}<br>
                            Tổng doanh thu khách hàng: ${tongDoanhThu}<br><br>
                        </div>
                        
                        <table border="1">
                                <thead>
                                    <tr>
                                        <th>STT</th>
                                        <th>Mã hoá đơn</th>
                                        <th>Thời gian</th>
                                        <th>Tổng tiền</th>
                                        <th>Ghi chú</th>
                                        <th>Xem chi tiết</th>
                                    </tr>
                                </thead>
                                <tbody>
                                <c:forEach var="hd" items="${hoadonct}" varStatus="loop">
                                    <tr>
                                        <td><c:out value="${loop.index + 1}" /></td>
                                        <td><c:out value="${hd.getId()}" /></td>
                                        <td><c:out value="${hd.getDate()}" /></td>
                                        <td><c:out value="${hd.getTongTien()}" /></td>
                                        <td><c:out value="${hd.getGhiChu()}" /></td>
                                        <td><a href="ddct?donDatid=${hd.getDonDat096().getId()}&tongTien=${hd.getTongTien()}&khachHang096id=${khachHang096id}&name=${name}&tongDoanhThu=${tongDoanhThu}">Xem chi tiết</a></td>
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
