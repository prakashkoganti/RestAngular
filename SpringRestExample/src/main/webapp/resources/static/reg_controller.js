'use strict';

App.controller('RegController',['$scope','UserService', "$location",function($scope,UserService,$location){
	console.log("i am from RegController");
	var self=this;
	self.emp={ userId:"",esiId:"",empName:"",projectName:"",technology:"",dateOfbirth:"",mobile:"",accentureEmail:"",personalEmail:""};
	console.log(JSON.stringify(self.emp));
	self.submit=function() {
		console.log("addUser"+self.emp.username);
		console.log(JSON.stringify(self.emp));
		UserService.createUser(self.emp).then(
				 function(d) {
					 self.emp=d.data;
//				        self.users = d;
					 $location.path('/success/'+ self.emp.userId);
			       },
					function(errResponse){
						console.error('Error while fetching Currencies');
					}
		       );
	}
}])