<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Evaluation-->
<html>
<jsp:useBean id="ProjetoBean" scope="page" class="siaadao.ProjetoProcessor" />
<jsp:setProperty name="ProjetoBean" property="*" />
<% String result = ProjetoBean.process(); %>

<script language="javascript">
<!--
function perform(command)  {
		form1.action.value = command;
		form1.submit();
		return true;
	}
function listAll()  {
		window.location.href = 'ProjetoList.jsp';
		return true;
	}
// -->
</script>
<head><title>Projeto</title>
</head>
<body>
<h1>Projeto</h1>
<form method="POST" name="form1" action=Projeto.jsp>
	<table>
		<tr>
			<td>*ID : </td>
			<td><input type=text name="ID" value="<jsp:getProperty name="ProjetoBean" property="ID"/>" /></td>
		</tr>
		<tr>
			<td>Nome : </td>
			<td><input type=text name="nome" value="<jsp:getProperty name="ProjetoBean" property="nome"/>" /></td>
		</tr>
		<tr>
			<td>Descricao : </td>
			<td><input type=text name="descricao" value="<jsp:getProperty name="ProjetoBean" property="descricao"/>" /></td>
		</tr>
		<tr>
			<td>Data_criacao : </td>
			<td><input type=text name="data_criacao" value="<jsp:getProperty name="ProjetoBean" property="data_criacao"/>" /></td>
		</tr>
		<tr>
			<td>Data_fim : </td>
			<td><input type=text name="data_fim" value="<jsp:getProperty name="ProjetoBean" property="data_fim"/>" /></td>
		</tr>
		<tr>
			<td>Estado : </td>
			<td><input type=text name="estado" value="<jsp:getProperty name="ProjetoBean" property="estado"/>" /></td>
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
