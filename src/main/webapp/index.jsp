<%@ page import="java.time.LocalDate" %>
<html>
<body>
<h2>Hi Vlad!</h2>
<h3>/        -welcome page</h3>
<h3>/home    -homepage</h3>

<%--  $ {pageContext.request.contextPath} -это абсолютный путь  --%>
<%--https://coderoad.ru/5850336/%D0%A7%D1%82%D0%BE-%D0%B8%D0%BC%D0%B5%D0%BD%D0%BD%D0%BE-%D0%B4%D0%B5%D0%BB%D0%B0%D0%B5%D1%82-%D1%8D%D1%82%D0%BE%D1%82-%D1%8F%D0%B7%D1%8B%D0%BA-%D0%B2%D1%8B%D1%80%D0%B0%D0%B6%D0%B5%D0%BD%D0%B8%D0%B9-pageContext-request-contextPath-%D0%B2-JSP-EL--%>
<form action="${pageContext.request.contextPath}/getform" method="get">
    <label for="getemail">getEmail</label>
    <input type="email" name="getemail" value="get@ukr.net" id="getemail" placeholder="Your e-mail"/>
    <button type="submit">get</button>
</form>
<form action="${pageContext.request.contextPath}/postform" method="post">
    <label for="postemail">postEmail</label>
    <input type="email" name="postemail"  value="post@ukr.net"  id="postemail" placeholder="Your e-mail"/>
    <button type="submit">post</button>
</form>

<%
    LocalDate now = LocalDate.now();
    out.println(now);
%>

</body>
</html>
