<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.io.*" %>
<%@ page import="java.util.Date" %>



<%@include file="/WEB-INF/views/template/header.jsp" %>


<div class="jumbotron text-center">
	<img src="/a.png - test/src/main/webapp/WEB-INF/resources/images"></img>
  <h1>Apperal Fashion House</h1>
  <p>Wear who suits you</p> 
</div>

<div class="container">
	<h1><i>${messege}</i></h1>
	<center>
		<a href="Category"><b>Category</b></a>||
		<a href="Product"><b>Product</b></a>
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

<%@include file="/WEB-INF/views/template/bottom.jsp" %>