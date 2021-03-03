<%@ page import="java.util.Date" %>
<%--
  Created by IntelliJ IDEA.
  User: wujun
  Date: 2020/11/14
  Time: 22:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--网站概况 start--%>
<aside id="php_text-22" class="widget php-text">
    <h3 class="widget-title">
        <i class="fa fa-bars"></i>
        网站概况
    </h3>
    <div class="textwidget widget-text">
        <ul class="site-profile">
            <li><i class="fa fa-file-o"></i>文章总数：${siteProfile.articleCount} 篇</li>
            <li><i class="fa fa-commenting-o"></i>留言数量：${siteProfile.messageCount} 条</li>
            <li><i class="fa fa-folder-o"></i>分类数量：${siteProfile.categoryCount} 个</li>
            <li><i class="fa fa-tags"></i>标签总数：${siteProfile.tagCount} 个</li>
            <li><i class="fa fa-link"></i>链接数量：${siteProfile.linkCount} 个</li>
            <li><i class="fa fa-view"></i>浏览数量：${siteProfile.viewCount} 个</li>
            <li><i class="fa fa-pencil-square-o"></i>
                最后更新：
                <span style="color:#2F889A">
                    <fmt:formatDate value="${lastUpdateArticle.articleUpdateTime}" pattern="yyyy年MM月dd日"></fmt:formatDate>
                </span>
            </li>
        </ul>
    </div>
    <div class="clear"></div>

</aside>
<%--网站概况 end--%>
