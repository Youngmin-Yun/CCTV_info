<%@page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">

<head>
    <meta charset="UTF-8">
    <script src="http://code.jquery.com/jquery-3.4.1.min.js"></script>
    <script src="/assets/js/myTownCCTV.js"></script>
    <script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=850c58b458ca1b9930ac28be7a802a03"></script>
    <title>우리집 주변은?</title>
</head>

<body>
    <div class="container">
        <%@include file = "/WEB-INF/views/includes/menu.jsp"%>
        <div class="right_area">
            <p id = "explain">해당 기능은 사용자의 위치 기준으로 1km내의 cctv위치를 보여줍니다.</p>
            <p id = "caution">해당 기능을 사용하기 위해서는 사용자의 동의가 필요 합니다.</p>
            <button id = "position">내 위치 기반 검색</button>
            <p id="demo" hidden></p>
            <div id="map" style="width:810px;height:400px;"></div>
        </div>
    </div>    
</body>
</html>