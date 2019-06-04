<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/30
  Time: 10:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>脑壳疼</title>
    <script src="js/jquery-1.7.2.min(1).js"></script>
  </head>
  <body>
  <form id="cj">
    用户：<input type="text" name="username">
    密码：<input type="text" name="password">
    性别：<input type="text" name="sex">
    <button id="btn">提交</button>
  </form>
  </body>
</html>
<script>
  $(function () {
     $("#btn").click(function () {
         $.ajax(
             {
                 url:"${pageContext.request.contextPath}/userServlet",
                 type:"POST",
                 data:$("#cj").serialize(),
                 success:function (data) {
                     alert(data);
                 },
                 error:function (data) {
                     alert(data);}
             }
         );
     })
  });
</script>