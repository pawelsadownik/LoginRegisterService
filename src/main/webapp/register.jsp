        <%@ page contentType="text/html;charset=UTF-8" language="java" %>
        <html>
        <head>
            <title>Zarejestruj</title>
        </head>
<body>
<form id="form" class="float" action="/register" method="get">
    <table>

        <tr>
            <td><label>Podaj e-mail:</label> <input type="text" name="email" id="email" size="20" class="input"  /> </td>
        </tr>
        <tr>
            <td><label>Potwierdz e-mail:</label> <input type="text" name="confirmemail" id="confirmemail" size="20" class="input"  /> </td>
        </tr>
        <tr>
            <td><label>Haslo:</label> <input type="password" name="password" id="password" size="20" class="input"  /> </td>
        </tr>

    </table>
    <input type="submit" name="Zarejestruj" value="Zarejestruj" class="button" />

</form>
</body>
</html>

