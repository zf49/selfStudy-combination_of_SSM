<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: chris
  Date: 2021/8/24
  Time: 下午10:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>全部书籍展示</title>
    <!-- 新 Bootstrap 核心 CSS 文件 -->

    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

    <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->

    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>

    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->

    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>

   
</head>
<body>


<div class="container">
    <div class="row clearfix">
          <div class="col-md-12 column">
              <div class="page-header">
                  <h1>
                     <small>书籍列表</small>
                  </h1>
              </div>

          </div>
    </div>

<div class="row">

    <div class="col-md-4 column">
        <a class="btn-primary" href="${pageContext.request.contextPath}/book/toaddbook">增加书籍</a>

    </div>
    <div class="col-md-4 column">
        <a class="btn-primary" href="${pageContext.request.contextPath}/book/allbook">显示全部数据</a>

    </div>
    <div class="col-md-4 column">
<%--        查询书籍--%>
    <h1><span>${error}</span></h1>

    <form action="${pageContext.request.contextPath}/book/queryBook" method="get">
              <input type="text" class="form-control" placeholder="书籍名称" name="queryBookName">
               
                <input type="submit" value="查询" class="btn btn-primary">
               
           </form>
        
    </div>
</div>
</div>

      <div class="row clearfix">
          <div class="col-md-12 column">
              <table class="table table-hover table-striped">
                  <thead>
                  <tr>
                      <th>标号</th>
                      <th>name</th>
                      <th>count</th>
                      <th>detail</th>
                      <th>d操作</th>
                  </tr>
                  </thead>
                  <tbody>
                        <c:forEach var="book" items="${list}">
                            <tr>
                                <td>${book.bookID}</td>
                                <td>${book.bookName}</td>
                                <td>${book.bookCounts}</td>
                                <td>${book.detail}</td>
                                <td>
                                     <a href="${pageContext.request.contextPath}/book/toupdatebook/${book.bookID}">修改</a>
                                    &nbsp;| &nbsp;

                                    <a href="${pageContext.request.contextPath}/book/deletebook/${book.bookID}">删除</a>
                                </td>
                            </tr>
                        </c:forEach>
                  </tbody>
              </table>

          </div>
      </div>


</body>
</html>
