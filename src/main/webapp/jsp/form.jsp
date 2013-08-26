<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd"> 
<html>
	<head>
		<%@include file="/jsp/head.jsp" %>
	</head>
	
	<body>
		<s:form action="primerAction" namespace="/">
	
			<s:textfield name="campo1" key="label1" />
            <s:textfield name="campo2" key="label2" />
			
			<s:submit key="redirectAction" name="boton" method="redirectAction"/>
			<s:submit key="chain" name="chain" method="chain"/>
			
		</s:form>
		<%@include file="/jsp/footer.jsp" %>
	</body>
</html>
