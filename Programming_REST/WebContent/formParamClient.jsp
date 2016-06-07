<html>
<head>
<title>RESTful Web Services (JAX-RS) @FormParam Exampale</title>
</head>
<body>

	<form
		action="http://localhost:8888/Programming_REST/rest/studentInfoFormParamExample/addStudent"
		method="post">

		<table>
			<tr>
				<td><font face="verdana" size="2px">Student Roll No : </font></td>
				<td><input type="text" name="studRollNo" /></td>
			</tr>

			<tr>
				<td><font face="verdana" size="2px">Student Name</font></td>
				<td><input type="text" name="studName" /></td>
			</tr>

			<tr>
				<td></td>
				<td><input type="submit" value="Add Student" /></td>
			</tr>
		</table>

	</form>

</body>
</html>