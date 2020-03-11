<%@page isELIgnored="false" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<h1>
<form:form action="valid" modelAttribute="result">
	
	Name:<form:input path="name"/><br>
	Hobbies:
	
	Reading<form:checkbox path="f_hobbies" value="Reading"/>
	Sleeping<form:checkbox path="f_hobbies" value="Sleeping"/>
	Movies<form:checkbox path="f_hobbies" value="Movies"/>
	
		<br><br>
		
	Gender:
	Male:<form:radiobutton path="gender" value="Male"/>
	Female:<form:radiobutton path="gender" value="Female"/>
	<br><br>
	Country:
	<form:select path="country" items="${countries}" multiple="true" />
		<input type="submit" value="Submit"> 
</form:form>


</h1>