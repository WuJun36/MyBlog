<%--
  Created by IntelliJ IDEA.
  User: wujun
  Date: 2020/11/12
  Time: 11:31
  To change this template use File | Settings | File Templates.
--%>
<%--博客顶部部分
    包括：顶部菜单，主要菜单(包括搜索按钮)，面包屑--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%--顶部导航 start--%>
<header id="masthead" class="site-header">
    <%--顶部菜单 start--%>
    <nav id="top-header">
        <div class="top-nav">
            <div class="user-login">
                <c:choose>
                    <c:when test="${sessionScope.user==null}">
                        <a href="/admin">登录</a>
                    </c:when>
                    <c:otherwise>
                        <a href="/admin">进入后台</a>
                    </c:otherwise>
                </c:choose>
            </div>

        </div>
    </nav><!-- #top-header -->
    <%--顶部菜单 end--%>

    <%--    顶部主菜单 start--%>
    <div id="menu-box">
        <div id="top-menu">
            <span class="nav-search">
                <i class="fa fa-search"></i>
            </span>
            <div class="logo-site">
                <h1 class="site-title">${options.optionSiteTitle}</h1>
                <p class="site-description">${options.optionSiteDescription}</p>
            </div>
            <div id="site-nav-wrap">
                <div id="sidr-close">
                    <a href="#sidr-close" class="toggle-sidr-close">×</a>
                </div>
                <nav id="site-nav" class="main-nav">
                    <a href="#sidr-main" id="navigation-toggle" class="bars">
                        <i class="fa fa-bars"></i>
                    </a>
                    <div class="menu-pcmenu-container">
                        <ul id="menu-pcmenu" class="down-menu nav-menu sf-js-enabled sf-arrows">

                            <li>
                                <a href="<%=basePath%>">
                                    <i class="fa-home fa"></i>
                                    <span class="font-text">首页</span>
                                </a>
                            </li>
                            <c:forEach items="${categoryList}" var="category">
                                <c:if test="${category.categoryPId == 0}">
                                    <li>
                                        <a href="<%=basePath%>category/${category.categoryId}">
                                            <i class="fa-home fa"></i>
                                            <span class="font-text">${category.categoryName}</span>
                                        </a>
                                        <ul class="sub-menu">
                                            <c:forEach items="${categoryList}" var="cate">
                                                <c:if test="${cate.categoryPId==category.categoryId}">
                                                    <li>
                                                        <a href="<%=basePath%>category/${cate.categoryId}">${cate.categoryName}</a>
                                                    </li>
                                                </c:if>
                                            </c:forEach>
                                        </ul>

                                    </li>
                                </c:if>

                            </c:forEach>

                        </ul>
                    </div>
                </nav>
            </div><!--导航栏结束-->
            <div class="clear"></div>
        </div> <!-- #top-menu -->
    </div><!-- #menu-box -->
    <%--    顶部主菜单 end--%>
</header>
<%--顶部导航 end--%>


<%-- 搜索框 start--%>
<div id="search-main">
    <div class="searchbar">
        <form method="get" id="searchform" action="<%=basePath%>" accept-charset="UTF-8">
            <span>
                <input type="text" value="" name="keywords" id="s" placeholder="输入搜索内容" required="">
                <button type="submit" id="searchsubmit">搜索</button>
            </span>
        </form>
    </div>
    <div class="clear"></div>
</div>
<%-- 搜索框 end--%>

<rapid:block name="breadcrumb">

</rapid:block>