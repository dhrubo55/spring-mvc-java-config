<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<body>
<h2>Hello World!</h2>
<form action="greetings">
    <input type="text" name="name"/> <br/>
    <input type="submit" value="Press to greet">
</form>

<p>${result}</p>

</body>
</html>