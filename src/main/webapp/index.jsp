<%@page pageEncoding="UTF-8" language="java" %>
<html>
<body>
<form action="/servlet/Request2" method="get">
    <table>
        <tr>
            <th>姓名</th>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <th>年龄</th>
            <td><input name="old"></td>
        </tr>
        <tr>
            <th>性别</th>
            <td><input name="sex"></td>
        </tr>
        <tr>
            <th>住址</th>
            <td><input name="address"></td>
        </tr>
    </table>
    <input  type="submit" value="提交">
</form>
</body>
</html>
