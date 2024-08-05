<%--
  Created by IntelliJ IDEA.
  User: Ulquiorra
  Date: 2024/7/30
  Time: 9:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="json" uri="http://www.atg.com/taglibs/json" %>
<html>
<head>
    <title>Welcome</title>
</head>
<body>
<json:object>
    <json:property name="itemCount" value="2"/>
    <json:property name="subtotal" value="3"/>
    <json:array name="items" var="item" items="1">
        <json:object>
            <json:property name="title" value="1"/>
            <json:property name="description" value="22"/>
            <json:property name="imageUrl" value="3"/>
            <json:property name="price" value="4"/>
            <json:property name="qty" value="$6"/>
        </json:object>
    </json:array>
</json:object>
</body>
