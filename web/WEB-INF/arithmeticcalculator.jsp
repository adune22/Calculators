
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form action="arithmetic" method="post">
            <label for="first"> First:</label>
            <input type="number" name="first" id="first">
            <br>
            <label for="second"> Second:</label>
            <input type="number" name="second" id="second">
            <br>

            <input type=submit value="+" name="btn">
            <input type=submit value="-" name="btn">
            <input type=submit value="*" name="btn">
            <input type=submit value="%" name="btn">
            <br>


            <label for="result">Result:</label>
            <input type="number" name="result" id="result" >

        </form>

        <p>${message}</p>

        <a href="http://localhost:8084/Calculators/age">Age Calculator</a>

    </body>
</html>
