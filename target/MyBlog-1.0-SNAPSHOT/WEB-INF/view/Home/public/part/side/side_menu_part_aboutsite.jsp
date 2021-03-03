<%--
  Created by IntelliJ IDEA.
  User: wujun
  Date: 2020/11/14
  Time: 22:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="rapid" uri="http://www.rapid-framework.org.cn/rapid" %>
<%--关于本站 start--%>
<aside class="widget about">
    <h3 class="widget-title">
        <i class="fa fa-bars"></i>
        关于本站
    </h3>
    <div class="feed-about">
        <div class="about-main">
            <%--博客logo图片--%>
            <div class="about-img">
                <img src="${options.optionAboutsiteAvatar}"
                     alt="图片暂时无法加载">
            </div>
            <%--博客名字--%>
            <div class="about-name">${options.optionAboutsiteTitle}</div>
            <%--博客简介--%>
            <div class="about-the">${options.optionAboutsiteContent}</div>
            <div class="clear"></div>
            <%--其他平台联系链接--%>
            <rapid:block name="connet_other_platform">

            </rapid:block>
            <%--文章和留言总数 start--%>
            <div class="about-inf">
                <span class="about-pn">文章 ${articleCounts}</span>
                <span class="about-cn">留言 1</span>
            </div>
                <%--文章和留言总数 start--%>
        </div>
    </div>
    <div class="clear"></div>
</aside>
<%--关于本站 end--%>