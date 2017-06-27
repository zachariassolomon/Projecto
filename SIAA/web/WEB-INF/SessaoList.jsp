<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Evaluation-->
<html>
<head><title>Sessao List</title>
</head>
<body>
<center>
<h1>Sessao List</h1>
<table border="1" width="80%">
	<tr>
		<td>ID(PK)</td>
		<td>Data_inicio</td>
		<td>Data_fim</td>
		<td>Comentario</td>
		<td>Tempo_trabalho</td>
		<td>Tarefa(FK)</td>
		<td>User(FK)</td>
		<td></td>
	</tr>
<%
siaadao.Sessao[] sessaos = siaadao.SessaoDAO.listSessaoByQuery(null, null);
for(int i = 0; i < sessaos.length; i++) {
		out.print("<tr>");
		out.print("<td>");
		out.print(sessaos[i].getORMID());
		out.print("</td>");
		out.print("<td>");
		out.print(sessaos[i].getData_inicio());
		out.println("</td>");
		out.print("<td>");
		out.print(sessaos[i].getData_fim());
		out.println("</td>");
		out.print("<td>");
		out.print(sessaos[i].getComentario());
		out.println("</td>");
		out.print("<td>");
		out.print(sessaos[i].getTempo_trabalho());
		out.println("</td>");
		
		siaadao.Tarefa tarefa = sessaos[i].getTarefa();
		if(tarefa != null) {
			out.print("<td>");
			out.print("<a href=\"Tarefa.jsp?action=search&ID=");
			out.print(tarefa.getORMID());
			out.print("\">");
			out.print(tarefa.getORMID());
			out.print("</a>");
			out.println("</td>");
		}
		
		else
 {
out.println("<td></td>");
		}
		
		
		siaadao.User user = sessaos[i].getUser();
		if(user != null) {
			out.print("<td>");
			out.print("<a href=\"User.jsp?action=search&ID=");
			out.print(user.getORMID());
			out.print("\">");
			out.print(user.getORMID());
			out.print("</a>");
			out.println("</td>");
		}
		
		else
 {
out.println("<td></td>");
		}
		
		out.print("<td>");
		out.print("<a href=\"Sessao.jsp?action=search&ID=");
		out.print(sessaos[i].getORMID());
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
<a href="Sessao.jsp">Add Sessao</a>
</center>
</body>
</html>
