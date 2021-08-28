$(function () {
    $("#region_select").change(function(){
        let region = $(this).find("option:selected").val()
        setRegionCCTV(region)
        console.log(region)
    })
    setRegionCCTV("서울특별시")
    function setRegionCCTV(region) {
		$(".cctv_location").html(region)
		$.ajax({
			type: "get",
            url: "/api/region?region=" + region,
            success: function (r) {
				console.log(r)
				console.log(r.list.length)
				$(".amount").html(r.list.length)
                // 줌 아웃시 지도가 몇장 있는 것처럼 움직임, 해당부분 제거하면 지도의 중심 위치가 고정됨, 하지만 지도는 잘 움직임
				for (let p = 0; p < r.list.length; p++) {
					var mapContainer = document.getElementById('map'), // 지도를 표시할 div  
						mapOption = {
							center: new kakao.maps.LatLng(r.list[0].latitude, r.list[0].longitude), // 지도의 중심좌표
							level: 3 // 지도의 확대 레벨
						};
					}
					var map = new kakao.maps.Map(mapContainer, mapOption); // 지도를 생성합니다  
				for (let i = 0; i < r.list.length; i++) {
					var positions = [{
						content:  '<div"> 관리기관 : ' + r.list[i].institutionNm + '</div>' +
						'<div>' + "관리기관 전화번호 : " + r.list[i].phoneNumber + '</div>' +
						'<div>' + "촬영방면정보 : " + r.list[i].potogrfInfo + '</div>',
						latlng: new kakao.maps.LatLng(r.list[i].latitude, r.list[i].longitude)
					}]
					console.log(r.list[i].institutionNm)
					for (var j = 0; j < positions.length; j++) {
						// 마커를 생성합니다
						var marker = new kakao.maps.Marker({
							map: map, // 마커를 표시할 지도
							position: positions[j].latlng // 마커의 위치
						});

						// 마커에 표시할 인포윈도우를 생성합니다 
						var infowindow = new kakao.maps.InfoWindow({
							content: positions[j].content // 인포윈도우에 표시할 내용
						});
						kakao.maps.event.addListener(marker, 'mouseover', makeOverListener(map, marker, infowindow));
						kakao.maps.event.addListener(marker, 'mouseout', makeOutListener(infowindow));
					}
					// 마커 이미지의 이미지 주소입니다
					function makeOverListener(map, marker, infowindow) {
						return function () {
							infowindow.open(map, marker);
						};
					}
					// 인포윈도우를 닫는 클로저를 만드는 함수입니다 
					function makeOutListener(infowindow) {
						return function () {
							infowindow.close();
						};
					}
				}
            }
        })
    }
})