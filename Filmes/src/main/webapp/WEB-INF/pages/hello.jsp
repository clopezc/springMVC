<!DOCTYPE html>
<html ng-app="films">
<head>
    <meta charset="UTF-8" />
    <title>Oscar a la mejor película</title>
    <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.2.21/angular.js"></script>
    <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.2.21/angular-resource.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/services.js"></script>


</head>

<body ng-controller="FilmsController as ctrl" ng-init="ctrl.getFilms()">

<div class="container" ng-show="ctrl.filmss != null">
    <div class="film-info-bottom" ng-repeat="film in ctrl.filmss">
        <h4><span> {{film.year}} - {{film.title}} - {{film.director}} </span></h4>
    </div>
</div>

<div class="form">
    <label for="title">Título:</label>
    <input id="title" ng-model="title" type="text" />

    <label for="year">Año:</label>
    <input id="year" ng-model="year" type="number" />

    <label for="director">Director:</label>
    <input id="director" ng-model="director" type="text" />

    <button id="addBtn" class="btn" ng-click="addFilm()">Añadir película</button>
</div>

<h4>{{msg}}</h4>


</body>
</html>