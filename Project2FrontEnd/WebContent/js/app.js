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
						console.log(response.status)
						$location.path('/login')
					})
				}
			})
				
			
			