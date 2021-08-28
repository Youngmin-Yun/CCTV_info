$(function(){
    $.ajax({
        type:"get",
        url:"/api/cctvInfo/all",
        success:function(r){
            console.log(r)
            $(".cctv_cate").html("")
            for(let i = 0; i < r.list.length; i++){
                let tag =
                '<div class="cctv_box">'+
                    '<p class="cctv_por">'+r.list[i].purpos+'</p>'+
                    '<p class="cctv_por_cnt">'+comma(r.list[i].cnt)+' 대</p>'+
                '</div>'
                $(".cctv_cate").append(tag)
        }
        }
    })
})
function comma(x) {
    return x.toString().replace(/\B(?=(\d{3})+(?!\d))/g, ",")
}
