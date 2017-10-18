<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css3" rel="stylesheet">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="page-header">
	<center><h1><i>Choose Category</i></h1></center>
</div>
<div class="container">
<table class="table table-striped">
	<thead>
		<tr> 
			<th>
			<div class="dropdown">
    		<button class="btn btn-basic dropdown-toggle" type="button" data-toggle="dropdown">Mens wear
   			 <span class="caret"></span></button>
  		  	<ul class="dropdown-menu">
  		    <li><a href="#">Jeans</a></li>
 		     <li><a href="#">T-shirt</a></li>
 		     <li><a href="#">Shirts</a></li>
 		     <li><a href="#">Shoes</a></li>
  		    <li><a href="#">Other accesories</a></li>
 		   </ul>
		  </div>
		  </th>
		
		
		 
			<th>
				<div class="dropdown">
    			<button class="btn btn-basic dropdown-toggle" type="button" data-toggle="dropdown">Womens wear
   				 <span class="caret"></span></button>
  		 	 	<ul class="dropdown-menu">
  		 	   <li><a href="#">Saree</a></li>
  		 	   <li><a href="#">Kurta</a></li>
 		 	    <li><a href="#">T-shirt</a></li>
 		 	    <li><a href="#">Jeans</a></li>
 		 	    <li><a href="#">Tops</a></li>
 		 	    <li><a href="#">Shoes</a></li>
  		 	   	<li><a href="#">Other accesories</a></li>
 		 		  </ul>
			 	 </div>
		  	</th>
		
		
		
			<th>
				<div class="dropdown">
    			<button class="btn btn-basic dropdown-toggle" type="button" data-toggle="dropdown">Kids wear
   				 <span class="caret"></span></button>
  		  		<ul class="dropdown-menu">
  		    	<li><a href="#">Jeans</a></li>
 		   	 	 <li><a href="#">T-shirt</a></li>
 		   	 	 <li><a href="#">Shirts</a></li>
 		   	 	 <li><a href="#">Shoes</a></li>
 		   	 	 <li><a href="#">Caps</a></li>
  		   	 	<li><a href="#">Other accesories</a></li>
 		   		</ul>
		  		</div>
		  	</th>
		</tr>
	</thead>
</table>
</div>

<div class="container">
  <h2><i>Apperal</i></h2>  
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner">
      <div class="item active">
        <img src="_1.jpg - FitnessFrontEnd/WebContent/WEB-INF/resource" alt="Los Angeles" style="width:100%;">
      </div>

      <div class="item">
        <img src="DSC_0077_1.jpg - FitnessFrontEnd/WebContent/WEB-INF/resource" alt="Chicago" style="width:100%;">
      </div>
    
      <div class="item">
        <img src="DSC_0207_2.jpg - FitnessFrontEnd/WebContent/WEB-INF/resource" alt="New york" style="width:100%;">
      </div>
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>

</body>
</html>