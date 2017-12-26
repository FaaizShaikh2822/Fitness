/**
 * 
 */
app.factory('UserService',function($http)
		{
			var BASE_URL="http://localhost:8080/Project2MiddleWare"
				
			var userService={}
			
			userService.registerUser=function(user)
			{
				console.log(user)
				return $http.post(BASE_URL + "/registerUser",user)
			}
			userService.login=function(user)
			{
				return $http.post(BASE_URL + "/login",user)
			}
			 return userService;
		})