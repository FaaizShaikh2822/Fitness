<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.io.*" %>
<%@ page import="java.util.Date" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css3" rel="stylesheet">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>


<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<jsp:include page="bottom.jsp"></jsp:include>
<div class="jumbotron text-center">
	<img src="/FitnessFrontEnd/WebContent/WEB-INF/resources/images/a.png"></img>
  <h1>Apperal Fashion House</h1>
  <p>Wear who suits you</p> 
</div>

<div class="container">
	<center>
		<a href="Category.jsp"><b>Category</b></a>|
		<a href="Product.jsp"><b>Product</b></a>
	</center>
</div>



<div class="container">
<div class="row">
                    <div class="col-md-8" data-wow-delay="0.2s">
                        <div class="carousel slide" data-ride="carousel" id="#myCarousel">
                            <!-- Bottom Carousel Indicators -->
                            <ol class="carousel-indicators">
                                <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                                <li data-target="#myCarousel" data-slide-to="1"></li>
                                <li data-target="#myCarousel" data-slide-to="2"></li>
                            </ol>

                            <!-- Carousel Slides / Quotes -->
                            <div class="carousel-inner text-center">

                                <!-- Quote 1 -->
                                <div class="item active">
                                  <blockquote>
                                        <div class="row">
                                            <div class="col-sm-8 col-sm-offset-2">
											<img src="" alt="Lee" style="width:70%;">
                                            </div>
                                        </div>
                                    </blockquote>
                                </div>
                                <!-- Quote 2 -->
                                <div class="item">
                                    <blockquote>
                                        <div class="row">
                                            <div class="col-sm-8 col-sm-offset-2">
											<img src="" alt="Spark" style="width:70%;">
                                            </div>
                                        </div>
                                    </blockquote>
                                </div>
                                <!-- Quote 3 -->
                                <div class="item">
                                    <blockquote>
                                        <div class="row">
                                            <div class="col-sm-8 col-sm-offset-2">
											<img src="" alt="Gas" style="width:70%;">
                                            </div>
                                        </div>
                                    </blockquote>
                                </div>
                            </div>

                            <!-- Carousel Buttons Next/Prev -->
                            <a data-slide="prev" href="#myCarousel" class="left carousel-control"><i class="fa fa-chevron-left"></i></a>
                            <a data-slide="next" href="#myCarousel" class="right carousel-control"><i class="fa fa-chevron-right"></i></a>
                        </div>
                    </div>
                </div>
</div>

</body>

</html>