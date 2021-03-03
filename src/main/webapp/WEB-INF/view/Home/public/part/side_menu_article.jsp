<%--
  Created by IntelliJ IDEA.
  User: wujun
  Date: 2020/11/13
  Time: 17:40
  To change this template use File | Settings | File Templates.
  文章右侧的菜单栏，包括搜索框、热评文章、所有文章、随机文章
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--文章右侧菜单栏 start--%>
<div id="sidebar" class="widget-area all-sidebar"
     style="position: relative; overflow: visible; box-sizing: border-box; min-height: 1px;">

    <%--        搜索栏 start--%>
    <%@include file="side/side_menu_part_search.jsp" %>
    <%--        搜索栏 end--%>

    <%--        热评文章 start--%>
    <%@include file="side/side_menu_part_hotcomment.jsp" %>
    <%--        热评文章 end--%>

    <%--  所有标签 start  --%>
    <%@include file="side/side_menu_part_alltag.jsp" %>
    <%--  所有标签 end--%>

    <%--   浏览热度最高文章 start--%>
    <%@include file="side/side_menu_part_hotView.jsp" %>
    <%--   浏览热度最高文章 end--%>

</div>
<%--文章右侧菜单栏 end--%>
