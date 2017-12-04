<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta charset="utf-8">
		<title>Bootstrap E-commerce Templates</title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<meta name="description" content="">
		<!--[if ie]><meta content='IE=8' http-equiv='X-UA-Compatible'/><![endif]-->
		<!-- bootstrap -->
		
		<link href="<c:url value="/resources/css/bootstrap.min.css"/>" rel="stylesheet">      
		<link href="<c:url value="/resources/css/bootstrap-responsive.min.css"/>" rel="stylesheet">
		
		<link href="<c:url value="/resources/css/bootstrappage.css"/>" rel="stylesheet"/>
		
		<!-- global styles -->
		<link href="<c:url value="/resources/css/flexslider.css"/>" rel="stylesheet"/>
		<link href="<c:url value="/resources/css/main.css"/>" rel="stylesheet"/>

		<!-- scripts -->
		<script src="<c:url value="/resources/js/jquery-1.7.2.min.js"/>"></script>
		<script src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>			
		<script src="<c:url value="/resources/js/superfish.js"/>"></script>	
		<script src="<c:url value="/resources/js/jquery.scrolltotop.js"/>"></script>
		<!--[if lt IE 9]>			
			<script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
			<script src="js/respond.min.js"></script>
		<![endif]-->
	</head>
    <body>		
		<div id="top-bar" class="container">
			<div class="row">
				<div class="span4">
					<form method="POST" class="search_form">
						<input type="text" class="input-block-level search-query" Placeholder="eg. T-sirt">
					</form>
				</div>
				<div class="span8">
					<div class="account pull-right">
						<ul class="user-menu">				
							<li><a href="#">My Account</a></li>
							<li><a href="/GirlsWorld/cart">Your Cart</a></li>
							<li><a href="/GirlsWorld/checkout">Checkout</a></li>					
							<li><a href="/GirlsWorld/register">Login</a></li>		
						</ul>
					</div>
				</div>
			</div>
		</div>
		<div id="wrapper" class="container">
			<section class="navbar main-menu">
				<div class="navbar-inner main-menu">				
					<a href="index.html" class="logo pull-left"><img src="<c:url value="/resources/image/logo.png"/>" class="site_logo" alt=""></a>
					<nav id="menu" class="pull-right">
						<ul>
							<li><a href="/GirlsWorld/products">Woman</a>					
								<ul>
									<li><a href="/GirlsWorld/products">Lacinia nibh</a></li>									
									<li><a href="/GirlsWorld/products">Eget molestie</a></li>
									<li><a href="/GirlsWorld/products">Varius purus</a></li>									
								</ul>
							</li>															
							<li><a href="/GirlsWorld/products">Man</a></li>			
							<li><a href="/GirlsWorld/products">Sport</a>
								<ul>									
									<li><a href="/GirlsWorld/products">Gifts and Tech</a></li>
									<li><a href="/GirlsWorld/products">Ties and Hats</a></li>
									<li><a href="/GirlsWorld/products">Cold Weather</a></li>
								</ul>
							</li>							
							<li><a href="/GirlsWorld/products">Hangbag</a></li>
							<li><a href="/GirlsWorld/products">Best Seller</a></li>
							<li><a href="/GirlsWorld/products">Top Seller</a></li>
						</ul>
					</nav>
				</div>
			</section>
			<section  class="homepage-slider" id="home-slider">
				<div class="flexslider">
					<ul class="slides">
						<li>
							<img src="<c:url value="/resources/image/carousel/banner-1.jpg"/>" alt="" />
						</li>
						<li>
							<img src="<c:url value="/resources/image/carousel/banner-2.jpg"/>" alt="" />
							<div class="intro">
								<h1>Mid season sale</h1>
								<p><span>Up to 50% Off</span></p>
								<p><span>On selected items online and in stores</span></p>
							</div>
						</li>
					</ul>
				</div>			
			</section>
			<section class="header_text">
				We stand for top quality templates. Our genuine developers always optimized bootstrap commercial templates. 
				<br/>Don't miss to use our cheap abd best bootstrap templates.
			</section>