<%-- 
    Document   : GDTimKiemDVPT096
    Created on : Nov 13, 2023, 11:23:17 PM
    Author     : 84382
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Tìm kiếm</title>
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
                width: 500px;
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
                    <h2>Tìm kiếm thông tin dịch vụ/phụ tùng</h2>

                    <form style="color: #fff" action="timkiem" method="post"  accept-charset="UTF-8">
                        Nhập tên: <input type="text" name="tenCanTim"  value="${tenCanTim}">
                        <input type="submit" value="Tìm kiếm">
                    </form>

                    <c:choose>

                        <c:when test="${not empty danhSachDichVu}">
                            <h3>Kết quả tìm kiếm dịch vụ</h3>
                            <table border="1">
                                <tr>
                                    <th>ID</th>
                                    <th>Tên</th>
                                    <th>Giá</th>
                                    <th>Xem chi tiết</th>

                                </tr>
                                <c:forEach var="dichVu" items="${danhSachDichVu}">
                                    <tr>
                                        <td><c:out value="${dichVu.id}" /></td>
                                        <td><c:out value="${dichVu.ten}" /></td>
                                        <td><c:out value="${dichVu.gia}" /></td>
                                        <td><a href="chitietdvpt?type=dichvu&id=${dichVu.id}">Xem chi tiết</a></td>
                                    </tr>
                                </c:forEach>
                            </table>
                        </c:when>
                    </c:choose>
                    <c:choose>
                        <c:when test="${not empty danhSachPhuTung}">
                            <h3>Kết quả tìm kiếm phụ tùng</h3>
                            <table border="1">
                                <tr>
                                    <th>ID</th>
                                    <th>Tên</th>
                                    <th>Giá</th>
                                    <th>Xem chi tiết</th>

                                </tr>
                                <c:forEach var="phuTung" items="${danhSachPhuTung}">
                                    <tr>
                                        <td><c:out value="${phuTung.id}" /></td>
                                        <td><c:out value="${phuTung.ten}" /></td>
                                        <td><c:out value="${phuTung.gia}" /></td>
                                        <td><a href="chitietdvpt?type=phutung&id=${phuTung.id}">Xem chi tiết</a></td>
                                    </tr>
                                </c:forEach>
                            </table>
                        </c:when>
                    </c:choose>
                </div>
            </div>
        </section>  
</body>
</html>
