<%--
  Created by IntelliJ IDEA.
  User: wujun
  Date: 2020/11/14
  Time: 0:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--  所有标签 start  --%>
<aside class="widget">
    <h3 class="widget-title">
        <i class="fa fa-bars"></i>
        所有标签
    </h3>
    <div class="tagcloud">
        <%-- 循环取出所有标签--%>
        <c:forEach items="${tagList}" var="tag">
            <a href="<%=basePath%>tag/${tag.tagId}"
               class="tag-link-129 tag-link-position-1"
               style="font-size: 14px;">
                ${tag.tagName}
            </a>
        </c:forEach>
    </div>
    <div class="clear"></div>

</aside>
<%--  所有标签 end--%>
