<%--
  Created by IntelliJ IDEA.
  User: wujun
  Date: 2020/11/14
  Time: 23:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--最新评论 start--%>
<aside id="recent_comments-2" class="widget recent_comments wow fadeInUp" data-wow-delay="0.3s">
    <h3 class="widget-title"><i class="fa fa-bars"></i>
        近期评论
    </h3>
    <div id="message" class="message-widget">
        <ul>
            <c:forEach items="${recentComments}" var="comment">
            <li style="border: none;">
                <a href="" ref="external nofollow">
<%--                    评论用户--%>
                    <span class="comment-author">
                        <strong>${comment.commentAuthorName}</strong>
                    </span>
                        ${comment.commentContent}
                </a>
            </li>
            </c:forEach>

        </ul>
    </div>
    <div class="clear"></div>

</aside>
<%--最新评论 end--%>