<html>
<body bgcolor="pink">
	<h1 align="center">Welcome to Doctor Home</h1>
	<h2 align="center">
		<a href="doctor_profile.jsp">Doctor Profile</a> <a
			href="patient_appointment.jsp">Patient Appointment</a> <a
			href="index.html">Logout</a>
		<%@page import="java.sql.*"%>
		<%
Class.forName("com.mysql.cj.jdbc.Driver");
String url = "jdbc:mysql://localhost:3306/jnit";
String username = "root";
String password = "root";
Connection connection = DriverManager.getConnection(url,username,password);
int id = (Integer)session.getAttribute("eid");
PreparedStatement ps = connection.prepareStatement("select * from doctor where id=?");

%>
		<table width="80%" height="50%" padding="10" align="center" border="2">
			<tr>
				<td>Id</td>
				<td>Name</td>
				<td>Email</td>
				<td>Phone</td>
				<td>Specializtion</td>
			</tr>
			<%
ps.setInt(1,id);
ResultSet rs = ps.executeQuery();
while(rs.next()){
%>
			<tr>
				<td><%=rs.getInt(1) %></td>
				<td><%=rs.getString(2) %></td>
				<td><%=rs.getString(4) %></td>
				<td><%=rs.getInt(5) %></td>
				<td><%=rs.getString(6) %></td>
				<%} %>
			
		</table>
	</h2>
</body>
</html>