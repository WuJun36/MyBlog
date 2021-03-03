<c:if test="${pageInfo.pages > 1}">
    <%--    分页 start--%>
    <nav class="navigation pagination" role="navigation">
        <div class="nav-links">
                <%--确定 begin 和 end 页码  start--%>
            <c:choose>
                <c:when test="${pageInfo.pages <= 3}">
                    <c:set var="begin" value="1"></c:set>
                    <c:set var="end" value="${pageInfo.pages}"></c:set>
                </c:when>
                <c:otherwise>
                    <c:set var="begin" value="${pageInfo.pageNum- 1}"></c:set>
                    <c:set var="end" value="${pageInfo.pageNum + 1}"></c:set>
                    <c:if test="${pageInfo.pageNum <= 2}">
                        <c:set var="begin" value="1"></c:set>
                        <c:set var="end" value="3"></c:set>
                    </c:if>
                    <c:if test="${pageInfo.pageNum > pageInfo.pages - 2}">
                        <c:set var="begin" value="${pageInfo.pages- 2}"></c:set>
                        <c:set var="end" value="${pageInfo.pages}"></c:set>
                    </c:if>
                </c:otherwise>
            </c:choose>
                <%-- 确定 begin 和 end 页码  end--%>

                <%-- 展示逻辑 start--%>
                <%--  上一页按钮 start   --%>
            <c:choose>
                <c:when test="${pageInfo.pageNum == 1}">
                    <%-- 当前页为第一页，不展示上一页按钮--%>
                </c:when>
                <c:otherwise>
                    <a class="page-numbers" href="${pageUrlPrefix}=${pageInfo.pageNum - 1}">
                        <span class="fa fa-angle-left"></span>
                    </a>
                </c:otherwise>
            </c:choose>
                <%--  上一页按钮 end   --%>

                <%--第一页和省略号 start--%>
            <c:if test="${begin >= 2}">
                <a class="page-numbers" href="${pageUrlPrefix}=1">
                    1
                </a>
            </c:if>
            <c:if test="${begin > 2}">
                <a class="page-numbers dots">
                    ...
                </a>
            </c:if>

                <%--第一页和省略号 end--%>

                <%--begin到end页码的展示 start--%>
            <c:forEach begin="${begin}" end="${end}" var="page">
                <c:choose>
                    <c:when test="${page eq pageInfo.pageNum}">
                        <a class="page-numbers current">
                                ${page}
                        </a>
                    </c:when>
                    <c:otherwise>
                        <a class="page-numbers" href="${pageUrlPrefix}=${page}">
                            ${page}
                        </a>
                    </c:otherwise>
                </c:choose>
            </c:forEach>
                <%--begin到end页码的展示 end--%>

                <%--省略号和最后一页 start--%>
            <c:if test="${end + 1 < pageInfo.pages}">
                <a class="page-numbers dots">
                    ...
                </a>
            </c:if>
            <c:if test="${end < pageInfo.pages}">
                <a class="page-numbers" href="${pageUrlPrefix}=${pageInfo.pages}">
                        ${pageInfo.pages}
                </a>
            </c:if>
                <%--省略号和最后一页 end--%>

                <%--下一页按钮 start--%>
            <c:choose>
                <c:when test="${pageInfo.pageNum == pageInfo.pages}">
                    <%-- 当前页为最后一页，不展示下一页按钮--%>
                </c:when>
                <c:otherwise>
                    <a class="page-numbers" href="${pageUrlPrefix}=${pageInfo.pageNum+1}">
                        <span class="fa fa-angle-right"></span>
                    </a>
                </c:otherwise>
            </c:choose>
                <%--下一页按钮 end--%>

        </div>
    </nav>
    <%--    分页 end--%>
</c:if>

