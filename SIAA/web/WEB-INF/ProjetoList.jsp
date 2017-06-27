<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Evaluation-->
<html>
<head><title>Projeto List</title>
</head>
<body>
<center>
<h1>Projeto List</h1>
<table border="1" width="80%">
	<tr>
		<td>ID(PK)</td>
		<td>Nome</td>
		<td>Descricao</td>
		<td>Data_criacao</td>
		<td>Data_fim</td>
		<td>Estado</td>
		<td></td>
	</tr>
<%
siaadao.Projeto[] projetos = siaadao.ProjetoDAO.listProjetoByQuery(null, null);
for(int i = 0; i < projetos.length; i++) {
		out.print("<tr>");
		out.print("<td>");
		out.print(projetos[i].getORMID());
		out.print("</td>");
		out.print("<td>");
		out.print(projetos[i].getNome());
		out.println("</td>");
		out.print("<td>");
		out.print(projetos[i].getDescricao());
		out.println("</td>");
		out.print("<td>");
		out.print(projetos[i].getData_criacao());
		out.println("</td>");
		out.print("<td>");
		out.print(projetos[i].getData_fim());
		out.println("</td>");
		out.print("<td>");
		out.print(projetos[i].getEstado());
		out.println("</td>");
		out.print("<td>");
		out.print("<a href=\"Projeto.jsp?action=search&ID=");
		out.print(projetos[i].getORMID());
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
<a href="Projeto.jsp">Add Projeto</a>
</center>
</body>
</html>
