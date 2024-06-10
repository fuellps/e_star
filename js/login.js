;(
    function(){
        $(".label").click(
            function(){
                console.log("点击事件");
                $(this).addClass("active")
                .siblings()
                .removeClass("active");
                let lebel = $(this).attr("data-label");
                $(lebel).css(
                    "display","block"
                ).siblings()
                .css(
                    "display","none"
                );
                
            }
        )
        $(".icon").click(
            function(){
                // 如果当前不是高亮状态
                if(!$(this).hasClass("active")){
                    $(this).addClass("active")
                    .siblings()
                    .removeClass("active");
                    let id = $(this).attr("data-label");
                    $(id).css("display","block")
                    .siblings()
                    .css("display","none");
                }else{
                   $(".label").last().trigger("click");
                }
            }
        )
    }
    
)();