<%--
  Created by IntelliJ IDEA.
  User: wujun
  Date: 2020/11/14
  Time: 0:14
  To change this template use File | Settings | File Templates.
--%>
<%--右侧菜单栏的搜索框--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--        搜索栏 start--%>
<aside class="widget widget_search">
    <div class="searchbar">
        <form method="get" id="searchform1" action="/">
                <span>
                    <input type="text" value="" name="keywords" id="s1" placeholder="输入搜索内容" required="">
                    <button type="submit" id="searchsumbit1">搜索</button>
                </span>
        </form>
    </div>
    <div class="clear"></div>

</aside>
<%--        搜索栏 end--%>