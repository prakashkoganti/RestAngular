'use strict';

var App = angular.module('myApp',["ngRoute"]);
App.config(['$routeProvider',function($routeProvider) {
	 $routeProvider.
     when('/', {
       templateUrl: 'registration.html',
       controller: 'RegController'
     }).
     when('/success', {
         templateUrl: 'success.html',
         controller: 'RegController'
       }).
       when('/failue', {
           templateUrl: 'success.html',
           controller: 'RegController'
         }).
     otherwise({
    	 templateUrl: 'registration.html',
         controller: 'RegController'
     });
	
}]);


