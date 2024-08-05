<%--
  Created by IntelliJ IDEA.
  User: Ulquiorra
  Date: 2024/7/30
  Time: 10:07
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
    <json:property name = " outer "  value = " foo " />

    <json:object name = " inner " >
        <json:property name = " innerProp1 "  value = " val1 " />
        <json:property name = " innerProp2 "  value = " val2 " />

        <json:object name = " inner2 " >
            <json:property name = " inner2Prop1 "  value = " in2p1 " />
            <json:property name = " inner2Prop2 "  value = " in2p2 " />
        </json:object>

    </json:object>
</json:object>
<json:object>
    <json:property name="itemCount" value="1"/>
    <json:property name="subtotal" value="1"/>
    <json:array name="items" var="item" items="1">
        <json:object>
            <json:property name="title" value="2"/>
            <json:property name="description" value="2"/>
            <json:property name="imageUrl" value="3"/>
            <json:property name="price" value="4"/>
            <json:property name="qty" value="5"/>
        </json:object>
    </json:array>
</json:object>

</body>
</html>
