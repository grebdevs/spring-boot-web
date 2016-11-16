/**
 * Created by Pär Svedberg on 2016-10-19.
 */

var app = angular.module('app', ['ngRoute','ngResource']);
app.config(['$routeProvider', '$locationProvider',function($routeProvider, $locationProvider){
    $routeProvider
        .when('/explorer',{
            templateUrl: '/views/explorer.html',
            controller: 'explorerController'
        })
        .when('/about',{
            templateUrl: '/views/about.html',
            controller: 'aboutController'
        })
        .when('/',{
            templateUrl: '/views/first.html',
            controller: 'firstController'
        })
        .otherwise(
            { redirectTo: '/'}
        );

    // use the HTML5 History API
    $locationProvider.html5Mode(true);
}]);