<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Evaluation-->
<html>
<jsp:useBean id="TarefaBean" scope="page" class="Projecto.TarefaProcessor" />
<jsp:setProperty name="TarefaBean" property="*" />
<% String result = TarefaBean.process(); %>

<script language="javascript">
<!--
function perform(command)  {
		form1.action.value = command;
		form1.submit();
		return true;
	}
function listAll()  {
		window.location.href = 'TarefaList.jsp';
		return true;
	}
// -->
</script>
<head><title>Tarefa</title>
</head>
<body>
<h1>Tarefa</h1>
<form method="POST" name="form1" action=Tarefa.jsp>
	<table>
		<tr>
			<td>*ID : </td>
			<td><input type=text name="ID" value="<jsp:getProperty name="TarefaBean" property="ID"/>" /></td>
		</tr>
		<tr>
			<td>Descricao : </td>
			<td><input type=text name="descricao" value="<jsp:getProperty name="TarefaBean" property="descricao"/>" /></td>
		</tr>
		<tr>
			<td>Estado : </td>
			<td><input type=text name="estado" value="<jsp:getProperty name="TarefaBean" property="estado"/>" /></td>
		</tr>
		<tr>
			<td>Prioridade : </td>
			<td><input type=text name="prioridade" value="<jsp:getProperty name="TarefaBean" property="prioridade"/>" /></td>
		</tr>
		<tr>
			<td>Data_inicio : </td>
			<td><input type=text name="data_inicio" value="<jsp:getProperty name="TarefaBean" property="data_inicio"/>" /></td>
		</tr>
		<tr>
			<td>Data_fim : </td>
			<td><input type=text name="data_fim" value="<jsp:getProperty name="TarefaBean" property="data_fim"/>" /></td>
		</tr>
		<tr>
			<td>Projeto_projetoID : </td>
			<td><input type=text name="projeto_projetoID" value="<jsp:getProperty name="TarefaBean" property="projeto_projetoID"/>" /></td>
		</tr>
		<tr>
			<td>Tarefa_mae_tarefaID : </td>
			<td><input type=text name="tarefa_mae_tarefaID" value="<jsp:getProperty name="TarefaBean" property="tarefa_mae_tarefaID"/>" /></td>
		</tr>
	</table>
	<INPUT type="hidden" name="action" value="">
	<hr>
	<INPUT type="button" value="List All" onclick="return listAll();">
	<INPUT type="button" value="Search" onclick="return perform('search');">
	<INPUT type="button" value="Insert" onclick="return perform('insert');">
	<INPUT type="button" value="Update" onclick="return perform('update');">
	<INPUT type="button" value="Delete" onclick="return perform('delete');">
	<INPUT type="reset">
</form>
<hr>
<h3><b>Result :</b><%=result%></h3>
</body>
</html>
