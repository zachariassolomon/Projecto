<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Evaluation-->
<html>
<head><title>Tarefa List</title>
</head>
<body>
<center>
<h1>Tarefa List</h1>
<table border="1" width="80%">
	<tr>
		<td>ID(PK)</td>
		<td>Descricao</td>
		<td>Estado</td>
		<td>Prioridade</td>
		<td>Data_inicio</td>
		<td>Data_fim</td>
		<td>Projeto(FK)</td>
		<td>Tarefa_mae(FK)</td>
		<td></td>
	</tr>
<%
Projecto.Tarefa[] tarefas = Projecto.TarefaDAO.listTarefaByQuery(null, null);
for(int i = 0; i < tarefas.length; i++) {
		out.print("<tr>");
		out.print("<td>");
		out.print(tarefas[i].getORMID());
		out.print("</td>");
		out.print("<td>");
		out.print(tarefas[i].getDescricao());
		out.println("</td>");
		out.print("<td>");
		out.print(tarefas[i].getEstado());
		out.println("</td>");
		out.print("<td>");
		out.print(tarefas[i].getPrioridade());
		out.println("</td>");
		out.print("<td>");
		out.print(tarefas[i].getData_inicio());
		out.println("</td>");
		out.print("<td>");
		out.print(tarefas[i].getData_fim());
		out.println("</td>");
		
		Projecto.Projeto projeto = tarefas[i].getProjeto();
		if(projeto != null) {
			out.print("<td>");
			out.print("<a href=\"Projeto.jsp?action=search&ID=");
			out.print(projeto.getORMID());
			out.print("\">");
			out.print(projeto.getORMID());
			out.print("</a>");
			out.println("</td>");
		}
		
		else
 {
out.println("<td></td>");
		}
		
		
		Projecto.Tarefa tarefa_mae = tarefas[i].getTarefa_mae();
		if(tarefa_mae != null) {
			out.print("<td>");
			out.print("<a href=\"Tarefa.jsp?action=search&ID=");
			out.print(tarefa_mae.getORMID());
			out.print("\">");
			out.print(tarefa_mae.getORMID());
			out.print("</a>");
			out.println("</td>");
		}
		
		else
 {
out.println("<td></td>");
		}
		
		out.print("<td>");
		out.print("<a href=\"Tarefa.jsp?action=search&ID=");
		out.print(tarefas[i].getORMID());
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
<a href="Tarefa.jsp">Add Tarefa</a>
</center>
</body>
</html>
