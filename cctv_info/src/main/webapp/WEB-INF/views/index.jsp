<%@page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="/assets/css/index.css">
    <script src="http://code.jquery.com/jquery-3.4.1.min.js"></script>
    <script src="/assets/js/index.js"></script>
    <title>우리동네CCTV</title>
</head>
<body>
    <div class="container">
        <%@include file = "/WEB-INF/views/includes/menu.jsp"%>
        <div class="right_area">
            <div class="data_row">
                <h1>전국 CCTV 현황</h1>
                <div class="content_left">
                    <p class="cctv">전국 CCTV 댓수</p>
                    </div>
                    <div class="content_right">
                    <p class="cctv_cnt">${cnt} 대</p>
                    </div>
                </div>
                <div class="cctv_cate">
                </div>
            </div>
        </div>
    </div>
</body>
</html>