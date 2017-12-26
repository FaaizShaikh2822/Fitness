/**
 * 
 */



$scope.registerUser=function()
{
	console.log($scope.user)
	UserService.registerUser($scope.user)
	.then(function(response)
			{
			$location.path('/login')
			},function(response)
			{
				console.log(response.data)
				console.log(response.status)
				$scope.error=response.data
			})
}
$scope.login=function()
{
	UserService.login($scope.user)
	.then(function(response)
			{
			$location.path('/home')
			},function(response)
			{
				if(response.status==401)
					$scope.error=response.data
					$location.path('/login')
			})
}