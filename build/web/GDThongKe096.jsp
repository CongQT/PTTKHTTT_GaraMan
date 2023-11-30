<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
                width: 300px;
                height: 40px;
                background-color: #fff;
                border:none;
                border-radius: 30px;
                text-decoration: none;
                justify-content: center;
                align-items: center
            }
        </style>
    </head>
    
    <body>
         <section>
            <div class="form-box">
                <div class="form-value">
                    <div style="text-align: center; align-items: center; display: block">
                        <h2>Chọn thống kê</h2>
                        <button class="button" type='button' onclick="window.location.href='GDThongKeKH096.jsp'">Thống kê khách hàng theo doanh thu</button>                     
                    </div>
                </div>
        </div>
    </section>       
        
    </body>
</html>
