<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inscription</title>
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body>

<div class="container">
 <h2>Inscription</h2>
  <form action="client" method="post">
  
    <div class="form-group">
      <label>Nom :</label>
      <input type="text" name="nom" class="form-control" placeholder="Entrez votre Nom">
    </div>
   <div class="form-group">
     <label>Prénom :</label>
     <input type="text" name="prenom" class="form-control" placeholder="Entrez votre Prénom">
   </div>
  <div class="form-group">
    <label>Email :</label>
    <input type="text" name="email" class="form-control" placeholder="Entrez votre Email">
  </div>
  <div class="form-group">
    <label>Téléphone :</label>
    <input type="text" name="telephone" class="form-control" placeholder="Entrez votre Téléphone">
  </div>
  <button type="submit" class="btn btn-primary">Envoyer</button>
 
  </form>
 
</div>
<br />
<div class="alert alert-danger" role="alert">
<%
String message = (String) request.getAttribute("message");

if(message != null){
	out.print(message);
}

%>

</div>

</body>
</html>