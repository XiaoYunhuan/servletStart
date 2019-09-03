<%--
  Created by IntelliJ IDEA.
  User: xiaoyh
  Date: 2019/9/2
  Time: 10:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=gbk" language="java" %>
<html>
  <head>
    <title>INDEX</title>
  </head>
  <body>
  Hello World!
  <a href="http://my.chinayltx.com/测试.xlsx">测试</a>
  <a href="http://my.chinayltx.com/采购订单模板.xlsx">采购订单模板.xlsx</a>
  </body>
  <script type="text/javascript">
      var path = "http://my.chinayltx.com/采购订单模板.xlsx";
      var encodePath = encodeURI(path);
      console.log(encodePath);
      //http://my.chinayltx.com/%E9%87%87%E8%B4%AD%E8%AE%A2%E5%8D%95%E6%A8%A1%E6%9D%BF.xlsx
      path = "http://my.chinayltx.com/测试.xlsx";
      encodePath = encodeURI(path);
      console.log(encodePath);
      //http://my.chinayltx.com/%E6%B5%8B%E8%AF%95.xlsx
  </script>
</html>
