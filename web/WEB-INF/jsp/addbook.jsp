<%--
  Created by IntelliJ IDEA.
  User: chris
  Date: 2021/8/24
  Time: 下午11:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>add book</title>

    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

    <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->

    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>

    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->

    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>

    <script>
        let count= document.getElementsByClassName("bookCounts").value;

       if (count == isNaN(count)){
           alert("need number")
       }


    </script>
</head>
<body>

<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>Add Book</small>
                </h1>
            </div>

        </div>
    </div>
</div>
<form action="${pageContext.request.contextPath}/book/addbook" method="post">
    <div class="form-group">
        <label for="bkname">书籍名称</label>
        <input type="text" name="bookName" class="form-control" id="bkname" placeholder="书籍名称" required>
    </div>
    <div class="form-group">
        <label for="bkcount">书籍数量</label>
        <input type="text" name="bookCounts" class="form-control" id="bkcount" placeholder="书籍数量" required/>

    </div>
    <div class="form-group">
        <label for="bkdetail">书籍内容</label>
        <input type="text" name="detail" class="form-control" id="bkdetail" placeholder="书籍内容" required>
    </div>


    <button type="submit" class="btn btn-default">Submit</button>
</form>


</body>
</html>
