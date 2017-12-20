angular.module("noteTakerApp", ['eventModule']).config([function() {
    console.log("Configuration providers")
}])
.run([function () {
    console.log("Run configuration hook");
}])
.controller("noteCtrl", ['$scope', function($scope) {
    $scope.records = [
        {id: "1", body: "Ask Larry about the TPS reports."},
        {id: "2", body: "Some more notes to get."},
        {id: "3", body: "Some even more notes to get."}
        
    ]
}])

