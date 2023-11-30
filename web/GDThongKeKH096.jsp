<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Thống kê khách hàng theo doanh thu</title>
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
                width: 1100px;
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
            .login {
                
                height: 30px;
                background: transparent;           
                outline: none;
                font-size: 1em;
                padding:0 35px 0 5px;
                margin-bottom: 12px;
                border:1px solid #fff;
                border-radius: 30px;
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
                    <h2>Thống kê khách hàng theo doanh thu</h2>

                    <form style="color: #fff" id="thongKeForm" method="post" action="tkkh">
                        Ngày bắt đầu: <input class="login" type="date" id="startDate" name="startDate" value="${startDate}"><br>
                        Ngày kết thúc: <input class="login" type="date" id="endDate" name="endDate" value="${endDate}"> <br>
                        <button class="button" type="submit">Thực hiện thống kê</button>
                    </form>

                    <!-- Bảng thống kê dịch vụ -->
                    <c:if test="${not empty thongKeKH}">
                        <h2>Kết quả thống kê</h2>
                        <table border="1">
                                <thead>
                                    <tr>
                                        <th>STT</th>
                                        <th>Mã khách hàng</th>
                                        <th>Tên khách hàng</th>
                                        <th>Địa chỉ</th>
                                        <th>Số điện thoại</th>
                                        <th>Email</th>
                                        <th>Tổng doanh thu</th>
                                        <th>Xem chi tiết</th>
                                    </tr>
                                </thead>
                                <tbody>
                                <c:forEach var="tk" items="${thongKeKH}" varStatus="loop">
                                    <tr>
                                        <td><c:out value="${loop.index + 1}" /></td>
                                        <td><c:out value="${tk.getThanhVien096id()}" /></td>
                                        <td><c:out value="${tk.getHoTen()}" /></td>
                                        <td><c:out value="${tk.getDiaChi()}" /></td>
                                        <td><c:out value="${tk.getSdt()}" /></td>
                                        <td><c:out value="${tk.getEmail()}" /></td>
                                        <td><c:out value="${tk.tongDoanhThu}đ" /></td>
                                        <td><a href="hdct?khachHang096id=${tk.getThanhVien096id()}&name=${tk.getHoTen()}&tongDoanhThu=${tk.tongDoanhThu}">Xem chi tiết</a></td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>

                    </c:if>
                    <c:if test="${empty thongKeKH}">
                        <p>Không có dữ liệu để hiển thị.</p>
                    </c:if>
            </div>
        </div>
    </section>   
</body>
</html>
