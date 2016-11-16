/**
 * Created by Pär Svedberg on 2016-10-19.
 */

app.controller('explorerController', function ($scope, $http) {
    $scope.headingTitle = "Explore my tiny API!";
    $scope.restInput = "/svedberg";
    $scope.goButton = function () {

        $http.get($scope.restInput).success(function (data) {
            var jsonData = JSON.stringify(data, null, 2);
            $scope.restOutput = jsonData;
            console.log(jsonData);
        }
    )}
});

app.controller('aboutController', function ($scope, $rootScope) {
    $scope.headingTitle = "About Pär";
    $scope.aboutHeaderStyle = {color:'red'};
    $rootScope.myStyle = {background:'black'};
});

app.controller('firstController', function ($scope, $http, $rootScope) {
    $http.get('/svedberg/experience/current').success(function (data) {
        $rootScope.myStyle = {background:'white'};
        var jsonData = JSON.stringify(data, null, 2);
        $scope.myData = jsonData;
        console.log(jsonData);
    })
});