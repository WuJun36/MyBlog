<%--
  Created by IntelliJ IDEA.
  User: wujun
  Date: 2020/11/30
  Time: 23:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--分类or标签右侧菜单栏 start--%>
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
<%--分类or标签右侧菜单栏 end--%>