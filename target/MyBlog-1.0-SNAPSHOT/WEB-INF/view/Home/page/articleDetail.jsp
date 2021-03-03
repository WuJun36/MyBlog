<%--
  Created by IntelliJ IDEA.
  User: wujun
  Date: 2020/11/24
  Time: 23:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="rapid" uri="http://www.rapid-framework.org.cn/rapid" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@include file="../public/common_variable.jsp" %>
<script href="<%=basePath%>js/script.js"></script>

<rapid:override name="title">
    <title>${article.articleTitle}</title>
</rapid:override>

<rapid:override name="header-style">
    <link rel="stylesheet" href="/css/highlight.css">
    <style>
        .entry-title {
            background: #f8f8f8;
        }
    </style>
</rapid:override>

<rapid:override name="breadcrumb">
    <%--面包屑导航 start--%>
    <nav class="breadcrumb">
        <a class="crumbs" href="<%=basePath%>">
            <i class="fa fa-home"></i>首页
        </a>

        <c:choose>
            <c:when test="${article.categoryList != null && article.categoryList.size() > 0 }">
                <c:forEach items="${article.categoryList}" var="cate">
                    <i class="fa fa-angle-right"></i>
                    <a href="">
                            ${cate.categoryName}
                    </a>
                </c:forEach>
            </c:when>
            <c:otherwise>
                <i class="fa fa-angle-right"></i>
                <a href="">
                    未分类
                </a>
            </c:otherwise>
        </c:choose>

    </nav>
    <%--面包屑导航 end--%>
</rapid:override>

<rapid:override name="left_content">
    <%--左侧文章正文 start--%>
    <div id="primary" class="content-area">
        <main id="main" class="site-main" role="main">
            <article class="post" id="articleDetail" data-id="${article.articleId}">
<%--                文章标题 start--%>
                <header class="entry-header">
                    <h1 class="entry-title">
                        ${article.articleTitle}
                    </h1>
                </header>
<%--                文章标题 end--%>
<%--                文章正文内容 start--%>
                <div class="entry-content">
                    <div class="single-content">
                        ${article.articleContent}
                    </div>
                    <div class="clear"></div>
                    <div id="social">
                        <div class="social-main">
<%--                            点赞 start--%>
<%--                            todo 点击动作--%>
                            <span class="like">
                                <a href="javascript:;" title="点赞"
                                    class="favorite" onclick="likeArticle(${article.articleId})">
                                        <i class="fa fa-thumbs-up"></i>赞
                                        <i class="count" id="count-${article.articleId}">
                                            ${article.articleLikeCount}
                                        </i>
                                </a>
                            </span>
<%--                            点赞 end--%>
                            <div class="shang-p">
                                <div class="shang-empty">
                                    <span></span>
                                </div>
                                <span class="shang-s">
                                    <a href="javascript:;" style="cursor:pointer">👆</a>

                                </span>
                            </div>
<%--                           todo 分享 start--%>
                            <div class="share-sd">
                                <span class="share-s" style="margin-top: 25px!important;">
                                    <a href="javascript:;" id="share-s" title="分享">
                                        <i class="fa fa-share-alt"></i>分享
                                    </a>
                                </span>

                            </div>
<%--                           todo 分享 end--%>
                            <div class="clear"></div>
                        </div>

                    </div><!-- social end-->

<%--                    文章顶部 展示评论数、浏览数 start--%>
                        <%-- todo --%>
                    <footer class="single-footer">
                        <ul class="single-meta">
                            <c:if test="${sessionScope.user != null && sessionScope.user.userId.equals(article.articleAuthorId)}">
                                <li class="edit-link">
                                    <a target="_blank" class="post-edit-link"
                                        href="">
                                        编辑
                                    </a>
                                </li>
                            </c:if>
                            <li class="comment">
                                <a href="" rel="external nofollow">
                                    <i class="fa fa-comment"></i>
                                    <i class="comment-count">${article.articleCommentCount}</i>
                                </a>
                            </li>
                            <li class="views">
                                <i class="fa fa-eye"></i>
                                <span class="articleViewCount">${article.articleViewCount}</span>
                                views
                            </li>
                            <li class="r-hide">
<%--                                todo --%>
                                <a href="javascript:pr()" title="侧边栏">
                                    <i class="fa fa-caret-left"></i>
                                    <i class="fa fa-caret-right"></i>
                                </a>
                            </li>
                        </ul>
                        <ul id="fontsize">
                            <li>A+</li>
                        </ul>
                        <div class="single-cat-tag">
                            <div class="single-cat">
                                所属分类：
                                <c:forEach items="${article.categoryList}" var="cate">
                                    <a href="<%=basePath%>category/${cate.categoryId}">
                                       ${cate.categoryName}
                                    </a>
                                </c:forEach>
                            </div>
                        </div>
                    </footer>
<%--                    文章顶部 展示评论数、浏览数 end--%>
                    <div class="clear"></div>
                </div>
<%--                文章正文内容 end--%>
            </article>

<%--            所属标签 start--%>
            <div class="single-tag">
                <ul data-wow-delay="0.3s">
                    <c:forEach items="${article.tagList}" var="tag">
                        <li>
                            <a href="<%=basePath%>tag/${tag.tagId}" rel="tag" style="background:#666666">
                                    ${tag.tagName}
                            </a>
                        </li>
                    </c:forEach>
                </ul>
            </div>
<%--            所属标签 end--%>

<%--            版权声明 start--%>
            <div>
                <div>
                    <img src=""/>
                    <div>
                        <strong>版权声明：</strong>
                        本站原创文章，于${article.articleCreateTime}
                        <c:if test="${article.author != null}">
                            ,由${article.author.userName}
                        </c:if>
                        创建

                    </div>
                    <div>
                        <strong>转载请注明：</strong>
                        ${article.articleTitle}|${options.optionSiteTitle}
                    </div>
                </div>
            </div>
<%--            版权声明 end--%>
        </main>

    </div>

    <%--左侧文章正文 start--%>


</rapid:override>


<rapid:override name="right_menu">
    <%@include file="../public/part/side_menu_article.jsp" %>
</rapid:override>

<%@include file="../public/framework.jsp" %>
