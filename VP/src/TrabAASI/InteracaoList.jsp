<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Evaluation-->
<html>
<head><title>Interacao List</title>
</head>
<body>
<center>
<h1>Interacao List</h1>
<table border="1" width="80%">
	<tr>
		<td>ID(PK)</td>
		<td>Comment</td>
		<td>Data_interacao</td>
		<td>Tarefa(FK)</td>
		<td></td>
	</tr>
<%
Projecto.Interacao[] interacaos = Projecto.InteracaoDAO.listInteracaoByQuery(null, null);
for(int i = 0; i < interacaos.length; i++) {
		out.print("<tr>");
		out.print("<td>");
		out.print(interacaos[i].getORMID());
		out.print("</td>");
		out.print("<td>");
		out.print(interacaos[i].getComment());
		out.println("</td>");
		out.print("<td>");
		out.print(interacaos[i].getData_interacao());
		out.println("</td>");
		
		Projecto.Tarefa tarefa = interacaos[i].getTarefa();
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
		
		out.print("<td>");
		out.print("<a href=\"Interacao.jsp?action=search&ID=");
		out.print(interacaos[i].getORMID());
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
<a href="Interacao.jsp">Add Interacao</a>
</center>
</body>
</html>
