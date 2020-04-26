<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ page import="com.rsv.beans.Client" %>
            <%@ page import="com.rsv.beans.Reservation" %>
      
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>InfoRéservation</title>
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

</head>
<body>


<br />
<div class="container">
<div class="alert alert-success" role="alert">
<%
String message = (String) request.getAttribute("message");

if(message != null){
	out.print(message);
}

%>

</div>
</div>
<br />
<% 
Client client = (Client) request.getAttribute("client");

%>

<div class=container>
<table class="table">
  <thead class="bg-warning">
    <tr>
      <th scope="col">Nom</th>
      <th scope="col">Prénom</th>
      <th scope="col">Email</th>
      <th scope="col">Téléphone</th>
     
    </tr>
  </thead>
  <tbody>

    <tr>
      <td><%= client.getNom() %></td>
      <td><%= client.getPrenom() %></td>
      <td><%= client.getEmail() %></td>
      <td><%= client.getTelephone() %></td>
    </tr>
  </tbody>
</table>
</div>
<br />
<div class=container>
 <h2>Information Sur Réservation</h2>
  <table class="table">
    <thead class="bg-warning">
      <tr>
         <th scope="col">Type</th>
         <th scope="col">Prix</th>
         <th scope="col">Option</th>
      </tr>
  </thead>
   <tbody>
    <tr>
      <td><%= client.getReservation().getType() %></td>
      <td><%= client.getReservation().getPrix() %></td>
      <td><%= client.getReservation().getOption() %></td>
    </tr>
  </tbody>
</table>
</div>


</body>
</html>