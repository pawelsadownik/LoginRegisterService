<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<h1>FORMULARZ REJESTRACYJNY BY PAWEL SADOWNIK - S9712@PJWSTK.EDU.PL</h1>
<h2>Zarejestruj się lub zaloguj jeżeli już posiadasz konto</h2>
<h3>Aby zalogowac sie jako admin i moc nadawac uprawnienia:</h3>
<h3>login: admin</h3>
<h3>haslo: admin</h3>

<form id="form" class="float" action="/login" method="get">
    <table>

        <tr>
            <td><label>Podaj e-mail:</label> <input type="text" name="email" id="email" size="20" class="input"  /> </td>
        </tr>
        <tr>
            <td><label>Podaj haslo</label> <input type="text" name="password" id="password" size="20" class="input"  /> </td>
        </tr>

    </table>
    <a href="register.jsp"><input type="button" value="Zarejestruj" /></a>
    <input type="submit" name="Premium" value="Premium" />
    <input type="submit" name="Zaloguj" value="Zaloguj" class="button" />

</form>
</body>
</html>
