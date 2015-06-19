'use strict';

/**
 * @ngdoc overview
 * @name testingAngularApp
 * @description
 * # testingAngularApp
 *
 * Main module of the application.
 */
angular
  .module('testingAngularApp', [
    'ngAnimate',
    'ngCookies',
    'ngResource',
    'ngRoute',
    'ngSanitize',
    'ngTouch'/*,
    'ui.bootstrap'*/
  ])
  .config(function ($routeProvider) {
    $routeProvider
      .when('/', {
        templateUrl: '../views/main.html',
        controller: 'MainCtrl'
      })
      .when('/about', {
        templateUrl: '../views/about.html',
        controller: 'AboutCtrl'
      })
      .when('/example1-js', {
        templateUrl: '../views/example1-js.html'
      })
      .when('/example1-angular', {
        templateUrl: '../views/example1-angular.html'
      })
      .when('/example3', {
        templateUrl: '../views/example3.html',
        controller: 'Example3'
      })
      .when('/example4', {
        templateUrl: '../views/example4.html',
        controller: 'Example4'
      })
      .when('/example2', {
        templateUrl: '../views/example2.html',
        controller: 'Example2'
      })
      .otherwise({
        redirectTo: '/'
      });
  });
