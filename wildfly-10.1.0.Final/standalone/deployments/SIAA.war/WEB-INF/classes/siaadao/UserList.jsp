<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Evaluation-->
<html>
<head><title>User List</title>
</head>
<body>
<center>
<h1>User List</h1>
<table border="1" width="80%">
	<tr>
		<td>ID(PK)</td>
		<td>Username</td>
		<td>Password</td>
		<td>Email</td>
		<td></td>
	</tr>
<%
siaadao.User[] users = siaadao.UserDAO.listUserByQuery(null, null);
for(int i = 0; i < users.length; i++) {
		out.print("<tr>");
		out.print("<td>");
		out.print(users[i].getORMID());
		out.print("</td>");
		out.print("<td>");
		out.print(users[i].getUsername());
		out.println("</td>");
		out.print("<td>");
		out.print(users[i].getPassword());
		out.println("</td>");
		out.print("<td>");
		out.print(users[i].getEmail());
		out.println("</td>");
		out.print("<td>");
		out.print("<a href=\"User.jsp?action=search&ID=");
		out.print(users[i].getORMID());
		out.print("\">");
		out.print("Edit");
		out.print("</a>");
		out.print("</td>");
		out.println("</td>");
		out.println("</tr>");
}

%>
</table><br>
<a href="index.html">Index page</a>
 | 
<a href="User.jsp">Add User</a>
</center>
</body>
</html>
