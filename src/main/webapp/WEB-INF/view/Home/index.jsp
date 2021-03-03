<%--
  Created by IntelliJ IDEA.
  User: wujun
  Date: 2020/11/10
  Time: 15:52
  To change this template use File | Settings | File Templates.

--%>
<%--网站首页--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="rapid" uri="http://www.rapid-framework.org.cn/rapid" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@include file="public/common_variable.jsp"%>

<%--override要写在引入页面前面，否则不会生效--%>
<%--面包屑  start header.jsp中定义--%>
<rapid:override name="breadcrumb">
    <nav class="breadcrumb">
        <div class="bull">
            <i class="fa fa-volume-up"></i>
        </div>
        <div id="scrolldiv">
            <div class="scrolltext">
                <ul style="margin-top: 0px;">
                    <c:forEach items="${noticeList}" var="notice">
                        <li class="scrolltext-title">
                            <a href="" rel="bookmark">${notice.noticeTitle}</a>
                        </li>
                    </c:forEach>
                </ul>
            </div>
        </div>
    </nav>
</rapid:override>
<%--面包屑 end--%>

<%--左侧所有文章列表 start--%>
<rapid:override name="left_content">
    <div id="primary" class="content-area">
        <main id="main" class="site-main" role="main">
            <c:forEach items="${pageInfo.list}" var="article">
                <article class="post type-post">
                        <%--文章图片 start--%>
                    <figure class="thumbnail">
                        <a href="<%=basePath%>article/${article.articleId}">
                            <img width="280" height="210"
                                 src="<%=basePath%>img/articleLogo.jpg"
                                 class="attachment-content size-content wp-post-image"
                                 alt="${article.articleTitle}"/>
                        </a>
                            <%--左上角标签，直接跳转至文章所属分类页面--%>
                        <span class="cat">
                            <c:if test="${article.categoryList != null }">
                                <a href="<%=basePath%>category/${article.categoryList[0].categoryId}">
                                        ${article.categoryList[0].categoryName}
                                </a>
                            </c:if>

                        </span>
                            <%--分类跳转 end--%>
                    </figure>
                        <%--文章图片 end--%>

                        <%--文章标题 start--%>
                    <header class="entry-header">
                        <h2 class="entry-title">
                            <a href="<%=basePath%>article/${article.articleId}" rel="bookmark">
                                ${article.articleTitle}
                            </a>
                        </h2>
                    </header>
                        <%--文章标题 end--%>

                        <%--文章简要内容，发表日期、浏览数、评论数等展示 start--%>
                    <div class="entry-content">
                        <div class="archive-content">
<%--                                ${article.articleSummary}--%>
                                    ...
                        </div>
                        <span class="title-l"></span>
                        <%--文章右上角标签 start--%>
                        <span class="new-icon">
                            <c:choose>
                                <%--2 是什么状态？--%>
                                <c:when test="${article.articleStatus==2}">
                                    <i class="fa fa-bookmark-o"></i>
                                </c:when>
                                <c:otherwise>
                                    <%--最近7天发布的文章，展示NEW标签--%>
                                    <jsp:useBean id="nowDate" class="java.util.Date"/>
                                    <c:set var="interval"
                                            value="${nowDate.time-article.articleCreateTime.time}"/>
                                    <fmt:formatNumber value="${interval/1000/60/60/24}" pattern="#0"
                                                        var="days"/>
                                    <c:if test="${days <= 7}">NEW</c:if>
                                </c:otherwise>
                            </c:choose>
                        </span>
                        <%--文章右上角标签 end--%>

                        <%--文章概况下方标签 start--%>
                        <span class="entry-meta">
                            <span class="date">
                                <fmt:formatDate value="${article.articleCreateTime}" pattern="yyyy年MM月dd日"></fmt:formatDate>
                            </span>
                            <span class="views">
                                <i class="fa fa-eye"></i>
                                ${article.articleViewCount} views
                            </span>
                            <span class="comment">
                                <a href="" rel="external nofollow">
                                    <i class="fa fa-comment-o"></i>
                                    <c:choose>
                                        <c:when test="${article.articleCommentCount==0}">
                                            发表评论
                                        </c:when>
                                        <c:otherwise>
                                            ${article.articleCommentCount}
                                        </c:otherwise>
                                    </c:choose>
                                </a>

                            </span>
                        </span>
                        <%--文章概况下方标签 end--%>
                        <div class="clear"></div>
                    </div>
                    <%--文章简要内容，发表日期、浏览数、评论数等展示 start--%>

                    <span class="entry-more">
                        <a href="<%=basePath%>article/${article.articleId}" rel="bookmark">
                            阅读全文
                        </a>
                    </span>
                </article>
            </c:forEach>
        </main>



        <%--分页功能 start--%>
        <%@ include file="public/part/paging.jsp"%>
        <%--分页功能 end--%>

    </div>
</rapid:override>
<%--左侧所有文章列表 end--%>

<%--右侧的菜单栏 start--%>
<rapid:override name="right_menu">
    <%@include file="public/part/side_menu_main.jsp" %>
</rapid:override>
<%--右侧的菜单栏 start--%>

<%@include file="public/framework.jsp" %>





