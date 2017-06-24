<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Evaluation-->
<html>
<jsp:useBean id="InteracaoBean" scope="page" class="Projecto.InteracaoProcessor" />
<jsp:setProperty name="InteracaoBean" property="*" />
<% String result = InteracaoBean.process(); %>

<script language="javascript">
<!--
function perform(command)  {
		form1.action.value = command;
		form1.submit();
		return true;
	}
function listAll()  {
		window.location.href = 'InteracaoList.jsp';
		return true;
	}
// -->
</script>
<head><title>Interacao</title>
</head>
<body>
<h1>Interacao</h1>
<form method="POST" name="form1" action=Interacao.jsp>
	<table>
		<tr>
			<td>*ID : </td>
			<td><input type=text name="ID" value="<jsp:getProperty name="InteracaoBean" property="ID"/>" /></td>
		</tr>
		<tr>
			<td>Comment : </td>
			<td><input type=text name="comment" value="<jsp:getProperty name="InteracaoBean" property="comment"/>" /></td>
		</tr>
		<tr>
			<td>Data_interacao : </td>
			<td><input type=text name="data_interacao" value="<jsp:getProperty name="InteracaoBean" property="data_interacao"/>" /></td>
		</tr>
		<tr>
			<td>Tarefa_tarefaID : </td>
			<td><input type=text name="tarefa_tarefaID" value="<jsp:getProperty name="InteracaoBean" property="tarefa_tarefaID"/>" /></td>
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
