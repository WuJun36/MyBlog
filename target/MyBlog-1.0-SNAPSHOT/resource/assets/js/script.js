$(document).ready(function () {
    // 弹出&收起搜索框
    $(".nav-search").click(function () {
        // 淡入 or 淡出功能；300毫秒
        $("#search-main").fadeToggle(300);
    })

})

//点赞数+1
function likeArticle(articleId) {
    console.log(articleId)
    $.ajax({
        url: "http://localhost:8087/MyBlog/article/like/" + articleId,
        type: "POST",
        dataType: "json",
        contentType: "application/json",
        success: function (data) {
            console.log("likeId:",articleId);

            $.cookie(
                //写入cookie的键值对
                "likeId", articleId,
                {
                    "path":"/", //cookie的默认属性
                }
            )
        }

        })
}