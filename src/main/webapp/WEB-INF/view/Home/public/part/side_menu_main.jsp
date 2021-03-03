<%--
  Created by IntelliJ IDEA.
  User: wujun
  Date: 2020/11/15
  Time: 1:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--首页右侧菜单栏 start--%>
<div id="sidebar" class="widget-area all-sidebar"
     style="position: relative; overflow: visible; box-sizing: border-box; min-height: 1px;">

    <%-- 关于本站--%>
    <%@include file="side/side_menu_part_aboutsite.jsp" %>


    <%-- 网站概况--%>
    <%@include file="side/site_menu_part_siteprofile.jsp" %>


    <%-- 所有标签 --%>
    <%@include file="side/side_menu_part_alltag.jsp" %>


    <%-- 近期评论--%>
    <%@include file="side/site_menu_part_recentcomment.jsp" %>


</div>
<%--首页右侧菜单栏 end--%>