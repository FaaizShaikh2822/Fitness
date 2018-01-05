/**
 * AngularJs Module
 */
var app=angular.module("app",['ngRoute'])
	app.config(function($routeProvider)
		{
			$routeProvider
			.when('/register',
					{
						templateUrl:'views/registrationform.html',
						controller:'UserController'
					})
			.when('/login',
					{
						templateUrl:'views/login.html',
						controller:'UserController'
					})
			.when('/editprofile',
					{
						templateUrl:'views/userprofile.html',
						controller:'UserController'
					})
			.when('/addjob',
					{
						tremplateUrl:'views/jobform.html'
						controller:'JobController'
					})
			.when('/alljobs',
					{ // from Controller to View [$scope.persons=[]]
						templateUrl:'views/jobslist.html', 
						controller:'JobController'
					})
			.when('/addblog',
					{
						templateUrl:'views/blogform.html', //V to Controller
						controller:'BlogPostController'
					})
			.when('/getblogs',
					{
						templateUrl:'views/blogslist.html',//Controller to V
						controller:'BlogPostController'
					})
			.when('/admin/getblog/:id',
					{
						templateUrl:'views/approvalform.html',
						controller:'BlogPostDetailsController'
					})
			.when('/getblog/:id',
					{
						templateUrl:'views/blogdetails.html',
						controller:'BlogPostDetailsController'
					})
	
					.otherwise({templateUrl:'views/home.html'})
		})
		
	app.run(function($rootScope,$cookieStore,UserService,$location)
			{
			alert($cookieStore.get('currentUser'))
			if($rootScope.currentUser==undefined)
				$rootScope.currentUser=$cookieStore.get('currentUser')
			
				$scope.logout=function()
				{
					UserService.logout()
					.then(function(response)
					{
						delete $rootScope.currentUser;
						$cookieStore.remove('currentUser')
						$location.path('/login')
						
					},function(response)
					{
						delete $rootScope.currentUser;
						$cookieStore.remove('currentUser')
						console.log(response.status)
						$location.path('/login')
					})
				}
			})
				
			
			