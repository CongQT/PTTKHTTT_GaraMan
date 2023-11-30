<%-- 
    Document   : GDChiTietDVPT
    Created on : Nov 13, 2023, 10:55:16 PM
    Author     : 84382
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Chi Tiết Phụ Tùng</title>
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
            
        </style>
</head>
<body>
    <section>
       <div class="form-box">
            <div class="form-value">
                    <c:choose>
                    <c:when test="${not empty chiTietPhuTung && type == 'phutung'}">
                        <h2>Chi Tiết Phụ Tùng</h2>
                        <p>ID: ${chiTietPhuTung.id}</p>
                        <p>Tên: ${chiTietPhuTung.ten}</p>
                        <p>Giá: ${chiTietPhuTung.gia}</p>
                        <p>Mô tả: ${chiTietPhuTung.moTa}</p>        
                    </c:when>
                    </c:choose>
                    <c:choose>
                    <c:when test="${not empty chiTietDichVu && type == 'dichvu'}">
                        <h2>Chi Tiết Dịch Vụ</h2>
                        <p>ID: ${chiTietDichVu.id}</p>
                        <p>Tên: ${chiTietDichVu.ten}</p>
                        <p>Giá: ${chiTietDichVu.gia}</p>
                        <p>Mô tả: ${chiTietDichVu.mota}</p>            
                    </c:when>
                    </c:choose>
            </div>
        </div>
    </section>  
</body>
</html>
