<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Custom Login Page</title>
</head>
<body onload='document.loginForm.j_username.focus();'>
	<h3>Custom Login Page</h3>

	<form name='loginForm'
		action="<c:url value='j_spring_security_check' />" method="post">

		<table>
			<tr>
				<td>User:</td>
				<td><input type='text' id="j_username" name="j_username"
					value=''></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type='password' id="j_password" name="j_password" />
				</td>
			</tr>
			<tr>
				<td><input name="submit" type="submit" value="submit" /></td>
				<td><input name="reset" type="reset" /></td>
			</tr>
		</table>

	</form>
</body>
</html>