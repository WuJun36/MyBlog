<%--
  Created by IntelliJ IDEA.
  User: wujun
  Date: 2020/11/14
  Time: 0:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--   热门文章 start--%>
<aside id="random_post-7" class="widget random_post wow fadeInUp" data-wow-delay="0.3s">
    <h3 class="widget-title">
        <i class="fa fa-bars"></i>
        热门文章
    </h3>
    <div id="random_post_widget">
        <ul>
<%--            循环取出热门文章，标题链接至正文--%>
            <c:forEach items="${hotArticleByView}" var="article">
                <li>
                    <a href="<%=basePath%>article/${article.articleId}" rel="bookmark" title="${article.articleViewCount}次浏览">
                        ${article.articleTitle}
                    </a>
                </li>
            </c:forEach>
        </ul>

    </div>

</aside>
<%--   热门文章 end--%>
