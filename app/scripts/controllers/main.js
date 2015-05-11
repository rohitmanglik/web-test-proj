'use strict';

/**
 * @ngdoc function
 * @name testingAngularApp.controller:MainCtrl
 * @description
 * # MainCtrl
 * Controller of the testingAngularApp
 */
angular.module('testingAngularApp')
  .controller('MainCtrl', function ($scope) {
    $scope.awesomeThings = [
      'HTML5 Boilerplate',
      'AngularJS',
      'Karma'
    ];
  });
