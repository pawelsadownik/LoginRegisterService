<%--
  Created by IntelliJ IDEA.
  User: pawel
  Date: 08.04.18
  Time: 11:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Admin</title>
</head>
<body>

<h2>Nadawanie uprawnień premium</h2>
<h2>Lista uzytkownikow:</h2>

<form id="form" class="float" action="/admin" method="get">
    <table>

        <tr>
            <td><label>Podaj e-mail uzytkownika</label> <input type="text" name="email" id="email" size="20" class="input"  /> </td>
        </tr>


    </table>
    <input type="submit" name="Premium" value="Nadaj uprawnienia Premium" class="button"/>
    <input type="submit" name="Normal" value="Nadaj upranienia Normal" class="button" />

</form>
</body>
</html>
