/**
 * Created by Alejandro on 29-08-2017.
 */
(function () {
    'use strict';

    var app = angular
        .module('films', [
            "ngResource"
        ])
        .controller('FilmsController', FilmsController);

    FilmsController.$inject = ['$http'];

    function FilmsController($http) {

        var vm = this;
        vm.fechaHoy = new Date();
        vm.filmss;

        vm.getFilms = getFilms;
        vm.addFilm = addFilm;

        function getFilms() {

                $http.get('/Filmes/films').success(
                    function(data) {
                    vm.filmss = data;
                });
        }

        function addFilm() {

            $http.post('/films',
                {
                    title : $scope.title,
                    year : $scope.year,
                    director : $scope.director
                }
            ).success(function(data) {
                    $scope.msg = 'Pelicula creada correctamente';
                    $scope.getFilms();
                }).error(function(data) {
                    $scope.msg = 'Se ha producido un error';
                });
        }

    }

})();


