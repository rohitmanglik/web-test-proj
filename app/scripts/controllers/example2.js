(function () {
  'use strict';
  angular.module('testingAngularApp')
    .controller('Example4', function ($scope) {
      $scope.names = [
        {item: '1', value: 'Parikshit'},
        {item: '2', value: 'Ishant'},
        {item: '3', value: 'Madhur'}
      ];

      $scope.addItem = function () {
        $scope.names.push({item: $scope.names[($scope.names.length - 1)].item + 1, value: $scope.newItem});
        $scope.newItem = '';
      };

      $scope.deleteItem = function (item) {
        $scope.names.splice($scope.names.indexOf(item), 1);
      };
    });
})();
