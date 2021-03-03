<%--
  Created by IntelliJ IDEA.
  User: wujun
  Date: 2020/11/14
  Time: 0:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--        热评文章 start--%>
<aside class="widget hot_comment">
    <h3 class="widget-title">
        <i class="fa fa-bars"></i>
        热评文章
    </h3>
    <div id="hot_comment_widget">
        <ul>
<%--            循环取出评论数量最多的文章--%>
            <c:forEach items="${hotArticleByComment}" var="article">
                <li>
                        <%--                        标题链接到正文,鼠标放在标题上显示评论数量--%>
                    <a href="<%=basePath%>article/${article.articleId}" rel="bookmark" title="(${article.articleCommentCount}条评论)">
                            ${article.articleTitle}
                    </a>
                </li>

            </c:forEach>
        </ul>

    </div>
</aside>
<%--        热评文章 end--%>