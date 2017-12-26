/**
 * JobController
 */
app.controller('JobController',function($scope,JobService,$location)
		{
			$scope.addJob=function()
			{
				JobService.addJob($scope.job).then(function(response)
						{
						alert('Job details posted successfully')
						$location.path('/home')
						},function(response)
						{
							if(response.status==401)
								{
									if(response.data.code==6)
										alert('Access Denied')
									else{
										$scope.error = response.data
										$location.path('/login')
									}
								}
							if(response.status==500)
								{
									$scope.error = response.data
									$location.path('/addJob')
								}
						})
			}
		})