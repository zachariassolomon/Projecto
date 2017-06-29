<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Evaluation-->
<html>
<jsp:useBean id="SessaoBean" scope="page" class="siaadao.SessaoProcessor" />
<jsp:setProperty name="SessaoBean" property="*" />
<% String result = SessaoBean.process(); %>

<script language="javascript">
<!--
function perform(command)  {
		form1.action.value = command;
		form1.submit();
		return true;
	}
function listAll()  {
		window.location.href = 'SessaoList.jsp';
		return true;
	}
// -->
</script>
<head><title>Sessao</title>
</head>
<body>
<h1>Sessao</h1>
<form method="POST" name="form1" action=Sessao.jsp>
	<table>
		<tr>
			<td>*ID : </td>
			<td><input type=text name="ID" value="<jsp:getProperty name="SessaoBean" property="ID"/>" /></td>
		</tr>
		<tr>
			<td>Data_inicio : </td>
			<td><input type=text name="data_inicio" value="<jsp:getProperty name="SessaoBean" property="data_inicio"/>" /></td>
		</tr>
		<tr>
			<td>Data_fim : </td>
			<td><input type=text name="data_fim" value="<jsp:getProperty name="SessaoBean" property="data_fim"/>" /></td>
		</tr>
		<tr>
			<td>Comentario : </td>
			<td><input type=text name="comentario" value="<jsp:getProperty name="SessaoBean" property="comentario"/>" /></td>
		</tr>
		<tr>
			<td>Tempo_trabalho : </td>
			<td><input type=text name="tempo_trabalho" value="<jsp:getProperty name="SessaoBean" property="tempo_trabalho"/>" /></td>
		</tr>
		<tr>
			<td>Tarefa_tarefaID : </td>
			<td><input type=text name="tarefa_tarefaID" value="<jsp:getProperty name="SessaoBean" property="tarefa_tarefaID"/>" /></td>
		</tr>
		<tr>
			<td>User_userID : </td>
			<td><input type=text name="user_userID" value="<jsp:getProperty name="SessaoBean" property="user_userID"/>" /></td>
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
