<%--
  Created by IntelliJ IDEA.
  User: wujun
  Date: 2020/11/12
  Time: 15:35
  To change this template use File | Settings | File Templates.
--%>
<%--页面框架--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="rapid"   uri="http://www.rapid-framework.org.cn/rapid"%>

<html lang="zh-CN">
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <meta http-equiv="Cache-Control" content="max-age=72000"/>
    <meta name="viewport"
          content="width=device-width,initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no"/>
    <meta name="applicable-device" content="pc,mobile"/>
    <meta name="MobileOptimized" content="width"/>
    <meta name="HandheldFriendly" content="true"/>
    <%--    网站logo--%>
    <link rel="shortcut icon" href="<%=basePath%>img/logo.png">
    <%--   网站描述--%>
    <meta name="description" content="${options.optionMetaDescription}"/>
    <meta name="keywords" content="${options.optionMetaKeyword}"/>
    <%--    网站title--%>
    <rapid:block name="title">
        <title>
                ${options.optionSiteTitle}-${options.optionSiteDescription}
        </title>
    </rapid:block>

    <link rel="stylesheet" href="<%=basePath%>css/style.css">
    <link rel="stylesheet" href="<%=basePath%>plugin/font-awesome/css/font-awesome.min.css">

    <rapid:block name="header-style">

    </rapid:block>

</head>
<body>
<div id="page" class="site" style="transform: none;">
    <%@ include file="part/header.jsp"%>
    <div id="content" class="site-content" style="transform: none">
        <rapid:block name="left_content">

        </rapid:block>
        <rapid:block name="right_menu">
            <%@ include file="part/side_menu_main.jsp"%>
        </rapid:block>

    </div>
    <div class="clear"></div>
    <rapid:block name="link">

    </rapid:block>


</div>

<script src="<%=basePath%>js/jquery.min.js"></script>
<script src="<%=basePath%>js/script.js"></script>

<%@ include file="part/footer.jsp"%>
<rapid:block name="footer-script">

</rapid:block>
</body>
</html>
